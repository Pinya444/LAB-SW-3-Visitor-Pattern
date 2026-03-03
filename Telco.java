public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String accept(UsagePromo promo) {
        return promo.showAllowance(telcoName, promoPrice);
    }

    public String accept(UnliCallOffer offer) {
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}