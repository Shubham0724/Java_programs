import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ch,i,n,cnt,flag,fact,sum;
        do{
            System.out.println("1: FIND FACTORIAL");
            System.out.println("2:DISPLAY FIRST 50 NUMBERS");
            System.out.println("3: FIND SUM AND AVG OF N NUMBERS");
            System.out.println("4: EXIT");
            System.out.println("ENTER THE CHOICE= ");
            ch=sc.nextInt();
            switch(ch)
           {
            case 1: System.out.println("enter the number");
            n=sc.nextInt();
            fact = 1;
            for(i=1;i<=n;i++)
                fact=fact*i;
                System.out.println("factorial=" + fact);
                break;
            case 2: cnt=1;
                   n=1;
                   while(cnt<=50)
                   {
                    flag=1;
                         for(i=2; i<=n/2; i++)
                         {
                            if(n%i==0)
                            {
                                flag=0;
                                  break;
                            }
                         }
                         if(flag==1) {
                            System.out.println(n +" ");
                            cnt++;
                         }
                         n++;
                   }
                   break;
                case 3 : System.out.println("enter limit");
                        n=sc.nextInt();
                    sum=n*(n+1)/2;
                    System.out.println("sum"+sum);
                    System.out.println("avg="+(float)sum/n);
                    break;

           } 

        }while(ch!=4);
                sc.close();
    }
    
}
