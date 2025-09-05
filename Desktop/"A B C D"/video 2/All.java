// question 1

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number N : ");
//         int N=sc.nextInt();
//         if (N>=2){
//              int count=0;
//             for(int i=1; i<=N;i++){
//                 if(N%i==0){
//                     count=count+1;
//                 }
//             }
//             if(count==2){
//                 System.out.println("no. is prime");
//             }
//             else{
//                 System.out.println("no. is not prime");
//             }
//         }
//         else{
//             System.out.println(" not prime ");
//         }

//     }
// }


// question 2

// 3i+2


// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number N");
//         int N=sc.nextInt();
//         for(int i=1; i<=N; i++){
//             System.out.print((3*i)+2 + " ");
//         }
//     }
// }

// question 3

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number :");
//         int N=sc.nextInt();
//         int count=0;
//         if(N==0){
//             count=1;
//         }
//         else{
//             while(N>0){
//             N=N/10;
//             count=count+1;
//         }
//         }
        
//         System.out.println(count);
//     }
// }


// question 4

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number :");
//         int N=sc.nextInt();
//        int sum=0;
//         while(N>0){
//             int ld=N%10;
//             sum=sum+ld;
//             N=N/10;
//         }
//         System.out.println(sum);
       
        
//     }
// }        


// question 5

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number :");
//         int N=sc.nextInt();
//        int rev=0;
//         while(N>0){
//             int ld=N%10;
//             rev=(rev*10)+ld;
//             N=N/10;
//         }
//         System.out.println(rev);
       
        
//     }
// }        

// question 6

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int N=sc.nextInt();
//         int copy=N;
//         int sum=0;
//         while(N>0){
//             int ld=(N%10);
//             sum=(sum*10)+ld;
//             N=N/10;
//         }
//         if(copy==sum){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
// }


// question 7


// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int N=sc.nextInt();
//         int copy=N;
//         int count=0;
//         int sum=0;

//         while(N>0){
//             N=N/10;
//             count=count+1;
//         }
//         N=copy;

//         while(N>0){
//             int ld=(N%10);
//             sum=(int) (sum+ Math.pow(ld,count));
//             N=N/10;
//         }
//         N=copy;

//         if(N==sum){
//             System.out.println("armstrong number");
//         }
//         else{
//             System.out.println("mot armstrong");
//         }
//     }
// }


