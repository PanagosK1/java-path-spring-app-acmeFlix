package gr.codelearn.spring.app.repository;



import gr.codelearn.spring.app.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Long> {
}