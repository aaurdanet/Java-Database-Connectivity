# Java-Database-Connectivity

JDBCmySQL is a Java application that demonstrates the basic usage of JDBC (Java Database Connectivity) to connect to a MySQL database, execute SQL queries, and retrieve data from a table named "Employees".
Features:

Database Connectivity: Utilizes JDBC to establish a connection to a MySQL database specified by the JDBC URL.

Query Execution: Executes a predefined SQL query to select all columns from the "Employees" table.

Data Retrieval: Retrieves data from the ResultSet obtained from the executed query and prints the concatenated names of the first two employees.

Setup and Usage:

Prerequisites: Ensure you have the Java Development Kit (JDK) installed and a MySQL database server running.

MySQL JDBC Driver: Download and place the MySQL JDBC Driver (e.g., mysql-connector-java-x.x.xx.jar) in your project's classpath.

Configuration: Modify the url, uname, and pass variables in the main method to match your MySQL database connection details.

Compile and Run: Compile the JDBCmySQL.java file using the Java compiler (javac JDBCmySQL.java) and then execute the compiled program (java JDBCmySQL).

Error Handling:

Handles potential ClassNotFoundException if the MySQL JDBC driver class (com.mysql.cj.jdbc.Driver) is not found.

Refer to the Word document attached to see the command prompt output
