package reverse_string;

public class Reverse_string {

    public static void main(String[] args) {
        String name = "Comfort";
        
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
    
}
