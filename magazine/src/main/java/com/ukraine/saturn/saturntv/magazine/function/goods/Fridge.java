package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Fridge {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Fridge(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Общий  л:", "Общий полезный обьем, л:", "Хладагент:", "Компрессор, шт:",
                "Тип системы охлаждения:", "Объем холодильной камеры, л:",
                "Объем морозильной камеры, л:", "К-во отсеков в морозильной камере:",
                "Автоматическая разморозка холодильной камеры:", "Диапазон внешней температуры °C:",
                "Навесные полки на двери:", "Перевешиваемая дверь:",
                "Переставляемая ударопрочная полка с бортиком, шт:",
                "Стеклянная полка над лотком для овощей:",
                "Управление:", "Класс морозильной камеры:", "Климатический класс:",
                "Уровень шума, дБ:", "Разморозка морозильной камеры:",
                "Размер (Глубина*Высота*Ширина:", "Прозрачный ящик для овощей:",
                "Частота, Гц:"};

        switch (arr_category[id_arr]) {
            case "ST-CF1952U":
                arr_descriptions = new String[]{
                        "322", "310", "R600a", "1", "статическая", "226", "84", "3", "Да",
                        "+16 - +38", "4", "Да", "3", "Да", "механическое", "****", "ST", "<42",
                        "ручная", "600*1850*600", "2", "50"};
                image = R.mipmap.fridge_st_cf1952u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1952u/";
                break;
            case "ST-CF1954U - inox":
                arr_descriptions = new String[]{
                        "282", "273", "R600a", "1", "статическая", "205", "68", "3", "Да",
                        "+16 - +32", "4", "Да", "3", "Да", "механическое", "****", "N", "<42",
                        "ручная", "580*1770*550", "1", "50"};
                image = R.mipmap.fridge_st_cf1954u_inox;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1954u_inox/";
                break;
            case "ST-CF1954U":
                arr_descriptions = new String[]{
                        "282", "273", "R600a", "1", "статическая", "205", "68", "3", "Да",
                        "+16 - +32", "4", "Да", "3", "Да", "механическое", "****", "N", "<42",
                        "ручная", "580*1770*550", "1", "50"};
                image = R.mipmap.fridge_st_cf1954u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1954u/";
                break;
            case "ST-CF1960U":
                arr_descriptions = new String[]{
                        "159", "155", "R600a", "1", "статическая", "115", "40", "-", "Да", "-",
                        "4", "Да", "3", "Да", "механическое", "****", "N", "<42", "ручная",
                        "-", "-", "50"};
                image = R.mipmap.fridge_st_cf1960u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1960u/";
                break;
            case "ST-CF1953U":
                arr_descriptions = new String[]{
                        "282", "273", "-", "1", "статическая", "191", "84", "3", "Да", "-16+38",
                        "4", "Да", "3", "Да", "механическое", "****", "-", "<42",
                        "ручная", "-", "2", "50"};
                image = R.mipmap.fridge_st_cf1953u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1953u/";
                break;
            case "ST-CF1963U":
                arr_descriptions = new String[]{
                        "258", "252", "R600a", "1", "статическая", "199", "53", "2", "Да", "-16+38",
                        "4", "Да", "3", "Да", "механическое", "****", "N/ST", "<42",
                        "ручная", "580*1660*550", "2", "50"};
                image = R.mipmap.fridge_st_cf1963u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1963u/";
                break;
            case "ST-CF1965U":
                arr_descriptions = new String[]{
                        "121", "118", "R600a", "1", "статическая", "89", "29", "-", "Да", "-",
                        "3", "Да", "-", "Да", "механическое", "****", "N", "<42",
                        "ручная", "-", "2", "50"};
                image = R.mipmap.fridge_st_cf1965u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1965u/";
                break;
            case "ST-CF2965M":
                arr_descriptions = new String[]{"194", "143", "-", "-", "-", "-", "-", "-", "-", "-",
                        "-", "-", "-", "-", "-", "-", "ST", "<41", "ручная", "-", "-", "50"};
                image = R.mipmap.fridge_st_cf2965m;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2965m/";
                break;
            case "ST-CF1961U":
                arr_descriptions = new String[]{
                        "187", "182", "R600a", "1", "статическая", "136", "48", "2", "Да", "-16+32",
                        "4", "Да", "3", "Да", "механическое", "****", "N",
                        "<42", "ручная", "580*1400*500", "1", "50"};
                image = R.mipmap.fridge_st_cf1961u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1961u/";
                break;
            case "ST-CF1962U":
                arr_descriptions = new String[]{
                        "217", "212", "R600a", "1", "статическая", "171", "41", "2", "Да", "-16+38",
                        "4", "Да", "3", "Да", "механическое", "****", "N/st", "<42",
                        "ручная", "580*1430*550", "2", "50"};
                image = R.mipmap.fridge_st_cf1962u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1962u/";
                break;
            case "ST-CF2953":
                arr_descriptions = new String[]{
                        "120", "118", "R600a", "1", "статическая", "103", "15", "1", "Да", "-16+32",
                        "3", "Да", "1", "Да", "механическое", "****", "N", "<41", "ручная",
                        "580*850*550", "2", "50"};
                image = R.mipmap.fridge_st_cf2953;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2953/";
                break;
            case "ST-CF2952":
                arr_descriptions = new String[]{
                        "104", "102", "R600a", "1", "статическая", "88", "14", "-", "Да", "-",
                        "-", "Да", "-", "Да", "механическое", "****", "N", "<41", "ручная",
                        "580*850*550", "1", "50"};
                image = R.mipmap.fridge_st_cf2952;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2952/";
                break;
            case "ST-CF2950":
                arr_descriptions = new String[]{
                        "84", "82", "R600a", "1", "статическая", "73", "9", "1", "Да", "-16+38",
                        "2", "Да", "1", "Да", "механическое", "-", "st", "<41", "ручная",
                        "450*850*480", "1", "50"};
                image = R.mipmap.fridge_st_cf2950;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2950/";
                break;
            case "ST-CF1956U":
                arr_descriptions = new String[]{
                        "175", "65", "-", "-", "-", "-", "-", "3", "Да", "-16+38",
                        "3", "Да", "3", "Да", "-", "****", "N", "<41", "ручная", "500*1715*550",
                        "-", "50"};
                image = R.mipmap.fridge_st_cf1956u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1956u/";
                break;
            case "ST-CF1955U":
                arr_descriptions = new String[]{
                        "141", "66", "-", "-", "-", "-", "-", "1", "Да", "-16+38",
                        "3", "Да", "3", "Да", "-", "****", "N", "<41", "ручная", "580*1500*550",
                        "-", "50"};
                image = R.mipmap.fridge_st_cf1955u;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf1955u/";
                break;
            case "ST-CF2951":
                arr_descriptions = new String[]{
                        "-", "-", "-", "-", "-", "73", "9", "1", "Да", "-16+38",
                        "2", "Да", "1", "Да", "-", "-", "st", "-", "-", "450*850*480", "-", "50"};
                image = R.mipmap.fridge_st_cf2951;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2951/";
                break;
            case "ST-CF2949":
                arr_descriptions = new String[]{
                        "-", "-", "-", "-", "-", "46", "4", "1", "Да", "-16+38",
                        "2", "Да", "-", "-", "-", "-", "N/st", "-", "-", "470*510*440", "-", "50"};
                image = R.mipmap.fridge_st_cf2949;
                url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/kholodilniki/saturn_st_cf2949/";
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
