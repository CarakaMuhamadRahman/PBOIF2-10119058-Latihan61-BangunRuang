/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung volume 
 *                     bangun ruang.
 */
public class PBOIF210119058Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BolaBasket basket = new BolaBasket();
       basket.setR(7);
       System.out.println("Jari-jari dari sebuah");
       System.out.println("bola basket adalah " + basket.getR());
       System.out.println("cm");
       System.out.println();
       System.out.printf("Hasil : V = %.1f cm^3 \n ",basket.hitungVolume());
       System.out.println("--------------------------");
       Tabung tabung = new Tabung();
       tabung.setR(10);
       tabung.setT(21);
       System.out.println("Sebuah tabung memiliki jari-jari");
       System.out.println("berukuran " + tabung.getR() + "cm. " + "Jika tingginya ");
       System.out.println("" + tabung.getT() + "cm,");
       System.out.println();
       System.out.printf("Hasil V = %.1f cm^3 \n",tabung.hitungVolume());
       System.out.println("---------------------------");
       Kerucut kerucut = new Kerucut();
       kerucut.setT(9);
       kerucut.setR(14);
       System.out.println("Diketahui tinggi sebuah");
       System.out.println("kerucut " + kerucut.getT() + "cm.Jika jari-");
       System.out.println("jarinya " + kerucut.getR() + "cm,");
       System.out.println();
       System.out.printf("Hasil : V = %.1f cm^3 \n",kerucut.hitungVolume());
    }
    
}
