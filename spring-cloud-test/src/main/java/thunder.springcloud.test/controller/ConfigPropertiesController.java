package thunder.springcloud.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/springcloudtest")
public class ConfigPropertiesController {

    private static final Logger logger = LoggerFactory.getLogger(ConfigPropertiesController.class);

    @Value("${from}")
    private String from;

    @RequestMapping("/from.do")
    public String getFrom() {
        return from;
    }
}
