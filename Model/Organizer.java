/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;

public class Organizer {
    private String nama_organizer;
    private String kontak;
    private static ArrayList<Event> events = new ArrayList<>();

    public Organizer(String nama_organizer, String kontak) {
        this.nama_organizer = nama_organizer;
        this.kontak = kontak;
    }

    public String getOrganizerName() {
        return nama_organizer;
    }

    public void setOrganizerName(String nama_organizer) {
        this.nama_organizer = nama_organizer;
    }

    public String getContactInfo() {
        return kontak;
    }

    public void setContactInfo(String kontak) {
        this.kontak = kontak;
    }

    public static void addEvent(Event event) {
        events.add(event);
    }

    public static void showEvents() {
        if (events.isEmpty()) {
            System.out.println("<< Tidak Ada Event yang Tersedia >>");
        } else {
            for (Event event : events) {
                event.displayInfo();
                System.out.println("--------------");
            }
        }
    }
    
    public static void updateEvent(String nama_event, String tanggal_event, String lokasi_baru) {
        boolean found = false;
        for (Event event : events) {
            if (event.getEventName().equals(nama_event)) {
                event.setEventDate(tanggal_event);
                event.setLocation(lokasi_baru);
                System.out.println("<< Event '" + nama_event + "' Telah Diperbarui >>");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("<< Event Tidak Ditemukan >>");
        }
    }

    public static void removeEvent(String nama_event) {
        Iterator<Event> iterator = events.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.getEventName().equals(nama_event)) {
                iterator.remove();
                System.out.println("<< Event '" + nama_event + "' Telah Dihapus >>");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("<< Event Tidak Ditemukan >>");
        }
    }
}
