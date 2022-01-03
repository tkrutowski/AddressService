package net.focik.addresses.domain.port;

import net.focik.addresses.domain.Address;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface IAddressRepository {

    Long add(Address dto);

    Optional<Address> findById(Long id);
}
