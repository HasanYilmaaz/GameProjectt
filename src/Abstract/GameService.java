package Abstract;

import Entities.Game;
import Entities.Gamer;

public interface GameService {
    void add (Game game);
    void showGames(Game game);
    void updateInfo(Game game);
    void delete(Game game);
    void comment(Game game, Gamer gamer,String message);
}
