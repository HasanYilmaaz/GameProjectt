package Concrete;

import Abstract.GamerService;
import Abstract.UserCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {
    UserCheckService checkService;

    public GamerManager(UserCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void gamerControl(Gamer gamer){
        if (checkService.chechkIfRealPerson(gamer)){
            System.out.println(gamer.getGamerUsername().toUpperCase()+" adlı kullanıcı oluşturuldu");
        }else{
            System.out.println("Hatalı bilgi girdiniz");
        }
    }

    @Override
    public void add(Gamer gamer) {
        System.out.println(gamer.getGamerUsername()+" adlı kullanıcı eklendi");

    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getGamerUsername()+ " kullanıcı adlı kişinin bilgileri güncellendi.");

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getGamerUsername()+ " kullanıcı sistemden silindi.");

    }
}
