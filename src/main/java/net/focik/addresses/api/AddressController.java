package net.focik.addresses.api;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.AddressFacade;
import net.focik.addresses.domain.IAddressDto;
import net.focik.addresses.domain.dto.TaskCalendarAddressDtoDto;
import net.focik.addresses.domain.exceptions.AddressDoesNotExistException;
import net.focik.addresses.domain.share.AddressType;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@AllArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
    private AddressFacade addressService;

    @GetMapping("/type/{id}")
    IAddressDto getAddressByType(@PathVariable Long id, @RequestParam(name = "type" ) AddressType type) {
        int i=0;
        return addressService.getAddressByType(id, type);

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
