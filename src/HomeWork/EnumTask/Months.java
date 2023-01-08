package HomeWork.EnumTask;

public enum Months {
    JANUARY(1, "Yanvar", "Январь", "Ocak"),
    FEBRUARY(2, "Fevral", "Февраль", "Şubat"),
    MARCH(3, "Mart", "Март", "Mart"),
    APRIL(4, "Aprel", "Апрель", "Nisan"),
    MAY(5, "May", "Май", "Mayıs"),
    JUNE(6, "Iyun", "Июнь", "Haziran"),
    JULY(7, "Iyul", "Июль", "Temmuz"),
    AUGUST(8, "Avqust", "Август", "Ağustos"),
    SEPTEMBER(9, "Sentyabr", "Сентябрь", "Eylül"),
    OCTOBER(10, "Oktyabr", "Октябрь", "Ekim"),
    NOVEMBER(11, "Noyabr", "Ноябрь", "Kasım"),
    DECEMBER(12, "Dekabr", "Декабрь", "Aralık");

    int x;
    String a;
    String r;
    String t;

    public int getX() {
        return x;
    }

    public String getA() {
        return a;
    }

    public String getR() {
        return r;
    }

    public String getT() {
        return t;
    }

    Months(int x, String a, String r, String t) {
        this.x = x;
        this.a = a;
        this.r = r;
        this.t = t;
    }
}
