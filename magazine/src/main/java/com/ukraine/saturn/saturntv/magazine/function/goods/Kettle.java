package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Kettle {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Kettle(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Материал корпуса:", "Устройство защиты при включении без воды:",
                "Шкала уровня воды:", "Отсек для хранения шнура:", "Световой индикатор:",
                "Функция автоотключения:", "Защита от перегрева:", "Крышка с фиксатором:",
                "Съемный фильтр:", "Система STRIX:", "Объем л:", "Дополнительные свойства:"};

        switch (arr_category[id_arr]) {

            case "ST-EK0015 Blue":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "-", "-"};
                image = R.mipmap.kettle_st_ek0015_blue;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0015_blue/";
                break;
            case "ST-EK0024":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "-", "-",
                        "Да", "-", "-"};
                image = R.mipmap.kettle_st_ek0024;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0024/";
                break;
            case "ST-EK0017":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "-",
                        "Да", "-", "-"};
                image = R.mipmap.kettle_st_ek0017;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0017/";
                break;
            case "ST-EK0015":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "-", "-"};
                image = R.mipmap.kettle_st_ek0015;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0015/";
                break;
            case "ST-EK1014_Glass":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "-", "-"};
                image = R.mipmap.kettle_st_ek1014_glass;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek1014_glass/";
                break;
            case "ST-EK0020":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "2", "-"};
                image = R.mipmap.kettle_st_ek0020;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0020/";
                break;
            case "ST-EK8018 New_black":
                arr_descriptions = new String[]{
                        "1850", "пластик", "Да", "Да", "-", "Да", "Да", "Да", "-", "Да", "-",
                        "-", "-"};
                image = R.mipmap.kettle_st_ek8018_new_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8018_new_black/";
                break;
            case "ST-EK8428Blue":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "-", "-"};
                image = R.mipmap.kettle_st_ek8428blue;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8428blue/";
                break;
            case "ST-EK8421":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "-", "-"};
                image = R.mipmap.kettle_st_ek8421;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8421/";
                break;
            case "ST-EK8421black":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "-", "-", "-"};
                image = R.mipmap.kettle_st_ek8421black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8421black/";
                break;
            case "ST-EK8405Red":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "2", "-"};
                image = R.mipmap.kettle_st_ek8405_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8405red/";
                break;
            case "ST-EK8411":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8411;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8411/";
                break;
            case "ST-EK0010":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "-",
                        "1,7", "-"};
                image = R.mipmap.kettle_st_ek0010;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0010/";
                break;
            case "ST-EK8424":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8424;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8424/";
                break;
            case "ST-EK8418":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "1,7", "-"};
                image = R.mipmap.kettle_st_ek8418;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8418/";
                break;
            case "ST-EK8406":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "-",
                        "1,7", "LED подсветка"};
                image = R.mipmap.kettle_st_ek8406;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8406/";
                break;
            case "ST-EK8408 Flowers":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8408_flowers;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8408_flowers/";
                break;
            case "ST-EK0004 Light Viol":
                arr_descriptions = new String[]{
                        "2000", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek0004_light_viol;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0004_light_viol/";
                break;
            case "ST-EK0004 Cream":
                arr_descriptions = new String[]{
                        "2000", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek0004_cream;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0004_cream/";
                break;
            case "ST-EK0004":
                arr_descriptions = new String[]{
                        "2000", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek0004;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0004/";
                break;
            case "ST-EK0004 Sahara":
                arr_descriptions = new String[]{
                        "2000", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek0004_sahara;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0004_sahara/";
                break;
            case "ST-EK0008":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0008;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0008/";
                break;
            case "ST-EK0013New":
                arr_descriptions = new String[]{
                        "1800", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0013new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0013new/";
                break;
            case "ST-EK8014NewWBl":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek8014new_wbi;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8014newwbl/";
                break;
            case "ST-EK8014NewWR":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek8014new_wr;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8014newwr/";
                break;
            case "ST-EK8014New":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek8014new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8014new/";
                break;
            case "ST-EK8416":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8416;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8416/";
                break;
            case "ST-EK8014NewWP":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "двухцветная подсветка"};
                image = R.mipmap.kettle_st_ek8014new_wp;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8014newwp/";
                break;
            case "ST-EK8417":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8417;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8417/";
                break;
            case "ST-EK8417BlB":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8417bib;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8417blb/";
                break;
            case "ST-EK8417W":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8417w;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8417w/";
                break;
            case "ST-EK8417BlR":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8417bir;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8417blr/";
                break;
            case "ST-EK8417WR":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8417wr;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8417wr/";
                break;
            case "ST-EK0007_blue D":
                arr_descriptions = new String[]{
                        "2200", "эко-пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0007_blue_d;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0007_blue_d/";
                break;
            case "ST-EK0002New":
                arr_descriptions = new String[]{
                        "2200", "эко-пластик", "Да", "Да", "-", "Да", "Да", "Да", "-", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0002new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0002new/";
                break;
            case "ST-EK0002NewWViolet":
                arr_descriptions = new String[]{
                        "2200", "эко-пластик", "Да", "Да", "-", "Да", "Да", "Да", "-", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0002new_violet;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0002newwviolet/";
                break;
            case "ST-EK8001":
                arr_descriptions = new String[]{
                        "2000", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "-", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8001;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8001/";
                break;
            case "ST-EK8433":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8433;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8433/";
                break;
            case "ST-EK8432":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8432;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8432/";
                break;
            case "ST-EK0019 LED":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "Да", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0019_led;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0019_led/";
                break;
            case "ST-EK8434":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8434;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8434/";
                break;
            case "ST-EK0011":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0011;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0011/";
                break;
            case "ST-EK0018":
                arr_descriptions = new String[]{
                        "2200", "нерж. Сталь", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek0018;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0018/";
                break;
            case "ST-EK8431":
                arr_descriptions = new String[]{
                        "2200", "керамика", "Да", "-", "Да", "Да", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8431;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8431/";
                break;
            case "ST-EK8419":
                arr_descriptions = new String[]{
                        "2200", "керамика", "Да", "-", "Да", "-", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8419;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8419/";
                break;
            case "ST-EK8419Pumpkin":
                arr_descriptions = new String[]{
                        "2200", "керамика", "Да", "-", "Да", "-", "Да", "Да", "Да", "Да",
                        "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8419pumpkin;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8419pumpkin/";
                break;
            case "ST-EK8419A":
                arr_descriptions = new String[]{
                        "1500", "керамика", "Да", "-", "Да", "-", "Да", "Да", "Да", "Да",
                        "-", "-", "-"};
                image = R.mipmap.kettle_st_ek8419a;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8419a/";
                break;
            case "ST-EK8422":
                arr_descriptions = new String[]{
                        "2200", "керамика", "Да", "Да", "Да", "-", "Да", "Да", "Да", "-",
                        "-", "-", "-"};
                image = R.mipmap.kettle_st_ek8422;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8422/";
                break;
            case "ST-EK8448 Black":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "-", "Да", "-", "Да", "Да", "Да", "-",
                        "-", "1,8", "подсветка"};
                image = R.mipmap.kettle_st_ek8448_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8448_black/";
                break;
            case "ST-EK8448 White":
                arr_descriptions = new String[]{
                        "2200", "закаленное стекло", "Да", "-", "Да", "-", "Да", "Да", "Да", "-",
                        "-", "1,8", "-"};
                image = R.mipmap.kettle_st_ek8448_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8448_white/";
                break;
            case "ST-EK8408":
                arr_descriptions = new String[]{
                        "2200", "пластик", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "Да", "-", "1,7", "-"};
                image = R.mipmap.kettle_st_ek8408;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8408/";
                break;
            case "ST-EK8451 Black":
                arr_descriptions = new String[]{
                        "1800", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "-", "-",
                        "-", "1,8", "-"};
                image = R.mipmap.kettle_st_ek8451_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8451_black/";
                break;
            case "ST-EK8451 Gray":
                arr_descriptions = new String[]{
                        "1800", "закаленное стекло", "Да", "Да", "Да", "Да", "Да", "Да", "-", "-",
                        "-", "1,8", "-"};
                image = R.mipmap.kettle_st_ek8451_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek8451_gray/";
                break;
            case "ST-EK0021":
                arr_descriptions = new String[]{
                        "700", "пластик", "Да", "Да", "-", "Да", "Да", "Да", "-", "-",
                        "-", "0,5", "-"};
                image = R.mipmap.kettle_st_ek0021;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektrochayniki/saturn_st_ek0021/";
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
