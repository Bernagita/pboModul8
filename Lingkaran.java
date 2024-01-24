/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author USER
 */
// class 'Lingkaran

public class Lingkaran extends BangunDatar implements Keliling, Simetri {

    // atribut

    public int jari;

        // methods

        @Override

        public double hitungLuas () {

        return Math.PI * this.jari * this.jari;
          }

        @Override
        public double hitungKeliling(){

        return 2 * Math.PI *this.jari;
        }

        @Override
        public double hitungSimputar (){

        return Double.POSITIVE_INFINITY;
        }

        @Override
        public double hitungSimlipat (){
            return Double.POSITIVE_INFINITY;
            }

        @Override
        public void tampilHasil(){
            System.out.println("Lingkaran");
            System.out.println("-----------"); 
            System.out.println("Luasnya:" + this.hitungLuas()); 
            System.out.println("Kelilingnya: " + this.hitungKeliling());
            System.out.println("Sim. Lipat : " + this.hitungSimlipat());
            System.out.println("Sim. Putar : " + this.hitungSimputar());
}
}