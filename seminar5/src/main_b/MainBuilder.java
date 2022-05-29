package main_b;

import clase_builder.Autobuz;
import clase_builder.AutobuzBuilder;
import clase_builder.AutobuzBuilderV2;

public class MainBuilder {
    public static void main(String[] args) {
        Autobuz autobuz;
        AutobuzBuilder builder=new AutobuzBuilder();
        autobuz=builder.build();
        Autobuz autobuz2;
        autobuz2=new AutobuzBuilder().setNumeSofer("Vasile").build();
        Autobuz autobuz3;
        autobuz3=new AutobuzBuilder().setStop(false).setNrInmatriculare("B333ABC").build();
        System.out.println(autobuz);
        System.out.println(autobuz2);
        System.out.println(autobuz3);

        AutobuzBuilderV2 autobuzBuilder  = new AutobuzBuilderV2();
        Autobuz a1=autobuzBuilder.setStop(true).setOpenDoors(true).setText("La multi ani!").build();
        Autobuz a2=autobuzBuilder.setNumeSofer("Vasile").build();
        Autobuz a3= autobuzBuilder.build();

        System.out.println("Noile autobuze: ");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);



    }
}