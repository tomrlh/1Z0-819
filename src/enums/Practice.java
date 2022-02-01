package enums;

enum Season {
    WINTER {
        public String getHours() { return "10am"; }
    },
    SUMMER {
        public String getHours() { return "9am"; }
    };

    public abstract String getHours();

    private Season() {
        System.out.println("constructing");
    }
}

public class Practice {
    public static void main(String[] args) {
        Season.WINTER.getHours();

        final int v = 1;
        switch(10) {
            case v:
                break;
        }

        switch(Season.WINTER) {
            case WINTER: // case Season.WINTER não compila, pois não é um literal/const
                break;
        }
    }
}
