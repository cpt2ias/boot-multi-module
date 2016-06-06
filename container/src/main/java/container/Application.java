package container;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class Application {


    @Configuration
    protected static class ParentContext {
    }

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(ParentContext.class)
            .child(products.config.ModuleConfiguration.class)
                .web(true)
                .bannerMode(Banner.Mode.OFF)
            .sibling(orders.config.ModuleConfiguration.class)
                .web(true)
                .bannerMode(Banner.Mode.OFF)
            .run(args);
    }

}
