import org.springframework.data.jpa.repository.JpaRepository;

import javax.lang.model.element.Name;

public interface crudRepository extends JpaRepository <dog, Name>{

}
