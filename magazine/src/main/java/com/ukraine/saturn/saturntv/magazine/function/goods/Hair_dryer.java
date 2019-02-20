package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Hair_dryer {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Hair_dryer(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Скоростных режимов работы:", "Температурных режимов работы:",
                "Режим подачи холодного воздуха:", "Диффузор:", "Петелька для подвешивания:",
                "Частота, Гц:", "Защита от перегрева:",
                "Складная ручка:", "Ионизация:", "Свойства:"};

        switch (arr_category[id_arr]) {
            case "SATURN ST-HC7231":
                arr_descriptions = new String[]{
                        "1500", "3", "3", "Да", "Да", "Да", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7231;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7231/";
                break;
            case "ST-HC7212":
                arr_descriptions = new String[]{
                        "1600", "2", "2", "Да", "-", "Да", "50", "Да", "Да", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7212;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7212/";
                break;
            case "ST-HC7203":
                arr_descriptions = new String[]{
                        "1200", "2", "-", "-", "-", "Да", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7203;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7203/";
                break;
            case "ST-HC7210 green":
                arr_descriptions = new String[]{
                        "1400", "2", "1", "-", "-", "Да", "50", "Да", "Да", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7210_green;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7210_green/";
                break;
            case "ST-HC7230 white":
                arr_descriptions = new String[]{
                        "1200", "2", "1", "-", "-", "Да", "50", "Да", "Да", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7230_white;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7230_white/";
                break;
            case "ST-HC7335":
                arr_descriptions = new String[]{
                        "1200", "2", "-", "-", "-", "Да", "50", "Да", "Да", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7335;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7335/";
                break;
            case "ST-HC7238":
                arr_descriptions = new String[]{
                        "1800", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "Да", "-"};
                image = R.mipmap.hair_dryer_st_hc7238;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7238/";
                break;
            case "ST-HC7324":
                arr_descriptions = new String[]{
                        "2200", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "Да", "-"};
                image = R.mipmap.hair_dryer_st_hc7324;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7324/";
                break;
            case "ST-HC7217New":
                arr_descriptions = new String[]{
                        "2200", "2", "3", "Да", "-", "Да", "50", "Да", "-", "-",
                        "AC мотор, профессиональная насадка-концентратор"};
                image = R.mipmap.hair_dryer_st_hc7217_new;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7217new/";
                break;
            case "ST-HC7334":
                arr_descriptions = new String[]{
                        "1800", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "Да", "-"};
                image = R.mipmap.hair_dryer_st_hc7334;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7334/";
                break;
            case "ST-HC7238_Brown":
                arr_descriptions = new String[]{
                        "1800", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "Да", "-"};
                image = R.mipmap.hair_dryer_st_hc7238_brown;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7238_brown/";
                break;
            case "ST-HC7229 red":
                arr_descriptions = new String[]{
                        "2200", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7229_red;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7229_red/";
                break;
            case "ST-HC7323":
                arr_descriptions = new String[]{
                        "2000", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7323;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7323/";
                break;
            case "ST-HC7325":
                arr_descriptions = new String[]{
                        "1200", "2", "3", "-", "-", "Да", "50", "-", "Да", "-",
                        "Выпрямитель для волос (Мощность: 20 Вт, Керамические пластины)"};
                image = R.mipmap.hair_dryer_st_hc7325;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7325/";
                break;
            case "ST-HC7337":
                arr_descriptions = new String[]{
                        "2200", "2", "3", "Да", "Да", "-", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7337;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7337/";
                break;
            case "ST-HC7219 purple":
                arr_descriptions = new String[]{
                        "2200", "2", "3", "Да", "Да", "Да", "50", "Да", "Да", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7219_purple;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7219_purple/";
                break;
            case "ST-HC7218New":
                arr_descriptions = new String[]{
                        "2000", "2", "3", "Да", "Да", "Да", "50", "Да", "-", "-",
                        "профессиональная насадка-концентратор"};
                image = R.mipmap.hair_dryer_st_hc7218_new;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7218new/";
                break;
            case "ST-HC7236":
                arr_descriptions = new String[]{
                        "1600", "2", "2", "Да", "-", "Да", "50", "Да", "-", "-", "-"};
                image = R.mipmap.hair_dryer_st_hc7236;
                url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/feny/saturn_st_hc7236/";
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
