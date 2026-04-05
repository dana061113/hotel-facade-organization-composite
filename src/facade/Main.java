package facade;

public class Main {
    public static void main(String[] args) {

        HotelFacade facade = new HotelFacade();

        facade.fullBooking("Aigerim");
        facade.organizeEvent("IT Conference");
        facade.restaurantWithTaxi("Dias");

        facade.cancelBooking("Aigerim");
        facade.requestCleaning();
    }
}
