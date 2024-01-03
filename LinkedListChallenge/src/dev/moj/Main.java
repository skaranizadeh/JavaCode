package dev.moj;

import java.util.*;

public class Main {

    record Place(String name, int distance) {
        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }


    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydnye", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = sc.nextLine().toLowerCase().substring(0, 1);

            //printMenu();
            try {
                switch (menuItem) {
                    case "l": {
                        System.out.println(placesToVisit);
                        break;
                    }
                    case "f": {
                        System.out.println("User wants to go forward");
                        if (!forward) { //Reversing Direction
                            forward = true;
                            if (iterator.hasNext()) {
                                iterator.next();//adjust position forward
                            }
                        }

                        if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                        break;
                    }
                    case "b":{
                        System.out.println("User wants to go backwards");
                        if (forward) { //Reversing Direction
                            forward = false;
                            if (iterator.hasPrevious()) {
                                iterator.previous();//adjust position backwards
                            }
                        }

                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                        break;
                    }
                    case "m":{
                        printMenu();
                        break;
                    }
                    default:{
                        quitLoop = true;
                    }
                };
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!");
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
       if (list.contains(place)) {
           System.out.println("Found duplicate: " + place);
           return;
       }
       for (var el : list) {
           if (el.name().equalsIgnoreCase(place.name())) {
               System.out.println("Found duplicate: " + place);
               return;
           }
       }
       int matchedIndex = 0;
       for (var el : list) {
           if (place.distance() < el.distance()) {
               list.add(matchedIndex, place);
               return;
           }
           matchedIndex++;
       }
        list.add(place);
    }


    private static void printMenu() {
        String textBlock = """
                Available actions (select word ar letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }



//    private static LinkedList<Place> places() {
//
//        LinkedList<Place> places = new LinkedList<>(List.of(new Place("Sydney", 0),
//                new Place("Adelaide", 1374),
//                new Place("Alice Springs", 2771),
//                new Place("Brisbane", 917),
//                new Place("Darwin", 3972),
//                new Place("Melbourne", 877),
//                new Place("Perth", 3923)
//        ));
//        return places;
//    }
//
//    private static void sortByDistance(LinkedList<Place> list) {
//
//        Collections.sort(list, new Comparator<Place>() {
//            @Override
//            public int compare(Place o1, Place o2) {
//                return o1.getDistance() - o2.getDistance();
//            }
//        });
        //System.out.println("after: " + list);
//    }

//}

//class Place {
//
//    private String townName;
//    private int distance;
//
//    public Place(String townName, int distance) {
//        this.townName = townName;
//        this.distance = distance;
//    }
//
//    public String getTownName() {
//        return townName;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    @Override
//    public String toString() {
//        return  townName;
//    }
}
