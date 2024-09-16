package mapper;

import model.Date;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DateMapper {

    Date mapDate(int dia, int mes, int ano);

}
