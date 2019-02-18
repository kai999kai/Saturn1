package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Heater {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Heater(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Площадь обогрева, м2", "Световой индикатор:", "Габариты, см:",
                "Встроенный вентилятор:", "Регулируемый термостат:", "Позиции режимов мощности, Вт:",
                "Количество секций:", "Дополнительные свойства:", "Защита от перегрева:",
                "Отсек для хранения шнура:", "Частота, Гц:"};

        switch (arr_category[id_arr]) {


            case "ST-OH1254":
                arr_descriptions = new String[]{
                        "3000", "32", "-", "-", "-", "Да", "1000/2000/3000", "13",
                        "Полотенцесушитель, увлажнитель воздуха", "Да", "-", "50"};
                image = R.mipmap.heater_st_oh1254;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1254/";
                break;
            case "ST-OH1256":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "-", "-", "Да", "800/1200/2000", "9",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh1256;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1256/";
                break;
            case "ST-OH0414":
                arr_descriptions = new String[]{
                        "2500", "32", "Да", "16х60", "-", "Да", "1000/1500/2500", "13",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0414;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0414/";
                break;
            case "ST-OH1253":
                arr_descriptions = new String[]{
                        "2500", "27", "Да", "-", "-", "Да", "1000/1500/2500", "11",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh1253;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1253/";
                break;
            case "ST-OH0433":
                arr_descriptions = new String[]{
                        "2500", "27", "Да", "15х58", "-", "Да", "1000/1500/2500", "11",
                        "Отключение при опрокидывании", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0433;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0433/";
                break;
            case "ST-OH0429":
                arr_descriptions = new String[]{
                        "2500", "27", "Да", "-", "-", "Да", "1000/1500/2500", "11",
                        "Отключение при опрокидывании", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0429;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0429_2/";
                break;
            case "ST-OH1252":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "-", "-", "Да", "800/1200/2000", "9",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh1252;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1252/";
                break;
            case "ST-OH0413":
                arr_descriptions = new String[]{
                        "2500", "27", "Да", "16х60", "-", "Да", "1000/1500/2500", "11",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0413;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0413/";
                break;
            case "ST-OH0432":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "16х58", "-", "Да", "800/1200/2000", "9",
                        "Отключение при опрокидывании", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0432;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0432/";
                break;
            case "ST-OH0443":
                arr_descriptions = new String[]{
                        "2500", "20", "Да", "-", "-", "Да", "1000/1500/2500", "11",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0443;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0443/";
                break;
            case "ST-OH0447":
                arr_descriptions = new String[]{
                        "2500", "25", "Да", "125x590x505", "-", "Да", "1000/1500/2500", "11",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0447;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0447/";
                break;
            case "ST-OH1251":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "-", "-", "Да", "600/900/1500", "7",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh1251;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1251/";
                break;
            case "ST-OH1664":
                arr_descriptions = new String[]{
                        "1200", "14", "Да", "-", "-", "Да", "500/700/1200", "7",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh1664;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1664/";
                break;
            case "ST-OH0412":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "16х60", "-", "Да", "800/1200/2000", "9",
                        "увлажнитель", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0412;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0412/";
                break;
            case "ST-OH0442":
                arr_descriptions = new String[]{
                        "2000", "15", "Да", "-", "-", "Да", "800/1200/2000", "9",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0442;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0442/";
                break;
            case "ST-OH0428":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "-", "-", "Да", "800/1200/2000", "9",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0428;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0428_1/";
                break;
            case "ST-OH0446":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "125х590х42,5", "-", "Да", "800/1200/2000", "9",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0446;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0446/";
                break;
            case "ST-OH0411":
                arr_descriptions = new String[]{
                        "1500", "10", "Да", "-", "-", "Да", "600/900/1500", "7",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0411;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0411/";
                break;
            case "ST-OH0431":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "12х58", "-", "Да", "600/900/1500", "7",
                        "отключение при опрокидывании", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0431;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0431/";
                break;
            case "ST-OH0441":
                arr_descriptions = new String[]{
                        "1500", "10", "Да", "-", "-", "Да", "600/900/1500", "7",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0441;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0441/";
                break;
            case "ST-OH0427":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "-", "-", "Да", "600/900/1500", "7",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0427;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0427_2/";
                break;
            case "ST-OH0445":
                arr_descriptions = new String[]{
                        "1500", "15", "Да", "12,5х59", "-", "Да", "600/900/1500", "7",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0445;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0445/";
                break;
            case "ST-OH1246 New":
                arr_descriptions = new String[]{"600", "7", "Да", "-", "-", "Да", "-", "7",
                        "-", "Да", "Нет", "50"};
                image = R.mipmap.heater_st_oh1246_new;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh1246_new/";
                break;
            case "ST-OH0403":
                arr_descriptions = new String[]{
                        "2500", "20", "Да", "11,2х58", "-", "Да", "1000/1500/2500", "11",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0403;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0403/";
                break;
            case "ST-OH0402":
                arr_descriptions = new String[]{
                        "2500", "15", "Да", "11,2х58", "-", "Да", "800/1200/2000", "9",
                        "-", "Да", "Да", "50"};
                image = R.mipmap.heater_st_oh0402;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/maslyanye_obogrevateli/saturn_st_oh0402/";
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
