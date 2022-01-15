package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Address {
    private  Long id;
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

    public String toJsonString() {
        return "{" +
                "id=" + id +
                ", commune='" + commune + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", latitude='" + getLatitude() +'\'' +
                ", longitude='" + getLongitude() +'\'' +
                '}';
    }
}
