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
public class Toaster_and_Potatoes {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Toaster_and_Potatoes(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_TOASTER_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Материал корпуса:", "Количество слотов:",
                    "Функции: размораживание/подогрев/стоп:", "Автоматическое и ручное отключение:",
                    "Съемный поддон для крошек:", "Регулировка степени поджаривания:",
                    "Дополнительные свойства:"};
            switch (arr_category[id_arr]) {
                case "ST-EC0149_black":
                    arr_descriptions = new String[]{"850", "пластик", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec0149_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec0149_black/";
                    break;
                case "ST-EC0146":
                    arr_descriptions = new String[]{
                            "850", "нерж. Сталь", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec0146;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec0146/";
                    break;
                case "ST-EC7022":
                    arr_descriptions = new String[]{
                            "750", "нерж. Сталь", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec7022;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec7022/";
                    break;
                case "ST-EC1028":
                    arr_descriptions = new String[]{"750", "пластик", "2", "Да", "Да", "Да", "Да",
                            "-"};
                    image = R.mipmap.toaster_st_ec1028;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec1028/";
                    break;
                case "ST-EC7021 white":
                    arr_descriptions = new String[]{"750", "пластик", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec7021_white;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec7021_white/";
                    break;
                case "ST-EC7021 Black":
                    arr_descriptions = new String[]{"750", "пластик", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec7021_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec7021_black/";
                    break;
                case "ST-EC0150":
                    arr_descriptions = new String[]{"750", "пластик", "2", "Да", "Да", "Да", "Да",
                            "Кнопки с LED подсветкой"};
                    image = R.mipmap.toaster_st_ec0150;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/tostery/saturn_st_ec0150/";
                    break;
                default:
                    break;
            }
        } else {
            //  NAME_ARR_POTATOES_ALL SATURN ST-FP8507
            arr_naming = new String[]{
                    "Мощность, Вт:", "Материал корпуса:", " Отсек для хранения шнура:",
                    "Частота, Гц:", "Время очистки 1 кг картофеля, мин:"};
            arr_descriptions = new String[]{"85", "пластик", "Да", "50", "2"};
            image = R.mipmap.potatoes_st_fp8507;
            url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kartofelechistki_elektriche_/saturn_st_fp8507/";
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
