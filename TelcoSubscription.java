public interface TelcoSubscription {
    String accept(UsagePromo promo);
    String accept(UnliCallOffer offer);

    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
}