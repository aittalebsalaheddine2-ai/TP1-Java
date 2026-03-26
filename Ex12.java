package String;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouy".indexOf(c) != -1)
                count++;
        }

        System.out.println("Voyelles = " + count);
    }
}
