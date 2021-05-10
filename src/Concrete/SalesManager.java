package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

    @Override
    public void sale(Game game, Gamer gamer) {
        System.out.println(game.getGameName() + " adlı oyun " + gamer.getGamerUsername() + " tarafında alındı");
    }

    @Override
    public void refund(Game game, Gamer gamer) {
        System.out.println(game.getGameName() + " adlı oyun "+ gamer.getGamerUsername()+ " adlı kullanıcı tarafından " +
                "iade edildi.");


    }

    @Override
    public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getGameName()+ " adlı oyun "+ gamer.getGamerUsername()+ " adlı kullanıcı tarafından "+ campaign.getCampaignName()+" kampanyası dahilinde satın alındı.");


    }

}
