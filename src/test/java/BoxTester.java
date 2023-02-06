import javax.swing.*;
import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();

        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();

        System.out.println("Please enter object's height:");
        float height = scanner.nextFloat();

        System.out.println("This is the box you need.");

        if(new Box3().validate(length,width,height)){
            System.out.println("Box3");

        }else if(new Box5().validate(length,width,height)){
            System.out.println("Box5");
        }

    }
}

