package co.co.com;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {

        return "home";
    }

    @GetMapping("/char/{characterName}")
    @ResponseBody
    public myChar searchChar(@PathVariable String characterName, Croll croll) throws IOException {
        myChar character = new myChar();

        character.setName(characterName);

        croll.getCharacter(character);

        System.out.println(character);

        return  character;
    }
}

