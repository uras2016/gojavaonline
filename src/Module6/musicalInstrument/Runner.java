package Module6.musicalInstrument;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop();

        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            guitars.add(new Guitar());
        }

        musicShop.setGuitars(guitars);

        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            pianos.add(new Piano());
        }
        musicShop.setPianos(pianos);

        ArrayList<Trumpet> trumpets = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            trumpets.add(new Trumpet());
        }

        System.out.println(musicShop);


        Map<String, Integer> order = new HashMap<>();


        order.put("guitar", 7); // ?
        order.put("trumpet", 2);


        List<MusicalInstrument> boughtGuitars = prepareOrder(musicShop, order);
        List<MusicalInstrument> boughtTrumpets = prepareOrder(musicShop, order);
        System.out.println("removed guitars:" + boughtGuitars.size() + "removed trumpets: +" + boughtTrumpets.size());


        System.out.println("musicShop");
    }

    private static List<MusicalInstrument> prepareOrder(MusicShop musicShop, Map<String, Integer> order){
        ArrayList<MusicalInstrument> result  = new ArrayList<>();

        List<Guitar> guitars = musicShop.getGuitars();
        int numberOfBoughtGuitars = order.get("guitar");
        if (musicShop.getGuitars().size() < numberOfBoughtGuitars) throw  new IllegalStateException();
        List<Guitar> boughtGuitars = musicShop.getGuitars().subList(0, numberOfBoughtGuitars);
        List<Guitar> leftGuitars = musicShop.getGuitars().subList(numberOfBoughtGuitars,guitars.size());
        musicShop.setGuitars(leftGuitars);
        return result;

        List<Trumpet> trumpets = musicShop.getTrumpets();
        int numberOfBoughtTrumpets = order.get("trumpet");
        if (musicShop.getTrumpets().size() < numberOfBoughtTrumpets) throw  new IllegalStateException();
        List<Trumpet> boughtTrumpets = musicShop.getTrumpets().subList(0, numberOfBoughtTrumpets);
        List<Trumpet> leftTrumpets = musicShop.getTrumpets().subList(numberOfBoughtTrumpets,trumpets.size());
        musicShop.setTrumpets(leftTrumpets);
        return result;

    }
}







