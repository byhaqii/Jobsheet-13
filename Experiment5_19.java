public class Experiment5_19 {
    static void show (String str, int... a) {
        System.out.println("String: "+str);
        System.out.println("Number of arguments/parameters: "+ a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show("Programming Fundaentals 2023", 100, 200);
        show("Information Technology", 1, 2, 3, 4, 5);
        show("Informatics");
    }
}
