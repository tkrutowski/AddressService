package net.focik.addresses.domain;

import net.focik.addresses.domain.Address;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AddressConfigTest {

    @Autowired
    ModelMapper modelMapper;
    @Test
    void modelMapper() {
        //when
        AddressDbDto dto = getAddress();

        //given
        Address address = modelMapper.map(dto, Address.class);

        //then
        assertEquals(dto.getId(), address.getId());
        assertEquals(dto.getCity(), address.getCity());
        assertEquals(dto.getCommune(), address.getCommune());
        assertEquals(dto.getStreet(), address.getStreet());
        assertEquals(dto.getZip(), address.getZip());
        assertEquals(dto.getCoordinates(), address.getCoordinates());
    }

    private AddressDbDto getAddress(){
        AddressDbDto address=new AddressDbDto();
        address.setId(2l);
        address.setCommune("Poznań");
        address.setCity("Poznań");
        address.setStreet("Szyperska 13D/32");

        return address;
    }
}