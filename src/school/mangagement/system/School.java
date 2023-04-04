package school.mangagement.system;

import java.util.List;

/**
 * many teachers, many students
 * implements teachers and students using an arraylist
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     *
     * @return the list of teachers in school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);

    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * which is only salary given to teachers
     * @param MoneySpent the money spent by the school
     */
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
