package com.shishir.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller(value = "/logs/test")
public class LogController {
    private final Logger logger = LogManager.getLogger(LogController.class);

    @Get
    public void setLogs(){
        logger.info("INFO logged");
        logger.debug("DEBUG logged");
        logger.trace("TRACE logged");
        logger.error("ERROR logged");
    }
}
