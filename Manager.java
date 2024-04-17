import java.util.ArrayList;

class Manager extends Employee {
    private ArrayList<Goal> goals;
    public Manager(String imie, String nazwisko, String adres, String email, String pesel, int employmentYear) {
        super(imie, nazwisko, adres, email, pesel, employmentYear);
        this.goals = new ArrayList<>();
    }
    public void addGoal(Goal goal) {
        this.goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = 3000 + (2024 - employmentYear) * 1000;
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
    }
}
