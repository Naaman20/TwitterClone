# twitterclone
 
Hello folks, We will be trying to develop our own social media application just like Twitter.

You have to design & build the backend for the social media application and the ability for the users to register, log in, tweet, add/remove followers.

Your task is to go through below templates/stories and create a Twitter clone for the Relevel.

The tech stack required is Java and Spring Boot. Preferred IDE is Intellij/Eclipse to import the project directly. Postman tool to test the REST APIs. Make sure maven and .m2 etc are configured on local.

How to start: To start the development a template, fork this repo and start implementing

The candidate should make sure Java, Postman & Intellij are already installed on their system before starting the development. They should fork the above repo and clone to their local system. Once it is cloned, they should import the project in intellij and start development. To check the hosted app in the browser, they can search for http://localhost:8000/ in their browser or postman app after running the main class in IDE.

For persistence of data, H2 database should be used which is in-memory database and dependency for the same is already added in POM. If you are comfortable with any other in-memory database like SQLite or some other, feel free to add the dependency and use that.

Note: You need to use JDBC and SQL for database operations (do not use spring CRUD repository)

H2-Database Database is automatically configured with a sample table BILLIONAIRES. H2 Console can be accessed with below credentials.

username=sa password=password

Console link - http://localhost:8080/h2-console

Default JDBC URL: jdbc:h2:mem:testdb

How to connect to JDBC: http://www.h2database.com/html/tutorial.html#connecting_using_jdbc


Stories and templates:
https://docs.google.com/document/d/1k5lyXW45H2drbJjqNqxSAdMuO_hik-KLFdSF4DQMyB8/edit?usp=sharing 
