package model.phone;

import model.Logo;

public class Apple implements Phone{

    private static final String LOGO = Logo.APPLE.getLogo();
    private static final String LOADING = Logo.APPLE.getLoading();

    @Override
    public String getLogo() {
        return LOGO;
    }

    @Override
    public String load() {
        return LOADING;
    }
}
