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
public class Water_iron_and_Car_cloth {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Water_iron_and_Car_cloth(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_WATER_IRON_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Давление, бар:", "Подача пара, г/мин:", "Покрытие подошвы:",
                    "Управление:", "Вертикальное отпаривание:", "Паровой удар:", "Антинакипь:", "Регулятор температуры, C:",
                    "Емкость резервуара для воды, л:", "Функция автоотключения:", "Частота, Гц:", "Длина шланга, м:",
                    "Складная вешалка:", "Щетка для одежды:", "Отсек для хранения шнура:", "Режимов работы, количество:",
                    "Защита от перегрева:", "Регулятор расхода пара:", "Световой индикатор:", ":"};
            switch (arr_category[id_arr]) {
                case "ST-CC7112":
                    arr_descriptions = new String[]{"2400", "4,5", "55/75/110", "керамика", "электронное", "Да", "Да", "Да", "70-225",
                            "1,7", "Да", "50", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
                    image = R.mipmap.water_iron_st_cc7112;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc7112/";
                    break;
                case "ST-CC0226":
                    arr_descriptions = new String[]{"2000", "-", "2.8", "-", "-", "-", "-", "-", "-",
                            "2.8", "-", "50", "1.45", "Да", "Да", "Да", "4", "Да", "-", "-", "-"};
                    image = R.mipmap.water_iron_st_cc0226;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc0226/";
                    break;
                case "ST-CC0230":
                    arr_descriptions = new String[]{"2000", "-", "32", "-", "-", "-", "-", "-", "-",
                            "2", "-", "50", "1.45", "Да", "Да", "Да", "2", "Да", "-", "-", "-"};
                    image = R.mipmap.water_iron_st_cc0230;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc0230/";
                    break;
                case "ST-CC0232":
                    arr_descriptions = new String[]{"1750", "-", "25-32", "-", "-", "-", "-", "-", "-",
                            "2", "-", "50", "1.45", "Да", "Да", "Нет", "4", "Да", "Да", "-", "-"};
                    image = R.mipmap.water_iron_st_cc0232;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc0232/";
                    break;
                case "ST-CC0231":
                    arr_descriptions = new String[]{"1750", "-", "25-32", "-", "-", "-", "-", "-", "-",
                            "2,1", "-", "50", "1.45", "Да", "Да", "Нет", "2", "Да", "Да", "-", "-"};
                    image = R.mipmap.water_iron_st_cc0231;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc0231/";
                    break;
                case "ST-CC0228 blue":
                    arr_descriptions = new String[]{"1600", "-", "25-32", "-", "-", "-", "-", "-", "-",
                            "2,5", "-", "50", "1.45", "Да", "Да", "Да", "2", "Да", "Да", "-", "-"};
                    image = R.mipmap.water_iron_st_cc0228_blue;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc0228_blue/";
                    break;
                case "ST-CC7145 New":
                    arr_descriptions = new String[]{"1000", "-", "14-18", "-", "-", "-", "-", "Да", "-",
                            "0,1", "-", "50", "-", "-", "Да", "-", "-", "-", "-", "Да", "подставка, щетка для чистки ткани, щетка для чистки меха"};
                    image = R.mipmap.water_iron_st_cc7145_new;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/parovye_utyugi/saturn_st_cc7145_new/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_CAR_CLOTH_ALL
            arr_naming = new String[]{"Съемный прозрачный отсек для сбора катышек:", "Диаметр ножа, мм:",
                    "Тип питания:", "Защитная металлическая сетка:"};
            switch (arr_category[id_arr]) {

                case "ST-CC1548 Pink":
                    arr_descriptions = new String[]{"Да", "44", "2 батарейки AA", "Да"};
                    image = R.mipmap.car_cloth_st_cc1548pink;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/mashinki_dlya_strizhki_katyshkov/saturn_st_cc1548_pink/";
                    break;
                case "ST-CC1548 WGn":
                    arr_descriptions = new String[]{"Да", "40", "R20", "Да"};
                    image = R.mipmap.car_cloth_st_cc1548_wgn;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/mashinki_dlya_strizhki_katyshkov/saturn_st_cc1548_wgn/";
                    break;
                case "ST-CC1547":
                    arr_descriptions = new String[]{"Да", "44", "2 батарейки AA", "Да"};
                    image = R.mipmap.car_cloth_st_cc1547;
                    url_goods = "http://saturn.ua/ru/catalog/ukhod_za_odezhdoy/mashinki_dlya_strizhki_katyshkov/saturn_st_cc1547/";
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
