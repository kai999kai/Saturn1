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
public class Coffee_maker_and_Bowlerway {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Coffee_maker_and_Bowlerway(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_COFFEE_MAKER_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Тип:", "Съемный фильтр:", "Мерная ложка:", "Объем л:",
                    "Световой индикатор:", "Шкала уровня воды:", "Функция поддержания температуры:",
                    "Антикапельный механизм:", "Защита от перегрева:", "Давление, бар:",
                    "Свойства:"};
            switch (arr_category[id_arr]) {
                case "ST-CM7080 New_black":
                    arr_descriptions = new String[]{
                            "900", "капельная", "Да", "Да", "1,2", "Да", "Да", "Да", "Да", "Да",
                            "-", "-"};
                    image = R.mipmap.coffee_maker_st_cm7080_new_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7080_new_black/";
                    break;
                case "ST-CM7094":
                    arr_descriptions = new String[]{
                            "800", "эспрессо", "Да", "Да", "-", "-", "-", "-", "-", "-", "15",
                            "защитный клапан"};
                    image = R.mipmap.coffee_maker_st_cm7094;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7094/";
                    break;
                case "ST-CM7089":
                    arr_descriptions = new String[]{
                            "1500", "эспрессо", "-", "-", "1.5", "-", "-", "-", "-", "-", "15",
                            "защитный клапан, Насадка для взбивания пены"};
                    image = R.mipmap.coffee_maker_st_cm7089;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7089/";
                    break;
                case "ST-CM7086 New":
                    arr_descriptions = new String[]{
                            "800", "эспрессо", "-", "Да", "-", "Да", "-", "-", "-", "-", "3.5",
                            "защитный клапан, Насадка для взбивания пены, режим «Пауза»"};
                    image = R.mipmap.coffee_maker_st_cm7086_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7086_new/";
                    break;
                case "ST-CM7086 Black":
                    arr_descriptions = new String[]{
                            "800", "эспрессо", "-", "Да", "0.24", "Да", "-", "-", "-", "-", "4.5",
                            "защитный клапан, Насадка для взбивания пены, " +
                                    "Поддон из нержавеющей стали"};
                    image = R.mipmap.coffee_maker_st_cm7086_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7086_black/";
                    break;
                case "ST-CM0168":
                    arr_descriptions = new String[]{
                            "1000", "капельная", "Да", "-", "1,5", "-", "Да", "Да", "Да", "Да", "-",
                            "-"};
                    image = R.mipmap.coffee_maker_st_cm0168;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm0168/";
                    break;
                case "ST-CM0169":
                    arr_descriptions = new String[]{
                            "1000", "капельная", "Да", "-", "1,5", "-", "Да", "Да", "Да", "Да", "-",
                            "-"};
                    image = R.mipmap.coffee_maker_st_cm0169;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm0169/";
                    break;
                case "ST-CM7091 New":
                    arr_descriptions = new String[]{
                            "600", "капельная", "Да", "Да", "-", "Да", "-", "Да", "Да", "Да", "-",
                            "-"};
                    image = R.mipmap.coffee_maker_st_cm7091_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7091_new/";
                    break;
                case "ST-CM7085":
                    arr_descriptions = new String[]{
                            "600", "-", "-", "Да", "1,2", "Да", "Да", "Да", "Да", "Да", "-",
                            "-"};
                    image = R.mipmap.coffee_maker_st_cm7085;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7085/";
                    break;
                case "ST-CM7081 New":
                    arr_descriptions = new String[]{
                            "450", "капельная", "Да", "Да", "0,24", "Да", "-", "-", "Да", "Да", "-",
                            "2 керамические чашки"};
                    image = R.mipmap.coffee_maker_st_cm7081_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7081_new/";
                    break;
                case "ST-CM7052":
                    arr_descriptions = new String[]{
                            "800", "-", "-", "Да", "1,25", "Да", "Да", "Да", "Да", "Да", "-",
                            "-"};
                    image = R.mipmap.coffee_maker_st_cm7052;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7052/";
                    break;
                case "ST-CM7050":
                    arr_descriptions = new String[]{
                            "450", "капельная", "Да", "Да", "0,24", "Да", "-", "-", "Да", "Да", "-",
                            "2 керамические чашки"};
                    image = R.mipmap.coffee_maker_st_cm7050;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofevarki/saturn_st_cm7050/";
                    break;
                default:
                    break;

            }
        } else {
            //NAME_ARR_BOWLERWAY_ALL"SATURN ST-EC0152"Вафельницы
            arr_naming = new String[]{
                    "Мощность, Вт:", "Диаметр вафель, см:", "Отсек для хранения шнура:",
                    "Фиксатор ручек:", "Световой индикатор готовности блюда:",
                    "Антипригарное покрытие:", "Защита от перегрева:"};
            arr_descriptions = new String[]{"700", "17", "Да", "Да", "Да", "Да", "Да"};
            image = R.mipmap.bowlerway_st_ec0152;
            url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/vafelnitsy/saturn_st_ec0152/";
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
