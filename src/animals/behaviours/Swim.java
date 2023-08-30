package animals.behaviours;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Swim {
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    LocalDateTime getDurationOfSwim(LocalDateTime start, LocalDateTime end);
}
