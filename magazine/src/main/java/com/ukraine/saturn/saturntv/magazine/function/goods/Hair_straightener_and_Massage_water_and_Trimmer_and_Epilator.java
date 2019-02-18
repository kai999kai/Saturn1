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
public class Hair_straightener_and_Massage_water_and_Trimmer_and_Epilator {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Hair_straightener_and_Massage_water_and_Trimmer_and_Epilator(
            String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_HAIR_STRAIGHTENER_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Петелька для подвешивания:", "Покрытие пластин:",
                    "Максимальная температура нагрева,°С: ", "Световой индикатор:",
                    "Защита от перегрева:", "Частота, Гц:"};
            switch (arr_category[id_arr]) {
                case "ST-HC7370 violet":
                    arr_descriptions = new String[]{
                            "30", "Да", "керамическое", "190", "Да", "Да", "50"};
                    image = R.mipmap.hair_straightener_st_hc7370_violet;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc7370_violet/";
                    break;
                case "ST-HC0320_black":
                    arr_descriptions = new String[]{
                            "25", "Да", "керамическое", "200", "-", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0320_black;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0320_black/";
                    break;
                case "ST-HC0305":
                    arr_descriptions = new String[]{
                            "30", "Да", "керамическое", "190", "Да", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0305;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0305/";
                    break;
                case "ST-HC0318":
                    arr_descriptions = new String[]{
                            "50", "-", "керамическое", "200", "-", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0318;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0318/";
                    break;
                case "ST-HC0323":
                    arr_descriptions = new String[]{
                            "30", "Да", "керамическое", "200", "-", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0323;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0323/";
                    break;
                case "ST-HC0325 pink":
                    arr_descriptions = new String[]{
                            "30", "Да", "керамическое", "200", "-", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0325_pink;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0325_pink/";
                    break;
                case "ST-HC0325 violet":
                    arr_descriptions = new String[]{
                            "30", "Да", "керамическое", "200", "-", "-", "50"};
                    image = R.mipmap.hair_straightener_st_hc0325_violet;
                    url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/vypryamiteli_dlya_volos/saturn_st_hc0325_violet/";
                    break;
                default:
                    break;
            }
        } else if (Arrays.equals(arr_category, NAME_ARR_MASSAGE_WATER_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Бульбашковий масаж:", "Функция поддержания температуры:",
                    "Аксессуары:"};
            arr_descriptions = new String[]{"60", "Да", "Да", "4 массажных ролика"};
            image = R.mipmap.massage_water_st_bc7303;
            url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/massazhnye_vannochki_dlya_nog/saturn_st_bc7303/";

        } else if (Arrays.equals(arr_category, NAME_ARR_TRIMMER_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Аксессуары:"};
            arr_descriptions = new String[]{"2", "ножи из нержавеющей стали, щеточка для очистки"};
            image = R.mipmap.trimmer_st_hc8022_black;
            url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/trimmery/saturn_st_hc8022_black/";

        } else {
            //NAME_ARR_EPILATOR_ALL
            arr_naming = new String[]{
                    "Мощность, Вт:", "Скоростных режимов работы:", "Время зарядки, ч:",
                    "Время непрерывной работы, мин:", "Световой индикатор:", "Аксессуары:"};
            arr_descriptions = new String[]{
                    "4", "2", "8", "45", "Да",
                    "бритвенная насадка, 30 пинцетов, адаптер, щеточка, чехол"};
            image = R.mipmap.epilator_st_bc1595;
            url_goods = "http://saturn.ua/ru/catalog/krasota_i_zdorove/epilyatory/saturn_st_bc1595/";
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
