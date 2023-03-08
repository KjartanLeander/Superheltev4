package Service;

import Model.Superhero;
import Repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<Superhero> getSuperheroes() {
        return myRepository.getSuperheroes();
    }

}
