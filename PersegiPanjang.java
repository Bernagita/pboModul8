/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author USER
 */
public class PersegiPanjang extends BangunDatar implements Keliling,Simetri{
    
    //atribut
    public int panjang;
    public int lebar;
    
    //method
    
    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
}
    @Override
    public double hitungKeliling(){
        return 2 *(this.panjang + this.lebar);
}
    @Override
    public double hitungSimputar(){
        return 2.0;
}
    @Override
    public double hitungSimlipat(){
        return 2.0;
}
    @Override
    public void tampilHasil(){
        System.out.println("Persegi Panjang");
        System.out.println("--------------");
        System.out.println("Luasnya : " + this.hitungLuas());
        System.out.println("Kelilingnya : " + this.hitungKeliling());
        System.out.println(" Sim. Putar : "+ this.hitungSimputar());
        System.out.println(" Sim. Lipat : " + this.hitungSimlipat());
    }
}
