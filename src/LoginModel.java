
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */
public class LoginModel {
    private final Controller cntl;
    private HashMap<String, String> loginInfo;
    
    LoginModel(Controller cntl)
    {
        this.cntl = cntl;
        this.loginInfo = new HashMap<>();
        this.loginInfo.put("richChump", "baconBitz");
    }
    
    public boolean authenticate(String user, String password)
    {
        return loginInfo.containsKey(user) && loginInfo.get(user).equalsIgnoreCase(password);
    }
}
