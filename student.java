public class student {
    int id;
    String name;

   
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void details() {
        System.out.println(id);
        System.out.println(name);
    }
}
