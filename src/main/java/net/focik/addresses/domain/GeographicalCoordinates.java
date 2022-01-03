package net.focik.addresses.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public
class GeographicalCoordinates {

    private Long id;
    private String latitude; //szerokosc
    private String longitude; //długość


}
