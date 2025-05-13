package lab8.task6;

public class Manager extends Employee {

    public double mainBonusPercentage;

    public Manager(String name, double baseSalary, int hoursWorked, double mainBonusPercentage) {

        super(name, baseSalary, hoursWorked);
        this.mainBonusPercentage = mainBonusPercentage;
    }

    public void calculateSalary() {

        if (getHoursWorked() > 40) {

            double bonusAmount = getBaseSalary() * (mainBonusPercentage / 100);
            double newSalary = getBaseSalary() + bonusAmount;
            setBaseSalary(newSalary);
            System.out.println("Bonus: " + mainBonusPercentage + " %");
            System.out.println("Final Salary: $" + newSalary);
        }
    }

    public void requestIncrement(double amount) {

        int hours = getHoursWorked();
        if (hours > 100) {

            double newSalary = getBaseSalary() + amount;
            setBaseSalary(newSalary);
            System.out.println("$" + (int)amount + " Increment approved.");
        } else if (hours > 80) {

            double newSalary = getBaseSalary() + (amount / 2);
            setBaseSalary(newSalary);
            System.out.println("$" + (int)(amount / 2) + " Increment approved.");
        } else {
            
            System.out.println("Increment denied.");
        }
    }
}

