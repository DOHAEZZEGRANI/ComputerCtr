package ma.xproce.computer.service;

import lombok.AllArgsConstructor;
import ma.xproce.computer.dao.entities.Computer;
import ma.xproce.computer.dao.repositories.ComputerRepository;
import ma.xproce.computer.dto.ComputerDTO;
import ma.xproce.computer.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDTOToComputer(computerDTO);
        computer = computerRepository.save(computer);
        computerDTO = computerMapper.fromComputerToComputerDTO(computer);
        return computerDTO;

    }

    @Override
    public boolean deleteComputer(Long id) {
        try {
            computerRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<ComputerDTO> getComputerByproce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }



    @Override
    public List<ComputerDTO> savecomputer(List<ComputerDTO> computerDTOS) {

        List<Computer> computers = new ArrayList<>();
        for (ComputerDTO computerDTO : computerDTOS) {
            computers.add(computerMapper.fromComputerDTOToComputer(computerDTO));
        }

        computers = computerRepository.saveAll(computers);

        computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }
}


