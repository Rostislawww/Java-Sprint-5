import java.time.*;
public interface TimeClient {
    void setWorkTime(int hour, int minute, int second);
    void setWorkDate(int day, int month, int year, int hour);
    void setTimeVacation(int year, int month, int day);
    LocalDateTime getLocalWorkTime();
    LocalDateTime getLocalWorkDate();
    LocalDateTime getLocalTimeVacatoin();
}