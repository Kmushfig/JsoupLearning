package com.jsouplearning.jsouplearning;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        String pageCode = "?page@2232@asa@sasa@alnskal@aska";
//        String [] arrStr = pageCode.split("@", 6) ;
//        for ( String arrv : arrStr) {
//
//            System.out.println(arrv);
//
//        }


//        Document document = null;
        Document doc = Jsoup.connect("https://turbo.az/autos?page=1").get();
        Elements productName = doc.getElementsByClass("products-i");

        for (Element product : productName) {

            Elements carName = product.getElementsByClass("products-i__name products-i__bottom-text");
            Elements attributes = product.getElementsByClass("products-i__attributes products-i__bottom-text");
            Elements price = product.getElementsByClass("products-i__price products-i__bottom-text");
            Elements dateTimeAndPlace = product.getElementsByClass("products-i__datetime");

//            String attributesText = attributes.text(); //split???
//            System.out.println(attributes);


            System.out.println("Car model: " + carName.text() + "  -  " + "Attributes: " + attributes.text() + "  -  "
                    + "Price: " + price.text() + "  -  " + "Date time and place: " + dateTimeAndPlace.text());

        }
//        String text = productName.text();

//        System.out.println("Model Marka = " +text.split(",")[0]);
//        System.out.println("Mator = " +text.split(",")[1]);
//        System.out.println("buraxilis ili = " +text.split(",")[2]);
//        System.out.println("Probeq = " + text.split(",")[3]);
//        System.out.println(productName.text());

//        System.out.println(doc);

           }
}
