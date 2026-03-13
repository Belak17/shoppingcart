package com.belak.ecommerce.controller;

import com.belak.ecommerce.dto.ImageDto;
import com.belak.ecommerce.exception.ResourceNotFoundException;
import com.belak.ecommerce.model.Image;
import com.belak.ecommerce.response.ApiResponse;
import com.belak.ecommerce.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/images")
public class ImageController {
    private final IImageService imageService ;


    @PostMapping("/upload")
    public ResponseEntity<ApiResponse> saveImages(@RequestParam List<MultipartFile> files , @RequestParam Long productId)

    {
        try
        {
            List<ImageDto> imageDtos = imageService.saveImages(files,productId);
            return ResponseEntity.ok(new ApiResponse("Upload success !",imageDtos));
        } catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Upload failed!", e.getMessage()));
        }
    }

    @GetMapping("/image/download/{imageId}")
    public ResponseEntity<Resource> downloadImage(@PathVariable Long imageId)
    {
        Image image = imageService.getImageById(imageId);
        ByteArrayResource resource = new ByteArrayResource(image.getImage());
       return ResponseEntity.ok().contentType(MediaType.parseMediaType(image.getFileType()))
               .header(HttpHeaders.CONTENT_DISPOSITION, "attachment ; filename=\""+image.getFileName()+ "")
               .body(resource);
    }

    @PostMapping("/image/{imageId}/update")
    public ResponseEntity<ApiResponse> updateImage(@PathVariable Long imageId, @RequestBody MultipartFile file) {

        try {
            Image image = imageService.getImageById(imageId);

            if (image != null) {
                imageService.updateImage(file, imageId);
                return ResponseEntity.ok(new ApiResponse("Update Success !", null));
            }
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND)
                    .body(new ApiResponse("Update Failed !", null));
        }

        return ResponseEntity.status(NOT_FOUND)
                .body(new ApiResponse("Update Failed !", INTERNAL_SERVER_ERROR));

    }
}
