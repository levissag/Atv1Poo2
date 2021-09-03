/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1_poo2;

/**
 *
 * @author Levi
 */
public abstract class Medico {

    private String nome, CRM, telefone;
    private int especialidade;

    public Medico(String nome, String CRM, String telefone, int especialidade) {
        this.nome = nome;
        this.CRM = CRM;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public abstract void diagnosticar();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    
   
}
