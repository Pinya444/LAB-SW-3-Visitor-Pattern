public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        return telcoName + " offers data allowance for ₱" + promoPrice;
    }
}