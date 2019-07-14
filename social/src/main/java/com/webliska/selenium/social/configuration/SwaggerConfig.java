package com.webliska.selenium.social.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

	ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("B360 BenefitWordCompletion API")
            .description("This API takes partial words and expands them to possible options including similar topics where possible, provided the sections that the term maps to.")
            .build();
    }
	
    @Bean
    public Docket productApi() {

        return new Docket(DocumentationType.SWAGGER_2).select().
        		apis(RequestHandlerSelectors.basePackage("com.webliska.selenium.social.controller")).
        		paths(PathSelectors.any()).build().apiInfo(apiInfo());

    }
    
}


