
import java.util.Scanner;

import java.util.*;


public class tasklar {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("main method acıldı. ");

        soru1();

        soruDort();

        sumOfDigits();


        soru2();
        soru1();
        sumOfDigits();
        soruDokuz();


    }
    //soru 1   gülsüm h

    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

       */




    public static void soru1(){
        System.out.println("\n\nbir sayı giriniz");
        int sayi=scan.nextInt();
        int birlerBas=sayi%10;
        int onlarBas =(sayi/10)%10;
        int yuzlerBas=sayi/100;
        if (Math.pow(birlerBas,3)+Math.pow(onlarBas,3)+Math.pow(yuzlerBas,3)==sayi){
            System.out.println(sayi+": armstrong sayıdır.");
        }else System.out.println("sayı armstrong değildir.");
    }


    public static void soru2() {
        // soru 2  merve h
        // Kullanicidan bir String aliniz.
        // String'de var olan her character'in sayisini ekrana yazdiriniz.
        // Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        // abaa   ==> a=3  b=1

        System.out.println("\nLutfen bir metin giriniz : ");
        String metin = scan.nextLine();

        String[] arr = metin.split("");
        List<String> tekrarsizList = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }
        int sayac = 0;
        for (int i = 0; i < tekrarsizList.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (tekrarsizList.get(i).equals(arr[j])) {
                    sayac++;
                }
            }
            System.out.print(tekrarsizList.get(i) + " = " + sayac + " ");
            sayac = 0;
        }


    }


    //soru 3  hakan h
    /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

    //soru 4  yunus emre h
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */

    public static void soruDort(){

        System.out.print("Kelim Girin: ");
        String kelime = scan.next();
        System.out.print("Bir sayi girin: ");
        int sayi = scan.nextInt();

        String ilkSonHarf= kelime.substring(0,1)+kelime.substring(kelime.length()-1);

        String tekrarliKelime="";
        for (int i = 1; i <= sayi; i++) {
            tekrarliKelime += ilkSonHarf;
        }
        System.out.println(tekrarliKelime);


    }


    //soru 5  sümeyra h

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */


    //soru 6  ayse h

      /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */


//soru 7  salim h

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


    //soru 8  sena h

      /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric tam bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */


    //soru 9  naz h

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void soruDokuz() {


        Scanner scan = new Scanner(System.in);

        System.out.print("\nBir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");

    }



    //soru 10  erhan h

     /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */


// soru 11  enise h


     /*
 Create a method that accepts a String as parameter and finds the sum of digits in that String.
 Example:
 input : J4\/4 1$ 34$¥
 output : 16

 Hint:
 Character.isDigit()
 Integer.valueOf()
*/
     public static void sumOfDigits(){

         System.out.println("\nIcinde sayı da olan bir string giriniz");
         // dummy ilazımmm coooogggg laazım
         String str= scan.nextLine();

         int sum=0;

         for(int i=0; i<str.length();i++){

             if(Character.isDigit(str.charAt(i))){
                 sum+=Integer.parseInt(String.valueOf(str.charAt(i)));

             }

         }

         System.out.println("Sum of digits:"+sum);
     }

}
