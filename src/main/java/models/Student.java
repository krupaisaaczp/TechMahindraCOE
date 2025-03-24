package models;

public class Student {
    private String name;
    private String reg;
    private int age;
    private float per;

    // Constructor
    public Student(String name, String reg, int age, float per) {
        this.name = name;
        this.reg = reg;
        this.age = age;
        this.per = per;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }

    public int getAge() {
        return age;
    }

    public float getPer() {
        return per;
    }

    // Setters (Optional, but useful if you need to modify data)
    public void setName(String name) {
        this.name = name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPer(float per) {
        this.per = per;
    }

    // toString() Method (for debugging)
    @Override
    public String toString() {
        return "Student{name='" + name + "', reg='" + reg + "', age=" + age + ", per=" + per + "}";
    }
}
