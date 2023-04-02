package school.mangagement.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     *
     * @param id of the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }


    //we do not set name or id

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
