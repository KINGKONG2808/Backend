package Controller;

public class Control_ListMenu {
    public static void mainMenu() {
        System.out.println("\n\t\tMENU CHINH");
        System.out.println("1. Nhap danh sach giang vien.");
        System.out.println("2. Them giang vien moi.");
        System.out.println("3. Xuat danh sach giang vien theo yeu cau.");
        System.out.println("0. Thoat chuong trinh.\n");
    }

    public static void menuNhapDanhSachGVLv1() {
        System.out.println("\n\t\tMENU NHAP");
        System.out.println("1. Nhap danh sach giang vien co huu.");
        System.out.println("2. Nhap danh sach giang vien ban co huu.");
        System.out.println("3. Nhap danh sach giang vien thinh thoang.");
        System.out.println("0. Tro ve menu chinh.\n");
    }

    public static void menuThemDanhSachGVLv1() {
        System.out.println("\n\t\tMENU THEM");
        System.out.println("1. Them giang vien co huu.");
        System.out.println("2. Them giang vien ban co huu.");
        System.out.println("3. Them giang vien thinh thoang.");
        System.out.println("0. Tro ve menu chinh.\n");
    }

    public static void menuXuatGVTheoChucNangLv1() {
        System.out.println("\n\t\tMENU HIEN THI");
        System.out.println("1. Hien thi thong tin day du cho tung giang vien.");
        System.out.println("2. Hien thi nhanh thong tin tung giang vien (quicklook).");
        System.out.println("3. (Cau 3) Hien thi thong tin giang vien da nghi viec.");
        System.out.println("4. (Cau 7) Hien thi danh sach giang vien thinh thoang\n\tcong tac tai truong hon 1 nam\n\tva co hoc vi Tien Si tro len.");
        System.out.println("5. (Cau 8) Hien thi danh sach giang vien ban co huu\n\tcong tac tai truong hon 3 nam\n\t va co hoc vi Thac Si tro len.");
        System.out.println("6. (Cau 9) Hien thi danh sach giang vien cu huu chua co bang Thac Si.");
        System.out.println("7. (Cau 10) Hien thi danh sach giang vien co bang Thac Si tro len.");
        System.out.println("8. (Cau 11) Hien thi danh sach giang vien co huu\n\tco bang Thac Si tro len\n\tva ten bat dau bang 'N'.");
        System.out.println("9. (Cau 12) Sap xep danh sach giang vien co huu tang dan theo luong.");
        System.out.println("10. (Cau 13) Sap xep danh sach giang vien theo hoc vi.");
        System.out.println("11. (Cau 14) Hien thi danh sach giang vien co huu\n\tcong tac tai truong hon 10 nam.");
        System.out.println("12. (Cau 17) Hien thi danh sach giang vien khong hoan thanh nhiem vu.");
        System.out.println("0. Tro ve menu chinh.\n");
    }

    public static void menuHienThiDayDuLv2() {
        System.out.println("\n\t\tMENU HIEN THI DAY DU");
        System.out.println("1. Hien thi thong tin tat ca giang vien");
        System.out.println("2. Hien thi thong tin giang vien co huu.");
        System.out.println("3. Hien thi thong tin giang vien ban co huu.");
        System.out.println("4. Hien thi thong tin giang vien thinh thoang.");
        System.out.println("0. Tro ve menu chinh.\n");
    }
}
