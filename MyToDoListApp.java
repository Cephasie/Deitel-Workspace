package ChapterSeven;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.ArrayList;
    import java.util.Scanner;

public class MyToDoListApp {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String task;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("WELCOME!!!");
        while (true) {
            System.out.println("Add Tasks or press 1 to display list of tasks:");
            task = scanner.nextLine();
            if (task.equals("1")) {
                break;
            }
            toDoList.add(task);
            System.out.println("Task added successfully.");
        }

        System.out.println("list of tasks:");


        String fdate = localDate.format(format);
        for (String item : toDoList) {
            System.out.println("- " + item + " : " + fdate);
        }
    }
}
