package ma.xproce.computer.mapper;

import ma.xproce.computer.dao.entities.Computer;
import ma.xproce.computer.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO){
        return mapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputerToComputerDTO(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }
}
