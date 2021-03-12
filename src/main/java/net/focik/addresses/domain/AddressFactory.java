package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.dto.TaskCalendarAddressDtoDto;
import net.focik.addresses.domain.share.AddressType;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class AddressFactory {

    private ModelMapper modelMapper;


    IAddressDto createAddressFromDto(AddressDbDto addressDto, AddressType addressType) {

        IAddressDto iAddressDto = null;

        Address address = modelMapper.map(addressDto, Address.class);
        switch (addressType) {
            case TASK_CALENDAR:
                iAddressDto = createTaskCalendarAddressDto(address);
                break;
            default:
                iAddressDto = null;
                break;


        }

        return iAddressDto;
    }

    TaskCalendarAddressDtoDto createTaskCalendarAddressDto(Address address) {
        TaskCalendarAddressDtoDto dbDto = new TaskCalendarAddressDtoDto();

       // dbDto.setId(address.getId());
        dbDto.setCity(address.getCity());
        dbDto.setCommune(address.getCommune());
        dbDto.setStreet(address.getStreet());
        //dbDto.setLongitude(address.getLongitude());
        //dbDto.setLatitude(address.getLatitude());

        return dbDto;
    }
}
