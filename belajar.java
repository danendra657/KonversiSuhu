import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class belajar {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.println("Masukkan Celsius");
        double C = x.nextDouble();

        System.out.println("Pilih opsi: ");
        System.out.println("1. Farenheit ");
        System.out.println("2. Reamur ");
        System.out.println("3. Kelvin ");

        int opsi = x.nextInt();

        if(opsi == 1){
            double F = (C * 9/5) + 32;
            System.out.println(C + " adalah " + F);
        }

        else if(opsi == 2){
            double R = (C * 4/5);
            System.out.println(C + " adalah " + R);
        }

        else if(opsi == 3){
            double K = (C * 273);
            System.out.println(C + " adalah " + K);
        }

        else{
            System.out.println("Opsi tidak valid");
        }
    }
}
