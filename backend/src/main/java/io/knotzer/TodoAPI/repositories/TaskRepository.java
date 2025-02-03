package io.knotzer.TodoAPI.repositories;

import io.knotzer.TodoAPI.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
