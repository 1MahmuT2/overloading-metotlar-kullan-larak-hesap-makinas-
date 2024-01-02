import java.util.Scanner;

public class overloadinghesapmakinası {

    public static int toplama(int sayi1,int sayi2){
        return(sayi1+sayi2);
    }
    public static double bolme(int sayi1, int sayi2){
        return(sayi1/sayi2);
    }

    public static int cıkarma(int sayi1 , int sayi2){
        return(sayi1-sayi2);
    }
    public static int carpma(int sayi1, int sayi2){
        return(sayi1*sayi2);
    }

    static int toplama(int sayi1, int sayi2,int sayi3){
        return(sayi1+sayi2+sayi3);
    }
    double bolme(int sayi1, int sayi2,int sayi3){
        return(sayi1/sayi2/sayi3);
    }
    int carpma(int sayi1, int sayi2,int sayi3){
        return(sayi1*sayi2*sayi3);
    }
    static int cıkarma(int sayi1, int sayi2,int sayi3){
        return(sayi1-sayi2-sayi3);
    }

    


    public static void main(String[] args) {
       
        while(true){

            Scanner input = new Scanner(System.in);
        String islemler= "Toplama için 1\n"
                        +"Çıkarma için 2\n"
                        +"Çarpma için 3 \n"
                        +"Bölme için 4";

            System.out.println(islemler);
            System.out.println("--------------------------------------------------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem1= input.nextLine();
           
            

            if(islem1.equals("1")){
                System.out.print("Kaç işlemli (2or3) şeklinde: ");
                String number1=input.nextLine();

                if(number1.equals("2")){
                    System.out.print("1.SAYI: ");
                    int number2=input.nextInt();
                    System.out.print("2.SAYI: ");
                    int number3= input.nextInt();

                  System.out.println("Sonuç= "+toplama(number2, number3));
                   System.out.println("--------------------------------------------------------------");
                    

                }else if(number1.equals("3")){
                    System.out.print("1.SAYI: ");
                    int number2=input.nextInt();
                    System.out.print("2.SAYI: ");
                    int number3= input.nextInt();
                    System.out.print("3.SAYI: ");
                    int number4= input.nextInt();

                    System.out.println("Sonuç= "+toplama(number2, number3 ,number4));
                    System.out.println("--------------------------------------------------------------");
                }


            }else if(islem1.equals("2")){

                System.out.print("Kaç işlemli (2or3) şeklinde: ");
                String number1=input.nextLine();

                if(number1.equals("2")){
                    System.out.print("1. SAYI: ");
                    int number2= input.nextInt();
                    System.out.print("2. SAYI: ");
                    int number3= input.nextInt();

                    System.out.println("Sonuç= "+ cıkarma(number2, number3));
                    System.out.println("--------------------------------------------------------------");

                }else if(number1.equals("3")){
                    System.out.print("1 SAYI: ");
                    int number2= input.nextInt();
                    System.out.print("2. SAYI: ");
                    int number3= input.nextInt();
                    System.out.print("3. SAYI: ");
                    int number4 = input.nextInt();

                    System.out.println("Sonuç= "+ cıkarma(number2,number3, number4));
                    System.out.println("--------------------------------------------------------------");

                }
                
            }else if(islem1.equals("3")){
                System.out.print("1.SAYI: ");
                int number2= input.nextInt();
                System.out.print("2.SAYI: ");
                int number3= input.nextInt();

                System.out.println("Sonuç= "+ carpma(number2, number3));
                System.out.println("--------------------------------------------------------------");

            }else if(islem1.equals("4")){
                System.out.print("1.SAYI: ");
                int number2= input.nextInt();
                System.out.print("2.SAYI: ");
                int number3= input.nextInt();

                System.out.println("Sonuç= "+ bolme(number2, number3));
                System.out.println("--------------------------------------------------------------");
            }else{
                System.out.println("Geçersiz karakter\n"
                                  +"İşlemden çıkış yapılıyor...\n"
                                  +"Çıkış yapıldı.");
                break;                  
            }

        }

    }
}
