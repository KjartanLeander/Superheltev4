package com.example.superherov4.DTO;

public class DTO {
    public DTO(String heroName, String realName, String superPower) {
        this.heroName = heroName;
        this.realName = realName;
        this.superPower = superPower;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    private String heroName;
    private String realName;
    private String superPower;
}
