import java.util.*;

public class Todolist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> todolist=new ArrayList<>();

        int choice;
        do{
            options();
            System.out.println("Enter your Choice - ");
            choice=sc.nextInt();
            
            switch (choice) {
                case 1:{
                    System.out.println("Enter Item to add in List - ");
                    String s=sc.next();
                    addlist(todolist,s);
                    break;
                }
                case 2:{
                    System.out.println("Enter the SI.No to delete the item in List");
                    int n=sc.nextInt();
                    removelist(todolist,n-1);
                    break;
                }
                case 3:{
                    displaylist(todolist);
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                
                default:{
                    System.out.println("Invalid");
                    break;
                }   
            }
        }while(choice!=4);
    }

    public static void options(){
        System.out.println();
        System.out.println("+-------------------+");
        System.out.println(" 1. Add Items ");
        System.out.println(" 2. Remove Items ");
        System.out.println(" 3. Display To Do List ");
        System.out.println(" 4. Exit ");
        System.out.println("+-------------------+");
        System.out.println();
    }

    public static void addlist(ArrayList<String> l,String s){
        l.add(s);
        System.out.println("Item added successfully!");
    }

    public static void removelist(ArrayList<String> l,int num){
        if(l.isEmpty()){
            System.out.println("Empty List! Nothing to delete.");
            return;
        }
        if(num>=0 && num<l.size()){
            String str=l.get(num);
            l.remove(num);
            System.out.println(str);
        }
        else{
            System.out.println("Invalid SI.NO ");
        }
    }

    public static void displaylist(ArrayList<String> l){
        if(l.isEmpty()){
            System.out.println("Empty List! Nothing to delete.");
            return;
        }
        System.out.println("To-do List");
        for(int i=0;i<l.size();i++){
            System.out.println((i+1)+" "+l.get(i));
        }
    }
}
