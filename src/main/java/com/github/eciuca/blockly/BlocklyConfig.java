package com.github.eciuca.blockly;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.logging.Logger;

@Configuration
public class BlocklyConfig extends WebMvcConfigurationSupport {

    private static final String BLOCKLY_RESOURCE_LOCATION = "classpath:/blockly";
    private static final String BLOCKLY_BASE_PATH = "/blocklyAutomation";
    private static final Logger LOG = Logger.getLogger(BlocklyConfig.class.getName());

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(BLOCKLY_BASE_PATH)
                .addResourceLocations(BLOCKLY_RESOURCE_LOCATION + "/index.html")
                .setCachePeriod(0)
                .resourceChain(true)
                .addResolver(new BlocklyPathResourceResolver());

        registry.addResourceHandler(BLOCKLY_BASE_PATH + "/**")
                .addResourceLocations( BLOCKLY_RESOURCE_LOCATION + "/")
                .setCachePeriod(0)
                .resourceChain(true)
                .addResolver(new BlocklyPathResourceResolver());

        LOG.info("Enabled blockly automation. Visit http://localhost:8080" + BLOCKLY_BASE_PATH);
    }
}
