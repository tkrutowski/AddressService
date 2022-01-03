package net.focik.addresses.domain;

import net.focik.addresses.infrastructure.dto.AddressDbDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AddressConfig {
    @Bean
    public ModelMapper modelMapper() {
//        ModelMapper mapper = new ModelMapper();
//        mapper.typeMap(AddressDbDto.class, Address.class).addMappings(mapper ->{
//            mapper.map(source -> source.getCoordinates().getId());
//        })

        return new ModelMapper();
    }


}
