package org.ajmera.logging_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    private static final Logger logger = LoggerFactory.getLogger(HealthCheck.class);
    @GetMapping("/")
    public String healthCheck() {
        logger.trace("TRACE: Health check endpoint called");
        logger.debug("DEBUG: Health check endpoint processing");
        logger.info("INFO: Health check is OK");
        logger.warn("WARN: Health check warning (example)");
        logger.error("ERROR: Health check error (example)");
        return "ok";
    }
}