package ma.xproce.computer.service;

import ma.xproce.computer.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);

    public boolean deleteComputer(Long id);

    public List<ComputerDTO> getComputerByproce(String proce);

    public List<ComputerDTO> savecomputer(List<ComputerDTO> computerDTOS);
}
