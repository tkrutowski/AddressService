package net.focik.addresses.infrastructure.jpa;

import net.focik.addresses.domain.Address;
import net.focik.addresses.domain.GeographicalCoordinates;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import net.focik.addresses.infrastructure.dto.GeoCoordinatesDbDto;

class JpaMapper {

    public static Address toDomain(AddressDbDto dto){
        return Address.builder()
                .city(dto.getCity())
                .commune(dto.getCommune())
                .street(dto.getStreet())
                .zip(dto.getZip())
                .id(dto.getId())
                .coordinates(new GeographicalCoordinates(dto.getCoordinates().getId(), dto.getCoordinates().getLatitude(),dto.getCoordinates().getLongitude()))
                .build();
    }

    public static AddressDbDto toDto(Address address){
        AddressDbDto dto = new AddressDbDto();

        dto.setId(address.getId());
        dto.setStreet(address.getStreet());
        dto.setCity(address.getCity());
        dto.setCommune(address.getCommune());
        dto.setZip(address.getZip());
        dto.setCoordinates(new GeoCoordinatesDbDto(address.getCoordinates().getId(), address.getCoordinates().getLatitude(),address.getCoordinates().getLongitude()));

        return dto;
    }
}
