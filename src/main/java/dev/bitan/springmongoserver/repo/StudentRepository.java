package dev.bitan.springmongoserver.repo;

import dev.bitan.springmongoserver.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
