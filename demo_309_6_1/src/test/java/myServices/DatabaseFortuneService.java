package myServices;

public class DatabaseFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Database connection";
    }
}
