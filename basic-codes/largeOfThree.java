import java.util.*;
class largeOfThree{
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first number: ");
        a= sc.nextFloat();

        System.out.print("enter second number: ");
        b= sc.nextFloat();

        System.out.print("enter third number: ");
        c= sc.nextFloat();

        if(a>b && b>c){
            System.out.println("the first number "+a+" is the biggest number");
        }
        else if(b>c){
            System.out.println("the second number "+b+" is the biggest number");
        }
        else{
            System.out.println("the third number "+c+" is the biggest number");
        }
    }
}
