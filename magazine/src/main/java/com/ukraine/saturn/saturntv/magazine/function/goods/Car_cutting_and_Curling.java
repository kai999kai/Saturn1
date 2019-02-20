package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

import java.util.Arrays;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.*;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Car_cutting_and_Curling {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Car_cutting_and_Curling(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_CAR_CUTTING_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Аккумулятор:", "Время зарядки, ч:", "Покрытие ножей:",
                    "Время непрерывной работы, мин:", "Тример для носа, бритвенная насадка:",
                    "База для зарядки:", "Свойства"};
            switch (arr_category[id_arr]) {
                case "ST-HC8021":
                    arr_descriptions = new String[]{"3", "Да", "8", "нерж. Сталь", "45", "Да", "Да",
                            "5 насадок, расческа, щеточка, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc8021;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc8021/";
                    break;
                case "ST-HC0362_black":
                    arr_descriptions = new String[]{"2", "Да", "8", "нерж. Сталь", "40", "-", "Да",
                            "3 насадки, щеточка для чистки, масло для ухода, адаптер"};
                    image = R.mipmap.car_cutting_st_hc0362_black;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc0362_black/";
                    break;
                case "ST-HC7384_red":
                    arr_descriptions = new String[]{"2.4", "Да", "6", "титановое", "45", "-", "Да",
                            "4 насадки, щеточка, расческа, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc7384_red;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc7384_red/";
                    break;
                case "ST-HC7381 grey":
                    arr_descriptions = new String[]{"3", "Да", "8", "титановое", "35", "-", "Да",
                            "расческа-насадка с 5 положениями, щеточка, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc7381_grey;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc7381_grey/";
                    break;
                case "ST-HC7381":
                    arr_descriptions = new String[]{"3", "Да", "8", "титановое", "35", "-", "Да",
                            "расческа-насадка с 5 положениями, щеточка, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc7381;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc7381/";
                    break;
                case "ST-HC0360":
                    arr_descriptions = new String[]{"12", "Проводная", "-", "титановое",
                            "-", "-", "-",
                            "4 насадки, щеточка, ножницы, расческа, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc0360;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc0360/";
                    break;
                case "ST-HC7383":
                    arr_descriptions = new String[]{"12", "Проводная", "-", "нерж. Сталь",
                            "-", "-", "-",
                            "4 насадки, щеточка, ножницы, расческа, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc7383;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc7383/";
                    break;
                case "ST-HC0365":
                    arr_descriptions = new String[]{"12", "Проводная", "-", "нерж. Сталь",
                            "-", "-", "-",
                            "4 насадки, щеточка, ножницы, расческа, масло для ухода"};
                    image = R.mipmap.car_cutting_st_hc0365;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/mashinki_dlya_strizhki/saturn_st_hc0365/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_CURLING_ALL
            arr_naming = new String[]{
                    "Мощность, Вт:", "Материал покрытия:", "Максимальная температура нагрева,°С:",
                    "Диаметр, мм:", "ЖК дисплей:", "Регулируемый термостат:",
                    "Функция автоотключения:", "Защита от перегрева:", "Свойства"};
            switch (arr_category[id_arr]) {
                case "ST-HC7365":
                    arr_descriptions = new String[]{
                            "50", "керамика", "210", "17", "Да", "Да", "Да", "Да",
                            "ионизация; спящий режим; 2 варианта завивки; 3 временных режима; " +
                                    "3 температурных режима"};
                    image = R.mipmap.curling_st_hc7365;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7365/";
                    break;
                case "ST-HC7368":
                    arr_descriptions = new String[]{
                            "40", "керамика", "200", "25", "-", "Да", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7368;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7368/";
                    break;
                case "ST-HC7364":
                    arr_descriptions = new String[]{
                            "45", "керамика", "210", "23", "Да", "Да", "Да", "Да", "-"};
                    image = R.mipmap.curling_st_hc7364;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7364/";
                    break;
                case "ST-HC7251":
                    arr_descriptions = new String[]{
                            "60", "керамика", "200", "17", "-", "-", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7251;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7251/";
                    break;
                case "ST-HC7363 red":
                    arr_descriptions = new String[]{
                            "35", "керамика", "190", "19", "-", "-", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7363_red;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7363_red/";
                    break;
                case "ST-HC7252":
                    arr_descriptions = new String[]{
                            "60", "керамика", "230", "25", "-", "-", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7252;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7252/";
                    break;
                case "ST-HC7227":
                    arr_descriptions = new String[]{
                            "30", "керамика", "120", "23", "-", "-", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7227;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7227/";
                    break;
                case "ST-HC7367":
                    arr_descriptions = new String[]{
                            "25", "керамика", "200", "25", "-", "-", "-", "-", "-"};
                    image = R.mipmap.curling_st_hc7367;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/ployki/saturn_st_hc7367/";
                    break;
                default:
                    break;
            }
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
