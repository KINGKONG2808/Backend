package Controller;

public class Output_GiangVien extends Input_GiangVien {
    public static void xuatGiangVien(int i) {
        System.out.println("\tMa so           : " + listGiangVien.get(i).getMaSo());
        System.out.println("\tNgay vao truong : " +
                listGiangVien.get(i).getNgayNhanVaoTruong().getDate() + "/" +
                listGiangVien.get(i).getNgayNhanVaoTruong().getMonth() + "/" +
                listGiangVien.get(i).getNgayNhanVaoTruong().getYear());
        System.out.println("\tHo ten          : " + listGiangVien.get(i).getSoYeu().getHoTen());
        System.out.println("\tGioi tinh       : " + listGiangVien.get(i).getSoYeu().getGioiTinh());
        System.out.println("\tNgay sinh       : " +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getDate() + "/" +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getMonth() + "/" +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getYear());
        System.out.println("\tEmail           : " + listGiangVien.get(i).getSoYeu().getEmail());
        System.out.println("\tSo dien thoai   : " + listGiangVien.get(i).getSoYeu().getSoDienThoai());
        System.out.printf("%20s%20s%20s%n", "Ten truong cap", "Hoc vi", "Nam cap");
        for (int j=0; j<listGiangVien.get(i).getSoYeu().getBangCap().size(); j++) {
            System.out.printf("%20s%20s%20s%n",
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getTentruongCap(),
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getHocVi(),
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getNamCap());
        }
    }
}
