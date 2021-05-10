import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------Gamer Creation---------------");

        Gamer gamer1 = new Gamer(1, "hasan hüseyin", "Yılmaz", "11223344550", "1996", 25, "hashust");
        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.gamerControl(gamer1);
        Gamer gamer2 = new Gamer(2, "ahmet ali", "yılmaz", "11223344551", "2005", 16, "ahmetovski");
        gamerManager.add(gamer2);
        System.out.println("--------------------------------------------");
        System.out.println("\n");
        System.out.println("---------------Game Creation---------------");


        Game game = new Game(1, "Kral oyun", "Yeni oyunumuzla Globale açılmak istiyorum", 133);
        Game game2 = new Game(2, "Ankara", "oyun ankarada geçer boz ayılarla savaşırsınız ama ayılar nasıl tepki verir " +
                "bilmiyoruz", 25);
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.add(game2);

        System.out.println("--------------------------------------------");
        System.out.println("\n");

        System.out.println("---------------Campaign Creation---------------");

        Campaign campaign = new Campaign(1, "Haftasonu indirimleri", 10);
        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign1 = new Campaign(2, "Bayram indirimleri", 27);
        campaignManager.add(campaign);
        campaignManager.add(campaign1);
        System.out.println("--------------------------------------------");
        System.out.println("\n");

        System.out.println("---------------Sales Area---------------");
        gameManager.showGames(game);
        gameManager.showGames(game2);
        System.out.println("--------------------------------------------");
        System.out.println("\n");

        System.out.println("---------------Info Area---------------");
        SalesManager salesManager = new SalesManager();
        salesManager.sale(game, gamer1);
        salesManager.refund(game, gamer1);
        salesManager.campaignSale(game, gamer2, campaign);
        gameManager.comment(game, gamer2,"Güzel oyundu");
        salesManager.sale(game2 ,gamer1);
        salesManager.sale(game2,gamer2);
        gameManager.comment(game2,gamer1,"Yapılmış en güzel oyunlardan birisiydi");
        gameManager.comment(game2,gamer2,"Böyle bir oyun bir daha yapılır mı bilemem");
        System.out.println("--------------------------------------------");
        System.out.println("\n");


    }
}
