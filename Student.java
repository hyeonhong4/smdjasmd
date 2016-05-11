public class Student{
  
  String name;
  
  private int[] grades = new int[3];
  
  public boolean checkGrades(){
    int s = 0;
    for(int i = 0 ; i <grades.length;i++){
      if(grades[i]==0){
        return true;}
      else{
        s=grades[i];
        if(grades[i]>s){
          int c =grades[i];
        System.out.println(c);
        }
      }
    }
    return true;}
  
  public void expandGrades(){
  int[]  newGrades = new int[grades.length+1];
    for(int i = 0;i<grades.length;i++){
      newGrades[i]=grades[i];}
    grades=newGrades;
  }
      
  public void setGrade(int grade){
    if(checkGrades()){
      expandGrades();}
    for(int i=0;i<grades.length;i++){
    System.out.println(grades[i]);
      if (grades[i] == 0){
    grades[i] = grade;
    }}}

  public int getGrade(int i){
    return grades[i];
  }
  public Student(String name){
    this.name = name;
  }
  
  public int finalGrade(){
    int grade = (grades[0]
                    +grades[1]
                    +grades[2])/3;
    return grade;
  }
}
