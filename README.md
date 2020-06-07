# Adventure-Works-JPA-Entities
Simple maven project containing entities from all of the tables in MIcrosoft SQL Server's AdventureWorks Database

## The What
This project contains only JPA entities for the SQL Server AdventureWorks2017 database. It does not contain the
database as I do not have licensing rights to that.

## The Why
This is a barebones project with almost no testing. I have seen many new developers have difficulty creating
connections to SQL Server so I thought I'd save you some effort.

### Extra setup info
The easiest way to setup the database is to attach the DB through the SQL Server Management studio.
You can obtain a copy of the database which at the time of this writing it is located here:
https://github.com/Microsoft/sql-server-samples/releases/download/adventureworks/AdventureWorks2017.bak

The project contains info for a user whose name is awadmin. This account can be renamed to whatever user you
choose but it will require this user be added to each schema in the database. This is quite simple to do so
I'll leave that out.

The project also contains some extra classes dedicated to an application user which are not part of the database.
These are there to add the (what I believe) are best practice of having a non-root user in the database.

There is also a 'converter' class used to assist with the provided SQL Server Geometry entity. I'll let you
learn how to connect that one. After all there has to be some learning in the process here ;-)

The additional SQL script (create-entire-db.sql) allows you to create the database structure while not populating
the tables. 

## Gotcha's
Keep in mind this is a minimally tested project. I tested it only to ensure I could pull and push data to the database in
SQL Server Express. Also, there are views in the entities which are read only. This is helpful but not for CRUD operations.

## Fini
I hope you find this helpful.

- JR
