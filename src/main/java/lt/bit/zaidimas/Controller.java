package lt.bit.zaidimas;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String index(){
            return "redirect:/static/game.html";
    }


}
