package reduce;

import java.util.ArrayList;
import java.util.List;

/**
 * Rating
 */
public record Rating(double points, List<Review> reviews) {

    public Rating {
        reviews = new ArrayList<>();
    }
    public Rating(double points) {
        this(points, new ArrayList<>());
    }

    public void add(Review review) {
        reviews.add(review);
        computeRating();
    }

    private double computeRating() {
        double totalPoints = 
          reviews.stream().map(Review::points).reduce(0, Integer::sum);
        return totalPoints / reviews.size();
    }

    public Rating average(Rating r1, Rating r2) {
        List<Review> reviews = new ArrayList<>(r1.reviews);
        reviews.addAll(r2.reviews);
        double points = computeRating();
        Rating rating = new Rating(points, reviews);
        return rating;
    }
}