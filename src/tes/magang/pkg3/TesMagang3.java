/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.magang.pkg3;

/**
 *
 * @author Fajar
 */

// Deklarasi class pemainbola
class pemainbola {
    // class body
    private String nama;
    private int nomor_punggung;
    private String klub;
    
    // Constructor
    public pemainbola(String nama, int nomor_punggung, String klub) {
        this.nama = nama;
        this.nomor_punggung = nomor_punggung;
        this.klub = klub;
    }
    
    
    // getter setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNomor_punggung() {
        return nomor_punggung;
    }

    public void setNomor_punggung(int nomor_punggung) {
        this.nomor_punggung = nomor_punggung;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }
    
    
}

// deklarasi class gajipemainbola
class gajipemainbola{
    // class body
    private int gaji;

    // constructor
    public gajipemainbola(int gaji) {
        this.gaji = gaji;
    }

    // getter setter
    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    
}

public class TesMagang3 {

    public static void main(String[] args) {
        // Deklarasi variabel objek dari class pemainbola
        pemainbola pemainBola = new pemainbola("Muhamad Fajar", 11, "Chelsea");
        pemainbola pemainBola2 = new pemainbola("Neymar", 11, "PSG");
        pemainbola pemainBola3 = new pemainbola("Ciro Alves", 77, "Persib");
        
        // Deklarasi variabel objek dari class gajipemainbola
        gajipemainbola gajiPemainBola = new gajipemainbola(7000000);
        gajipemainbola gajiPemainBola2 = new gajipemainbola(15000000);
        gajipemainbola gajiPemainBola3 = new gajipemainbola(30000000);
        
        // Menggunakan objek yang telah dibuat
        System.out.println("*********************************************"+"\n"+
                           "**********INFORMASI PEMAIN PERTAMA***********"+"\n"+
                           "*********************************************"+"\n"+
                           "Nama            : " + pemainBola.getNama()+"\n"+
                           "Nomor Punggung  : " + pemainBola.getNomor_punggung()+"\n"+
                           "Klub            : " + pemainBola.getKlub()+"\n"+
                           "Gaji            : " + gajiPemainBola.getGaji());
        
        System.out.println("*********************************************"+"\n"+
                           "**********INFORMASI PEMAIN KEDUA*************"+"\n"+
                           "*********************************************"+"\n"+
                           "Nama            : " + pemainBola2.getNama()+"\n"+
                           "Nomor Punggung  : " + pemainBola2.getNomor_punggung()+"\n"+
                           "Klub            : " + pemainBola2.getKlub()+"\n"+
                           "Gaji            : " + gajiPemainBola2.getGaji());
        
        System.out.println("*********************************************"+"\n"+
                           "**********INFORMASI PEMAIN KETIGA************"+"\n"+
                           "*********************************************"+"\n"+
                           "Nama            : " + pemainBola3.getNama()+"\n"+
                           "Nomor Punggung  : " + pemainBola3.getNomor_punggung()+"\n"+
                           "Klub            : " + pemainBola3.getKlub()+"\n"+
                           "Gaji            : " + gajiPemainBola3.getGaji());
    }
    
}
