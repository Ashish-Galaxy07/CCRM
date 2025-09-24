# Campus Course & Records Manager (CCRM)

**A comprehensive Java console application for managing students, courses, enrollments, and grades in an educational institution.**

---

## Features

- **Student Management:** Add, update, list, and search students.  
- **Course Management:** Add, update, list, and assign instructors.  
- **Enrollment Management:** Enroll students in courses with duplicate enrollment validation.  
- **Grade Recording & GPA Calculation:** Record grades and compute cumulative GPA for students.  
- **Data Import/Export:** Import and export student and course data from/to CSV files.  
- **Backup & Restore:** Maintain backups of critical data.  
- **Reports & Statistics:** Generate transcripts and enrollment summaries.

---

## Technical Requirements Demonstrated

- **OOP Principles:** Encapsulation, Inheritance, Abstraction, Polymorphism  
- **Exception Handling:** Custom exceptions (`StudentNotFoundException`, `DuplicateEnrollmentException`) and try-catch-finally blocks  
- **File I/O:** Reading/writing data using NIO.2  
- **Java Stream API:** Efficient data processing and filtering  
- **Date/Time API:** Handling date/time where necessary  
- **Interfaces & Abstract Classes:** For service and domain layers  
- **Nested Classes:** Builder pattern for `Course` creation  
- **Enums:** Semester and Grade enums with constructors and fields  
- **Functional Programming:** Lambdas and functional interfaces  
- **Design Patterns:** Singleton for `DataStore`, Builder for `Course`  
- **Recursion:** Example usage for utilities or computations  

---

## Evolution of Java

- **1995:** Java 1.0 released  
- **1997:** Java 1.1 introduced inner classes and JDBC  
- **2004:** Java 5 introduced generics, annotations, and autoboxing  
- **2014:** Java 8 introduced lambdas, streams, and new date/time API  
- **2017:** Java 9 introduced modules and JShell  
- **2021:** Java 17 LTS released with sealed classes and pattern matching  

---

## Java Platforms Comparison

| Platform | Purpose | Target Environment |
|----------|---------|------------------|
| Java SE  | Standard Edition | Desktop and server applications |
| Java EE  | Enterprise Edition | Large-scale distributed systems |
| Java ME  | Micro Edition | Embedded and mobile devices |

---

## Java Architecture

- **JDK (Java Development Kit):** Development tools including compiler, debugger, and documentation tools  
- **JRE (Java Runtime Environment):** Runtime environment for executing Java applications  
- **JVM (Java Virtual Machine):** Executes Java bytecode and ensures platform independence  

---

## Installation and Setup

### Windows Installation

1. Download JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html)  
2. Run the installer and follow the prompts  
3. Set `JAVA_HOME` environment variable to the JDK installation path  
4. Add `%JAVA_HOME%\bin` to the `PATH` environment variable  

### IntelliJ IDEA Setup

1. Download and install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)  
2. Open IntelliJ and create a new Java project  
3. Configure the project SDK to the installed JDK  
4. Create packages and classes as per the project structure  

---

## How to Run

1. Clone the repository  
2. Open the project in IntelliJ IDEA or any Java IDE  
3. Ensure Java 8 or later is configured  
4. Run the `Main.java` class  

---

## Sample Commands

The application provides a **menu-driven interface**. Follow the prompts to:

- Add students and courses  
- Enroll students in courses  
- Record grades  
- Generate transcripts  
- Import/export data  
- Create backups  

---

## Enabling Assertions

To enable assertions during runtime, use the `-ea` flag when running the program:

```bash
java -ea -cp . edu.ccrm.cli.Main
