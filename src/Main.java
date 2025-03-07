import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        //Display Person ArrayList
        System.out.println("People:");
        for (Person person : people) {
            System.out.println(person);
        }
    }


    public static void run(Scanner scanner) {

        System.out.println("MENU");
        System.out.println("Choose option:");
        System.out.println("1. Show list of persons");
        System.out.println("2. Enter new friend");
        System.out.println("3. Enter new family member");
        System.out.println("4. Delete person");
        System.out.println("5. Save list");
        System.out.println("6. Load list");
        System.out.println("9. Quit");

        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice) {
            case 1:
                showList();
                break;
            case 2:
                enterNewFriend();
                break;
            case 3:
                enterNewFamilyMember();
                break;
            case 4:
                deletePerson();
                break;
            case 5:
                saveList();
                break;
            case 6:
                loadList();
                break;
            case 9:
                quit();
                break;
            default:
                quit();
                break;
        }
    }

    public static void showList() {
        for (int i = 0; i < arraylist.size; i++) {
            System.out.println("");
        }
    }
}