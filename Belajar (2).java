import java.util.Scanner;

public class Rafiesyg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("           (WeekDay)    (WeekEnd)     (Holiday)");
        System.out.println("Duku:       915.000     1.025.000     1.225.000");
        System.out.println("Jeruk:      915.000     1.025.000     1.225.000");
        System.out.println("Alpukat:    575.000     695.000       895.000");
        System.out.println("Jambu Air:  575.000     695.000       895.000");
        System.out.println("Durian:     595.000     715.000       915.000");
        System.out.println("Melon:      595.000     715.000       915.000");
        System.out.println("Belimbing:  495.000     575.000       755.000");
        System.out.println("Mangga:     495.000     575.000       755.000");
        System.out.println("Kedondong:  495.000     575.000       755.000");

             System.out.println("Masukkan Pilihan Kamar");
    String kamar = input.nextLine();
    
            System.out.println("Masukkan Pilihan Hari");
    String hari = input.nextLine();

            System.out.println("Berapa Malam Anda Meninap?");
    int Malam = input.nextInt();


        int harga=0;

        if (kamar.equals("Duku")){
            
            switch (hari) {
                case "Weekday":
                    harga= 915000;
                    break;
                case "Weekend":
                    harga= 1025000;
                    break;
                case "Holiday":
                    harga= 1225000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }

        else if (kamar.equals("Jeruk")){

            switch (hari) {
                case "Weekday":
                    harga= 915000;
                    break;
                case "Weekend":
                    harga= 1025000;
                    break;
                case "Holiday":
                    harga= 1225000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        
        }
        else if(kamar.equals("Alpukat")){
            switch (hari) {
                case "Weekday":
                    harga= 575000;
                    break;
                case "Weekend":
                    harga= 695000;
                    break;
                case "Holiday":
                    harga= 895000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if(kamar.equals("Jambu Air")){
             switch (hari) {
                case "Weekday":
                    harga= 575000;
                    break;
                case "Weekend":
                    harga= 695000;
                    break;
                case "Holiday":
                    harga= 895000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if (kamar.equals("Durian")){
             switch (hari) {
                case "Weekday":
                    harga= 595000;
                    break;
                case "Weekend":
                    harga= 715000;
                    break;
                case "Holiday":
                    harga= 915000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if(kamar.equals("Melon")){
            switch (hari) {
                case "Weekday":
                    harga= 595000;
                    break;
                case "Weekend":
                    harga= 715000;
                    break;
                case "Holiday":
                    harga= 915000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if(kamar.equals("Belimbing")){
            switch (hari) {
                case "Weekday":
                    harga= 495000;
                    break;
                case "Weekend":
                    harga= 575000;
                    break;
                case "Holiday":
                    harga= 755000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if (kamar.equals("Mangga")){
            switch (hari) {
                case "Weekday":
                    harga= 495000;
                    break;
                case "Weekend":
                    harga= 575000;
                    break;
                case "Holiday":
                    harga= 755000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else if(kamar.equals("Kedondong")){
            switch (hari) {
                case "Weekday":
                    harga= 495000;
                    break;
                case "Weekend":
                    harga= 575000;
                    break;
                case "Holiday":
                    harga= 755000;
                    break;
            
                default:
                harga=0;
                    break;
            }
        }
        else{
            System.out.println("Pilihan Tidak Valid");
        }
        System.out.println("Pilihan Kamar Anda: "+ kamar);
         System.out.println("Hari Yang Anda Pilih: "+ hari);
        System.out.println("Berapa Malam Anda menginap: "+ Malam);
        System.out.println("Total Harga: "+ harga*Malam);

    }
    
    }

    