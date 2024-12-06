package String;

public class Bulder {
    public static void main(String[] args){
        // Strings are immutable
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // chr at 0 index
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

    }
    
}
