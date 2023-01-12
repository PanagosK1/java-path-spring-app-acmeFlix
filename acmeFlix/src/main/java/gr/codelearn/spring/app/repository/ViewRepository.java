package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.View;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewRepository extends JpaRepository<View,Long> {
}
