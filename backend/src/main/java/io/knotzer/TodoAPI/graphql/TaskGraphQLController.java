package io.knotzer.TodoAPI.graphql;

import io.knotzer.TodoAPI.dto.TaskDTO;
import io.knotzer.TodoAPI.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TaskGraphQLController {

    @Autowired
    private TaskService taskService;

    @QueryMapping
    public List<TaskDTO> getTasks() {
        return taskService.getAllTasks();
    }

    @QueryMapping
    public TaskDTO getTaskById(@Argument Long id) {
        return taskService.getTaskById(id);
    }

    @MutationMapping
    public TaskDTO createTask(@Argument String title, @Argument String description) {
        return taskService.createTask(title, description);
    }

    @MutationMapping
    public TaskDTO updateTask(@Argument Long id,
                              @Argument String title,
                              @Argument String description,
                              @Argument Boolean completed) {
        return taskService.updateTask(id, title, description, completed);
    }

    @MutationMapping
    public Boolean deleteTask(@Argument Long id) {
        return taskService.deleteTask(id);
    }
}