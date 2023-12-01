public class BonusMilesService {
    public int calculate(int price) {

        int rublesPerMile = 20;
        int miles = (price / rublesPerMile);

        return miles;

    }
}
