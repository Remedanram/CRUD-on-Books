package com.book.crud_on_books.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration


public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Allow CORS for all API endpoints
                .allowedOrigins("http://localhost:63342")  // Allow access from localhost:63342
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow certain HTTP methods
                .allowedHeaders("*");  // Allow all headers
    }
}
