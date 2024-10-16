import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int mark = sc.nextInt();
        // if(mark>=91 && mark<=100)
        //     System.out.println("O");
        // else if(mark>=81 && mark<=90)
        //     System.out.println("A");
        // else if(mark>=71 && mark<=80)
        //     System.out.println("B");
        // else if(mark>=61 && mark<=70)
        //     System.out.println("C");
        // else 
        //     System.out.println("F");
        
        
        // int yr = sc.nextInt();
        // if((yr%4==0)&&!(yr%100==0)||(yr%400==0))
        // {
        //      System.out.println("leap year");
        // }
        // else
        // {
        //      System.out.println("not leap year");
        // }
        
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int tree = sc.nextInt()
        // int a[][] = new int[r][c];
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        //         if((tree>=1 && tree<=c) || (tree%c==1) || (tree%4==0))
        //         {
        //             System.out.println("mango tree");
        //         }
        //         else
        //         {
        //             System.out.println("apple tree");
        //         }
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        
        // double del = Math.pow(b,2) - 4*(a*c);
        
        // if(del>0)
        // {
        // double root = (-b + Math.sqrt(del))/(2*a);
        // double root1 = (-b - Math.sqrt(del))/(2*a);
        // System.out.println(del+" "+root+" "+root1);
        // }
        // else
        // {
        //     System.out.println("No real roots");
        // }
        
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         System.out.print("*");
        //     }
        //         System.out.println();
        // }
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(i==0 || i==n-1 || j==0 || j==m-1)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //         System.out.println();
        // }
        
        
        //left angled triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     }

        
        //right angled triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }
        
        // inverted left angled triangle
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //          System.out.print("* ");
        //         }
        //     System.out.println();
        //     }   
        
        //inverted right angled triangle
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print("  ");
        //         }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //         }
        //      System.out.println();
        //     }
        
        
        //pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print(" ");
        //         }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //          System.out.print("*");
        //         }
        //      System.out.println();
        // }
        
        //inverted pyramid
            //  int n = 5;
            // for (int i = n; i >= 1; i--) {
            //      for (int j = n; j > i; j--) {
            //         System.out.print(" ");
            //         }
            //      for (int k = 1; k <= (2 * i - 1); k++) {
            //         System.out.print("*");
            //         }
            //         System.out.println();
            // }
          
          //diamond  
// int n = 5;
// for (int i = 1; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for (int i = n - 1; i >= 1; i--) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //         System.out.println();
        //     }
        
        // int n = 5,c=1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //         System.out.println();
        //     }
        
        // int n=5;
        // int odd = 1; 
        // int even = 2;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
              
        //         if (i % 2 != 0) {
        //             System.out.print(odd + " ");
        //             odd += 2;
        //         }
              
        //         else {
        //             System.out.print(even + " ");
        //             even += 2;
        //         }
        //     }
        //     System.out.println(); 
        // }
        
        //Hollow diamond
//         int n = 5;
// for (int i = 1; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         if (k == 1 || k == (2 * i - 1)) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
// for (int i = n - 1; i >= 1; i--) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         if (k == 1 || k == (2 * i - 1)) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

        
//HOURGLASS
//         int n = 5; // Number of rows in each half

// // Upper half of the hourglass
// for (int i = n; i >= 1; i--) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// // Lower half of the hourglass
// for (int i = 2; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// RHOMBUS
// int n = 5; // Number of rows
// for (int i = 1; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= n; k++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }


// //BUTTERFLY
// int n = 5; // Number of rows for each half

// // Upper half of the butterfly
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     for (int j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// // Lower half of the butterfly
// for (int i = n; i >= 1; i--) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     for (int j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }


        




        
        
        
        
        
    }
}
