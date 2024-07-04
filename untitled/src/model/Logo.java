package model;

public enum Logo {
    GALAXY("삼송", "*** 폰 켜지는 중 ***"), APPLE("애플", "@@@ 폰 켜지는 중 @@@");

    private final String company;
    private final String loading;
    Logo(String company, String loading) {
        this.company = company;
        this.loading = loading;
    }

    public String getLogo() {
        return company;
    }

    public String getLoading() {
        return loading;
    }
}
