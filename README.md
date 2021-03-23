# CSE-572 - Database Systems
===================

**Course Description:** 

Basic concepts of database and the different approaches to database organization--relational, object/relational, network, hierarchical; and provides a “hands-on” application of ORACLE database management system.

### **Lab 1:**

First lab of class we setup our databases using Oracle database management.

### **Lab 2:**

This lab was mainly a continuation lecture on from the class. Learned mainly how ORACLE database displays things onto the terminal. Was given a filled database to display the different tables within it.

### **Lab 3:**

Was given a database to study and then to do SQL commands to get the results asked for. 
1. List all the rows of the departments table.
2. Find the number of employees in the database (hint: use the COUNT() aggregate function for this);
    * List the employees who:
    * have a salary greater than 15000,
    * were hired between January 1, 2002 and January 1, 2005,
3. have a phone number that doesn't start with 515
4. List the names of the employees who are in the finance department. Try to format the names as “firstname lastname” using concatenation (i.e., ||) and order them alphabetically.
5. List the city, state and country name for all locations in the Asian region.
6. List the locations that have no state or province specified in the database.
7. Oracle provides a default table named dual, which you can use to verify that Oracle is up and running. Try to figure out the schema and the data values stored in dual. Give examples of why one might want to user such a table.

Results/Turn in File: CSE-572-Lab03.pdf

### **Lab 4:**

This main was mainly about exploring PeopleSoft Query Manager and were given five different queies to do. 

Results/Turn in File: LAB4_Turnin.pdf

### **Lab 5:**

Had to create and alter tables based on diagrams in the instructions: LAB05W19.pdf.

Turned in Files:
Lab05-create.pdf: SQL commands to create tables based off given diagrams
Lab05-alter.pdf: SQL commands to alter talbes based off given diagrams.

### **Lab 6:**

This lab focused on loading and inserting data from different file types into the database.

Turn in file:
lab06-1.pdf: All SQL commands to load the different types of files.

### **Lab 7:**

Lab 7 combines a lot of topics and things we went over during past labs and classes, all steps we save as a .sql file. Worked with database tables already given to us.

1. Create a query to display the last name, department number and department name for all employees.
2. Create a unique listing of all jobs that in department 80. Include the location of the department in the output.
3. Create a query to display the employee’s last name, department name, location ID and city of all employees who earn a commission.
4. For each employee who has an ‘a’ (lowercase) in his/her last name, display the employee’s last name and department name.
5. Write a query that displays the last name, job, department number and department name for all employees who work in Toronto.
6. Create a query to display the employee’s last name and employee number along with his/her manager’s last name and manager number. Label the columns Employee, Emp#, Manager and Mgr#, respectively.
7. Modify LAB06_6.sql to display all employees including King, who has no manager. Order the results by the employee number.
8. Show the structure of the JOB_GRADES table. Create a query that displays the
name, job, department name, salary and grade for all employees.
9. Create a query to display the name and hire date of any employee hired after
Davies.
10. Display the names and hire dates for all employees who were hired before their
managers, along with their manager’s names and hire dates. Label the columns
Employee, Emp Hired, Manager, and Mgr Hired, respectively.
11. Create a view called EMPLOYEES_VU based on the employee numbers,
employee names, and department numbers from the HR.EMPLOYEES table.
Change the heading for the employee name to EMPLOYEE.
12. Spool LAB07_12.lst
13. Create a view named DEPT50 that contains the employee numbers, employee
last names, and department numbers for all employees in department 50. Label
the view columns EMPNO, EMPLOYEE and DEPTNO. Do not allowan employee
to be re-assigned to another department through the view.
14. Spool LAB07_14.lst

All files turned in were the .sql files created each step.

### **Lab 8:**

Lab 8 was about aggregating data using group functions and saving our steps a sql files to be turned in.

1. Create a query to display the highest, lowest, sum and average salary of all employees. Label the columns Maximum, Minimum, Sum and Average, respectively.
2. Modify the query in LAB08_1.sql to display the minimum, maximum, sum, and average salary for each job type.
3. Create a query to display the number of employees with the same job. Save your SQL statement in a text file named LAB08_3.sql.
4. Determine the number of managers without listing them. Label the column Number of Managers.
5. Write a query that displays the difference between the highest and lowest salaries. Label the column DIFFERENCE.
6. Display the manager number and the salary of the lowest paid employee for that manager. Exclude anyone whose manager is not known. Exclude any groups where the minimum salary is $6,000 or less. Sort the output in descending order of salary.
7. Write a query to display each department’s name, location, number of employees, and the average salary for all employees in that department. Label the columns Department , Location, Number of Workers, and Average Salary, respectively. Round the average salary to two decimal places.

File turned in: Lab08-Turnin.pdf: Has all sql files in one file.

### **Lab 9:**

Lab 9 was about programming a simple program in Java to connect to the database and run commands using Java.

1. Create a unique listing of all jobs that in department 80. Include the location of the department in the output.
2. Create a query to display the employee’s last name, department name, location ID and city of all employees who earn a commission.
3. Write a query that displays the last name, job, department number and department name for all employees who work in Toronto.
4. Create a query to display the employee’s last name and employee number along with his/her manager’s last name and manager number. Label the columns Employee, Emp#, Manager and Mgr#, respectively.
5. Display the names and hire dates for all employees who were hired before their managers, along with their manager’s names and hire dates. Label the columns Employee, Emp Hired, Manager, and Mgr Hired, respectively.
6. Submit your .java file.

### **Final Project:**

Final project was done in group randomly picked by the professor based off how everyone was doing in the class at the time and was told to pick from one of four categories. Our group chose to pick from the medical category and design A database off of hospital procedures and services that they offer all data pulled from hospital websites.

Directions given by professor were:

    1. Each group submits ONE Project PDF document, which includes a  functional specification, conceptual design (possibly revised)
    2. Followed by relational model and one ERD in UML(probably revised)
    3. Followed by CREATE TABLE, CREATE TRIGGER, CREATE VIEW, and CREATE ASSERTION definitions
    4. Followed by SQL queries

All detailed instructions can be found in: Final Project/Group Project Specifications.pdf