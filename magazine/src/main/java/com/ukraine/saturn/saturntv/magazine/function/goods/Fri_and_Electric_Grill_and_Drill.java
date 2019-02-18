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
public class Fri_and_Electric_Grill_and_Drill {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Fri_and_Electric_Grill_and_Drill(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_FRI_ALL)) {
            arr_naming = new String[]{
                    "Мощность Вт:", "Объем л:", "Материал корпуса:", "Регулятор температуры:",
                    "Съемная корзина для фритюра:", "Блокировочный механизм:", "Съемный фильтр:",
                    "Световой индикатор:", "Антипригарное покрытие:", "Аксессуары:"};
            switch (arr_category[id_arr]) {
                case "ST-EC0140":
                    arr_descriptions = new String[]{
                            "1300", "2", "софт-тач пластик", "0-190", "Да", "Да", "Да", "Да", "Да",
                            "-"};
                    image = R.mipmap.fri_st_ec0140;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/frityurnitsy/saturn_st_ec0140/";
                    break;
                case "ST-EC0143":
                    arr_descriptions = new String[]{
                            "1200", "3", "софт-тач пластик", "180-220", "Да", "-", "-", "-", "-",
                            "решетка гриль, ручка-ухват, корзина для фритюра"};
                    image = R.mipmap.fri_st_ec0143;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/frityurnitsy/saturn_st_ec0143/";
                    break;
                case "ST-EC7069":
                    arr_descriptions = new String[]{
                            "800", "1", "софт-тач пластик", "0-190", "Да", "Да", "Да", "Да", "Да",
                            "-"};
                    image = R.mipmap.fri_st_ec7069;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/frityurnitsy/saturn_st_ec7069/";
                    break;
                case "ST-EC0138":
                    arr_descriptions = new String[]{
                            "840", "0.9", "софт-тач пластик", "0-190", "Да", "-", "Да", "Да", "Да",
                            "-"};
                    image = R.mipmap.fri_st_ec0138;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/frityurnitsy/saturn_st_ec0138/";
                    break;
                default:
                    break;
            }
        } else if (Arrays.equals(arr_category, NAME_ARR_ELECTRIC_DRILL_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Количество ярусов:", "Вместительность одного яруса, кг:",
                    "Материал корпуса:", "Управление:", "Регулятор температуры С:",
                    "Дополнительные свойства:", "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-FP0111":
                    arr_descriptions = new String[]{
                            "245", "5", "1", "пластик", "механическое", "35-70",
                            "приготовление йогурта", "Да"};
                    image = R.mipmap.electric_grill_st_fp0111;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrosushilki_dlya_produktov/saturn_st_fp0111/";
                    break;
                case "ST-FP8504":
                    arr_descriptions = new String[]{
                            "245", "5", "1", "пластик", "механическое", "35-70",
                            "-", "Да"};
                    image = R.mipmap.electric_grill_st_fp8504;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrosushilki_dlya_produktov/saturn_st_fp8504/";
                    break;
                case "ST-FP8504 New":
                    arr_descriptions = new String[]{
                            "245", "5", "1", "пластик", "механическое", "35-70",
                            "-", "Да"};
                    image = R.mipmap.electric_grill_st_fp8504_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrosushilki_dlya_produktov/saturn_st_fp8504_new/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_ELECTRIC_GRILL_ALL {"SATURN ST-EC1151"};
            arr_naming = new String[]{"-"};
            arr_descriptions = new String[]{"-"};
            image = R.mipmap.main_saturn_tv;
            url_goods = "";

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
