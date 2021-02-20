package net.focik.addresses.domain;

import net.focik.addresses.domain.dto.TaskCalendarAddressDto;
import net.focik.addresses.domain.share.AddressFor;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
class AddressFactory {
    private ModelMapper modelMapper;


    IAddress createAddressFromDto(AddressDbDto addressDto, AddressFor addressFor) {

        IAddress iAddress = null;

        Address address = modelMapper.map(addressDto, Address.class);
        switch (addressFor) {
            case TASK_CALENDAR:
                iAddress = createTaskCalendarAddressDto(address);
                break;
            default:
                iAddress = null;
                break;


        }

        return iAddress;
    }

    TaskCalendarAddressDto createTaskCalendarAddressDto(Address address) {
        TaskCalendarAddressDto dbDto = null;

        //TODO create address

        return dbDto;
    }
}
