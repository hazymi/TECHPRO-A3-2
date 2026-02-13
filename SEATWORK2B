class Person {
    
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; 
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {

    private String strand;
    public void setStrand(String strand) {
        this.strand = strand;
    }

    public String getStrand() {
        return strand;
    }

    public void displayInfo() {
        System.out.println("------ Student Information ------");
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Strand : " + getStrand());
        System.out.println("----------------------------------");
    }
}


public class SEATWORK2B {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zemizelly");
        s.setAge(16);
        s.setStrand("computer programing");
        s.displayInfo();
    }
}
