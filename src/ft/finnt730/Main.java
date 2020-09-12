package ft.finnt730;

public class Main {

    public static void main(String[] arg) {
        System.out.println(new BoolCheck(true, false).result());
        System.out.println(new ByteCheck((byte)1, (byte)1).result());
        System.out.println(new IntCheck(0, 1).result());



//        new ForEachLoop_fast(new Object[] {1,2,3}, (it) -> {
//            System.out.println(it);
//        });

        new ForLoop_slow(1,10,1,(x) -> {
            new ForLoop_slow(1,10,1,(y) -> {
                System.out.printf("i : %d || j : %d \n", x, y);
            });
        });

    }

}
