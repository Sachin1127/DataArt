# MyCVProject

A simple Java Maven project that demonstrates the use of **Lombok**, **TestNG**, and **AssertJ** to create and validate a personal CV.  
The project follows a structured test setup using TestNG lifecycle annotations (`@BeforeClass`, `@Test`, `@AfterClass`).

---

## Features

-  Uses **Lombok** to create a CV model class with builder pattern  
-  Uses **TestNG** for test structure (`@BeforeClass`, `@Test`, `@AfterClass`)  
-  Uses **AssertJ** for fluent assertions and validation  
-  Maven-based build system (easily clone and run)  
-  Clean and readable CV printed to console  

---

##  Project Structure

MyCVProject/
│
├── pom.xml
└── src
└── test
└── java
├── model
│ └── MyCv.java
└── tests
└── MyCvTest.java

Expected Output:

***** My CV *****
Name       : Sachin Ramakrishna
Age        : 26
Address    : Bangalore, India
Email      : sachin.ramakrishna@example.com
Phone      : +91-9876543210
Skills     : Java, Appium, Selenium, TestNG, Maven
Education  : B.Tech in Computer Science
All CV fields validated successfully!
