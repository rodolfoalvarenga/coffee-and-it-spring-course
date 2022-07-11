package br.com.coffeeandit.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Conta implements Serializable {

    @Schema(description = "Código da Agência")
    @NotNull(message = "Informar o código da Agência")
    private Long codigoAgencia;

    @Schema(description = "Código da Conta")
    @NotNull(message = "Informar o código da Conta")
    private Long codigoConta;

}
