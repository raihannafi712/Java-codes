package lab8.task6;

public class Developer extends Employee{

    public String languageMainOne;

    public Developer(String name, double baseSalary, int hoursWorked, String languageMainOne) {

        super(name, baseSalary, hoursWorked);
        this.languageMainOne = languageMainOne;
    }

    public void calculateSalary() {

        if (languageMainOne.equals("Java")) {

            double newSalary = getBaseSalary() + 700;
            setBaseSalary(newSalary);
        }
    }

    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Language: " + languageMainOne);
        System.out.println("Final Salary: $" + getBaseSalary());
    }
}
