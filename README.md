# Code Generator

## About The Project

The project is about codes, the kind that you might find inside a bottle or a produce, by which one could win a prize by redeeming it. In the program, you can see all the generated codes, create new codes(winning and losing ones), redeem a code, and see all the redeemed codes.

This project was made for no exact reason, the process of starting it was the well-known:
* I think I can do it
* I should it
* I'm doing it

Still, I think it can have real-world usage with a few adjustments. 

### Built With

Used technologies and frameworks:
* [Java](https://www.java.com/en/)
* [Spring Boot/Spring](https://spring.io/)
* [H2](https://www.h2database.com/html/main.html)
* [Javascript](https://developer.mozilla.org/)
* [Angular](https://angular.io/)
* [HTML/CSS](https://developer.mozilla.org/)
* [Bootstrap](https://getbootstrap.com/)

## Getting Started
### Prerequisites

You will need java [jdk](https://www.oracle.com/java/technologies/javase-downloads.html)8 or higher to run this program and a decent IDE, preferably [IntelliJ](https://www.jetbrains.com/idea/).

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/AlexNaie/CodeGenearor.git
   ```
3. Import the project in your IDE
4. Run the application

## Database configuration

The application comes without any configuration on the database in application.properties, so the database would be dropped every time one closes the server. In order to persist the data stored in the database after one closes the server simply add the following:

* application.properties
   ```spring.datasource.url=jdbc:h2:file:~/test2;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE
      spring.datasource.username=admin
      spring.datasource.password=password
      spring.datasource.driver-class-name=org.h2.Driver
      spring.jpa.show-sql=true
      spring.jpa.hibernate.ddl-auto=update
   ```

Also for quick testing purposes, I made a configuration class called "LoadDatabase.java". This class is preloading our table with three entries, one could see imply delete it or comment it if it's for no use. 
