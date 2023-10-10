package com.koolkat254.springSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/notices","/contact","/register").permitAll()
                        .anyRequest().authenticated())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();
    }


//    @Bean
//    @Description("In memory Userdetails service registered since DB doesn't have user table ")
//    public InMemoryUserDetailsManager users() {
//        // The builder will ensure the passwords are encoded before saving in memory
//        UserDetails user = User.withUsername("user")
//                .password(passwordEncoder().encode("password"))
//                .authorities("user")
//                .build();
//        UserDetails admin = User.withUsername("admin")
//                .password(passwordEncoder().encode("password"))
//                .authorities("admin")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
