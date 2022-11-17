package com.exemple.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo").description("TP étude de cas").contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("beyram ayadi")
                        .email("beyram.ayadi@esprit.tn")
                .url("https://www.linkedin.com/in/beyram-ayadi-1a21b9130/");

        return contact;
    }
    @Bean
    public GroupedOpenApi ContratApi() {
        return GroupedOpenApi.builder()
                .group("Contrat API")
                                .pathsToMatch("/api/contrat/**")
                                .pathsToExclude("**")
                                .build();
    }
    @Bean
    public GroupedOpenApi DepartementApi() {
        return GroupedOpenApi.builder()
                .group("departement API")
                .pathsToMatch("/api/departement/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi EquipeApi() {
        return GroupedOpenApi.builder()
                .group("equipe API")
                .pathsToMatch("/api/equipe/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi EtudiantApi() {
        return GroupedOpenApi.builder()
                .group("etudiant API")
                .pathsToMatch("/api/etudiant/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi UniversiteApi() {
        return GroupedOpenApi.builder()
                .group("universite API")
                .pathsToMatch("/api/universite/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi DetailEquipeApi() {
        return GroupedOpenApi.builder()
                .group("detail equipe API")
                .pathsToMatch("/api/detailequipe/**")
                .pathsToExclude("**")
                .build();
    }
    }