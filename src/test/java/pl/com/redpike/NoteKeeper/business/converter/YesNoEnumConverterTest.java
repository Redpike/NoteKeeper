package pl.com.redpike.NoteKeeper.business.converter;

import org.junit.Before;
import org.junit.Test;
import pl.com.redpike.NoteKeeper.business.enums.YesNoEnum;

import static org.junit.Assert.assertEquals;

public class YesNoEnumConverterTest {

    private static final String NO_LOWERCASE = "n";
    private static final String YES_LOWERCASE = "y";
    private static final String ILLEGAL_ARGUMENT = "no";

    private YesNoEnumConverter yesNoEnumConverter;

    @Before
    public void init() {
        yesNoEnumConverter = new YesNoEnumConverter();
    }

    @Test
    public void checkConverterForLowerCase() {
        assertEquals(yesNoEnumConverter.convertToEntityAttribute(NO_LOWERCASE), YesNoEnum.NO_UPPERCASE);
        assertEquals(yesNoEnumConverter.convertToEntityAttribute(YES_LOWERCASE), YesNoEnum.YES_UPPERCASE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExceptionThrowing() {
        assertEquals(yesNoEnumConverter.convertToEntityAttribute(ILLEGAL_ARGUMENT), YesNoEnum.NO_UPPERCASE);
    }
}