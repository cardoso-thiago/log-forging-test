package br.com.cardoso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log/{value}")
    public String log(@PathVariable("value") String value) {
        value = value + "/log";
        LOGGER.info(value);
        return "ok";
    }

    @GetMapping("/log/esapi/{value}")
    public String logEsapi(@PathVariable("value") String value) {
        value = value + "/log/esapi";
        value = value + "\n\r5051 [http-nio-8080-exec-1] INFO br.com.cardoso.controller.LogController [] - Log Injetado";
//        value = ESAPI.encoder().encodeForHTML(value);
        LOGGER.info(value);
        return "ok";
    }
}
