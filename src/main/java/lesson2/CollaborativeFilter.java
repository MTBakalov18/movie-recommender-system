package lesson2;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendation(String movie) {
        return new String[] { };
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
}
