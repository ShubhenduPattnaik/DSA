import java.util.Scanner;

class SumOfNNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)(n*(n+1)/2));
    }
}