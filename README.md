# product-manager-db
This project is a simple crud operation for a Product table. The table has keys for name, type, place and year that 
the product was acquired. Crud operations can be performed by making controller actions on the main application. Some
examples are commented in main. They are not ready to run. Values need to be passed.

This project was created using **postgres** and **Maven**. After cloned make sure that Maven dependencies are 
all loaded and that postgres is installed on machine.



### Configure
Before making actions be sure to set up a database and table. A postgres database will be needed.

``conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/productsdb", "postgres", "132465p");``

In ProductDB the database is routed to a database at port 5432 (default postgres location) to a database named 
productsdb. The last parameter should be whatever your db is named. The user should be postgres and the password
will be set by whoever created the password through their postgres manager.

Database will be empty so actions to populate database need to be run. Here the table name is product in all of the
queries, so it would be easier to name the table accordingly.

```sql
CREATE TABLE products (
    id SERIAL PRIMARY KEY NOT NULL,
    name varchar(255),
    type varchar(255),
    place varchar(255),
    year_acquired int
)
```

