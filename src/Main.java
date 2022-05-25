import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        final double kmPrice = 0.10; // TL/km
        boolean isError = false;
        double distancePrice = 0;
        int age, distanceKM, tripType;
        /**
            * TripType == 1 (TEK YÖN)
            * TripType == 2 (GİDİŞ - GELİŞ)
        */

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Mesafeyi KM cinsinde giriniz: ");
        distanceKM = sc.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        age = sc.nextInt();

        System.out.print("Yolculuk Tipiniz (1 -> (TEK YÖN) , 2 -> (GİDİŞ - GELİŞ)): ");
        tripType = sc.nextInt();

        // CONTROL
        if(tripType > 0 && tripType < 3){
            if(distanceKM > 0){
                if(age > 0){

                    // NORMAL PRICE
                    distancePrice = distanceKM * kmPrice;

                    if(age <= 12){
                        distancePrice = distancePrice - (distancePrice * 50) / 100;
                    }else if(age > 12 && age <= 24){
                        distancePrice = distancePrice - (distancePrice * 10) / 100;
                    }else if(age > 65){
                        distancePrice = distancePrice - (distancePrice * 30) / 100;
                    }

                    if(tripType == 2){
                        distancePrice = distancePrice - (distancePrice * 20) / 100;
                    }

                }else{
                    isError = true;
                }
            }else{
                isError = true;
            }
        }else{
            isError = true;
        }

        // RESULT
        if(isError){
            System.out.println("Hatalı Veri Girdiniz!!!");
        }else{
            System.out.println("Toplam Tutar: " + distancePrice);
        }

    }
}
