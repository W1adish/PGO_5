class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonus;
    // Constructor
    public Goal(int year, int month, int day, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonus = bonus;
    }
    // Method to check if goal is achieved
    public boolean isAchieved() {
        // Assuming current date is 2024-04-10
        // You may need to adjust this based on actual current date
        return year <= 2024 && month <= 4 && day <= 10;
    }
    // Getter method for bonus
    public int getBonus() {
        return bonus;
    }
}