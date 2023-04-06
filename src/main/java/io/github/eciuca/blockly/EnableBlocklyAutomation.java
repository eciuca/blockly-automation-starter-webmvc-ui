package io.github.eciuca.blockly;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({BlocklyConfig.class})
public @interface EnableBlocklyAutomation {
}