import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka (0-100): ");
        double nilai = scanner.nextDouble();
        
        String nilaiHuruf;
        
        if (nilai >= 85 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 70 && nilai <= 84) {
            nilaiHuruf = "B";
        } else if (nilai >= 60 && nilai < 70) {
            nilaiHuruf = "C";
        } else if (nilai >= 50 && nilai < 60) {
            nilaiHuruf = "D";
        } else if (nilai < 50 && nilai >= 0) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid (harus 0-100)";
        }
        
        System.out.println("Nilai huruf: " + nilaiHuruf);
        
        scanner.close();
    }
}