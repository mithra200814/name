import java.util.concurrent.Callable;

public class day8 {
  record CourseRecord(String courseName,String department){

  }
  static void main(){
           CourseRecord courseRecord=new CourseRecord("modern java and java programming","computer science");
           System.out.println(courseRecord.courseName());
           System.out.println(courseRecord.department());
          }
  }

