package co.com.cesarflorez87.misiontic.Tareas.mvp;

import java.util.List;

import co.com.cesarflorez87.misiontic.Tareas.view.dto.TaskItem;

public interface MainMVP {

    interface Model {

        List<TaskItem> getTasks();

        void saveTask(TaskItem task);

        void saveTask();

        void updateTask(TaskItem item);

        void deleteTask(TaskItem task);
    }

    interface Presenter {
        void loadTasks();

        void addNewTask();

        void taskItemClicked(TaskItem item);

        void updateTask(TaskItem task);

        void taskItemLongClicked(TaskItem task);

        void deleteTask(TaskItem task);
    }

    interface View {

        void showTaskList(List<TaskItem> items);

        String getTaskDescription();

        void addTaskToList(TaskItem task);

        void updateTask(TaskItem task);

        void showConfirmDialog(String message, TaskItem task);

        void showDeleteDialog(String message, TaskItem task);

        void deleteTask(TaskItem task);
    }
}

