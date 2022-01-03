package net.focik.addresses.infrastructure.jpa;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.Address;
import net.focik.addresses.domain.port.IAddressRepository;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
@AllArgsConstructor
class AddressRepositoryAdapter implements IAddressRepository {

    IAddressDtoRepository addressDtoRepository;

    @Override
    public Long add(Address address) {

        return addressDtoRepository.save(JpaMapper.toDto(address)).getId();
    }

    @Override
    public Optional<Address> findById(Long id) {
        if(id == null)
            return Optional.empty();

        Optional<AddressDbDto> byId = addressDtoRepository.findById(id);

        if(byId.isPresent())
            return Optional.of(JpaMapper.toDomain(byId.get()));

        return Optional.empty();
    }
}
