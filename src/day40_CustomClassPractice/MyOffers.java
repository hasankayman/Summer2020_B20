package day40_CustomClassPractice;

import java.util.*;


public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000, "VA", true, true, true, "SDET", true);
        offer2.setOfferInfo(175_000,"VA",true,true, false, "SDET", true);
        offer3.setOfferInfo(125000,"VA", true, true, true, "SDET", true);
        offer4.setOfferInfo(130_000,"PA",true,false, false, "QA", true);
        offer5.setOfferInfo(100_000,"CA",true,false, false, "QA", true);
        offer6.setOfferInfo(120000,"CO",true,true,true,"Senior SDET",true);
        offer7.setOfferInfo(110_000,"GA",true,false, false, "QA", true);


        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));


        for (Offer eachoffer : jobOffers) {
            eachoffer.getOfferInfo();
        }

        /*jobOffers.removeIf(p -> p.salary < 120000);
        System.out.println("Number of offers : " + jobOffers.size());
*/
        /*String myLocation = "VA";
        jobOffers.removeIf(p -> p.salary < 120000 || !p.state.equals(myLocation));
        System.out.println("Number of offers: " + jobOffers.size());*/

        //does not have PTO or does not have benefit or is not fulltime
        jobOffers.removeIf(p -> p.hasPTO == false || p.hasBenefit == false || p.isFullTime == false);
        System.out.println("Number of offers: " + jobOffers.size());

    }
}
