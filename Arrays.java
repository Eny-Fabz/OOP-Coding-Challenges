public class Arrays {
    public static void main(String[] args) {
        String[] orderIds = {"K641","Y532","X451","K789","P322"};

        for (String item : orderIds) {
            if (item.startsWith("K")) {
                System.out.println(item);
            }
        }
    }
}