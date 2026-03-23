import java.util.Scanner;

class getDetails{
    private  String name = "";
    private  String age = "";

    public getDetails(){
    }

    public String getName(String name){
        return name;
    }

    public String getAge(String age){
        return age;
    }

    void setDetails(Scanner x){
        System.out.print("What is your name?");
        name = x.nextLine();
        System.out.print("What is your age?");
        age = x.nextLine();
    }

    void displayDetails(){
        System.out.println("Hello!" + getName(name));
        System.out.println("Your age is " + getAge(age));
    }


}

public class Main{
    public static void main(String[] args){
    Scanner x = new Scanner(System.in);
        /* Asks user how many times you want to input// */
    System.out.print("How many times you want to input details?");
    int n = x.nextInt();
    x.nextLine();
    getDetails[] p = new getDetails[n];

    for (int i = 0; i < n; i++){
        p[i] = new getDetails();
        p[i].setDetails(x);
    }

    for (int i = 0; i < n; i++){
        p[i].displayDetails();
    }

    }
}