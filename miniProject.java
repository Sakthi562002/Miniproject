import java.util.Scanner;
public class miniProject {
    public static void PrintEvenNumbers(int a,int b){

        for (int i = a; i <=b; i++) {
            if(i%2==0)
            {
                System.out.println(i);
            }
            
        }

    }
    public static void CheckPrime(int a){

        int count = 0;
        for(int i =1; i<=a; i++)
        {
            if(a%i==0){
                count++;
            }
        }
        if(count ==2)
        {
            System.out.println(a +" is Prime Number");
        }
        else{
            System.out.println(a +" is not Prime Number");
        }

    }
    
    public static void CheckPalindrone(int num)
    {
            int temp = num;
            int rev = 0;
            while( num > 0)
            {
                int ext = num%10;
                rev = rev*10 + ext;
                num = num/10;
            }
            if(rev == temp){
                System.out.println(temp +" is Palindrone");
            }
            else{
                System.out.println(temp +" is not Palindrone");
            }
    }

    public static void SumOfOddNunber(int a, int b){
            int sum = 0;
        for (int i = a; i<=b; i++) {
            if(i%2==1)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println(" 1.PrintEvenNumbers \n 2.CheckPrime \n 3.CheckPalindrone \n 4.SumOfOddNumber \n 5.Exit");

        System.out.println("Enter your Choice");
        int choice = s.nextInt();

        switch (choice)
        {
            case 1:{
                System.out.println("Enter Starting Range");
                int a = s.nextInt();

                System.out.println("Enter Ending Range");
                int b = s.nextInt();

                PrintEvenNumbers(a, b);



            }
            break;

            case 2:{
                System.out.println("Enter the Number");
                int a = s.nextInt();

                CheckPrime(a);


            }
            break;

            case 3:{
                System.out.println("Enter the Number");
                int a = s.nextInt();

                CheckPalindrone(a);



            }
            break;

            case 4:{
                System.out.println("Enter Starting range");
                int a = s.nextInt();

                System.out.println("Enter ending range");
                int b = s.nextInt();

                SumOfOddNunber(a, b);

            }
            break;

            case 5:{
                System.out.println("ThankYou.....");
                System.exit(0);

            }
            break;
            
            default:System.out.println("Invalid Choice");

        }
        }
    }
    
}
