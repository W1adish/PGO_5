import java.util.ArrayList;

class Tester extends Employee {
    private ArrayList<String> testTypes;
    public Tester(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
        this.testTypes = new ArrayList<>();
    }
    public void addTestType(String testType) {
        this.testTypes.add(testType);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = 3000 + (2024 - employmentYear) * 1000;
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}
