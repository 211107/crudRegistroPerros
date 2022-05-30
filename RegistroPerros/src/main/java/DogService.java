import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    @Autowired
    private CrudRepository crudRepository;

    public Dog insertar(Dog dog){
        return crudRepository.save(dog);
    }

    public Dog actualizar(Dog dog){
        return crudRepository.save(dog);
    }
    public List<Dog> Listar(){
        return crudRepository.findAll();
    }
    public void eliminar(Dog dog){
        crudRepository.delete(dog);
    }
}
