public class Task{

    
    int taskId;
    String taskName;
    boolean status;

    public Task(int taskId, String taskName, boolean status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public static void main(String[] args) {

        System.out.println("\nTask Management System\n");
        Manage obj = new Manage();

        System.out.println("Adding tasks....");
        obj.add(new Task(1, "Complete homework", false));
        obj.add(new Task(2, "Attend meeting", true));
        obj.add(new Task(3, "Submit report", false));
        obj.add(new Task(4, "Prepare presentation", true));

        obj.traverse();
        obj.delete(2);
        System.out.println("\nAfter deleting task with ID 2..");
        obj.traverse();
        System.out.println("\nSearching for task with ID 3:\n");
        obj.search(3);
    }
}

class Manage{
    
    Node head;
    Node tail;
    class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    void add(Task task) {
        if (task == null) {
            System.out.println("Cannot add a null task.");
            return;
        }
        Node newNode = new Node(task);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void traverse(){
        System.out.println("\nTraversing the task list:\n");
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.println("Task ID: " + curr.task.taskId + ", Task Name: " + curr.task.taskName + ", Status: " + (curr.task.status ? "Completed" : "Pending"));
            curr = curr.next;
        }
    }

    void delete(int taskId) {
        if (head == null) {
            System.out.println("No tasks available to delete.");
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.task.taskId != taskId) {
            curr = curr.next;
        }
        if (curr.next == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            curr.next = curr.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        }
    }

    boolean search(int taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.taskId == taskId) {
                System.out.println("Task with ID " + taskId + " found: \n" + curr.task.taskName);
                return true;
            }
            curr = curr.next;
        }
        System.out.println("Task with ID " + taskId + " not found.\n");
        return false;
    }
}