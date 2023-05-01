import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "IOS", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "IOS", "Черный");
        System.out.println();

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        System.out.println("4 - сортировка по цвету");
        System.out.print("Ввод: ");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
            if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(ram > 32){
            System.out.printf("Таких ноутбуков нет! \n");
            }else if(ram <= 2 ){
                System.out.printf(l1.toString()+ "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString());
            }else if(ram <= 4 && ram > 2){
                System.out.printf(l2.toString() + "\n" + l3.toString() + "\n" + l4.toString());
            }else if(ram <= 16 && ram > 4){
                System.out.printf(l4.toString() + "\n" + l3.toString());
            }else if (ram <= 32 && ram > 16) {
                System.out.printf(l3.toString() + "\n");
            }

        }else if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(ssd > 512){
                System.out.printf("Таких ноутбуков нет! \n");
            }else if(ssd <= 128){
                System.out.printf(l1.toString()+ "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString());
            }else if(ssd <= 256 && ssd > 128){
                System.out.printf(l2.toString() + "\n" + l3.toString() + "\n" + l4.toString());
            }else if (ssd <= 512 && ssd > 256){ 
                System.out.printf (l3.toString() + "\n");
            }

        }else if(choice == 3){

            System.out.print("Введите название OS: ");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("Windows")){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n");
            }else if(os.equals("IOS")){
                System.out.printf(l4.toString() + "\n" + l3.toString());
            }else System.out.println("Таких ноутбуков нет!");{
                sc1.close();
            }
                
            sc.close();
        } else if(choice == 4){

            System.out.print("Введите желаемый цвет: ");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("Сиреневый")){
                System.out.printf(l1.toString() + "\n");
            }else if(os.equals("Красный")){
                System.out.printf(l2.toString() + "\n");
            }else if(os.equals("Серый")){
                System.out.printf(l3.toString() + "\n");
            }else if(os.equals("Черный")){
                System.out.printf(l4.toString() + "\n");
            }else System.out.println("Таких ноутбуков нет!");{
                sc1.close();
            }
        }
    }
}





