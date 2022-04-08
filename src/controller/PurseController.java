package controller;

import model.Purse;

public class PurseController {
    private Purse[] purse;
    private int amountOfPurses;

    public PurseController(DataController d) {
    	
		purse = d.getPurse();
		amountOfPurses = d.getAmountOfPurses();
    }

    public String[] getName() {
        String[] apelido = new String[amountOfPurses];
        for (int i = 0; i < amountOfPurses; i++) {
            apelido[i] = purse[i].getNome();
        }
        return apelido;
    }

//    public int getIdLente(int i) {
//
//        return purse[i].getIdArmacao();
//    }
//
//    public int getQntLentes() {
//        return qntLentes;
//    }
//
//    public void setQntLentes(int qntLentes) {
//        this.qntLentes = qntLentes;
//    }
//
//    public double getGrauLente(int i) {
//        return purse[i].getGrauLente();
//
//    }
//
//    public double getValorLente(int i) {
//        return purse[i].getValorLente();
//    }
//
//    public String getFormatoLente(int i) {
//        return purse[i].getFormatoLente();
//    }
//
//    public String getIndMedica(int i) {
//        return purse[i].getIndMedica();
//    }
//
//    public String getFocoLente(int i) {
//        return purse[i].getFocoLente();
//    }
//
//    public String getLaboratorio(int i) {
//        return purse[i].getLaboratorio();
//    }
//
//    public boolean getProtecaoUV(int i) {
//        return purse[i].isProtecaoUV();
//    }
//
//    public String getDataProducao(int i) {
//        return purse[i].getDataProducao();
//    }
//
//    public int getIdArmacao(int i) {
//        return purse[i].getIdArmacao();
//    }
}