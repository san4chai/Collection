import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<String> shoppingList = new ArrayList<>();

    public static void showShoppingList() {
        System.out.println("Список покупок:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
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
                String e = scanner.nextLine();
                shoppingList.add(e);
            } else if (Integer.parseInt(input) == 2) {
                showShoppingList();
            } else if (Integer.parseInt(input) == 3) {
                showShoppingList();
                System.out.println("Какую покупку хотите удалить?");
                Iterator<String> iter = shoppingList.iterator();
                String f = scanner.nextLine();
                if (f.matches("\\d")) {
                    int a = Integer.parseInt(f);
                    shoppingList.remove(a - 1);
                } else {

                    while (iter.hasNext()) {
                        String product = iter.next();
                        if (product.equals(f)) {
                            iter.remove();
                        }
                    }
                }
            }

        }
        showShoppingList();
    }
}