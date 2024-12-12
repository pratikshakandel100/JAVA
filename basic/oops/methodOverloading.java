public class methodOverloading {
    public static int greeding(int a, int b){
        return a+b;
    }
    public static String greeding(String greed, String name){
        return greed + name;
    }
    public static String greeding(String grees, String firstname, String Lastname){
        return grees + firstname + Lastname;
    }
        public static void main(String[] args) {
        System.out.println(greeding(5,6));

    }
    
}
