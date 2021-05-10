package Entities;

import Abstract.Entity;

public class Gamer implements Entity {


    private String gamerUsername;
    private int gamerId;
    private String gamerFirstName;
    private String  gamerLastName;
    private String gamerNationalityId;
    private String gamerBirthDate;
    private int gamerAge;


    public Gamer() {
    }



    public Gamer(int gamerId, String gamerFirstName, String gamerLastName, String gamerNationalityId,
                 String gamerBirthDate, int gamerAge,String gamerUsername) {
        this.gamerId = gamerId;
        this.gamerFirstName = gamerFirstName;
        this.gamerLastName = gamerLastName;
        this.gamerNationalityId = gamerNationalityId;
        this.gamerBirthDate = gamerBirthDate;
        this.gamerAge = gamerAge;
        this.gamerUsername = gamerUsername;
    }



    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public String getGamerFirstName() {
        return gamerFirstName;
    }

    public void setGamerFirstName(String gamerFirstName) {
        this.gamerFirstName = gamerFirstName;
    }

    public String getGamerLastName() {
        return gamerLastName;
    }

    public void setGamerLastName(String gamerLastName) {
        this.gamerLastName = gamerLastName;
    }

    public String getGamerNationalityId() {
        return gamerNationalityId;
    }

    public void setGamerNationalityId(String gamerNationalityId) {
        this.gamerNationalityId = gamerNationalityId;
    }

    public String getGamerBirthDate() {
        return gamerBirthDate;
    }

    public void setGamerBirthDate(String gamerBirthDate) {
        this.gamerBirthDate = gamerBirthDate;
    }

    public int getGamerAge() {
        return gamerAge;
    }

    public void setGamerAge(int gamerAge) {
        this.gamerAge = gamerAge;
    }
    public String getGamerUsername() {
        return gamerUsername;
    }

    public void setGamerUsername(String gamerUsername) {
        this.gamerUsername = gamerUsername;
    }


}
