package packComparableOfertaSprzedazy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOfertaSprzedazy {
    public static void main(String[] args) {
        System.out.println();

        OfertaSprzedazy os1 = new OfertaSprzedazy("os11", 12.0);
        OfertaSprzedazy os2 = new OfertaSprzedazy("os2", 22.0);
        OfertaSprzedazy os3 = new OfertaSprzedazy("os3", 2.0);
        OfertaSprzedazy os4 = new OfertaSprzedazy("os4", 12.0);
        OfertaSprzedazy os5 = new OfertaSprzedazy("os5", 11.0);
        OfertaSprzedazy os6 = new OfertaSprzedazy("os6", 121.0);

        List<OfertaSprzedazy> ofertaSprzedazyList = new ArrayList<OfertaSprzedazy>();

        ofertaSprzedazyList.add(os1);
        ofertaSprzedazyList.add(os2);
        ofertaSprzedazyList.add(os3);
        ofertaSprzedazyList.add(os4);
        ofertaSprzedazyList.add(os5);
        ofertaSprzedazyList.add(os6);

        System.out.println();
        System.out.println("Lista ofert sprzedaży:");
        ofertaSprzedazyList.forEach(System.out::println);

        System.out.println();
        System.out.println("Lista posortowana:");
        Collections.sort(ofertaSprzedazyList);
        ofertaSprzedazyList.forEach(System.out::println);
    }
}
