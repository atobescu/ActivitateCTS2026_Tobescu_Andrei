package cts.tobescu.facade.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Masa> listaMese;

    public Restaurant(List<Masa> listaMese) {
        this.listaMese = listaMese;
    }

    public List<Masa> getListaMese() {
        return listaMese;
    }
}
