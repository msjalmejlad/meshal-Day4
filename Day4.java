Ex1 :

public class Main {
    public static void main(String[] args) {
        int[] number = {50, 60, 40, 10, 38, 65, 87, 56, 90, 100, 66, 80, 88, 40, 98};

        for(int n:number){
            if(n <= 100 && n>= 90){
                System.out.println(n+ " the grade A");
            } else if (n <= 89&& n >= 80) {
                System.out.println(n+ " the grade B");
            } else if (n>=79&&n>=70) {
                System.out.println(n+ " the grade C");
            } else if (n<=69&&n>=60) {
                System.out.println(n+ " the grade D");
            }else {
                System.out.println(n+ " the grade F");
            }

        }
    }
}
  
  Ex2 :
  
public class Main {
    public static void main(String[] args) {
        String[] name = {"Shaza","Mohamed","Asmaa","Anfal","Yousra","Amin","Radwa","Yasmeen"};
        for(String n : name){
            if(n.startsWith("A")){
                System.out.println(n);
            }
        }
    }
}

  Ex3 :
  
  public class Main {
    public static void main(String[] args) {
        int[] number = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};

        for (int n : number) {
            if(n>50) {
                System.out.println(n);
            }
        }
    }
}

  Ex4 :
  
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,38,65,87,56,90,100,53,80,88,40,98};
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the number you want check");
        int check = m.nextInt();
        boolean f = false;
        for(int i = 0; i <= number.length-1;i++){
        if (number[i]==check ){
                f = true;
            break;
                }
            }
        if(f){
            System.out.println("the number is here");
        } else {
            System.out.println("the number is not here");
        }


    }
}
