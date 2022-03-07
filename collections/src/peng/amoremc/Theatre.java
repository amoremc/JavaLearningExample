package peng.amoremc;

import java.util.*;

public class Theatre {

    private final String theatreName;

    private List<Seat> seats = new ArrayList<>();
    //List is interface, ArrayList is class.
    //we can easily switch from arrayList to linkedList, but the object is just LIST,
    //the additional method in arrayList and linkedList cannot be used in object.
//    private List<Seat> seats = new LinkedList<>();

    // to be more generic, we can swith from List to Collection.
    //in this way, any class implement "Collection" can be used to generate a new object, to contain "seats"
//    private Collection<Seat> seats = new ArrayList<>();
//    private Collection<Seat> seats = new HashSet<>();
//    private Collection<Seat> seats = new LinkedHashSet<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++){
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);//用对应类的method，而不是interface里的method，因为已经被override了
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }
    //注意区分 collections 和 collection
    public boolean reserveSeat(String seatNumber) {

//Edition3: the source code of binary search
        int low = 0;
        int high = seats.size() - 1;

        while (low <= high) {
            System.out.println(".");//to check how many times to compare to get the target value.
            int mid = (low + high) /2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;


//Edition2: usign the method in "collections" class, to do binary search automatically.
//        //remember the list should be sorted by sequence, before you do binary search.
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if (foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }


//Edition-1: without binary search
//        Seat requestedSeat = null;
//        for (Seat seat : seats) {
//            System.out.println(".");//to find how many times needed to find a seat is reserved or not.
//            if (seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    //for testing
    public  void getSeats(){
        for (Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }

    }

//    private class Seat {
    private class Seat implements Comparable<Seat>{

            private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        //override the method "compareto"in interface "Comparable"
    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved for you.");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat" + seatNumber + "cancelled.");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
