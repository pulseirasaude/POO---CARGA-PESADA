package cargapesada.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20181bsi0172
 */
public class Veiculo {

    private int id_veiculo;
    private String chassi;
    private String placa;
    private String status;
    private String tipoCombustivel;
    private String categoria;
    private Seguro seguro;
    private Modelo modelo;
    private Motorista motorista;
    private Financiamento financiamento;

    public Veiculo(String chassi, String placa, String status, String tipoCombustivel, String categoria, Seguro seguro, Modelo modelo, Motorista motorista, Financiamento financiamento) {
        this.chassi = chassi;
        this.placa = placa;
        this.status = status;
        this.tipoCombustivel = tipoCombustivel;
        this.categoria = categoria;
        this.seguro = seguro;
        this.modelo = modelo;
        this.motorista = motorista;
        this.financiamento = financiamento;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getStatus() {
        return status;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public Financiamento getFinanciamento() {
        return financiamento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void setFinanciamento(Financiamento financiamento) {
        this.financiamento = financiamento;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
