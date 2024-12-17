package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "ConversiobEutoToDh")
    public double conversion(@WebParam(name = "Montant") double mt){
        return mt * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,new Date(),1000+Math.random()*9000);

    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,new Date(),1000+Math.random()*9000),
                new Compte(2,new Date(),1000+Math.random()*9000),
                new Compte(2,new Date(),1000+Math.random()*9000)
        );
    }

}
