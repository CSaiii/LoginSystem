import java.util.HashMap;


public class UserAccount {

        HashMap<String,String> loginfo = new HashMap<String,String>();

        UserAccount(){
            loginfo.put("mangunaycg@students.national-u.edu.ph","Password123");

        }
            protected HashMap getLoginInfo(){
            return loginfo;
        }
}
