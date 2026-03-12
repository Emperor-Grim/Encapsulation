import java.util.Scanner;

class getDetails{
    Scanner x = new Scanner(System.in);
    private  String name = "";
    private  String age = "";

    public getDetails(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName(String name){
        return name;
    }

    public String getAge(String age){
        return age;
    }

    public void setDetails(){
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

    getDetails[] p = new getDetails[n];

    for (int i = 0; i < n; i++){
        p[i] = new getDetails("","");
        p[i].setDetails();
    }

    for (int i = 0; i < n; i++){
        p[i].displayDetails();
    }



    }
}