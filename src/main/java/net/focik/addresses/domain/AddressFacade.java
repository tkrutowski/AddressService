package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.exceptions.AddressAlreadyExistsException;
import net.focik.addresses.domain.exceptions.AddressDoesNotExistException;
import net.focik.addresses.domain.port.IAddressRepository;
import net.focik.addresses.domain.share.AddressType;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressFacade {

    //@Qualifier("inMemoryClientRepositoryAdapter")
    private IAddressRepository addressRepository;
    private AddressFactory addressFactory;


    public Long addAddress(Address address) {
        Optional<Address> byId = addressRepository.findById(address.getId());

        if(byId.isPresent())
            throw new AddressAlreadyExistsException(address.getId());
        int i = 0;
        return addressRepository.add(address);
    }

    public IAddressDto getAddressByType(Long id, AddressType addressType) {
        int i = 0;
        Optional<Address> byId = addressRepository.findById(id);

        if(byId.isEmpty())
            throw new AddressDoesNotExistException(id);

        return addressFactory.createAddressFromDto(byId.get(), addressType);
    }

    public Address getAddress(Long id) {
        Optional<Address> byId = addressRepository.findById(id);

        if(byId.isEmpty())
            throw new AddressDoesNotExistException(id);

        return byId.get();
    }
}
