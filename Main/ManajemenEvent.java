/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import java.util.*;
import Model.Event;
import Model.Organizer;

public class ManajemenEvent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Selamat Datang di Sistem Manajemen Event!");
        System.out.print("\nMasukkan nama pengguna: ");
        String nama_pengguna = scanner.nextLine();

        System.out.print("Masukkan nomor telepon: ");
        String no_telp = scanner.nextLine();

        Organizer organizer = new Organizer(nama_pengguna, no_telp);

        while (!exit) {
            System.out.println("\n+----------------------------+");
            System.out.println("|            MENU            |");
            System.out.println("+----------------------------+");
            System.out.println("| 1. Menambahkan Event       |");
            System.out.println("| 2. Menampilkan Semua Event |");
            System.out.println("| 3. Memperbarui Event       |");
            System.out.println("| 4. Menghapus Event         |");
            System.out.println("| 5. Keluar                  |");
            System.out.println("+----------------------------+");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nMasukkan nama event: ");
                    String nama_event = scanner.nextLine();

                    System.out.print("Masukkan tanggal event (cth. 2024-09-30): ");
                    String tanggal_event = scanner.nextLine();

                    System.out.print("Masukkan lokasi event: ");
                    String lokasi = scanner.nextLine();

                    Event event = new Event(nama_event, tanggal_event, lokasi);
                    Organizer.addEvent(event);
                    System.out.println("<< Event Berhasil Ditambahkan >>");
                    break;

                case 2:
                    Organizer.showEvents();
                    break;
                    
                case 3:
                    Organizer.showEvents();
                    System.out.print("Masukkan nama event yang ingin diperbarui: ");
                    String nama_event_update = scanner.nextLine();

                    System.out.print("Masukkan tanggal event baru (cth. 2024-09-30): ");
                    String tanggal_event_baru = scanner.nextLine();

                    System.out.print("Masukkan lokasi event baru: ");
                    String lokasi_baru = scanner.nextLine();

                    Organizer.updateEvent(nama_event_update, tanggal_event_baru, lokasi_baru);
                    break;

                case 4:
                    Organizer.showEvents();
                    System.out.print("\nMasukkan nama event yang ingin dihapus: ");
                    String eventToRemove = scanner.nextLine();
                    Organizer.removeEvent(eventToRemove);
                    break;
                    
                case 5:
                    exit = true;
                    System.out.println("\n<< Sistem Manajemen Event Ditutup >>");
                    break;

                default:
                    System.out.println("<< Opsi Tidak Valid! Silakan Coba Lagi >>");
            }
        }
        scanner.close();
    }
}
