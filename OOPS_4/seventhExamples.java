// Movies Example Using OOPS

class Movies {
    private String title;
    private double rating;

    public Movies(String title, double rating) {
        this.title = title;
        setRating(rating);
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else
            System.out.println("Invalid Rating !");
    }

    public void getMovieInfo() {
        System.out.println("Movie Name : " + title + "\nMovie Rating : " + rating);
    }

    public double getRating() {
        return rating;
    }
}

public class seventhExamples {
    public static void main(String[] args) {
        Movies m1 = new Movies("Kantara",9);
        m1.getMovieInfo();
        m1.setRating(10.0);
        System.out.println("Rating : "+m1.getRating());
    }
}
