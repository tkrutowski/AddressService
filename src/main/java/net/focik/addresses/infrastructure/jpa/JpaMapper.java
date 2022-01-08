package net.focik.addresses.infrastructure.jpa;

import net.focik.addresses.domain.Address;
import net.focik.addresses.domain.GeographicalCoordinates;
import net.focik.addresses.infrastructure.dto.AddressDbDto;
import net.focik.addresses.infrastructure.dto.GeoCoordinatesDbDto;

class JpaMapper {

    public static Address toDomain(AddressDbDto dto){
        return Address.builder()
                .city(dto.getCity() == null ? "" : dto.getCity())
                .commune(dto.getCommune()== null ? "" : dto.getCommune())
                .street(dto.getStreet() == null ? "" : dto.getStreet())
                .zip(dto.getZip()== null ? "" : dto.getZip())
                .id(dto.getId())
                .coordinates(dto.getCoordinates() == null ? null : new GeographicalCoordinates(dto.getCoordinates().getId(), dto.getCoordinates().getLatitude(),dto.getCoordinates().getLongitude()))
                .build();
    }

    public static AddressDbDto toDto(Address address){
        AddressDbDto dto = new AddressDbDto();

        dto.setId(address.getId());
        dto.setStreet(address.getStreet() == null ? "" : address.getStreet());
        dto.setCity(address.getCity() == null ? "" : address.getCity());
        dto.setCommune(address.getCommune() == null ? "" : address.getCommune());
        dto.setZip(address.getZip() == null ? "" : address.getZip());
        dto.setCoordinates(address.getCoordinates() == null ? null : new GeoCoordinatesDbDto(address.getCoordinates().getId(), address.getCoordinates().getLatitude(),address.getCoordinates().getLongitude()));

        return dto;
    }
}
