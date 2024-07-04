package model;

public enum Logo {
    GALAXY("삼송"), APPLE("애플");

    private final String company;
    Logo(String company) {
        this.company = company;
    }

    public String getLogo() {
        return company;
    }
}
