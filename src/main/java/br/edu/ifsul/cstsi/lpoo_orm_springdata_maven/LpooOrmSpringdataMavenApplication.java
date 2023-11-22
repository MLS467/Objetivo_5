package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "Sistema_De_Clinica_Veterinaria_Model")
@SpringBootApplication
public class LpooOrmSpringdataMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LpooOrmSpringdataMavenApplication.class, args);
    }

}
