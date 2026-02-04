package basic.operations;

public class arithematic {
    public static void main(String[] args) {
        int salary = 9000;
        int expense = 6000;
        int savings = salary - expense;
        System.out.println("Total Monthly saving is " + savings);
        int yearlySalary = 12*salary;
        int yearlySavings = 12*savings;
        System.out.println("My total yearly salary and savings are \n"+yearlySalary+" and "+yearlySavings);
        int child = savings/3;
        System.out.println("Expense of my 3 children are "+ child);
        int a = 5;
        int b = 3;
        int c = a % b;
        System.out.println(c);
    }
}
