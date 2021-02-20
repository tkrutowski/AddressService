package net.focik.addresses.domain.port;

import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface IAddressRepository {

    Long add(AddressDbDto dto);

    Optional<AddressDbDto> findById(Long id);
}
