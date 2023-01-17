package gr.codelearn.spring.app.repository;


import gr.codelearn.spring.app.domain.Movie;
import gr.codelearn.spring.app.domain.Serie;
import gr.codelearn.spring.app.domain.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViewRepository extends JpaRepository<View,Long> {




}
