package model.phone;

import model.Logo;

public class Galaxy implements Phone{

    private static final String logo = Logo.GALAXY.getLogo();
    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public String load() {
        return "*** 폰 켜지는 중 ***";
    }
}
