// question 1


// code to find the middle digit if a number 
 
// import java.util.Scanner;
// public class middle {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the string or number :");
//         String num=sc.nextLine();
//         int len=num.length();
//         int mid=len/2;
//         if (len%2==0){
//             System.out.println(" " + num.charAt(mid-1) + " " + num.charAt(mid));
//         }
//         else{
//             System.out.println(" " + num.charAt(mid));
//         }
//     }
// }

// practice question

// import java.util.Scanner;
// public class middle{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number N : ");
//         int N=sc.nextInt();
//         int copy=N;
//         int count=0;
//         while(N>0){
//              int ld=N%10;
//             count=count*10+ld;
//             N=N/10;
//         }
//         N=copy;
//         if(N==count){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
// }


// import java.util.Scanner;
// public class middle{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number N : ");
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
//             int ld=N%10;
//             sum=(int)(sum+Math.pow(ld,count));
//             N=N/10;
//         }
//         N=copy;
//         if(N==sum){
//             System.out.println("armstrong");
//         }
//         else{
//             System.out.println("not armstrong");
//         }
//     }
// }     



// question 2 way too long words

// import java.util.Scanner;
// public class middle{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String n=sc.nextLine();
//         if(n.length()>10){
//             System.out.println(n.charAt(0) + "" + (n.length()-2) + "" + n.charAt(n.length()-1));
//         }
//         else{
//             System.out.println(n);
//         }
        
//     }
// }

