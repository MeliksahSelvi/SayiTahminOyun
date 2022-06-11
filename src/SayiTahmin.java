import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class SayiTahmin {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Random rand=new Random();

        int right=5,tahmin,random,indis=0;
        random=rand.nextInt(100);


        int []tahminler=new int[right];
        boolean isWin=false,outRange=false;

        while (right!=0){

            System.out.print("Bir Sayi Tahmin Edin :");
            tahmin= input.nextInt();

            if(tahmin<0 || tahmin>99){

                if(outRange==false){

                    outRange=true;

                    System.out.println("0 Ile 100 Arasinda Bir Sayi Giriniz!");
                    System.out.println("Simdilik Gormezden Gelecegiz.Hakkinizdan Dusebilir!!");
                }
                else{

                    right--;
                    tahminler[indis++]=tahmin;

                    System.out.println("Cok Fazla Hatali Sayi Girdiniz Hakklarinizdan Dusuldu!");
                    System.out.println("Kalan Hakkiniz :"+right);
                    System.out.println("Hatali Girmeye Devam Ederseniz Hakkinizdan Dusulecektir.!");
                }

                continue;
            }

            if(tahmin==random){

                System.out.println("Dogru Tahmin.\n"+(6-right)+". Denemede Basarili Oldunuz.");
                isWin=true;
                break;
            }

            else{

                right--;
                tahminler[indis++]=tahmin;

                if(tahmin<random){

                    System.out.println("Yanlis Tahmin.Biraz Daha Buyuk Bir Tahmin Yapin.");
                }

                else {

                    System.out.println("Yanlis Tahmin.Biraz Daha Kucuk Bir Tahmin Yapin.");
                }

                System.out.println("Kalan Tahmin Hakkiniz :"+right);
            }

        }

        if(!isWin){

            System.out.println("Kaybettiniz.");
            System.out.println("Gizli Sayimiz :"+random);
            System.out.println("Tahminleriniz :"+Arrays.toString(tahminler));

        }
    }
}
