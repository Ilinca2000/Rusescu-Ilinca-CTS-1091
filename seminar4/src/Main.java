public class Main {
    public static void Main(String[] args) {
       MijlocTransportComun mijloc1 = Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "AGET(GJR#$)");
        MijlocTransportComun mijloc2 = Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "AGET(GJR#$)");
        MijlocTransportComun mijloc3 = Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "AGET(GJR#$)");
        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }


}
