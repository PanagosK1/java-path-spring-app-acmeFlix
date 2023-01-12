package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
