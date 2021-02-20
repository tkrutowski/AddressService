package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.dto.TaskCalendarAddressDto;
import net.focik.addresses.domain.port.IAddressRepository;
import net.focik.addresses.domain.share.AddressFor;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressFacade {

    //@Qualifier("inMemoryClientRepositoryAdapter")
    private IAddressRepository addressRepository;
    private AddressFactory addressFactory;


    public Long addClient(AddressDbDto addressDbDto) {
        int i = 0;
        return addressRepository.add(addressDbDto);
    }

    public IAddress getAddress(Long id, AddressFor addressFor) {
        int i = 0;
        Optional<AddressDbDto> byId = addressRepository.findById(id);

        return addressFactory.createAddressFromDto(byId.get(), addressFor);
    }
}
