
package com.mycompany.bmikotta;
import java.util.Scanner;
public class BMIRensi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int jenisKelamin, hasil;
      float berat, tinggi, bmi, meter;
      double broca;
          System.out.println("==================================");
          System.out.println("Menentukan Berat Badan Ideal");
          System.out.println("==================================");
          System.out.println("1.jenisKelamin");
          System.out.println("2.jenisKelamin");
          System.out.println("...................................");
          System.out.println("Masukkan jenis kelamin = ");
          jenisKelamin = input.nextInt();
          System.out.println("Masukkan Berat Badan = ");
          berat = input.nextFloat();
          System.out.println("Masukkan Tinggi Badan = ");
          tinggi = input.nextFloat();
       meter = tinggi / 100;
       bmi = (berat / (meter * meter));
       System.out.println("BMI = " + bmi + " "); 
          if(bmi < 18.5){
              System.out.println("Kurus");
          }else if (bmi <= 22.9){
              System.out.println("Normal");
          }else if (bmi < 24.9){
              System.out.println("Gemuk");
          }else {
              System.out.println("Obesitas");
          }
          System.out.println("==================================");
          switch (jenisKelamin){
              case 1 : broca = ((tinggi - 100)-(0.10 * (tinggi - 100)));
              break;
              case 2 : broca = ((tinggi - 100)-(0.15 * (tinggi - 100)));
              break;
              default : broca = 0;
          }
          hasil = (int)broca;
          System.out.println("Berat Badan Menurut Brooca = " + hasil + "kg");
    }
}

