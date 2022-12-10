import java.util.Scanner;
public class Asal {
public static boolean asal(int number,int temp){
    if(number==1)
        return false;
   else  if(number%--temp!=0)
    {
        return asal(number,temp);
    }
    else if(number%temp==0&&temp!=1)
    {
        return false;
    }
    else
         return true;
}

    public static void main(String[] args) {
        int number,temp;
        System.out.print("Kontrol edilecek sayi:");
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        temp=number;
        if(asal(number,temp))
        {
            System.out.println("Asal Sayi");
        }
            else
            System.out.println("Asal Degil");

    }
}
