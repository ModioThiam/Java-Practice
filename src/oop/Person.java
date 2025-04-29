package oop;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone_number;
    private String gender;
    private String occupation;
    private String email;

    // static varible
    private static int PersonCount;
    // constructor
    public Person(String name, int age, String address, String phone_number, String gender, String occupation, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_number = phone_number;
        this.gender = gender;
        this.occupation = occupation;
        this.email = email;
        PersonCount ++;
    }

    public static int getPersonCount(){
        return PersonCount;
    }

    // getters and setters for properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getNumber(){
        return phone_number;
    }

    public void setNumber(String phone_number){
        this.phone_number = phone_number;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // if it's one birthday, add one to the age.
    public void birthday(){
        age += 1;
        System.out.println("Happy Birthday! You are now " + age + " years old!");
    }

    // if person is an adult, return True
    public boolean isAdult(){
        return age >= 18;
    }

    // prints out a person's contact information - their email and phone number.
    public String getContactInfo(){
        return "Email address: " + email + " and phone number: " + phone_number;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + " \nPhone Number: " + phone_number + "\nGender: " + gender + "\nOccupation: " + occupation + "\nEmail: " + email;
    }

    public static void main(String[] args){
        Person person1 = new Person("Amy", 24, "1900 Green St", "5555555", "Female", "Grad Student", "Amy123@gmail.com");
        System.out.println(person1.toString());
        person1.birthday();
        System.out.println(person1.toString());
        System.out.println(person1.getContactInfo());

    }
    // in the future, Employee should be in a separate class for organization purposes.

    public static class Employee extends Person {
        private String company;
        private double salary;

        // constructor
        public Employee(String name, int age, String address, String phone_number, String gender, String occupation, String email, String company, double salary) {
            // take these elements from Person class
            // if you do not want to inherit something from super, you can put NULL in constructor.
            super(name, age, null, phone_number, gender, occupation, email);
            this.company = company;
            this.salary = salary;
        }

        // getters and setters for company and salary
        public String getCompany(){
            return company;
        }
        public void setCompany(String company){
            this.company = company;
        }

        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
    }
    }


