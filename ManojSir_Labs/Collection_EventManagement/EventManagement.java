import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Participant {
    private int participantId;
    private String participantName;
    private int age;
    private String email;
    private String phone;

    public Participant(int participantId, String participantName, int age, String email, String phone) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "ID: " + participantId + ", Name: " + participantName + ", Age: " + age + 
               ", Email: " + email + ", Phone: " + phone;
    }
}

class Event {
    private int eventId;
    private String eventName;
    private LocalDate eventDate;
    private String eventType;
    private List<Participant> participantsList;

    public Event(int eventId, String eventName, LocalDate eventDate, String eventType) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.participantsList = new ArrayList<>();
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public List<Participant> getParticipantsList() {
        return participantsList;
    }

    public void addParticipant(Participant participant) {
        participantsList.add(participant);
    }

    public void removeParticipant(int participantId) {
        participantsList.removeIf(p -> p.getParticipantId() == participantId);
    }

    @Override
    public String toString() {
        return "EventID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + 
               ", Type: " + eventType + ", Participants: " + participantsList.size();
    }
}

public class EventManagement {
    private Map<Integer, Event> eventsMap = new HashMap<>();

    //Add 
    public void addEvent(int eventId, String eventName, LocalDate eventDate, String eventType) {
        eventsMap.put(eventId, new Event(eventId, eventName, eventDate, eventType));
    }

    //Register 
    public void registerParticipant(int eventId, Participant participant) {
        Event event = eventsMap.get(eventId);
        if (event != null) {
            event.addParticipant(participant);
        } else {
            System.out.println("Event not found!");
        }
    }

    //Display 
    public void displayEventsSortedByDate() {
        List<Event> sortedEvents = new ArrayList<>(eventsMap.values());
        sortedEvents.sort(Comparator.comparing(Event::getEventDate));
        sortedEvents.forEach(System.out::println);
    }

    //Search 
    public Event searchEventByName(String eventName) {
        return eventsMap.values().stream()
                .filter(event -> event.getEventName().equalsIgnoreCase(eventName))
                .findFirst()
                .orElse(null);
    }

    //List 
    public void listParticipantsInEvent(int eventId) {
        Event event = eventsMap.get(eventId);
        if (event != null) {
            event.getParticipantsList().forEach(System.out::println);
        } else {
            System.out.println("Event not found!");
        }
    }

    //Remove
    public void removeParticipantFromEvent(int eventId, int participantId) {
        Event event = eventsMap.get(eventId);
        if (event != null) {
            event.removeParticipant(participantId);
        } else {
            System.out.println("Event not found!");
        }
    }

    //Display Events Where a Given Participant is Registered
    public void displayEventsForParticipant(int participantId) {
        eventsMap.values().stream()
                .filter(event -> event.getParticipantsList().stream()
                        .anyMatch(p -> p.getParticipantId() == participantId))
                .forEach(System.out::println);
    }

    //Filter
    public void filterEventsByType(String eventType) {
        eventsMap.values().stream()
                .filter(event -> event.getEventType().equalsIgnoreCase(eventType))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        EventManagement manager = new EventManagement();

        //Adding
        manager.addEvent(1, "Tech Workshop", LocalDate.of(2025, 4, 10), "Workshop");
        manager.addEvent(2, "Music Concert", LocalDate.of(2025, 4, 15), "Concert");

        //Creating 
        Participant p1 = new Participant(01, "Nikita", 23 "nikitapatil9423@gmail.com", "9637057818");
        Participant p2 = new Participant(02, "Piyush", 29, "piyushpatil8805@gmail.com", "9637057818");

        //Register
        manager.registerParticipant(1, p1);
        manager.registerParticipant(2, p2);

        //Display 
        System.out.println("Events sorted by date:");
        manager.displayEventsSortedByDate();

        //Search
        System.out.println("Search for Music Concert:");
        System.out.println(manager.searchEventByName("Music Concert"));

        //List
        System.out.println("Participants in Event 1:");
        manager.listParticipantsInEvent(1);

        //Remove
        manager.removeParticipantFromEvent(1, 01);

        //Display
        System.out.println("Events for Participant ID 102:");
        manager.displayEventsForParticipant(02);

        //Filter
        System.out.println("Filter events by type Concert:");
        manager.filterEventsByType("Concert");
    }
}
