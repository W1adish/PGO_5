import java.util.ArrayList;

class Tester extends Employee {
    private ArrayList<String> testTypes;
    // Constructor
    public Tester(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
        this.testTypes = new ArrayList<>();
    }
    // Method to add test type
    public void addTestType(String testType) {
        this.testTypes.add(testType);
    }
    // Override method to calculate salary
    @Override
    public int calculateSalary() {
        int baseSalary = 3000 + (2024 - employmentYear) * 1000;
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}
