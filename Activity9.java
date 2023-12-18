import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Apple");
        newList.add("Mango");
        newList.add("Pinapple");
        newList.add(3,"Banana");
        newList.add(4,"Grapes");
        newList.add(1,"Orange");
        System.out.println("Print All The Objects:");
        for (String S:newList) {
            System.out.println(S);
            
        }
        System.out.println("3rd element in the list is: " + newList.get(2));
        System.out.println("1st element in the list is: " + newList.get(0));
        System.out.println("5th element in the list is: " + newList.get(4));
        System.out.println("Is Chicku is in list: " + newList.contains("Mango"));
        System.out.println("Size of ArrayList: " + newList.size());
        newList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + newList.size());
    }
}
