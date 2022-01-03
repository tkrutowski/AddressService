package net.focik.addresses.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

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
        Address result = facade.getAddress(id);

        //then
        Assertions.assertEquals("Poznań", result.getCommune());
        Assertions.assertEquals("Poznań", result.getCity());
        Assertions.assertEquals("Szyperska 13D/32", result.getStreet());
        Assertions.assertEquals("61-754", result.getZip());
        Assertions.assertEquals(id, result.getId());
        Assertions.assertEquals("55.24", result.getCoordinates().getLatitude());
        Assertions.assertEquals("74.35", result.getCoordinates().getLongitude());

    }


    private Address getAddress(){
        Address address= Address.builder()
                .city("Poznań")
                .street("Szyperska 13D/32")
                .commune("Poznań")
                .zip("61-754")
                .coordinates(new GeographicalCoordinates(null,"55.24","74.35"))
                .build();

        return address;
    }
}