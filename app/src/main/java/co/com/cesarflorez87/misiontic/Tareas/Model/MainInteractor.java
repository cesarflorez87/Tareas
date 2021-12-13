package co.com.cesarflorez87.misiontic.Tareas.Model;

import java.util.ArrayList;
import java.util.List;



import co.com.cesarflorez87.misiontic.Tareas.mvp.MainMVP;
import co.com.cesarflorez87.misiontic.Tareas.view.dto.TaskItem;

class LoginActivity implements MainMVP.Model{

    @Override
    public List<TaskItem> getTasks() {
        return null;
    }

    @Override
    public void saveTask(TaskItem task) {

    }

    @Override
    public void saveTask() {

    }

    @Override
    public void updateTask(TaskItem item) {

    }

    @Override
    public void deleteTask(TaskItem task) {

    }
}

public class MainInteractor implements MainMVP.Model {

    private final List<TaskItem> tempItems;
    private TaskItem task;

    public MainInteractor() {
        tempItems = new ArrayList<>();
        tempItems.add(new TaskItem("Pay for services", "December 28/2021"));
    }

    @Override
    public List<TaskItem> getTasks() {
        return new ArrayList<>(tempItems);
    }

    @Override
    public void saveTask(TaskItem task) {

    }

    @Override
    public void saveTask() {
        saveTask();
        this.task= task;
        tempItems.add(task);
    }



    @Override
    public void updateTask(TaskItem item) {

    }

    @Override
    public void deleteTask(TaskItem task) {

    }
}
