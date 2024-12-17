package client;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.conversiobEutoToDh(600));
        Compte cp = proxy.getCompte(4);
        System.out.println("-------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println(cp.getCode());
        System.out.println("-------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach( c-> {
            System.out.println("-------------------");
            System.out.println(cp.getSolde());
            System.out.println(cp.getDateCreation());
            System.out.println(cp.getCode());
            System.out.println("-------------------");
        });

    }
}
