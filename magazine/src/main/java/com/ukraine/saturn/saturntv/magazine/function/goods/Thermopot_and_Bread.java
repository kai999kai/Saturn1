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
public class Thermopot_and_Bread {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Thermopot_and_Bread(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_THERMOPOT_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Объем:", "Материал корпуса:", "Температура кипячения °С:",
                    "Материал емкости:", "Количество режимов дозировки воды:",
                    "Ручная подкачка воды:", "Подача воды нажатием чашки:",
                    "Автоматическая подача воды:", "Функция поддержания температуры °С:",
                    "Функция уменьшения температуры воды:", "Блокировка ручной подачи воды:",
                    "Отсоединяемый шнур:", "Устройство защиты при включении без воды:",
                    "Шкала уровня воды:", "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-EK8035 NEW":
                    arr_descriptions = new String[]{
                            "800", "5", "металл", "100", "пищев. нерж.", "3", "Да", "Да",
                            "Да", "85-90", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8035_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8035_new/";
                    break;
                case "ST-EK8034 NEW":
                    arr_descriptions = new String[]{
                            "800", "4", "металл", "-", "пищев. нерж.", "3", "-", "Да",
                            "Да", "85-90", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8034_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8034_new/";
                    break;
                case "ST-EK8034 EU":
                    arr_descriptions = new String[]{
                            "800", "4", "металл", "100", "пищев. нерж.", "3", "Да", "Да",
                            "Да", "85-90", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8034_eu;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8034_eu/";
                    break;
                case "ST-EK8032":
                    arr_descriptions = new String[]{
                            "800", "2,5", "металл", "100", "пищев. нерж.", "3", "Да", "Да",
                            "Да", "85-90", "Да", "-", "-", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8032;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8032/";
                    break;
                case "ST-EK8032 EU":
                    arr_descriptions = new String[]{
                            "800", "3", "металл", "100", "пищев. нерж.", "3", "Да", "-",
                            "Да", "85-90", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8032_eu;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8032_eu/";
                    break;
                case "ST-EK8030 EU":
                    arr_descriptions = new String[]{
                            "600", "3", "металл", "100", "пищев. нерж.", "-", "Да", "-",
                            "-", "85-90", "-", "-", "-", "Да", "Да", "Да"};
                    image = R.mipmap.thermopot_st_ek8030_eu;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8030_eu/";
                    break;
                case "ST-EK8036":
                    arr_descriptions = new String[]{
                            "600", "3,5", "металл", "100", "пищев. нерж.", "3", "Да", "Да",
                            "Да", "85-90", "Да", "-", "Да", "-", "Да", "-"};
                    image = R.mipmap.thermopot_st_ek8036;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/termopoty/saturn_st_ek8036/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_BREAD_ALL
            arr_naming = new String[]{
                    "Мощность, Вт:", "Автоприготовление, программ:", "Материал корпуса:",
                    "ЖК дисплей:", "Таймер, ч:", "Память при отсутствии питания, мин:",
                    "Мерный стакан:", "Прозрачная крышка:", "Мерная ложка:",
                    "Функция поддержания тепла, мин:", "Съемный поддон для хлеба:",
                    "Вес приготовления, г:", "Регулируемая степень поджаривания:",
                    "Антипригарное покрытие:", "Аксессуары:"};
            switch (arr_category[id_arr]) {
                case "ST-EC0129":
                    arr_descriptions = new String[]{
                            "850", "12", "пластик", "Да", "13", "7", "Да", "Да", "Да",
                            "60", "Да", "750/1000/1250", "сильная/средняя/слабая", "Да", "-"};
                    image = R.mipmap.bread_st_ec0129;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec0129/";
                    break;
                case "ST-EC0128":
                    arr_descriptions = new String[]{
                            "450", "16", "пластик", "Да", "13", "7", "Да", "-", "Да",
                            "60", "Да", "500/750/1000", "сильная/средняя/слабая", "Да",
                            "интегрированные весы"};
                    image = R.mipmap.bread_st_ec0128;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec0128/";
                    break;
                case "ST-EC0131":
                    arr_descriptions = new String[]{
                            "700", "12", "нерж. Сталь", "Да", "13", "15", "Да", "Да", "Да",
                            "60", "Да", "600/900", "сильная/средняя/слабая", "Да", "-"};
                    image = R.mipmap.bread_st_ec0131;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec0131/";
                    break;
                case "ST-EC0125":
                    arr_descriptions = new String[]{
                            "550", "12", "пластик", "Да", "13", "15", "-", "-", "-",
                            "60", "Да", "750/900", "сильная/средняя/слабая", "Да", "-"};
                    image = R.mipmap.bread_st_ec0125;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec0125/";
                    break;
                case "ST-EC7774":
                    arr_descriptions = new String[]{
                            "650", "12", "пластик", "Да", "13", "15", "-", "Да", "-",
                            "60", "Да", "750/900", "сильная/средняя/слабая", "-", "-"};
                    image = R.mipmap.bread_st_ec7774;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec7774/";
                    break;
                case "ST-EC0127":
                    arr_descriptions = new String[]{
                            "650", "12", "пластик", "Да", "13", "7", "Да", "-", "Да",
                            "60", "Да", "500/750/1000", "сильная/средняя/слабая", "Да", "-"};
                    image = R.mipmap.bread_st_ec0127;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/khlebopechi/saturn_st_ec0127/";
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
