import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("make thy choice of favorite pet with a 1 for dog and a 2 for cat!");
        int a = s.nextInt();
        Favorite b;
        if(a == 1)
        {
         b = new Dog();
         b.roam();
        }
        else if(a == 2)
        {
        b = new Cat();
        b.roam();
        }
         else if(a != 1 || a != 2){
        System.out.println("Cat and dog both walk away since"
        +   " you did not choose them :( -1 love");
        }

    }
}