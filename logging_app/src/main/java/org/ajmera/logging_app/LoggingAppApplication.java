package org.ajmera.logging_app;

import org.ajmera.logging_app.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggingAppApplication {

    public static final Logger logger = LoggerFactory.getLogger(LoggingAppApplication.class);

    public static void main(String[] args) {
        logger.info("Welcome to Spring Concept Demo");
        ApplicationContext context =SpringApplication.run(LoggingAppApplication.class, args);
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }

}
