
package conversisuhu;

import java.util.Scanner;
/**
 *
 * @author Dwi Lestari
 */
public class ConversiSuhu {
    static double SuhuAwal;
    
    public static void main(String[] args) {
        String k ="Program Konversi Suhu[Y/T]:";
        Celcius fromCelcius = new Celcius();
        Farenheit fromFarenheit = new Farenheit();
        double Farenheit,Celcius;
        boolean valid=false;
        
    Scanner input = new Scanner(System.in);
    System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI SUHU  ");
    System.out.println("----------------------------------------");
    System.out.print("\n");
    System.out.print(k);
    
    String ans= input.next();
    while(ans.equals("Y"))
    {
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Pilih Jenis Suhu Saat Ini Untuk di Konversi");
        System.out.println("[1]. Celcius [2]. Fahrenheit");
        
        int suhu = input.nextInt();
        System.out.print("Masukkan nilai suhu awal :");
        SuhuAwal=input.nextDouble();
        switch(suhu){
            case 1:
                Farenheit = fromCelcius.toFarenheit();
                System.out.println("Suhu awal ="+SuhuAwal+" Celcius\nHasil:");
                System.out.println("Farenheit : "+Farenheit);
                valid=true;
                break;
            case 2:
                Celcius = fromFarenheit.toCelcius();
                System.out.println("Suhu awal ="+SuhuAwal+" Farenheit\nHasil:");
                System.out.println("Celcius : "+Celcius);
            default :
                System.out.println("Pilih Suhu yang akan dikonversi dengan benar");
                }
            System.out.print("\n");
            System.out.print("Ingin Lanjut "+k);
            ans = input.next();
            } 
        if(ans.equals("T")){
        System.out.println("program selesai");
        }
    }   
}
