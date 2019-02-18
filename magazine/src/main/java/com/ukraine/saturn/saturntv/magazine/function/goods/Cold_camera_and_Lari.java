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
public class Cold_camera_and_Lari {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Cold_camera_and_Lari(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_COLD_CAMERA_ALL)) {
            arr_naming = new String[]{
                    "Общий объем, л:", "Общий полезный обьем, л:", "Хладагент:", "Компрессор, шт:",
                    "Тип системы охлаждения:", "Управление:", "Класс морозильной камеры:",
                    "Климатический класс:", "Уровень шума, дБ:", "Разморозка морозильной камеры:",
                    "Глубина, мм:", "Высота, мм:", "Ширина, мм:", "Прозрачный ящик для овощей"};
            switch (arr_category[id_arr]) {
                case "ST-CF1984U":
                    arr_descriptions = new String[]{
                            "245", "225", "R600a", "1", "статическая", "механическое",
                            "****", "ST", "<42", "ручная", "600", "1700", "600", "7"};
                    image = R.mipmap.cold_camera_st_cf1984u;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_kamery/saturn_st_cf1984u/";
                    break;
                case "ST-CF1980U":
                    arr_descriptions = new String[]{
                            "182", "170", "R600a", "1", "статическая", "механическое",
                            "****", "N", "<42", "ручная", "580", "1430", "550", "6"};
                    image = R.mipmap.cold_camera_st_cf1980u;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_kamery/saturn_st_cf1980u/";
                    break;
                case "ST-CF1982U":
                    arr_descriptions = new String[]{
                            "80", "73", "R600a", "1", "статическая", "механическое",
                            "****", "N", "<41", "ручная", "560", "840", "500", "3"};
                    image = R.mipmap.cold_camera_st_cf1982u;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_kamery/saturn_st_cf1982u/";
                    break;
                case "ST-CF1983U":
                    arr_descriptions = new String[]{
                            "92", "85", "R600a", "1", "статическая", "механическое",
                            "****", "N", "<41", "ручная", "580", "850", "550", "4"};
                    image = R.mipmap.cold_camera_st_cf1983u;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_kamery/saturn_st_cf1983u/";
                    break;
                case "ST-CF1981U":
                    arr_descriptions = new String[]{
                            "70", "64", "R600a", "1", "статическая", "механическое",
                            "****", "N", "<41", "ручная", "-", "-", "-", "-"};
                    image = R.mipmap.cold_camera_st_cf1981u;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_kamery/saturn_st_cf1981u/";
                    break;
                default:
                    break;
            }
        } else {
            arr_naming = new String[]{
                    "Общий  л:", "Минимальная температура, C:", "Замораживающая способность, кг/24 ч:",
                    "Энергопотребление, кВт/24 ч:", "Антикоррозийное покрытие:", "Замок и ключ:",
                    "Регулируемый термостат:", "Хладагент:", "Климатический класс:",
                    "Уровень шума, дБ:", "Функция быстрой заморозки:", "Количество корзин:",
                    "Габариты, см:", "Частота, Гц:", "Дополнительные свойства:"};
            switch (arr_category[id_arr]) {
                case "ST-CF1906":
                    arr_descriptions = new String[]{
                            "250", "-18", "21", "0,68", "Да", "Да", "Да", "R600a", "ST", "<42",
                            "Да", "1", "-", "-", "Нет"};
                    image = R.mipmap.cold_lari_st_cf1906;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1906/";
                    break;
                case "ST-CF1911":
                    arr_descriptions = new String[]{
                            "400", "-18", "25", "0,858", "Да", "Да", "Да", "-", "-", "-", "-",
                            "1", "130*70*85", "50", "Нет"};
                    image = R.mipmap.cold_lari_st_cf1911;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1911/";
                    break;
                case "ST-CF1917 New":
                    arr_descriptions = new String[]{
                            "302", "-18", "17", "0,68", "Да", "-", "Да", "-", "-", "-", "-", "1",
                            "111.6*60.4*84.5", "50", "Внутренний конденсатор"};
                    image = R.mipmap.cold_lari_st_cf1917_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1917_new/";
                    break;
                case "ST-CF1902 New":
                    arr_descriptions = new String[]{
                            "252", "-", "-", "-", "-", "-", "Да", "R600a", "N/st", "<42",
                            "-", "-", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1902_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1902_new/";
                    break;
                case "ST-CF1910":
                    arr_descriptions = new String[]{
                            "-", "-18", "23", "0.69", "Да", "-", "Да", "R600a", "st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1910;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1910/";
                    break;
                case "ST-CF1907":
                    arr_descriptions = new String[]{
                            "300", "-18", "22", "0.73", "Да", "-", "Да", "R600a", "st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1907;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1907/";
                    break;
                case "ST-CF1902":
                    arr_descriptions = new String[]{
                            "100", "-18", "6", "0.45", "Да", "-", "Да", "R600a", "st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1902;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1902/";
                    break;
                case "ST-CF1915 New":
                    arr_descriptions = new String[]{
                            "102", "-18", "6", "0.44", "Да", "-", "Да", "R600a", "st", "<42",
                            "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1915_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1915_new/";
                    break;
                case "ST-CF1903":
                    arr_descriptions = new String[]{
                            "155", "-18", "9", "0.515", "Да", "-", "Да", "R600a", "st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1903;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1903/";
                    break;
                case "ST-CF1916 New":
                    arr_descriptions = new String[]{
                            "152", "-18", "8,5", "0.5", "Да", "-", "Да", "R600a", "N/st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1916_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1916_new/";
                    break;
                case "ST-CF1904":
                    arr_descriptions = new String[]{
                            "210", "-18", "12", "0.58", "Да", "-", "Да", "R600a", "st",
                            "<42", "Да", "1", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1904;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1904/";
                    break;
                case "ST-CF1901 New":
                    arr_descriptions = new String[]{
                            "212", "-", "-", "-", "-", "-", "Да", "-", "N/st", "-",
                            "-", "-", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1901_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1901_new/";
                    break;
                case "ST-CF1918 New":
                    arr_descriptions = new String[]{
                            "320", "-", "-", "-", "-", "-", "Да", "R600a", "N/st", "-",
                            "-", "-", "-", "50", "-"};
                    image = R.mipmap.cold_lari_st_cf1918_new;
                    url_goods = "http://saturn.ua/ru/catalog/kholodilnaya_tekhnika/morozilnye_lari/saturn_st_cf1918_new/";
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
