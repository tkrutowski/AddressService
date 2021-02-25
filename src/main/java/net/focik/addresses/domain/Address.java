package net.focik.addresses.domain;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
class Address {
    private Long id;
    private String commune;
    private String city;
    private String street;
    private String zip;
    private GeographicalCoordinates coordinates;


    String getLatitude() {//szerokosc
        if(coordinates != null)
            return this.coordinates.getLatitude();
        return "";
    }

    String getLongitude(){ //długość
        if(coordinates != null)
            return this.coordinates.getLongitude();
        return "";
    }
}
