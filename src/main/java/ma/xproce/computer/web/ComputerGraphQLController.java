package ma.xproce.computer.web;

import ma.xproce.computer.dto.ComputerDTO;
import ma.xproce.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {
    @Autowired
    private ComputerService computerService ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDTO){
        return computerService.saveComputer(computerDTO);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Long id){
        return computerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDTO> getcomputerByproce(@Argument String proce){
        return computerService.getComputerByproce(proce);
    }
}
