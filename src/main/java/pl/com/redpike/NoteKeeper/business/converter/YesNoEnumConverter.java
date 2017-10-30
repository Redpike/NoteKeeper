package pl.com.redpike.NoteKeeper.business.converter;

import pl.com.redpike.NoteKeeper.business.enums.YesNoEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class YesNoEnumConverter implements AttributeConverter<YesNoEnum, String> {

    @Override
    public String convertToDatabaseColumn(YesNoEnum yesNoEnum) {
        return yesNoEnum.getDatabaseValue();
    }

    @Override
    public YesNoEnum convertToEntityAttribute(String s) {
        return YesNoEnum.getEnum(s);
    }
}
