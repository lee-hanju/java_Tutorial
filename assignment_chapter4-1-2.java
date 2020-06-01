import java.util.Scanner;

public class PhoneBook {
    Scanner sc = new Scanner(System.in);
    int num;
    Phone phone[];
    String name;
    String tel;

    public void getNum(){
        System.out.print("�ο���>> ");
        num = sc.nextInt();
        phone = new Phone[num];
    }
    public void getInfo(){
        for(int i = 0; i <num; i++){
            System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
            name = sc.next();
            tel = sc.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("����Ǿ����ϴ�.");
    }
    public void Search(){
        boolean tf = false;
        while(true){
            System.out.print("�˻��� �̸�>>");
            name=sc.next();

            if(name.equals("�׸�")){
                break;
            }
            for(int i=0; i<num; i++){
                if(name.equals(phone[i].getName())){
                    System.out.println(name+"�� ��ȣ�� " + phone[i].getTel() +" �Դϴ�. " );
                    tf=true;
                }
            }
            if(tf==false){
                System.out.println(name + " �� �����ϴ�.");
            }
        }            
    }
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.getNum();
        phonebook.getInfo();
        phonebook.Search();
    }

}