import java.sql.Array;
import java.util.*;

public class tasklar {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("main method acıldı. ");
        soru2();


    }
    //soru 1   gülsüm h

    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */


    public static void soru2() {
        // soru 2  merve h
        // Kullanicidan bir String aliniz.
        // String'de var olan her character'in sayisini ekrana yazdiriniz.
        // Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        // abaa   ==> a=3  b=1

        System.out.println("Lutfen bir metin giriniz : ");
        String metin = scan.nextLine();

        String[] arr = metin.split("");
        List<String> tekrarsizList = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
            System.out.println(tekrarsizList);
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




    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
            System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
        }
    }

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

}
