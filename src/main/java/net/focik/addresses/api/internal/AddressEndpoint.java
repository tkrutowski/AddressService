package net.focik.addresses.api.internal;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.focik.addresses.domain.Address;
import net.focik.addresses.domain.AddressFacade;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Log4j2
@Component
public class AddressEndpoint {
    private static AddressFacade addressFacade;
    public static Address getAddress(Long id){
        log.info("ADDRESS-INTERNAL-SERVICE: Try find address for  id = " + id );
        Address address = addressFacade.getAddress(id);
        log.info(address != null ? "ADDRESS-INTERNAL-SERVICE: Found address for id = " + id : "ADDRESS-INTERNAL-SERVICE: Not found address for id = " + id);

        return address;
    }
}
