/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author USER
 */
public class Persegi extends BangunDatar implements Keliling,Simetri{
    
    //atribut
    public int sisi;
    ;
    
    //method
    
    @Override
    public double hitungLuas(){
        return (this.sisi* this.sisi) ;
}
    @Override
    public double hitungKeliling(){
        return 4 *(this.sisi);
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
        System.out.println("Persegi ");
        System.out.println("--------------");
        System.out.println("Luasnya : " + this.hitungLuas());
        System.out.println("Kelilingnya : " + this.hitungKeliling());
        System.out.println(" Sim. Putar : "+ this.hitungSimputar());
        System.out.println(" Sim. Lipat : " + this.hitungSimlipat());
    }
}

    

