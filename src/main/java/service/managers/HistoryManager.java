package service.managers;

import model.Task;
import java.util.List;

public interface HistoryManager {
    void add(Task task);

    void remover(long id);

    List<Task> getHistory();
}
