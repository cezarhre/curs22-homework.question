package ro.fasttrackit.curs22.homework.curs22homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs22.homework.curs22homework.model.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
}
