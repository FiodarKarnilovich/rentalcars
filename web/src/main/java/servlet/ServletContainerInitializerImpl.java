package servlet;


import controllers.WebConfiguration;
import my.config.RootConfig;
import my.service.ServiceContextConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.Set;

@Component
public class ServletContainerInitializerImpl implements ServletContainerInitializer  {



    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("ServletContainer is running");


        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();
        context.register(WebConfiguration.class);
        context.register(RootConfig.class);

        context.register(ServiceContextConfig.class);

        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(context);

        final ServletRegistration.Dynamic servletRegistration =
                ctx.addServlet("dispatcherServlet", dispatcherServlet);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
        servletRegistration.addMapping("/index.html");
        servletRegistration.addMapping("*.html");
        servletRegistration.addMapping("*.action");
        servletRegistration.addMapping("*.view");
        //servletRegistration.addMapping("*.jpg");



    }

}