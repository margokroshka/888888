package Phone;

public class Run {
    public static void main1() {
        Phone a = new Phone("1234567", "red", 123);
        Phone b = new Phone("1234568", "blue", 122);
        Phone c = new Phone("1234569", "black", 121);
        Phone c0 = new Phone("2234569", "black", 121);
        Phone c1 = new Phone("3234569", "black", 121);
        Phone c2 = new Phone("4234569", "black", 121);
        Phone c3 = new Phone("5234569", "black", 121);
        Phone c4 = new Phone("5234569", "black", 121);
        c.name = "Test";
        Phone c5 = new Phone();
        Phone c6 = new Phone();


        a.receiveCall(b);

        System.out.println();
        a.receiveCall(c.getNumber(), c.getName());


        a.sendMessage(b, c, c2, c0, c3);

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c.getName());
        System.out.println(c5.getNumber());

        System.out.println(c5.equals(c6));

    }

}
