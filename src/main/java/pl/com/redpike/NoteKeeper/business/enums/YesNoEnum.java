package pl.com.redpike.NoteKeeper.business.enums;

public enum YesNoEnum {

    YES_LOWERCASE("y", "Yes"),
    YES_UPPERCASE("Y", "Yes"),
    NO_LOWERCASE("n", "No"),
    NO_UPPERCASE("N", "No");

    private String databaseValue;
    private String readableValue;

    YesNoEnum(String databaseValue, String readableValue) {
        this.databaseValue = databaseValue;
        this.readableValue = readableValue;
    }

    public static YesNoEnum getEnum(String databaseValue) {
        if (databaseValue.equalsIgnoreCase(YES_LOWERCASE.getDatabaseValue()))
            return YES_UPPERCASE;
        if (databaseValue.equalsIgnoreCase(NO_LOWERCASE.getDatabaseValue()))
            return NO_UPPERCASE;

        throw new IllegalArgumentException();
    }

    public String getDatabaseValue() {
        return databaseValue;
    }

    public String getReadableValue() {
        return readableValue;
    }
}
