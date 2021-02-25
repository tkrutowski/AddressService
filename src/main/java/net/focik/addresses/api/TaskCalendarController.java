package net.focik.addresses.api;

import lombok.AllArgsConstructor;
import net.focik.addresses.domain.AddressFacade;
import net.focik.addresses.domain.dto.TaskCalendarAddressDtoDto;
import net.focik.addresses.domain.share.AddressType;
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
    TaskCalendarAddressDtoDto getAddress(@PathVariable Long id){
        int i=0;
        return (TaskCalendarAddressDtoDto) addressService.getAddressByType(id, AddressType.TASK_CALENDAR);
    }

}
