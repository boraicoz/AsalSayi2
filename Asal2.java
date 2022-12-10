import java.util.Scanner;
public class Asal2{
    public static boolean asal(int number,int bolen){
      if(number<3)
          return (number == 2)?true:false;
      if(number==bolen)
          return true;
      else if(number%bolen==0)
      return false;
      else
          return asal(number,bolen+1);

    }

    public static void main(String[] args) {
        int number,temp;
        System.out.print("Kontrol edilecek sayi:");
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        if(asal(number,2))
        {
            System.out.println("Asal Sayi");
        }
        else
            System.out.println("Asal Degil");

    }
}
