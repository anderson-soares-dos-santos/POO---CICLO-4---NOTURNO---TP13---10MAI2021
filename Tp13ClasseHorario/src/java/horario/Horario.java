/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;


/**
 *
 * @author andersons
 */




public class Horario {
     //CAMPOS OU VARIÁVEIS (atributos)
     /**
     * VARIÁVEL QUE REPRESENTA A HORA (HH) DO HORÁRIO
     */
    private int hh_hora;
     /**
     * VARIÁVEL QUE REPRESENTA OS MINUTOS (MM) DO HORÁRIO
     */
    private int mm_minuto;
     /**
     * VARIÁVEL QUE REPRESENTA OS SEGUNDOS (SS) DO HORÁRIO
     */
    private int ss_segundo;
    
    //CONSTRUTORES
    /**
     * INICIALIZAÇÃO COM O HORÁRIO EM 0
     */   
    
    public Horario(){
        hh_hora = 0;
        mm_minuto = 0;
        ss_segundo = 0;
    }
        /**
     * Inicialização do objeto com os parâmetros informados
     * @param hh_hora horas do horario
     * @param mm_minuto minutos do horario
     * @param ss_segundo segundos do horario
     */
    public Horario(int hh_hora, int mm_minuto, int ss_segundo) {
        this.hh_hora = hh_hora;
        this.mm_minuto = mm_minuto;
        this.ss_segundo = ss_segundo;
    }
    //MÉTODOS/FUNCÕES SPARA ACESSO
    public int getHoras() {
        return hh_hora;
    }
    public void setHoras(int hh_hora) {
        this.hh_hora = hh_hora;
    }
    public int getMinutos() {
        return mm_minuto;
    }
    public void setMinutos(int mm_minuto) {
        this.mm_minuto = mm_minuto;
    }
    public int getSegundos() {
        return ss_segundo;
    }
    public void setSegundos(int ss_segundo) {
        this.ss_segundo = ss_segundo;
    }
    //Métodos complementares(funções)
    public String getHorario(){
        String out = "";
        if(hh_hora < 10)
            out += "0";
        out += hh_hora + ":";
        if(mm_minuto < 10)
            out += "0";
        out += mm_minuto + ":";
        if(ss_segundo < 10)
            out += "0";
        out += ss_segundo;
        return out;
    }
    public String getHora_Intervalo(){
        return getHorario();
    }
    
    
    
}
