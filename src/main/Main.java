package main;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Digite a descrição da tarefa: ");
        String description = scanner.nextLine();
        taskManager.addTask(description);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    private static void listTasks() {
        System.out.println("\n--- Lista de Tarefas ---");
        taskManager.listTasks();
    }

    private static void markTaskAsCompleted() {
        System.out.print("Digite o número da tarefa que deseja marcar como concluída: ");
        int index = scanner.nextInt() - 1; 
        scanner.nextLine(); 
        taskManager.markTaskAsCompleted(index);
    }
}
