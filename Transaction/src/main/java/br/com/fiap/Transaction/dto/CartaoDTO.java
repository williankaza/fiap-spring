package br.com.fiap.Transaction.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CartaoDTO {
    private Long id;
    private Long numerocartao;
    private LocalDate datavalidade;
    private Long codigoIdentificador;

    public CartaoDTO(){

    }

    public CartaoDTO(CartaoRemoteDTO cartaoRemoteDTO){
        this.setId(cartaoRemoteDTO.getId());
        this.setNumerocartao(cartaoRemoteDTO.getNumerocartao());
        this.setCodigoIdentificador(cartaoRemoteDTO.getCodigoIdentificador());
        this.setDatavalidade(LocalDate.parse(cartaoRemoteDTO.getDatavalidade()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(Long numerocartao) {
        this.numerocartao = numerocartao;
    }

    public LocalDate getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(LocalDate datavalidade) {
        this.datavalidade = datavalidade;
    }

    public Long getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(Long codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
