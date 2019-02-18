package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Water_air {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Water_air(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Площадь увлажнения, м2:", "Интенсивность увлажнения, мл/ч:",
                "Регулятор интенсивности увлажнения:", "Емкость резервуара для воды, л:",
                "Функция автоотключения:", "Частота, Гц:",
                "Ароматерапия:", "Подсветка:", "Вращающийся диффузор на 360°:"};

        switch (arr_category[id_arr]) {
            case "ST-AH2110":
                arr_descriptions = new String[]{
                        "25", "25", "280", "Да", "2,5", "Да", "50", "-", "-", "-"};
                image = R.mipmap.water_air_st_ah2110;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2110/";
                break;
            case "ST-AH2109":
                arr_descriptions = new String[]{
                        "25", "25", "280", "Да", "2,5", "Да", "50", "-", "-", "-"};
                image = R.mipmap.water_air_st_ah2109;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2109/";
                break;
            case "ST-AH2111":
                arr_descriptions = new String[]{
                        "25", "25", "280", "Да", "2,5", "Да", "50", "-", "-", "-"};
                image = R.mipmap.water_air_st_ah2111;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2111/";
                break;
            case "ST-AH2113":
                arr_descriptions = new String[]{
                        "25", "25", "280", "Да", "2,5", "Да", "50", "-", "-", "-"};
                image = R.mipmap.water_air_st_ah2113;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2113/";
                break;
            case "ST-AH2112P":
                arr_descriptions = new String[]{
                        "12", "30", "25", "-", "0,7", "-", "50", "Да", "Да", "-"};
                image = R.mipmap.water_air_st_ah2112p;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2112p/";
                break;
            case "ST-AH2112C":
                arr_descriptions = new String[]{
                        "12", "30", "25", "-", "0,7", "-", "50", "Да", "Да", "-"};
                image = R.mipmap.water_air_st_ah2112c;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2112c/";
                break;
            case "ST-AH2103":
                arr_descriptions = new String[]{
                        "25", "30", "260", "Да", "2,9", "Да", "50", "Да", "Да", "Да"};
                image = R.mipmap.water_air_st_ah2103;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/uvlazhniteli_vozdukha/saturn_st_ah2103/";
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
