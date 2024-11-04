/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_23176029latihan26waktusaatini;

/**
 *
 * @author shafi
 * NIM   : 23176029
 * Kelas : PBO1
 * Prodi : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu saat ini
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class SI_RegPagi_23176029Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date sekarang = new Date();

        // Mengatur format tanggal dan waktu
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Menampilkan hasil dengan format yang diinginkan
        System.out.println("Hari ini adalah hari: " + formatTanggal.format(sekarang));
    }
}
