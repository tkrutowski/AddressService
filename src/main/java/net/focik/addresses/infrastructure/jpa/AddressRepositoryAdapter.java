package net.focik.addresses.infrastructure.jpa;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.port.IAddressRepository;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
@AllArgsConstructor
class AddressRepositoryAdapter implements IAddressRepository {

    IAddressDtoRepository addressDtoRepository;

    @Override
    public Long add(AddressDbDto dto) {
        return addressDtoRepository.save(dto).getId();
    }

    @Override
    public Optional<AddressDbDto> findById(Long id) {

        return addressDtoRepository.findById(id);
    }
}
