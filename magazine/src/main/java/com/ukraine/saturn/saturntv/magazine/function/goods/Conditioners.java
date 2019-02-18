package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Conditioners {
    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Conditioners(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        arr_naming = new String[]{
                "Компрессоры:", "Фреон:", "Мощность охлаждения, кВт:", "Мощность нагревания, кВт:",
                "Температурный диапазон, °С:", "3-х реберный испаритель:",
                "Функция супер-охлаждения и обогрева:", "Функция авторазмораживания:",
                "Функция “Sleep”:", "Самодиагностика работы основных блоков и режимов:",
                "Электростатический фильтр (сетка):", "Серебряный ионизирующий фильтр:",
                "Автоматический режим работы:", "Авторестарт:", "ЖК дисплей:", "Таймер, ч:",
                "Функция “Здоровье” (генератор анионов):", "Антибактериальный фильтр:",
                "Компрессор инверторного типа:"};

        switch (arr_category[id_arr]) {
            case "ST-24TLHR/Bio":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "7,03", "7,18", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_24tlhr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_24tlhr_bio/";
                break;
            case "ST-24CTH":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "7,03", "7,18", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_st_24cth;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_24cth/";
                break;
            case "CS-18AQ":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "5.2", "5.5", "-15 +48", "-", "Да", "Да", "Да", "Да",
                        "-", "-", "-", "Да", "-", "24", "-", "Да", "Да"};
                image = R.mipmap.conditioners_cs_18aq;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_18aq/";
                break;
            case "CS-24H":
                arr_descriptions = new String[]{
                        "-", "R22", "7", "7.7", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_24h;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_24h/";
                break;
            case "ST-24HR(Bio)":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "7", "7.7", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_24hr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_24hr_bio/";
                break;
            case "ST-18TLHR/Bio":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "5,28", "5,42", "-5 +43", "-", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_18tlhr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_18tlhr_bio/";
                break;
            case "ST-18CTH":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "5,3", "5,65", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_st_18cth;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_18cth/";
                break;
            case "ST-18HR(Bio)":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "5,2", "5,8", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_18hr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_18hr_bio/";
                break;
            case "CS-18H":
                arr_descriptions = new String[]{
                        "-", "R22", "5,28", "5,8", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_18h;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_18h/";
                break;
            case "CS-12":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "3,55", "3,8", "-5 +48", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "Да"};
                image = R.mipmap.conditioners_cs_12;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_12/";
                break;
            case "CS-12AQ":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "3,55", "3,8", "-5 +48", "Да", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "Да"};
                image = R.mipmap.conditioners_cs_12aq;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_12aq/";
                break;
            case "CS-09AQ":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410А", "2,7", "2,8", "-5 +48", "-", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "Да"};
                image = R.mipmap.conditioners_cs_09aq;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_09aq/";
                break;
            case "CS-09":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410А", "2,7", "2,8", "-5 +48", "-", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "Да"};
                image = R.mipmap.conditioners_cs_09;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_09/";
                break;
            case "ST-12TLHR/Bio":
                arr_descriptions = new String[]{
                        "GMCC", "R410А", "3,52", "3,66", "-5 +43", "Да", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_12tlhr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_12tlhr_bio/";
                break;
            case "CS-12VP":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "3,33", "3,58", "-", "Да", "Да", "Да", "Да", "-", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_12vp;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_12vp/";
                break;
            case "ST-12CTH":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "3,45", "3,55", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_st_12cth;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_12cth/";
                break;
            case "ST-07HR(Bio) (R410)":
                arr_descriptions = new String[]{
                        "HITACHI", "R22", "2", "2,1", "-5 +45", "Да", "Да", "Да", "Да", "-", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_07hr_bio_r410;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_07hr_bio_r410/";
                break;
            case "ST-07EN(Bio)(R410)":
                arr_descriptions = new String[]{
                        "-", "R410", "2,06", "2,65", "-", "-", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_07en_bio_r410;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_07en_bio_r410/";
                break;
            case "CS-09_AHR":
                arr_descriptions = new String[]{
                        "TOSHIBA", "-", "2,6", "2,8", "-", "Да", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "Да", "24", "Да", "-", "-"};
                image = R.mipmap.conditioners_cs_09_ahr;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_09_ahr/";
                break;
            case "CS-07_AHR":
                arr_descriptions = new String[]{
                        "TOSHIBA", "-", "2,1", "2,2", "-", "Да", "Да", "Да", "Да", "Да", "-",
                        "-", "Да", "Да", "Да", "24", "Да", "-", "-"};
                image = R.mipmap.conditioners_st_07_ahr;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_07_ahr/";
                break;
            case "ST-09TLHR/Bio":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "2,64", "2,78", "-5 +45", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "-", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_09tlhr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_09tlhr_bio/";
                break;
            case "ST-12":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "3,5", "3,6", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Нет", "-", "-"};
                image = R.mipmap.conditioners_st_12;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_12/";
                break;
            case "CS-12H":
                arr_descriptions = new String[]{
                        "-", "R22", "3,52", "3,8", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_12h;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_12h/";
                break;
            case "ST-12HR(Bio)":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "3,2", "3,52", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_12hr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_12hr_bio/";
                break;
            case "ST-07TLHR/Bio":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "2,5", "2,75", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_07tlhr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_07tlhr_bio/";
                break;
            case "ST-09CTH":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "2,7", "2,8", "-5 +43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_st_09cth;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_09cth/";
                break;
            case "CS-09VP":
                arr_descriptions = new String[]{
                        "GMCC", "R410", "2,24", "2,39", "-", "Да", "Да", "Да", "Да", "-", "-",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_09vp;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_09vp/";
                break;
            case "ST-07CTH":
                arr_descriptions = new String[]{
                        "HITACHI", "R410а", "2,2", "2,3", "-", "-", "Да", "Да", "Да", "Да", "-",
                        "Да", "Да", "Да", "Да", "24", "Да", "-", "-"};
                image = R.mipmap.conditioners_st_07cth;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_07cth/";
                break;
            case "ST-09HR(Bio)":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "2,5", "2,75", "-5+43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "Да", "Да", "-"};
                image = R.mipmap.conditioners_st_09hr_bio;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_09hr_bio/";
                break;
            case "CS-07VP":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R410", "-", "-", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_07vp;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_07vp/";
                break;
            case "ST-09":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "2,75", "2,8", "-5+43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "-", "-", "-", "-"};
                image = R.mipmap.conditioners_st_09;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_09/";
                break;
            case "ST-07":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "2,75", "2,8", "-5+43", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "Да", "Да", "Да", "-", "Да", "-", "-"};
                image = R.mipmap.conditioners_st_07;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_st_07/";
                break;
            case "CS-07H":
                arr_descriptions = new String[]{
                        "TOSHIBA", "R22", "2,1", "2,2", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "Да", "Да", "Да", "24", "-", "-", "-"};
                image = R.mipmap.conditioners_cs_07h;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konditsionery/saturn_cs_07h/";
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
