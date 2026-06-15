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
    /*
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
*/

        sealed interface LoginResult permits LoginSuccess, LoginFailure, LoginLoading {

        }

        record LoginSuccess(String time) implements LoginResult{

        }
        record LoginFailure(String reason) implements LoginResult{

        }
        record LoginLoading(String expectedTime) implements LoginResult{

        }
        record Rendom(String reason){

        }
        static void handleLogin(LoginResult result){
            switch (result){
                case LoginSuccess success -> System.out.println("Login Success at :"+success.time());
                case LoginFailure failure -> System.out.println("Login Failure becasuse of "+failure.reason());
                case LoginLoading loading -> System.out.println("Login Loadind, "+loading.expectedTime());
            }
        }
        static void main(){
            LoginResult loginSuccess =new LoginSuccess("2026-06-14:10pm");
            LoginFailure loginFailure=new LoginFailure("Invailed User name or Password");
            LoginLoading loginLoading=new LoginLoading("just 2 mins");

            handleLogin(loginSuccess);
            handleLogin(loginFailure);
            handleLogin(loginLoading);
        }
    }

