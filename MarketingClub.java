public class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String c, int m, int budget) {
        super(c, m);
        this.budget = budget;
    }

    public boolean useBudget(int amount) {
        if (this.budget >= amount) {
            this.budget -= amount;
            return true;
        }
        return false;
    }

    @Override
    public int determineBudget() {
        if (this.budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}