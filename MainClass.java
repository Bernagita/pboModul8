/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul8;

/**
 *
 * @author USER
 */
public class MainClass {

        public static void main(String[] args){

        //hitung luas, keliling, dan simetri dari suatu lingkaran A dig r=19 satuan

        Lingkaran A = new Lingkaran ();
        A.jari = 19;
        A.tampilHasil();

        //hitung luas, keliling, dan simetri dari suatu persegi panjang 3 dg pangang=10 & lebar=5 satuan

        PersegiPanjang B = new PersegiPanjang ();
        B.panjang = 10 ;
        B.lebar = 5;
        B.tampilHasil();

        // hitung luas dari segitiga C dg alas-12 & tinggi satuan

        Segitiga C = new Segitiga ();
        C.alas = 12;
        C.tinggi = 8;
        C.tampilHasil();
       
        //hitung luas, keliling, dan simetri dari suatu persegi  dg sisi = 40
        Persegi D = new Persegi ();
        D.sisi = 40;
        D.tampilHasil();
        }

}
