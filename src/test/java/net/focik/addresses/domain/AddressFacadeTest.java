package net.focik.addresses.domain;

import net.focik.addresses.domain.dto.TaskCalendarAddressDtoDto;
import net.focik.addresses.domain.share.AddressType;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AddressFacadeTest {

    @Autowired
    AddressFacade facade;

    @Test
    @Transactional
    void should_add_address() {

        assertDoesNotThrow(() -> facade.addAddress(getAddress()));
    }

    @Test
    @Transactional
    void should_return_address_when_id_given() {
        //given
        Long id = facade.addAddress(getAddress());

        //when
        TaskCalendarAddressDtoDto  addressDto = (TaskCalendarAddressDtoDto) facade.getAddressByType(id, AddressType.TASK_CALENDAR);

        //then
        Assertions.assertEquals(id, addressDto.getId());

    }


    private AddressDbDto getAddress(){
        AddressDbDto address=new AddressDbDto();
//        address.setId(2l);
        address.setCommune("Poznań");
        address.setCity("Poznań");
        address.setStreet("Szyperska 13D/32");

        return address;
    }
}