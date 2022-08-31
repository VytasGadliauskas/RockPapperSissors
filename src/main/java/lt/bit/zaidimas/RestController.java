package lt.bit.zaidimas;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/game")
public class RestController {

    @GetMapping(path="/{name}/{chose}", produces = "application/json")
    public Player getGame(@PathVariable("name") String name, @PathVariable("chose") String chose) {
        return Game.getGame(name,chose);
    }

    @GetMapping(path="/new/{name}", produces = "application/json")
    public Player newGame(@PathVariable("name") String name) {
        return Game.newGame(name);
    }

}
