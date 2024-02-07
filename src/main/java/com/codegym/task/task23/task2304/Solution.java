package com.codegym.task.task23.task2304;

/*
Inner 3

*/

import java.util.List;
import java.util.Map;

public class Solution {

    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }

    public static void main(String[] args) {

    }

    private class TaskDataProvider implements DbDataProvider {
        @Override
        public void refreshAllData(Map criteria) {
            /*The refreshAllData method in the
            TaskDataProvider class must save
            the result of the MockDB
            class's getFakeTasks method in the tasks list.*/

        }
    }

    private class NameDataProvider implements DbDataProvider {
        @Override
        public void refreshAllData(Map criteria) {

        }
    }
}
