package cs115;

/**
 * Created by icyhot on 27/05/2017.
 */
public enum EnumDays {

    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday");
    private String name;

    EnumDays(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
