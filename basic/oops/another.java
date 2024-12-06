class students  {
    String name;
    int age;
    String address;
    public void write(){
        System.out.println("Good Students.");

    }
}
public class another{
public static void main(String[] args){
    students st = new students();
    st.name = "Rahul";
    st.age = 19;
    st.name = "Rojan";
    System.out.println(st.name);
    st.write();


}
}
    

