package com.example.apiconsumption;

public class Employee {
/////////for GET methods///////////////
//    private int id;
//    private String employee_name;
//    private double employee_salary;
//    private int employee_age;
//    private String profile_image;
//
//    public Employee(int id, String employee_name, double employee_salary, int employee_age, String profile_image) {
//        this.id = id;
//        this.employee_name = employee_name;
//        this.employee_salary = employee_salary;
//        this.employee_age = employee_age;
//        this.profile_image = profile_image;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmployee_name() {
//        return employee_name;
//    }
//
//    public void setEmployee_name(String employee_name) {
//        this.employee_name = employee_name;
//    }
//
//    public double getEmployee_salary() {
//        return employee_salary;
//    }
//
//    public void setEmployee_salary(double employee_salary) {
//        this.employee_salary = employee_salary;
//    }
//
//    public int getEmployee_age() {
//        return employee_age;
//    }
//
//    public void setEmployee_age(int employee_age) {
//        this.employee_age = employee_age;
//    }
//
//    public String getProfile_image() {
//        return profile_image;
//    }
//
//    public void setProfile_image(String profile_image) {
//        this.profile_image = profile_image;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", employee_name='" + employee_name + '\'' +
//                ", employee_salary=" + employee_salary +
//                ", employee_age=" + employee_age +
//                ", profile_image='" + profile_image + '\'' +
//                '}';
//    }

    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_name='" + name + '\'' +
                ", employee_salary=" + salary +
                ", employee_age=" + age +
                '}';
    }
}
