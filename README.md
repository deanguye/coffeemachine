Implement Fully Automatic Beverage Vending Machine

This application will dispense various types of Coffee and Tea to the individual. In addition, the Vending Machine Application will allow adding Sugar and Milk condiments at 3 units maximum for each of them.

# Task 1: Implementation Description
How the application is implemented is based on the following Design Principles: 
  1.	Flexibility: The program has the ability to add new drink types. The VendingMachine.java class is general and contains a "beverage" variable. The user will
      be able to add/remove new drinks in the future by modifying the constructor in the VendingMachine.java class. They can use the "contains" method to check for certain
      keywords. If there is a match, the VendingMachine object will be initialized and the user will be able to make the new drink.
      
  2. Understandability: The user is able to read and understand what the program is expecting them to do based on the "system.output.println" messages provided. If, for example,
     the user inputs more than 3 units of a condiment, the program will exit and the user will receive a message saying that more than 3 units of condiment is not allowe
   
  3. Duplicate code is avoided through grouping similar classes (or classes with similar responsibilities together). For example, the Coffee and Tea share the commonality
     of being a beverage that belongs to the VendingMachine. Since they are a part of the vending machine, the VendingMachine code is written to contain objects of those
     classes (aggregate relationship in UML class) when using the "makeBeverage" method.
   
  4. Low Coupling: There are little dependencies between each classes. For instance, the UML diagram demonstrates an aggregation relationship between the Condiments,
     Coffee, and Tea class in relation to the Vending Machine class. This is designed to minimize coupling and make the code easier to modify (Teymourian, Lecture 1).
     
  5. Robustness: The program can handle different types of user input. For instance, if the user does not type in "Coffee" or "Tea", the program will display a message
     and exit the program in a graceful manner.

# Task 2: UML Class Diagram

The UML Class Diagram was designed based on the requirements and Software Design Principles. All relationships were "Aggregate" to allow for code reusability (Module 1 Lecture). Aggregate relationships are preferred as the classes can exist independently(Eric Braude, Lecture 1). This also reduces redundancy.

![image](https://user-images.githubusercontent.com/86865687/125266712-f066de80-e2ba-11eb-82b5-823d3623cbd8.png)

# Preconditions/Assumptions

  1. The user has inputted the correct amount of money, which is 2 dollars and 0 cents for beverage.
  2. The vending machine is not broken/turned off and can make the beverage.
  3. The machine has an appropriate amount of sugar and milk (the machine did not run out of sugar or milk).
  4. The machine has an appropriate amount of coffee and tea (the machine did not run out of coffee or tea).
  5. The machine has all the coffee/tea selections listed in Assignment 1 available (no running out of latte or black tea).
  6. Only 1 beverage may be created at a time.
  7. Only 1 type of beverage(Coffee or Tea) may be selected at a time.
  8. The User has an idea of what selection they would like to make. They will not backtrack and change their mind about their selection
  and attempt to "go back" to the selection menu.
  9. The User knows the coffee types(Americano, Latte, Macchiato,Expresso) and tea types available (Black,Green,Yellow).
  10. When prompted for condiments, milk will be the first condiment assigned and sugar will be the second condiment.

# Conceptual Solution
The conceptual solution is that based on the junit test, the user should be able to see a message that their desired beverage with customized features were made. In addition, the solution is primarily to notify users if their input is not correct and exit the program if needed. This is because with a real-life vending machine, the system will
notify the user if they do not have a beverage available. The machine would not make a beverage it does not have.

# Task 3: Implement your solution in java

The solution was originally written in the Eclipse IDE and then exported to github. The steps below will show how to compile, run and check bugs in the project.


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




