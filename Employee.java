abstract class Employee {
        protected String firstName;
        protected String lastName;
        protected String address;
        protected String email;
        protected String PESEL;
        protected int employmentYear;
        public Employee(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.email = email;
            this.PESEL = PESEL;
            this.employmentYear = employmentYear;
        }
        public abstract int calculateSalary();
    }

