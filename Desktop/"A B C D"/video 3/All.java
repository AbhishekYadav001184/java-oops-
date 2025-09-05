
//  question 1

// import java.util.Scanner;
// public class All {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number upper");
//         int upper=sc.nextInt();
//         for(int k=1;k<=upper;k++) {
//            int N=k;
//             int count=0;
//             for (int i=1;i<=N;i++){
//                 if(N%i==0){
//                     count=count+1;
//                 }
//             }
//             if(count==2){
//                 System.out.print(N + " ");
//             }
//             else{
//                 continue;
//             }
//         }   
//     }
// }


// question 2

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the upper ");
//         int upper=sc.nextInt();
//         for(int k=1;k<=upper;k++){
//             int N=k;
//             int copy=N;
//             int sum=0;
//             while(N>0){
//                 int ld=N%10;
//                 sum=sum*10+ld;
//                 N=N/10;

//             }
//             N=copy;
//             if(N==sum){
//                 System.out.print(N + " ");
//             }
//             else{
//                 continue;
//             }
//         }
//     }
// }


// question 3

// import java.util.Scanner;
// public class All{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the upper limit");
//         int upper=sc.nextInt();
//         for(int k=1;k<=upper;k++){
//             int N=k;
//             int count=0;
//             int sum=0;
//             int copy=N;
//             while(N>0){
//                 N=N/10;
//                 count=count+1;
//             }
//             N=copy;
//             while(N>0){
//                 int ld=N%10;
//                 sum=(int)(sum+Math.pow(ld,count));
//                 N=N/10;
//             }
//             N=copy;
//             if(N==sum){
//                 System.out.print(N + " ");
//             }
//             else{
//                 continue;
//             }
//         }
//     }
// }
