package com.jsouplearning.jsouplearning;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


//        Document document = null;
//        int j = 1;
        for (int j = 1; j < 2 ; j++) {

            Document doc = Jsoup.connect("https://turbo.az/autos?page=" + j).get();
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

//              System.out.println("Car model: " + carName.text() + "  -  " + "Attributes: " + attributes.text() + "  -  "
//              + "Price: " + price.text() + "  -  " + "Date time and place: " + dateTimeAndPlace.text());

            }
//        String text = productName.text();

//        System.out.println("Model Marka = " +text.split(",")[0]);
//        System.out.println("Mator = " +text.split(",")[1]);
//        System.out.println("buraxilis ili = " +text.split(",")[2]);
//        System.out.println("Probeq = " + text.split(",")[3]);
//        System.out.println(productName.text());

//        System.out.println(doc);


//        String pageCode = "?page@2232@asa@sasa@alnskal@aska";
//        String [] arrStr = pageCode.split("@", 6) ;
//        for ( String arrv : arrStr) {
//            System.out.println(arrv);
//        }

        }
    }
}
