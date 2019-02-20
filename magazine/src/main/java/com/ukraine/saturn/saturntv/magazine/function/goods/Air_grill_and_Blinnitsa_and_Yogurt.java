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
public class Air_grill_and_Blinnitsa_and_Yogurt {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Air_grill_and_Blinnitsa_and_Yogurt(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_AIR_GRILL_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Объем:", "Способов приготовления:",
                    "Галогенный нагревательный элемент:", "Экономия энергии, %:",
                    "Автоматическая самоочистка:", "ЖК дисплей:", "Управление:", "Таймер, мин:",
                    "Аксессуары:", "Конвекция:"};
            switch (arr_category[id_arr]) {
                case "ST-CO9155":
                    arr_descriptions = new String[]{"1400", "17", "10", "Да", "60", "Да", "Да",
                            "электронное", "60",
                            "низкая решетка, высокая решетка, противень для жарки и запекания, " +
                                    "стимер, щипцы, кольцо-увеличитель", "-"};
                    image = R.mipmap.air_grill_st_go9155;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/aerogrili/saturn_st_co9155/";
                    break;
                case "ST-CO9153":
                    arr_descriptions = new String[]{"800", "10", "10", "Да", "60", "Да", "-",
                            "механическое",
                            "60", "кольцо-увеличитель, низкая решетка, высокая решетка и щипцы",
                            "Да"};
                    image = R.mipmap.air_grill_st_go9153;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/aerogrili/saturn_st_co9153/";
                    break;
                case "ST-CO9151_Red":
                    arr_descriptions = new String[]{"1400", "17", "10", "Да", "60", "Да", "-",
                            "механическое",
                            "60", "кольцо-увеличитель, противень для жарки и запекания, стимер, " +
                            "низкая/высокая решетка, щипцы", "Да"};
                    image = R.mipmap.air_grill_st_go9151_red;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/aerogrili/saturn_st_co9151_red/";
                    break;
                case "ST-CO9151":
                    arr_descriptions = new String[]{"1400", "17", "10", "Да", "60", "Да", "-",
                            "механическое",
                            "60", "кольцо-увеличитель, противень для жарки и запекания, стимер, " +
                            "низкая/высокая решетка, щипцы", "Да"};
                    image = R.mipmap.air_grill_st_go9151;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/aerogrili/saturn_st_co9151/";
                    break;
                case "ST-CO9151_Black":
                    arr_descriptions = new String[]{"1400", "17", "10", "Да", "60", "Да", "-",
                            "механическое",
                            "60", "кольцо-увеличитель, противень для жарки и запекания, стимер, " +
                            "низкая/высокая решетка, щипцы", "Да"};
                    image = R.mipmap.air_grill_st_go9151_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/aerogrili/saturn_st_co9151_black/";
                    break;
                default:
                    break;
            }
        } else if (Arrays.equals(arr_category, NAME_ARR_BLINNITSA_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Регулируемый термостат:",
                    "Диаметр поверхности для жарки, см:", "Температура нагрева, °C:",
                    "Нескользящие ножки:", "Световой индикатор:", "Антипригарное покрытие:",
                    "Защита от перегрева:", "Аксессуары:"};
            switch (arr_category[id_arr]) {

                case "ST-EC6001":
                    arr_descriptions = new String[]{"800", "Да", "20", "200", "Да", "Да", "Да",
                            "Да", "крышка, лопатка"};
                    image = R.mipmap.blinnitsa_st_ec6001;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blinnitsy/saturn_st_ec6001/";
                    break;
                case "ST-EC6002":
                    arr_descriptions = new String[]{"1000", "Да", "28", "200", "Да", "Да", "Да",
                            "Да", "-"};
                    image = R.mipmap.blinnitsa_st_ec6002;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blinnitsy/saturn_st_ec6002/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_YOGURT_ALL
            arr_naming = new String[]{"Мощность, Вт:", "Количество контейнеров:",
                    "Емкость контейнера, мл:", "Емкость для приготовления творога, л:",
                    "Время приготовления, ч:", "Автоотключение со звуковым сигналом:",
                    "ЖК дисплей:", "Режимов работы, количество:"};

            switch (arr_category[id_arr]) {
                case "ST-FP8512":
                    arr_descriptions = new String[]{"50", "7", "200", "3,5", "7", "Да", "Да", "2"};
                    image = R.mipmap.yogurt_st_fp8512;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/yogurtnitsy/saturn_st_fp8512/";
                    break;
                case "ST-FP8513":
                    arr_descriptions = new String[]{"18", "7", "200", "-", "8", "Да", "Да", "-"};
                    image = R.mipmap.yogurt_st_fp8513;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/yogurtnitsy/saturn_st_fp8513/";
                    break;
                case "ST-FP8511":
                    arr_descriptions = new String[]{"35", "6", "100", "-", "7", "Да", "-", "2"};
                    image = R.mipmap.yogurt_st_fp8511;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/yogurtnitsy/saturn_st_fp8511/";
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
