package net.focik.addresses.api;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.focik.addresses.domain.AddressFacade;
import net.focik.addresses.domain.IAddressDto;
import net.focik.addresses.domain.share.AddressType;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/address")
@Log4j2
public class AddressController {
    private AddressFacade addressService;

    @GetMapping("/type/{id}")
    IAddressDto getAddressByType(@PathVariable Long id, @RequestParam(name = "type" ) AddressType type) {
        int i=0;
        log.info("ADDRES-SERVICE: Try find address for  id = " + id + "and type: "+type);

        IAddressDto addressByType = addressService.getAddressByType(id, type);
        log.info(addressByType != null ? "ADDRES-SERVICE: Found address for id = " + id : "ADDRES-SERVICE: Not found address for id = " + id);
        return addressByType;
    }

    @GetMapping("/{id}")
    AddressDbDto getAddress(@PathVariable Long id) {
        int i=0;
        return addressService.getAddress(id);
    }

    @PostMapping
    Long saveAddress(@RequestBody AddressDbDto addressDbDto) {
        return addressService.addAddress(addressDbDto);
    }
}
