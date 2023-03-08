package Controller;

import Model.Superhero;
import Service.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "kea")
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(path = "superheroes")     //localhost:8081/kea/superheroes
    public ResponseEntity<List<Superhero>> getSuperheroes() {
        List<Superhero> superheroesList = myService.getSuperheroes();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }


}

