public class BonusMilesService {
    public int calculate (int cost) {
        int price = cost;
        int bonusMile = 20;
        int bonusMileValue = price / bonusMile;
        return bonusMileValue;
    }
}
