package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası Eklendi.");
    }

    @Override
    public void getAll() {
        System.out.println("Kampanyalar Gösteriliyor.");

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası Güncellendi.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası Silindi.");

    }
}

