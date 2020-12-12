package SpringMVC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class loginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLogin()
    {
        return "login";
    }
}
