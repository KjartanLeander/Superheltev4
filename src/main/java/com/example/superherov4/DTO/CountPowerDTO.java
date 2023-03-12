package com.example.superherov4.DTO;

public class CountPowerDTO {
    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCountPower(int countPower) {
        this.countPower = countPower;
    }

    private String superHeroName;
    private String realName;
    private int countPower;

    public String getSuperHeroName() {
        return superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCountPower() {
        return countPower;
    }

    public CountPowerDTO(String superHeroName, String realName, int countPower) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.countPower = countPower;
    }


}
