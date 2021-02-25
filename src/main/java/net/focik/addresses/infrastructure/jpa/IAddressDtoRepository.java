package net.focik.addresses.infrastructure.jpa;

import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.springframework.data.jpa.repository.JpaRepository;

interface IAddressDtoRepository extends JpaRepository<AddressDbDto, Long> {
}
