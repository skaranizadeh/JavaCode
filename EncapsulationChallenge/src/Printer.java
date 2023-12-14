public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
       int result = tonerLevel + tonerAmount;
//        return result > 100 || result <= 0 ? -1 : result;

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (result > 100) {
                return -1;
            } else {
                return result;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int jobPages = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
        }
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
