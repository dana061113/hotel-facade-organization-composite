package facade;

public class HotelFacade {

    private RoomBookingSystem room;
    private RestaurantSystem restaurant;
    private EventManagementSystem event;
    private CleaningService cleaning;
    private TaxiService taxi;

    public HotelFacade() {
        room = new RoomBookingSystem();
        restaurant = new RestaurantSystem();
        event = new EventManagementSystem();
        cleaning = new CleaningService();
        taxi = new TaxiService();
    }

    // 🏨 Бронь + еда + уборка
    public void fullBooking(String name) {
        System.out.println("\n=== Толық бронь ===");
        room.bookRoom(name);
        restaurant.orderFood("Dinner");
        cleaning.scheduleCleaning();
    }

    // 🎉 Мероприятие
    public void organizeEvent(String groupName) {
        System.out.println("\n=== Мероприятие ===");
        event.bookHall();
        event.orderEquipment();
        room.bookRoom(groupName);
    }

    // 🍽️ Ресторан + такси
    public void restaurantWithTaxi(String name) {
        System.out.println("\n=== Ресторан + Такси ===");
        restaurant.bookTable(name);
        taxi.callTaxi(name);
    }

    public void cancelBooking(String name) {
        room.cancelRoom(name);
    }

    public void requestCleaning() {
        cleaning.cleanNow();
    }
}
