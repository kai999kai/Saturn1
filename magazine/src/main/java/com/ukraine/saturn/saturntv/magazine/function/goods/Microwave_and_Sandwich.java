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
public class Microwave_and_Sandwich {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Microwave_and_Sandwich(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_MICROWAVE_ALL)) {
            arr_naming = new String[]{
                    "Автоприготовление, программ:", "Объем:", "Микроволновая мощность, Вт:",
                    "Мощность гриля, Вт:", "Уровней микроволновой мощности:",
                    "Потребляемая мощность, Вт:", "Функция размораживания:",
                    "Покрытие внутренней камеры:", "Металлическая ручка:",
                    "ЖК дисплей:", "Управление:", "Таймер, мин:", "Блокировочный механизм:"};
            switch (arr_category[id_arr]) {
                case "ST-MW8159":
                    arr_descriptions = new String[]{"6", "23", "800", "1000", "5", "1280", "Да",
                            "антибактериальное", "Да", "Да", "электронное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw8159;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8159/";
                    break;
                case "ST-MW8156":
                    arr_descriptions = new String[]{"-", "25", "800", "1000", "5", "1280", "Да",
                            "антибактериальное", "-", "Да", "сенсорное", "60", "-"};
                    image = R.mipmap.microwave_st_mw8156;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8156/";
                    break;
                case "ST-MW7153New":
                    arr_descriptions = new String[]{"6", "23", "800", "1000", "10", "1280", "Да",
                            "антибактериальное", "-", "Да", "сенсорное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw7153new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7153new/";
                    break;
                case "ST-MW7159GR":
                    arr_descriptions = new String[]{"6", "20", "800", "1000", "5", "1280", "Да",
                            "антибактериальное", "-", "Да", "электронное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw7159gr;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7159gr/";
                    break;
                case "ST-MW7159G":
                    arr_descriptions = new String[]{"8", "20", "800", "1000", "5", "1280", "Да",
                            "антибактериальное", "-", "Да", "электронное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw7159g;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7159g/";
                    break;
                case "ST-MW7158G":
                    arr_descriptions = new String[]{"6", "20", "700", "800", "10", "1150", "Да",
                            "антибактериальное", "-", "Да", "электронное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw7158g;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7158g/";
                    break;
                case "ST-MW7158GR":
                    arr_descriptions = new String[]{"6", "20", "700", "800", "10", "1150", "Да",
                            "антибактериальное", "-", "Да", "электронное", "60", "Да"};
                    image = R.mipmap.microwave_st_mw7158gr;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7158gr/";
                    break;
                case "ST-MW8168":
                    arr_descriptions = new String[]{"-", "20", "700", "-", "6", "1200", "Да",
                            "антипригарное", "-", "-", "механическое", "30", "-"};
                    image = R.mipmap.microwave_st_mw8168;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8168/";
                    break;
                case "ST-MW8167":
                    arr_descriptions = new String[]{"-", "20", "700", "-", "5", "1100", "Да",
                            "антипригарное", "-", "-", "механическое", "35", "-"};
                    image = R.mipmap.microwave_st_mw8167;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8167/";
                    break;
                case "ST-MW8160":
                    arr_descriptions = new String[]{"-", "20", "700", "-", "6", "1150", "Да",
                            "антипригарное", "-", "-", "механическое", "30", "-"};
                    image = R.mipmap.microwave_st_mw8160;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8160/";
                    break;
                case "ST-MW8170":
                    arr_descriptions = new String[]{"-", "20", "700", "-", "6", "1200", "Да",
                            "антипригарное", "-", "-", "механическое", "30", "-"};
                    image = R.mipmap.microwave_st_mw8170;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw8170/";
                    break;
                case "ST-MW7155M":
                    arr_descriptions = new String[]{"-", "20", "700", "-", "6", "1150", "Да",
                            "антипригарное", "-", "-", "механическое", "30", "-"};
                    image = R.mipmap.microwave_st_mw7155m;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/mikrovolnovye_pechi/saturn_st_mw7155m/";
                    break;
                default:
                    break;

            }
        } else {
            //NAME_ARR_SANDWICH_ALL
            arr_naming = new String[]{"Мощность Вт:", "Световой индикатор готовности блюда:",
                    "Антипригарное покрытие:", "Защита от перегрева:", "Отсек для хранения шнура:"};
            arr_descriptions = new String[]{"1200", "Да", "Да", "Да", "Да"};
            image = R.mipmap.sandwich_st_ec7030;
            url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sendvichnitsy/saturn_st_ec7030/";

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
