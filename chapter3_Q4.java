import java.util.Scanner;

public class gnd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
        
       String alp = s.next(); 

        char a = alp.charAt(0);
        for(int i = 0; i <=a-'a'; i++){
            for(char j = 'a'; j<=a-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}