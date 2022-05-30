import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {
    @Autowired
    private  DogService dogService;

    @GetMapping
    public List<Dog>Listar(){
        return dogService.Listar();
    }
    @PostMapping
    public Dog insertar(@RequestBody Dog dog){
        return dogService.insertar(dog);
    }
    @PutMapping
    public Dog actualizar(@RequestBody Dog dog){
        return dogService.actualizar(dog);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Dog dog){
        dogService.eliminar(dog);
    }


}
