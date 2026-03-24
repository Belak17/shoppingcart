package com.belak.shoppingcart.data;

import com.belak.shoppingcart.model.Role;
import com.belak.shoppingcart.model.User;
import com.belak.shoppingcart.repository.RoleRepository;
import com.belak.shoppingcart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository ;
    private final BCryptPasswordEncoder passwordEncoder ;
    private final RoleRepository roleRepository;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Set<String> defaultRoles = Set.of("ROLE_ADMIN","ROLE_USER");

        createDefaultUserIfNotExists();

        createDefaultRoleIfNotExists(defaultRoles);

        createDefaultAdminIfNotExists();
    }

    private void createDefaultUserIfNotExists() {
        Role userRole = roleRepository.findByName("ROLE_USER").get();
        for (int i=0 ; i<=5 ;i++)
        {
            String defaultEmail = "user"+i+"@email.com";
            if (userRepository.existsByEmail(defaultEmail))
            {
                continue;
            }
            User user = new User();
            user.setEmail(defaultEmail);
            user.setFirstName("The User");
            user.setLastName("User "+i);
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRoles(Set.of(userRole));
            userRepository.save(user);
            System.out.println("Default vet user "+ i + " created successfully .");
        }
    }

    private void createDefaultAdminIfNotExists() {
        Role adminRole = roleRepository.findByName("ROLE_ADMIN").get();
        for (int i=0 ; i<=2 ;i++)
        {
            String defaultEmail = "admin"+i+"@email.com";
            if (userRepository.existsByEmail(defaultEmail))
            {
                continue;
            }
            User user = new User();
            user.setEmail(defaultEmail);
            user.setFirstName("The Admin");
            user.setLastName("Admin"+i);
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRoles(Set.of(adminRole));
            userRepository.save(user);
            System.out.println("Default admin user "+ i + " created successfully .");
        }
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }

    private  void createDefaultRoleIfNotExists(Set<String> roles)
    {
        roles.stream()
                .filter(role -> roleRepository.findByName(role).isEmpty())
                .map(Role::new).forEach(roleRepository::save);
    }
}
