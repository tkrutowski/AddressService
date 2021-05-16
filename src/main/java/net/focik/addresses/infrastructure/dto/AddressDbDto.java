package net.focik.addresses.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.focik.addresses.infrastructure.dto.GeoCoordinatesDbDto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "addresses")
//@Table(name = "address_gasconnection_view_test")
@ToString
public class AddressDbDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String commune;
    private String city;
    private String street;
    private String zip;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_coordinates", referencedColumnName = "id")
    private GeoCoordinatesDbDto coordinates;

}
