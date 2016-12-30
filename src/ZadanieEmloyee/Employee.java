package ZadanieEmloyee;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
        String firstName= "Jan";
        String lastName="Kowalski";
        double salary=5000;
    }

     public Employee( String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        System.out.println("Imię i nazwisko:"+ getFirstName()+" "+ getLastName());
    }

     public Employee( String firstName, String lastName, double salary){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
        System.out.println("Imię i nazwisko:"+getFirstName()+" "+getLastName()+"\nWypłata:"+getSalary());
    }


}
/*	Przetestuj	działanie	każdego	z
nich	w	osobnej	klasie.	W	zadaniu	wykorzystaj	możliwości	słowa	kluczowego	this.
 */
