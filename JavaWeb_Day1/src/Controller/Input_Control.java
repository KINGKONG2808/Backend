package Controller;

import java.util.Scanner;

public class Input_Control {
    static Scanner input = new Scanner(System.in);
    public static int enterChoose(int n) {
        System.out.print("- Nhap lua chon cua ban: ");
        int x = input.nextInt();
        while (x<0 || x>n) {
            System.out.print("-> Lua chon khong ton tai, moi nhap lai: ");
            x = input.nextInt();
        }
        input.nextLine();
        return x;
    }
}
