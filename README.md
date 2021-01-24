# TatsamTask
Tatsam Hiring Software Engineer - Java Spring Assignment

**Description:** 

There are 4 areas that a user can allot different priorities to. 

1. Connection
2. Relationships
3. Career
4. Wealth

Along with priority, he/she needs to rate the satisfaction for all the above areas on a scale of 1 to 5.

Company admin/creator should have the ability to add more areas in the backend later if needed. 

**Task:**

Create REST APIs that 

- Returns a list of all the priority areas from the database
- Accepts the order of priority along with the satisfaction rating for each area for a user and stores it in the database.


properties------------------------------------


# tomcat server port 
server.port=7413

#database configuration:mysql

spring.datasource.url=jdbc:mysql://localhost:3306/sys
spring.datasource.username=root
spring.datasource.password=
spring.datasource.dbcp2.driver-class-name=com.mysql.jdbc.Driver


#hibernate configuration

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect


# method/operation             |            API urls
#                              |
#   get all data(GET)          |            /data
#                              |
#  get data by id(GET)         |            /data/{id}
#                              |
#   add new data(POST)         |            /data
#                              |
#   delete data from DB 	   |
#   by id  (DELETE)            |            /data
