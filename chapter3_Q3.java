import java.util.Scanner;

public class gnd{
    public static void main(String[] args) {     
        Scanner s = new Scanner(System.in);
        System.out.print("������ �Է��ϼ���>> ");
        int num = s.nextInt();

        for(int i = 1; i <=num; i++){
            for(int j = i; j <=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

}