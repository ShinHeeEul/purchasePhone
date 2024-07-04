package model.phone;

import model.Logo;

public class Apple implements Phone{

    private static final String logo = Logo.APPLE.getLogo();

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public String load() {
        return "@@@ 폰 켜지는 중 @@@";
    }
}
