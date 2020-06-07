# todolist

This is the start of a project to build upon my knowledge of Java. 

The first version is to experiment with classes, as this has a ToDoList class which keeps all of the functionality of the application (reading the list, adding to the list, removing from the list) within one area to improve reusability. 

The next stage is to learn how to firstly connect with a database (likely to be MySQL for now) and then use the current classes to build upon communicating with the database, creating a CRUD application without having to change too much of the Main class. 

After that I will probably be looking into creating an application interface on a web page to provide something more visually stimulating than a console project. This will involve improving my skills with HTML and CSS (probably Bootstrap). How I will interact with the backend isn't known yet, the two options off the top of my head are using Spring Boot or learning a Javascript/Javascript framework to act as the intermediary between the front and back ends. 


UPDATE 07/06/2020:
Changed the way the program works from using ArrayLists to interacting with the database. I used the JDBC drivers to interact with a MySQL database, whilst not the most efficient way to do this it has helped me understand working with the databases and submitting queries and statements to be executed. The problem with using jdbc is each action needs to be opening with it's own connection, which is fine for this use but if this was being used by multiple users, the amount of strain on the database would start to show. I need to look into better ways to interact with the database. 

Once I move it towards being used on a website and setting up APIs to interact with database from the application, I will be able to find better ways to do the job (Hibernate seems to be popping up on previous research and queries) but also using Spring might be a viable option. 
