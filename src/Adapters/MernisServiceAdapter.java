package Adapters;

import Abstract.UserCheckService;
import Entities.Gamer;
import mernis.LCOKPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements UserCheckService {
    @Override
    public boolean chechkIfRealPerson(Gamer gamer) {
        LCOKPSPublicSoap lcokpsPublicSoap = new LCOKPSPublicSoap();
        boolean result  =true;

        try{ result =lcokpsPublicSoap.TCKimlikNoDogrula(gamer.getGamerNationalityId(),gamer.getGamerFirstName(),
                gamer.getGamerLastName(), gamer.getGamerBirthDate());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bilgiler uyuşmuyor");
        }

        return  result;

    }


}
