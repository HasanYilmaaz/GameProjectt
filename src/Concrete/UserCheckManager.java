package Concrete;

import Abstract.UserCheckService;
import Entities.Gamer;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean chechkIfRealPerson(Gamer gamer) {
        return true;
    }
}
