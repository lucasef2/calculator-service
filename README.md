## A Calculator Service ##



This is a Spring Boot application that implements a calculator functionality.

There are only one operation implemented at the moment: multiplication.



### Example call

`localhost:8200/calculator/multiply?a=8&b=4`

### How to build it

`mvn clean package`

Make sure you run on the same directory then pom.xml.

### How to run it

`mvn spring-boot:run`
Make sure you run on the same directory then pom.xml.

Or

`java -jar calculator-service-1.0.0-SNAPSHOT.jar`