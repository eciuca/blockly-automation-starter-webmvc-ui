# Blockly Automation Starter WebMVC UI

"blockly-automation-starter-webmvc-ui" is a Spring Boot java library for building applications that use Blockly Automation.

This library leverages OpenAPI 3.0 to generate the [Blockly Automation](https://github.com/ignatandrei/BlocklyAutomation) Visual API

## Getting Started

To get started with this project, follow these steps:

1. Add the following dependency to your project's `pom.xml` file:

```xml
<dependency>
  <groupId>io.github.eciuca.blockly</groupId>
  <artifactId>blockly-automation-starter-webmvc-ui</artifactId>
  <version>0.1.0</version>
</dependency>
```

2. Annotate your Spring Boot application class with `@EnableBlocklyAutomation`

```java
@EnableBlocklyAutomation
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

3. Access the Blockly Automation Visual API at `http://localhost:8080/blocklyAutomation`

## If you only want to play with the demo application you can just run it with docker
```shell
$ docker build -t blockly-automation-starter-webmvc-ui .
$ docker run -p 8080:8080 blockly-automation-starter-webmvc-ui
```