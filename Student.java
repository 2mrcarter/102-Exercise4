
public class Student extends user{
    public int cohortNumber;

    public Student(String name, int age,int cohortNumber){
        super(name, age);
        this.cohortNumber=cohortNumber;
    }


    public void printStudent(){
        System.out.println("-----------------");
        System.out.println("Student Information");
        System.out.println("Cohort " + cohortNumber);
        printUser();

    }
}
