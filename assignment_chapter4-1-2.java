import java.util.Scanner;

public class PhoneBook {
    Scanner sc = new Scanner(System.in);
    int num;
    Phone phone[];
    String name;
    String tel;

    public void getNum(){
        System.out.print("인원수>> ");
        num = sc.nextInt();
        phone = new Phone[num];
    }
    public void getInfo(){
        for(int i = 0; i <num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            name = sc.next();
            tel = sc.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다.");
    }
    public void Search(){
        boolean tf = false;
        while(true){
            System.out.print("검색할 이름>>");
            name=sc.next();

            if(name.equals("그만")){
                break;
            }
            for(int i=0; i<num; i++){
                if(name.equals(phone[i].getName())){
                    System.out.println(name+"의 번호는 " + phone[i].getTel() +" 입니다. " );
                    tf=true;
                }
            }
            if(tf==false){
                System.out.println(name + " 이 없습니다.");
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