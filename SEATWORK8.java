import java.util.ArrayList;
class Student {
  private int id;
  private String name; 
  Student(int id, String name) {
    this = id;
    this.name =name;
    System.out.println("STUDENT CREATED: " + name);
  }
   void displayinfo(){
    System.out.println("ID; "+ id "NAME; " + name);
  }
  @override
  protected void finalize() throws throwable {
    System.out.println("GARBAGE COLLECTOR DESTORYING STUDENTS OBJECT: " +name);
  }
}
public class SEATWORK8 {
  public static void main(String[] args) {
    System.out.println("====STUDENT RECORD SYSTEM====");
    ArrayList<Student> student =new ArrayList<>();
    
    student.add(new Student(1. "zemi"));
    student.add(new Student(2. "arthel"));
    student.add(new Student(3. "zelly boo"));
    System.out.println("\n--DISPLAYING STUDENT RECORDS ---");
    for (Student s: student){
      s.displayinfo();
    }
    System.out.println("\n--- REMOVING STUDENT RECORDS ---");
    Student.remove(0);
    Student.remove(0);
    System.out.printl("\n REQUESTING GARBAGE COLLECTION…");
    System.ge();
     System.out.println("\n --- CREATING TEMPORARY STUDENT OBJECTS ---");
    for (int i= 4; i<=20;i++){
      Student temp= new Student(i,"TEMPSTUDENT"+ i);
    }
     System.out.println("\n --- CLEARING RAMAINING REFERENCE ---");
    Student = null;
     System.out.println("\n REQUESTING GARBAGE COLLECTION AGAIN…");
    System.ge();
    try{
      Thread.sleep(2000);
    }catch (interruptedException e){
        System.out.println(e);
    }
     System.out.println("\n===PROGRAM ENDED===");
  }
}

