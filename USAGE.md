# CCRM Usage Guide

This guide explains how to use the **Campus Course & Records Manager (CCRM)** Java console application.

---

## 1. Running the Application

1. Make sure you have **Java 8 or later** installed.
2. Clone the repository.
3. Open the project in your preferred IDE (IntelliJ/Eclipse).
4. Run the `Main.java` class.
5. The menu-driven console interface will appear.

---

## 2. Main Menu Overview

1. Manage Students
2. Manage Instructors
3. Manage Courses
4. Enroll Student
5. Record Grade
6. Print Student Transcript
7. Export Students
8. Export Courses
9. Import Students
10. Import Courses
11. Exit

---

## 3. Managing Students
- Add Student: Enter Registration No, Full Name, Email.
- List Students: View all students in the system.
- Search/Update: Future feature can be added.

## 4. Managing Instructors
- Add Instructor: Enter ID, Name, Email, Department.
- List Instructors: Displays all instructors.

## 5. Managing Courses
- Add Course: Enter Code, Title, Credits, Department, Semester, and assign an instructor.
- List Courses: View all courses available.

## 6. Enrollments
- Enroll Student: Enter Student RegNo and Course Code.
- Duplicate check: Prevents enrolling the same student twice.

## 7. Grades & GPA
- Record Grade: Enter grade (S, A, B, C, D, E, F) for a student in a course.
- Print Transcript: Shows enrolled courses, grades, and cumulative GPA.

## 8. Data Import/Export
- Export: Save students or courses to CSV files.
- Import: Load students or courses from CSV files.
- Backup/Restore: Optional feature for future use.

## 9. Notes
- Use the menu numbers to navigate.
- Follow prompts carefully; invalid inputs will show errors.
- The app uses custom exceptions like StudentNotFoundException and DuplicateEnrollmentException to handle errors gracefully.

## 10. Example Workflow
- Add a few students and courses.
- Enroll students in courses.
- Record grades.
- Generate transcript for any student.
- Export all data to CSV for backup.







