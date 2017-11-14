import java.util.ArrayList;
import java.util.List;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Controller;

import com.wondergroup.example.filter.HttpReqFilter;

@EnableAutoConfiguration
@Controller
@ComponentScan(basePackages={"com.wondergroup"})  
public class Application{
	
	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	}  
	
    @Bean  
    public FilterRegistrationBean  filterRegistrationBean() {  
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();  
        HttpReqFilter httpReqFilter = new HttpReqFilter();  
        registrationBean.setFilter(httpReqFilter); 
        List<String> urlPatterns = new ArrayList<String>();
        //指定过滤器过滤的urlPatterns,同web.xml下的url-pattern功能一样
        urlPatterns.add("/com/*");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;  
    }  
    
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("10MB");
        factory.setMaxRequestSize("10MB");
        return factory.createMultipartConfig();
    }
    
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
}
