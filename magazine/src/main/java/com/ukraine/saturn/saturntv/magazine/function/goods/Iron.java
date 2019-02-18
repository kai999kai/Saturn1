package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Iron {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Iron(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Покрытие подошвы:", "Вертикальное отпаривание:",
                "Функция распыления воды:", "Паровой удар:", "Функция самоочистки:", "Антинакипь:",
                "Емкость резервуара, мл:", "Функция автоотключения:", "Антикапельный механизм:",
                "Режим сухого/парового глажения:", "Частота, Гц:", "Дополнительные свойства:",
                "Подача пара, г/мин:"};

        switch (arr_category[id_arr]) {

            case "ST-CC0223 grey":
                arr_descriptions = new String[]{
                        "2000", "Керамика", "Да", "Да", "Да", "Да", "Да", "250", "Да", "Да",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0223_grey;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0223_grey/";
                break;
            case "ST-CC0223 blue":
                arr_descriptions = new String[]{
                        "2000", "Керамика", "Да", "Да", "Да", "Да", "Да", "250", "Да", "Да",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0223_blue;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0223_blue/";
                break;
            case "ST-CC1112 Auto shut off":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "Да", "Да", "360", "-", "Да",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc1112_auto_shut_off;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc1112_auto_shut_off/";
                break;
            case "ST-CC7136green":
                arr_descriptions = new String[]{
                        "2500", "Керамика", "Да", "Да", "Да", "Да", "Да", "270", "-", "Да",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7136_green;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7136green/";
                break;
            case "ST-CC7128":
                arr_descriptions = new String[]{
                        "2200", "Керамика", "Да", "Да", "Да", "Да", "Да", "415", "-", "Да",
                        "Да", "Да", "50", "-", "30"};
                image = R.mipmap.iron_st_cc7128;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7128/";
                break;
            case "ST-CC7126 New":
                arr_descriptions = new String[]{
                        "2200", "Керамика", "Да", "Да", "Да", "Да", "-", "250", "Да", "-",
                        "Нет", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7126_new;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7126_new/";
                break;
            case "ST-CC7116":
                arr_descriptions = new String[]{
                        "2200", "Керамика", "Да", "Да", "Да", "Да", "-", "250", "Да", "-",
                        "-", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7116;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7116/";
                break;
            case "ST-CC1112":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "Да", "Да", "360", "Да", "-",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc1112;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc1112/";
                break;
            case "ST-CC7109CerGrey":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "Да", "Да", "350", "-", "-",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7109_cer_grey;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7109cergrey/";
                break;
            case "ST-CC7127":
                arr_descriptions = new String[]{
                        "2400", "мрамор", "Да", "Да", "Да", "Да", "Нет", "270", "Да", "-",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7127;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7127/";
                break;
            case "ST-CC7121":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "-", "Да", "Да", "Да", "Да", "300", "-", "-",
                        "Да", "Да", "50", "-", "30"};
                image = R.mipmap.iron_st_cc7121;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7121/";
                break;
            case "ST-CC0225":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "-", "-", "-", "300", "Да", "-",
                        "Да", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0225;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0225/";
                break;
            case "ST-CC0216 New":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "-", "-", "250", "Да", "-",
                        "-", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0216_new;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0216_new/";
                break;
            case "ST-CC0218":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "Да", "Да", "240", "Да", "-", "Да",
                        "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0218;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0218/";
                break;
            case "ST-CC7138 Green":
                arr_descriptions = new String[]{
                        "2400", "Керамика", "Да", "Да", "Да", "Да", "-", "370", "Да", "-",
                        "-", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc7138_reen;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7138_green/";
                break;
            case "ST-CC0222 green":
                arr_descriptions = new String[]{
                        "2000", "Керамика", "Да", "Да", "Да", "Да", "Да", "260", "Да", "-",
                        "-", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0222_green;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0222_green/";
                break;
            case "ST-CC0221":
                arr_descriptions = new String[]{
                        "2000", "тефлон", "Да", "Да", "-", "Да", "-", "300", "Да", "-",
                        "-", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0221;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0221/";
                break;
            case "ST-CC0220 green":
                arr_descriptions = new String[]{
                        "1000", "нерж. Сталь", "Да", "Да", "Да", "Нет", "-", "40", "Да", "-",
                        "Нет", "Да", "50", "-", "-"};
                image = R.mipmap.iron_st_cc0220_green;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc0220_green/";
                break;
            case "ST-CC7113 CerGrey":
                arr_descriptions = new String[]{
                        "1600", "Керамика", "Да", "Да", "Да", "-", "-", "80", "-", "-",
                        "-", "Да", "50", "-", "15"};
                image = R.mipmap.iron_st_cc7113_cer_grey;
                url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/utyugi/saturn_st_cc7113_cergrey/";
                break;
            default:
                break;
        }
    }

    public String[] getArr_naming() {
        return arr_naming;
    }

    public String[] getArr_descriptions() {
        return arr_descriptions;
    }

    public int getImage() {
        return image;
    }

    public String getUrl_goods() {
        return url_goods;
    }

}
