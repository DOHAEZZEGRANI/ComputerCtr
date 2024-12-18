package ma.xproce.computer.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDTO {
    String proce;
    String ram;
    String hardDrive;
    Double price;
    String macAdress;
}
