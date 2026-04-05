🧩 Design Patterns: Facade & Composite (Java)

📌 Описание проекта

Бұл жоба құрылымдық паттерндерді (Structural Design Patterns) қолдануды көрсету үшін жасалған.
Жоба екі негізгі бөліктен тұрады:

- 🏨 Facade (Фасад) — қонақүй жүйесін жеңіл басқару
- 🌳 Composite (Компоновщик) — ұйым құрылымын иерархиялық басқару

---

🏨 1. Facade — Hotel Management System

📖 Идея

Facade паттерні күрделі жүйені бір ғана қарапайым интерфейс арқылы басқаруға мүмкіндік береді.

Бұл бөлімде қонақүйдің бірнеше ішкі жүйелері біріктірілді:

- 🛏️ RoomBookingSystem — номер брондау
- 🍽️ RestaurantSystem — ресторан қызметі
- 🎉 EventManagementSystem — іс-шаралар
- 🧹 CleaningService — уборка
- 🚕 TaxiService — такси шақыру

⚙️ Facade мүмкіндіктері

"HotelFacade" арқылы:

- 🏨 Номер брондау + тамақ + уборка
- 🎉 Мероприятие ұйымдастыру
- 🍽️ Ресторан + такси
- ❌ Бронь отмена
- 🧹 Уборка шақыру

▶️ Қолдану мысалы

HotelFacade facade = new HotelFacade();

facade.fullBooking("Aigerim");
facade.organizeEvent("IT Conference");
facade.restaurantWithTaxi("Dias");

---

🌳 2. Composite — Organization Structure

📖 Идея

Composite паттерні жеке объектілер мен олардың топтарын бірдей өңдеуге мүмкіндік береді.

🧱 Құрылым

- 👤 Employee — қызметкер (аты, должность, зарплата)
- 🧑‍💻 Contractor — уақытша қызметкер (бюджетке кірмейді)
- 🏢 Department — бөлім (ішінде басқа бөлімдер мен қызметкерлер бар)

⚙️ Мүмкіндіктер

- ➕ Қосу (add)
- ➖ Жою (remove)
- 📊 Жалпы бюджет есептеу
- 👥 Қызметкерлер санын есептеу
- 🌲 Иерархияны шығару

▶️ Қолдану мысалы

Department company = new Department("Company");

Department it = new Department("IT");
it.add(new Employee("Ali", "Developer", 5000));

company.add(it);

company.display("");

---

🚀 Қалай іске қосу

Компиляция:

javac src/**/*.java

Іске қосу:

java facade.Main
java composite.Main

---

🧠 Қорытынды

Facade

✔ Күрделі жүйені жеңілдетеді
✔ Бір ғана интерфейс береді

Composite

✔ Иерархиямен жұмыс істеуді жеңілдетеді
✔ Рекурсивті құрылым

---

👩‍💻 Автор

Студенттің практикалық жұмысы
Курс: Шаблоны проектирования приложений
