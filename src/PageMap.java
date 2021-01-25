public class PageMap {

    public static void main(String[] args) {

        String homepage = "http://kurczaki.pl/homepage";
        String menu = "http://kurczaki.pl/menu";
        String blog = "http://kurczaki.pl/blog";
        String shop = "http://kurczaki.pl/shop";
        String history = "http://kurczaki.pl/history";
        String about = "http://kurczaki.pl/about";
        String credentials = "http://kurczaki.pl/credentials";

        String[] pages = new String [7];
        pages[0] = homepage;
        pages[1] = menu;
        pages[2] = blog;
        pages[3] = shop;
        pages[4] = history;
        pages[5] = about;
        pages[6] = credentials;

        System.out.println();
        System.out.println("----- Przed zmianą -----");
        System.out.println();
        for (String page : pages) {
            System.out.println(page);
        }
        System.out.println();
        System.out.println("----- Po zmianie -----");
        System.out.println();

        int i = 0;
        for (String page : pages){
            StringBuilder str = new StringBuilder(pages[i]);
            System.out.println(str.replace (7, 15, "naukajavy"));
            i++;
        }
    }
}
