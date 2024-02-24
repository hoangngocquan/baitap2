import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        // Chuyển đổi chuỗi sang chữ thường
        chuoi = chuoi.toLowerCase();

        // In hoa chữ cái đầu tiên của mỗi từ
        String[] mangTu = chuoi.split(" ");
        for (int i = 0; i < mangTu.length; i++) {
            mangTu[i] = mangTu[i].substring(0, 1).toUpperCase() + mangTu[i].substring(1);
        }

        // Ghép các từ lại thành chuỗi
        String chuoiVietHoaDauTu = String.join(" ", mangTu);

        // In ra chuỗi viết hoa đầu từ
        System.out.println("Chuỗi viết hoa đầu từ: " + chuoiVietHoaDauTu);
    }
}