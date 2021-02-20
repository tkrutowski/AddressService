package net.focik.addresses.api;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.AddressFacade;
import net.focik.addresses.domain.dto.TaskCalendarAddressDto;
import net.focik.addresses.domain.share.AddressFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/taskcalendar")
class TaskCalendarController {

    private AddressFacade addressService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    TaskCalendarAddressDto getAddress(@PathVariable Long id){
        int i=0;
        return (TaskCalendarAddressDto) addressService.getAddress(id, AddressFor.TASK_CALENDAR);
    }

}
