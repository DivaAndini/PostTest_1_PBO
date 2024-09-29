/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;

public class Event {
    private String nama_event;
    private String tanggal_event;
    private String lokasi;

    public Event(String nama_event, String tanggal_event, String lokasi) {
        this.nama_event = nama_event;
        this.tanggal_event = tanggal_event;
        this.lokasi = lokasi;
    }

    public String getEventName() {
        return nama_event;
    }

    public void setEventName(String nama_event) {
        this.nama_event = nama_event;
    }

    public String getEventDate() {
        return tanggal_event;
    }

    public void setEventDate(String tanggal_event) {
        this.tanggal_event = tanggal_event;
    }

    public String getLocation() {
        return lokasi;
    }

    public void setLocation(String lokasi) {
        this.lokasi = lokasi;
    }

    public void displayInfo() {
        System.out.println("\nNama Event   : " + this.nama_event);
        System.out.println("Tangga Event : " + this.tanggal_event);
        System.out.println("Lokasi       : " + this.lokasi);
    }   
}
