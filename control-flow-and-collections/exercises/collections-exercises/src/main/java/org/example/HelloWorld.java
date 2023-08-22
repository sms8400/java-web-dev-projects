public class HelloWorld{
    public static void main(String []args){

            String str = "Foodie";
            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) == 'o') {
                    System.out.println("Found it at index " + i);
                    break;
                }
            }
        }
    }