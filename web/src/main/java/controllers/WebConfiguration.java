package controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"controllers"})
@EnableWebMvc
public class WebConfiguration {


    @Bean
    public ViewResolver beanNameViewResolver() {
        System.out.println("beanNameViewResolver");
        return new BeanNameViewResolver();
    }

    @Bean
    public ViewResolver jspViewResolver() {
        System.out.println("jspViewResolver");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }



//    @Bean(name = "multipartResolver")
//    public CommonsMultipartResolver multipartResolver() {
//        System.out.println("multipartResolver");
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(1_000_000);
//        return multipartResolver;
//    }

}
