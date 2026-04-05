package facade;

public class RoomBookingSystem {

    public void bookRoom(String name) {
        System.out.println(name + " үшін номер брондалды");
    }

    public void cancelRoom(String name) {
        System.out.println(name + " бронь отмена жасалды");
    }

    public void checkAvailability() {
        System.out.println("Бос номерлер тексерілді");
    }
}
