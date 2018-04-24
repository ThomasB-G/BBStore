
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
    private Controller cntl;
    private HashMap<String, String> loginInfo;
    LoginModel(Controller cntl)
    {
        this.cntl = cntl;
        this.loginInfo.put("richChump", "baconBitz");
    }
    
    public void loginButtonPressed()
    {
        
    }
}
