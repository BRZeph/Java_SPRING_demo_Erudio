package brzeph.spring.java_spring_demo_erudio.repository;

import brzeph.spring.java_spring_demo_erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}