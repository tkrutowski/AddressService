package net.focik.addresses.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.focik.addresses.domain.IAddress;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskCalendarAddressDto implements IAddress {
    private String commune;
    private String city;
    private String street;
    private String latitude; //szerokosc
    private String longitude; //długość
}
