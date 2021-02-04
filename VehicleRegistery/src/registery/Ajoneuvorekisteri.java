package registery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Riku
 */
 
import java.util.HashMap;
import java.util.ArrayList;
 
public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if(!omistajat.containsKey(rekkari)){
            omistajat.put(rekkari, omistaja);
            return true;
        } else {
            return false;
        }
    }
    
    public String hae(Rekisterinumero rekkari) {
        if(omistajat.containsKey(rekkari)){
            return omistajat.get(rekkari);
        } else {
            return null;
        }
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if(omistajat.containsKey(rekkari)) {
            omistajat.remove(rekkari);
            return true;
        } else {
            return false;
        }
    }
    
    public void tulostaRekisterinumerot(){
        if(!omistajat.isEmpty()) {
            for (Rekisterinumero rekkari : this.omistajat.keySet()) {
                System.out.println(rekkari);
            }
        } 
    }
    
    public void tulostaOmistajat(){
        ArrayList<String> nimet = new ArrayList<String>();  
        if(!omistajat.isEmpty()) {
            for (String omistaja : this.omistajat.values()) {
                if(!nimet.contains(omistaja)) {
                    nimet.add(omistaja);
                }
            }
        }
        for(String nimi : nimet) {
            System.out.println(nimi);
        }
    }
}
