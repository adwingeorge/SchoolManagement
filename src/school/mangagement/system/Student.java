package school.mangagement.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create new student object by initialising the value
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //not going to alter students name, Id, so no setter needed


    //void for setters

    /**
     * used to updaate students grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * feesPaid = 10000+5000+15000
     * keep adding fees to feesPaid field
     * add the fees to the fees paid
     * the school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid = feesPaid + fees;   //feesPaid+=fees;
    }
}
