package ft.finnt730;

import ft.finnt730.math.Add;
import ft.finnt730.pleasenouse.CreateJunkFile;
import ft.finnt730.pleasenouse.Lanse_LogicReversed;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] arg) {
        System.out.println(new BoolCheck(true, false).result());
        System.out.println(new ByteCheck((byte)1, (byte)1).result());
        System.out.println(new IntCheck(0, 1).result());



//        new ForEachLoop_fast(new Object[] {1,2,3}, (it) -> {
//            System.out.println(it);
//        });

//        new ForLoop_fast(1,10,1,(x) -> {
////            new ForLoop_slow(1,10,1,(y) -> {
////                System.out.printf("x + y = %d \n", new Add((int)x,(int)y).getIRes());
////                new ForEachLoop_fast(new Object[] {x,y}, (it) -> {
////
////                });
////            });
//
//        });

        new ForLoop_fast(0,1024,1, (q) -> {
            new ForLoop_fast(0,1024,1, (w) -> {
                int x = (int)q;
                int y = (int)w;
                if((new Add((int)x,(int)y).getIRes() & 1) != 0) {

                }
            });
        });


        new CreateJunkFile();


        System.out.println(new Lanse_LogicReversed((byte)0).getResult());

        System.gc();

    }

}
