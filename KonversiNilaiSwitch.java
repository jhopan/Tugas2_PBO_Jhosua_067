import java.util.Scanner;

public class KonversiNilaiSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka (0-100): ");
        double nilai = scanner.nextDouble();
        
        String nilaiHuruf;
        
        // Menggunakan switch dengan range nilai
        // Kita perlu mengkonversi range ke kategori integer
        int kategori;
        
        if (nilai >= 85 && nilai <= 100) {
            kategori = 1; // A
        } else if (nilai >= 70 && nilai <= 84) {
            kategori = 2; // B
        } else if (nilai >= 60 && nilai < 70) {
            kategori = 3; // C
        } else if (nilai >= 50 && nilai < 60) {
            kategori = 4; // D
        } else if (nilai < 50 && nilai >= 0) {
            kategori = 5; // E
        } else {
            kategori = 0; // Invalid
        }
        
        switch (kategori) {
            case 1:
                nilaiHuruf = "A";
                break;
            case 2:
                nilaiHuruf = "B";
                break;
            case 3:
                nilaiHuruf = "C";
                break;
            case 4:
                nilaiHuruf = "D";
                break;
            case 5:
                nilaiHuruf = "E";
                break;
            default:
                nilaiHuruf = "Nilai tidak valid (harus 0-100)";
                break;
        }
        
        System.out.println("Nilai huruf: " + nilaiHuruf);
        
        scanner.close();
    }
}