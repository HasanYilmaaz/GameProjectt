package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName().toUpperCase()+ " isimli oyun sisteme eklendi");

    }

    @Override
    public void showGames(Game game) {
        System.out.println("Sistemde var olan oyunlar "+ game.getGameName().toUpperCase());

    }

    @Override
    public void updateInfo(Game game) {
        System.out.println(game.getGameName() + " Seçilen oyun bilgileri güncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " Seçilen oyun sistemden kaldırıldı.");

    }

    @Override
    public void comment(Game game, Gamer gamer,String message) {
        System.out.println(game.getGameName()+ " adlı oyuna "+gamer.getGamerUsername()+" tarafından yorum yapıldı"+
                "\n"+ "Yapılan yorum : "+message);

    }
}
