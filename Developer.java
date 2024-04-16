import java.util.ArrayList;

class Developer extends Employee {
    private ArrayList<Technology> technologies;
    public Developer(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
        this.technologies = new ArrayList<>();
    }

    @Override
    public int calculateSalary() {
        int baseSalary = 3000 + (2024 - employmentYear) * 1000;
        int bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }

    public void addTechnology(Technology tech) {
        this.technologies.add(tech);
    }

}
