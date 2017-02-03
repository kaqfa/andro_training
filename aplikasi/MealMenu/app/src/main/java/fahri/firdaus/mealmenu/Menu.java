package fahri.firdaus.mealmenu;

/**
 * Created by kaqfa on 1/26/17.
 */

public class Menu {

    private String title, category, from;

    public Menu(String title, String category, String from) {
        this.title = title;
        this.category = category;
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
