package main;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private List<Task> tasks;
	
	public TaskManager() {
		this.tasks = new ArrayList<>();
	}
	
	public void addTask(String description) {
		tasks.add(new Task(description));
	}
	
	public void listTasks() {
		if (tasks.isEmpty()) {
			System.out.println("Nenhuma tarefa encontrada.");
			return;
		}
		
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ". " + tasks.get(i));
		}
	}
	
	public void markTaskAsCompleted(int index) {
		if (index < 0 || index >= tasks.size()) {
			System.out.println("Índice inválido.");
			return;
		}
		
		Task task = tasks.get(index);
		if (task.isCompleted()) {
			System.out.println("A tarefa já está concluída.");
		} else {
			task.markAsCompleted();
			System.out.println("Tarefa marcada como concluída.");
		}
	}
}
