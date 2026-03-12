import java.util.Scanner;
class Area{
    private int length = 0;
    private int width = 0;
    private int area = 0;
    public Area (){
    }

    public int GetLength(){
        return length;
    }
    public int GetWidth(){
        return width;
    }
    public int GetArea(){
        return GetWidth()*GetLength();
    }
    void DisplayDetails(){
        System.out.print("\n----DETAILS-----\n");
        System.out.println("The Length you input: "+GetLength());
        System.out.println("The Width you input: " +GetWidth());
        System.out.println("The Area is : " + GetArea());
    }
    void UserInput(Scanner x){
        System.out.print("Length: ");
        length = x.nextInt();
        System.out.print("Width: ");
        width = x.nextInt();
    }
}
public class Main{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("How many times you want to input such things?");
        int n = x.nextInt();

        Area[] p = new Area[n];

        for (int i = 0; i < n; i++){
            p[i] = new Area();
            p[i].UserInput(x);
        }
        for (int i = 0; i < n; i++){
            p[i].DisplayDetails();
        }

    }
}