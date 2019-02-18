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
public class Coffee_grinder_and_Omelette {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Coffee_grinder_and_Omelette(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_COFFEE_GRINDER_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Материал корпуса:", "Материал чаши:",
                    "Блокировочный механизм:", "Прозрачная крышка:", "Отсек для хранения шнура:",
                    "Вместимость, г:", "Мерная ложка:", "Импульсный режим работы:", "Щетка:",
                    "Ножи из нержавеющей стали:"};
            switch (arr_category[id_arr]) {
                case "ST-CM1038":
                    arr_descriptions = new String[]{"180", "нерж. Сталь", "нерж. Сталь", "Да", "Да",
                            "Да", "80", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm1038;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm1038/";
                    break;
                case "ST-CM0177":
                    arr_descriptions = new String[]{"180", "нерж. Сталь", "нерж. Сталь", "Да",
                            "Да", "Да", "80", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0177;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0177/";
                    break;
                case "ST-CM0178 Brown":
                    arr_descriptions = new String[]{"200", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "100", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0178_brown;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0178_brown/";
                    break;
                case "ST-CM0178 Black":
                    arr_descriptions = new String[]{"200", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "100", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0178_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0178_black/";
                    break;
                case "ST-CM1032":
                    arr_descriptions = new String[]{"200", "пластик", "нерж. Сталь", "Да", "Да", "Да",
                            "85", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm1032;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm1032/";
                    break;
                case "ST-CM1031":
                    arr_descriptions = new String[]{"280", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "60", "-", "Да", "-", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm1031;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm1031/";
                    break;
                case "ST-CM0176 Grey":
                    arr_descriptions = new String[]{"250", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "80", "-", "Да", "-", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0176_grey;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0176_grey/";
                    break;
                case "ST-CM0176":
                    arr_descriptions = new String[]{"250", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "80", "-", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0176;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0176/";
                    break;
                case "ST-CM0176 Red":
                    arr_descriptions = new String[]{"250", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "80", "-", "Да", "-", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm0176_red;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm0176_red/";
                    break;
                case "ST-CM1033":
                    arr_descriptions = new String[]{"180", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "50", "-", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm1033;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm1033/";
                    break;
                case "ST-CM1033 Black":
                    arr_descriptions = new String[]{"180", "пластик", "нерж. Сталь", "Да", "Да", "-",
                            "50", "-", "Да", "Да", "Да"};
                    image = R.mipmap.coffee_grinder_st_cm1033_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kofemolki/saturn_st_cm1033_black/";
                    break;
                default:
                    break;

            }
        } else {
            //  NAME_ARR_OMELETTE_ALL {"SATURN ST-EC1136"};
            arr_naming = new String[]{"Мощность Вт:", "Аксессуары:", "Антипригарное покрытие:"};
            arr_descriptions = new String[]{"200", "щеточка для очистки, 5 шпажек, лопатка", "Да"};
            image = R.mipmap.omelette_st_ec1136;
            url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/omletnitsy/saturn_st_ec1136/";
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
