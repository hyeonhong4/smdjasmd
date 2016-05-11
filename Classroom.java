public class Classroom{
  
  public static void main(String[] args){
  
    Student s1 = new Student("Maria");
    
    String[] x = new String[3];
    System.out.println(x[0]);
    int[] y = new int[3];
    System.out.println(y[0]);
    boolean[] d = new boolean[3];
    System.out.println(d[0]);
    
    //s1.grades[0] = 90;
    s1.setGrade (90);
    s1.setGrade (80);
    s1.setGrade (100);
    
    Student s2 = new Student("Maria");
    
    s2.setGrade (60);
    s2.setGrade (90);
    s2.setGrade (100);
    
    //System.out.println(finalGrade(s1));
    System.out.println(s1.finalGrade());
    System.out.println(s2.finalGrade());
    System.out.println(s1.name);
    
    int [] grades = new int[3];
  }

}