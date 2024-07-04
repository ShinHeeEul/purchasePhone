package model.phone;

import model.Logo;

public class Galaxy implements Phone{

    private static final String LOGO = Logo.GALAXY.getLogo();
    private static final String LOADING = Logo.GALAXY.getLoading();
    @Override
    public String getLogo() {
        return LOGO;
    }

    @Override
    public String load() {
        return LOADING;
    }
}
