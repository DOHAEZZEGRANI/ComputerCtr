package ma.xproce.computer;

import ma.xproce.computer.dto.ComputerDTO;
import ma.xproce.computer.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.savecomputer(
                    List.of(
                            ComputerDTO.builder().proce("doha").ram("x").hardDrive("xx").price(12.3).macAdress("ad").build(),
                            ComputerDTO.builder().proce("doha").ram("x").hardDrive("xx").price(12.3).macAdress("ad").build(),
                            ComputerDTO.builder().proce("doha").ram("x").hardDrive("xx").price(12.3).macAdress("ad").build(),
                            ComputerDTO.builder().proce("doha").ram("x").hardDrive("xx").price(12.3).macAdress("ad").build()


                    )

            );
        };
    }

}
