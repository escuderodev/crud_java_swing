package br.com.escuderodev.dto;

public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private String detalhe;

    public Cliente(String nome, String telefone, String endereco, String detalhe) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.detalhe = detalhe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", detalhe='" + detalhe + '\'' +
                '}';
    }
}
