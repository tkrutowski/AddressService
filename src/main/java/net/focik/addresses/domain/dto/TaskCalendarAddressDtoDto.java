package net.focik.addresses.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.focik.addresses.domain.IAddressDto;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskCalendarAddressDtoDto implements IAddressDto {
    private Long id;
    private String commune;
    private String city;
    private String street;
    private String latitude; //szerokosc
    private String longitude; //długość
}
