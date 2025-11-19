import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    int severity;
    Alert(String type, int severity) {
        this.type = type;
        this.severity = severity;
    }
    public String toString() {
        return type + " | Severity: " + severity;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("vitals", 5),
            new Alert("system", 2),
            new Alert("medication", 4),
            new Alert("vitals", 3)
        );

        // Predicate – only show vital alerts with severity >= 4
        Predicate<Alert> filter = a -> a.type.equals("vitals") && a.severity >= 4;

        List<Alert> filtered = alerts.stream()
                                     .filter(filter)
                                     .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}

