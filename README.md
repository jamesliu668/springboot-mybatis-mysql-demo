# Springboot-MyBatis-MySQL-Demo
This is a demo projec to show you how to setup J2EE web application with Spring Boot, Mybatis, and MySQL.

## How To Use
You can git clone the project. Then use eclipse for J2EE to import the source code as maven project. 

### Clone Project
```
git clone https://github.com/jamesliu668/springboot-mybatis-mysql-demo.git
```

### Check Maven Dependency
```
mvn dependency:resolve
```

### Prepare Maven Dependency
```
mvn dependency:purge-local-repository
```

### Build/Compile Project
```
mvn clean install
```

### Run Spring Boot Project with Build-in Tomcat
```
mvn spring-boot:run
```


## Note
Files under src/main/java/com/james/demo/mybatis folders are automatically generated by eclipse plugin _MyBatis Generator_