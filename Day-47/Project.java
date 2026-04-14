
import java.util.*;

class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> mark = new ArrayList<>();

        while (true) {
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.updated Student");
            System.out.println("6.Exit");

            System.out.println("enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter the student name:");
                    String name = sc.nextLine();

                    System.out.println("enter the mark:");
                    int n = sc.nextInt();

                    list.add(name);
                    mark.add(n);

                    System.out.println("student added!");
                    break;

                case 2:
                    // view the student name and marks
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i) + " " + mark.get(i));
                    }

                    // calculate the highest mark
                    int highest = mark.get(0);
                    int index = 0;
                    for (int i = 0; i < mark.size(); i++) {
                        if (mark.get(i) > highest) {
                            highest = mark.get(i);
                            index = i;
                        }
                    }
                    System.out.println("the topper is:" + list.get(index));
                    System.out.println("highest mark is:" + highest);
                    break;

                case 3:
                    // search the name from the list and also print the searched person mark:

                    System.out.println("enter the student name:");
                    String findname = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equalsIgnoreCase(findname)) {
                            System.out.println("found the student:" + list.get(i) + " " + mark.get(i));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("student not found!");
                    }

                    break;

                case 4:
                    System.out.println("enter the name for delete:");
                    String delete = sc.nextLine();
                    boolean foundd = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equalsIgnoreCase(delete)) {
                            list.remove(i);
                            mark.remove(i);
                            System.out.println("student deleted!!");
                            foundd = true;
                            break;
                        }
                        if (!foundd) {
                            System.out.println("student not found");
                        }
                    }

                    break;

                case 5:
                    System.out.println("enter the name for update");
                    String update = sc.nextLine();

                    boolean Found = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equalsIgnoreCase(update)) {

                            System.out.println("enter the new mark:");
                            int newmarks = sc.nextInt();
                            sc.nextLine();

                            mark.set(i, newmarks);
                            System.out.println("the mark is updated!");
                            Found = true;
                            break;

                        }
                        if (!Found) {
                            System.out.println("Student not found");
                        }
                    }
                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("invalid choice!! pls enter the valid choice:");
            }
        }
    }
}
