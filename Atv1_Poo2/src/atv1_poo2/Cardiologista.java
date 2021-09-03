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
public class Cardiologista extends Medico{

    public Cardiologista(String nome, String CRM, String telefone, int especialidade) {
        super(nome, CRM, telefone, especialidade);
        System.out.println("Cardiogista criado: " + getNome() + " - " + getCRM() + " - " + getTelefone() + " - " + getEspecialidade());
    }

    public void diagnosticar(){
        System.out.println("Voce foi consultado por um Cardiologista");
    }
    
}
