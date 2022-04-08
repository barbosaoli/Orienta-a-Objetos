package controller;

import model.Store;
import model.Telefone;

public class StoreController {
    private Store[] lControl;
    private int qntLojas;

    public StoreController(DataController dados) {
        lControl = dados.getStores();
        qntLojas = dados.getAmountOfStores();
    }

    public int getQntLojas() {
        return qntLojas;
    }

    public void setQntLojas(int qntLojas) {
        this.qntLojas = qntLojas;
    }

    public String[] getNomeLojas() {
        String[] s = new String[qntLojas];

        for (int i = 0; i < qntLojas; i++) {
            s[i] = lControl[i].getNomeLoja();
        }

        return s;
    }

    public String getNomeL(int i) {
        return lControl[i].getNomeLoja();
    }

    public int getCEP(int i) {
        return lControl[i].getCep();
    }

    public Telefone getTelefone(int i) {
        return lControl[i].getTelefone();
    }

    public String getEndereco(int i) {
        return lControl[i].getEndereco();
    }
}