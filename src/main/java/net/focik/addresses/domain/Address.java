package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Address {
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
