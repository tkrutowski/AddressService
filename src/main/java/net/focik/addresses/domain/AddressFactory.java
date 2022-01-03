package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.share.AddressType;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class AddressFactory {

    IAddressDto createAddressFromDto(Address address, AddressType addressType) {

        IAddressDto iAddressDto = null;

        switch (addressType) {
            case TASK_CALENDAR:
               // iAddressDto = createTaskCalendarAddressDto(address);
                break;
            default:
                iAddressDto = null;
                break;


        }

        return iAddressDto;
    }

//    TaskCalendarAddressDtoDto createTaskCalendarAddressDto(Address address) {
//        TaskCalendarAddressDtoDto dbDto = new TaskCalendarAddressDtoDto();
//
//       // dbDto.setId(address.getId());
//        dbDto.setCity(address.getCity());
//        dbDto.setCommune(address.getCommune());
//        dbDto.setStreet(address.getStreet());
//        //dbDto.setLongitude(address.getLongitude());
//        //dbDto.setLatitude(address.getLatitude());
//
//        return dbDto;
//    }
}
