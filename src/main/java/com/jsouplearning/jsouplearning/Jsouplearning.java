package com.jsouplearning.jsouplearning;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Jsouplearning {
    public static void main(String[] args) throws IOException {


//        Document document = null;
//        int j = 1;
//        for (int j = 1; j < 2; j++) {

        String [] a ={"3", "4", "9"};
        String link = "https://turbo.az/autos?q[sort]=&q[make][]=" + a + "&q[model][]=&q[model][]=";
        for (int i = 0; i <= link.length(); i++) {
            System.out.println(link);

        }

            Document doc = Jsoup.connect("https://turbo.az/autos?q%5Bsort%5D=&q%5Bmake%5D%5B%5D=9&q%5Bmodel%5D%5B%5D=&q%5Bmodel%5D%5B%5D=14").get();
            Elements productName = doc.getElementsByClass("products-i");

            for (Element product : productName) {

                Elements carName = product.getElementsByClass("products-i__name products-i__bottom-text");
                Elements attributes = product.getElementsByClass("products-i__attributes products-i__bottom-text");
                String[] atribittooSplittoo = attributes.get(0).text().split(", ");
                String year = atribittooSplittoo[0];
                String engine = atribittooSplittoo[1];
                String odoMetr = atribittooSplittoo[2];
                Elements price = product.getElementsByClass("products-i__price products-i__bottom-text");
                Elements dateTimeAndPlace = product.getElementsByClass("products-i__datetime");

                System.out.println("Car model: " + carName.text() + "  -  " + "Attributes: " + attributes.text() + "  -  "
                        + "Price: " + price.text() + "  -  " + "Date time and place: " + dateTimeAndPlace.text());

//            }
        }
    }
}
