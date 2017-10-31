package pl.com.redpike.NoteKeeper.entities.business.converter;

import org.junit.Before;
import org.junit.Test;
import pl.com.redpike.NoteKeeper.entities.business.enums.YesNoEnum;

import static org.junit.Assert.*;

public class YesNoEnumConverterTest {

    private static final String NO_LOWERCASE = "n";
    private static final String NO_UPPERCASE = "N";
    private static final String YES_LOWERCASE = "y";
    private static final String YES_UPPERCASE = "Y";
    private static final String ILLEGAL_ARGUMENT = "i";

    private YesNoEnumConverter yesNoEnumConverter;

    @Before
    public void init() {
        yesNoEnumConverter = new YesNoEnumConverter();
    }

    @Test
    public void convertToDatabase() {
        assertEquals(NO_LOWERCASE, yesNoEnumConverter.convertToDatabaseColumn(YesNoEnum.NO_LOWERCASE));
        assertEquals(NO_UPPERCASE, yesNoEnumConverter.convertToDatabaseColumn(YesNoEnum.NO_UPPERCASE));
        assertEquals(YES_LOWERCASE, yesNoEnumConverter.convertToDatabaseColumn(YesNoEnum.YES_LOWERCASE));
        assertEquals(YES_UPPERCASE, yesNoEnumConverter.convertToDatabaseColumn(YesNoEnum.YES_UPPERCASE));
    }

    @Test
    public void convertToUpperCase() {
        assertEquals(YesNoEnum.NO_UPPERCASE, yesNoEnumConverter.convertToEntityAttribute(NO_LOWERCASE));
        assertEquals(YesNoEnum.NO_UPPERCASE, yesNoEnumConverter.convertToEntityAttribute(NO_UPPERCASE));
        assertEquals(YesNoEnum.YES_UPPERCASE, yesNoEnumConverter.convertToEntityAttribute(YES_LOWERCASE));
        assertEquals(YesNoEnum.YES_UPPERCASE, yesNoEnumConverter.convertToEntityAttribute(YES_UPPERCASE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentException() {
        assertNotNull(YesNoEnum.getEnum(ILLEGAL_ARGUMENT));
    }
}