package lk.ijse.logs.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String logMessage() {
        logger.debug("This is DEBUG log message");
        logger.info("This is INFO log message"); // sout wage dano nm meka use karanna
        logger.warn("This is WARN log message");
        logger.error("This is ERROR log message");

        // Log Management
        // ELK stack, Logstash, kibana

        try {
            String notNumberStr = "hello";
            int number = Integer.parseInt(notNumberStr);
        } catch (NumberFormatException e) {
            logger.error("This is number format error : {}", e.getMessage());
        }
        return "This is sample end point for test log management";
    }
}
