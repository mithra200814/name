import java.util.concurrent.Callable;

public class day8 {
    /*
  record CourseRecord(String courseName,String department){

  }
  static void main(){
           CourseRecord courseRecord=new CourseRecord("modern java and java programming","computer science");
           System.out.println(courseRecord.courseName());
           System.out.println(courseRecord.department());
          }
  }
*/
enum LANGUAGE{
    EN("English"),
    GR("German"),
    JP("Japanese"),
    TA("Tamil");

    String description;

    LANGUAGE(String description){
        this.description=description;
    }
}
static void main(){
    System.out.println(LANGUAGE.EN.description);
    System.out.println(LANGUAGE.GR.description);
    System.out.println(LANGUAGE.JP.description);
    System.out.println(LANGUAGE.TA.description);
}
}
