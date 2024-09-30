/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import java.util.*;
import Model.Event;
import Model.Organizer;

public class ManajemenEvent {
    private Scanner scanner;
    private boolean isRunning;
    private Organizer organizer;

    public ManajemenEvent() {
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
        this.organizer = new Organizer("Ivocadou Organizer", "Jl. Pasundan No. 99");
    }

    public void start() {
        while (isRunning) {
            System.out.println("+------------------------------+");
            System.out.println("|             MENU             |");
            System.out.println("+------------------------------+");
            System.out.println("| 1. Menambahkan Event         |");
            System.out.println("| 2. Menampilkan Semua Event   |");
            System.out.println("| 3. Memperbarui Event         |");
            System.out.println("| 4. Menghapus Event           |");
            System.out.println("| 5. Profil Ivocadou Organizer |        |");
            System.out.println("| 6. Keluar                    |");
            System.out.println("+----------------------------  +");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahEvent();
                    break;
                case 2:
                    organizer.showEvents();
                    break;
                case 3:
                    perbaruiEvent();
                    break;
                case 4:
                    hapusEvent();
                    break;
                case 5:
                    tampilkanInfoOrganizer();
                    break;
                case 6:    
                    isRunning = false;
                    System.out.println("<< Sistem Manajemen Event Ditutup >>");
                    break;
                default:
                    System.out.println("<< Opsi Tidak Valid! Silakan Coba Lagi >>");
            }
        }
    }

    private void tambahEvent() {
        System.out.print("\nMasukkan nama event: ");
        String nama_event = scanner.nextLine();

        System.out.print("Masukkan tanggal event (cth. 2024-09-30): ");
        String tanggal_event = scanner.nextLine();

        System.out.print("Masukkan lokasi event: ");
        String lokasi = scanner.nextLine();

        Event event = new Event(nama_event, tanggal_event, lokasi);
        organizer.addEvent(event);
        System.out.println("<< Event Berhasil Ditambahkan >>");
    }

    private void perbaruiEvent() {
        organizer.showEvents();
        System.out.print("Masukkan nama event yang ingin diperbarui: ");
        String nama_event_update = scanner.nextLine();

        System.out.print("Masukkan tanggal event baru (cth. 2024-09-30): ");
        String tanggal_event_baru = scanner.nextLine();

        System.out.print("Masukkan lokasi event baru: ");
        String lokasi_baru = scanner.nextLine();

        organizer.updateEvent(nama_event_update, tanggal_event_baru, lokasi_baru);
    }

    private void hapusEvent() {
        organizer.showEvents();
        System.out.print("\nMasukkan nama event yang ingin dihapus: ");
        String eventToRemove = scanner.nextLine();
        organizer.removeEvent(eventToRemove);
    }

    private void tampilkanInfoOrganizer() {
        System.out.println("\n<< Informasi Organizer >>");
        System.out.println("Nama Organizer  : " + organizer.getNamaOrganizer());
        System.out.println("Alamat Kantor   : " + organizer.getAlamatKantor());
    }   
    
    public static void main(String[] args) {
        ManajemenEvent manajemenEvent = new ManajemenEvent();
        manajemenEvent.start();
    }
}