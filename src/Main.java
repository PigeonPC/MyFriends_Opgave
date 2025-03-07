import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public static void run(Scanner scanner) {
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
}