package edu.ccrm.config;

import edu.ccrm.domain.Student;
import edu.ccrm.domain.Instructor;
import edu.ccrm.domain.Course;
import edu.ccrm.domain.Enrollment;


import java.util.ArrayList;
import java.util.List;

public final class DataStore {
    private static final DataStore INSTANCE = new DataStore();

    private final List<Student> students;
    private final List<Instructor> instructors;
    private final List<Course> courses;
    private final List<Enrollment> enrollments;


    private DataStore() {
        students = new ArrayList<>();
        instructors = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();

    }

    public static DataStore getInstance() {
        return INSTANCE;
    }

    // Students
    public void addStudent(Student student) { students.add(student); }
    public List<Student> getStudents() { return students; }

    // Instructors
    public void addInstructor(Instructor instructor) { instructors.add(instructor); }
    public List<Instructor> getInstructors() { return instructors; }

    // Courses
    public void addCourse(Course course) { courses.add(course); }
    public List<Course> getCourses() { return courses; }

    //Enrollments
    public void addEnrollment(Enrollment e) { enrollments.add(e); }
    public List<Enrollment> getEnrollments() { return enrollments; }

    //GPA Calculation
    public double computeGPA(Student student) {
        int totalCredits = 0;
        int totalPoints = 0;

        for (Enrollment e : enrollments) {
            if (e.getStudent().equals(student) && e.isGraded()) {
                int credits = e.getCourse().getCredits();
                int gradePoints = e.getGrade().getPoints();

                totalCredits += credits;
                totalPoints += credits * gradePoints;
            }
        }

        if (totalCredits == 0) return 0.0;
        return (double) totalPoints / totalCredits;
    }

}

