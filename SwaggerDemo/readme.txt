
1. the application start with port : 9090

2. In order to access the controller and configuration file, have to define

        @SpringBootApplication(scanBasePackages={"com.ramesh.*"})
        
 3. have to added below dependencies

<dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger2</artifactId>
      <version>2.4.0</version>
    </dependency>

    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger-ui</artifactId>
      <version>2.4.0</version>
    </dependency>

4. to access the swagger API using the below URL

        http://localhost:9090/swagger-ui.html
        
        @EnableSwagger2 - Annotation to Enable Swagger Documentation on the API
        public Docket metaInfo()  - Docket to decide what kind of APIs you would want to document. In this example, we are documenting all APIs. You can filter out APIs you do not want to document with Swagger.

