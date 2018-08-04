package io.project.yerevan;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories("io.project.yerevan.repositories")
@ComponentScan(basePackages = {"io.project"})
@EntityScan("io.project.yerevan.domain")
@EnableSwagger2
public class YerevanApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(YerevanApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
