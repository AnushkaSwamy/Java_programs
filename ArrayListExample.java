import java.util.*;

class ArrayListExample {

    public static void main(String[] args){
        

        ArrayList<String>  = new ArrayList<>();
            
        System.out.println("Size of names array list is == "+name.size());
        
        name.add("Shashi");
        name.add("Kadgi");

        System.out.println("Size of names array list is == "+name.size());

        for (int i=0; i<name.size();i++){

            System.out.println(" name at "+ i + " is => "+name.get(i));

        }

       name.remove("Shashi"); 
       System.out.println("============");

        System.out.println("After Removing Size of names array list is == "+name.size());

        for (int i=0; i<name.size();i++){
            String nm = name.get(i);
            System.out.println(" name at "+ i + " is => "+nm);

        }

    }

}
