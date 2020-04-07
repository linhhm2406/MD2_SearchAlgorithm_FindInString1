import java.util.ArrayList;
import java.util.Scanner;

public class FindInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi : ");
        String str = scanner.nextLine();

        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        //T(for) =O(n) (n = str.length)
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            } else if (max.size() < list.size() ) {
                max.clear();
                max.addAll(list);
                list.clear();
                list.add(str.charAt(i));
            } else {
                list.clear();
                list.add(str.charAt(i));
            }
        }

        if (max.size() > list.size()){
            for (Character ch : max) {
                System.out.print(ch);
            }
        } else {
            for (Character ch : list) {
                System.out.print(ch);
            }
        }

    }
}
