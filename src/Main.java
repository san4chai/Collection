import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void showList() {
        System.out.println("Список покупок:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию 1(добавить), 2(показать), 3(удалить), или введите 'end' для выхода из программы");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            if (Integer.parseInt(input) == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String input1 = scanner.nextLine();
                list.add(input1);
            } else if (Integer.parseInt(input) == 2) {
                showList();
            } else if (Integer.parseInt(input) == 3) {
                showList();
                System.out.println("Какую покупку хотите удалить?");
                String input3 = scanner.nextLine();
                if (input3.matches("\\d")) {
                    int a = Integer.parseInt(input3);
                    list.remove(a - 1);
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(input3)) {
                            list.remove(i);
                        }
                    }
                }
            }
        }
        showList();
    }
}