
package br.cesjf.projetosw.model.dao;

import br.cesjf.projetosw.model.vo.Cliente;
import br.cesjf.projetosw.model.vo.Vaga;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocorrencia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Cliente cliente;
    private Vaga vaga;
    private Date horaEntrada;
    private Date horaSaida;
    //1 para carro, 2 para moto
    private int tipoVeiculo;

    public Ocorrencia() {
        
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vaga getVaga() {
        return vaga;
    }
    
    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
    
    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    public Date getHoraSaida() {
        return horaSaida;
    }
    
    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public int isTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public void registraSaida(){
        this.horaSaida = new Date();
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
