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
public class Processor_and_Mixer {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private String url_goods;
    private int image;


    public Processor_and_Mixer(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_PROCESSOR_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Емкость чаши, л:", "Материал корпуса:", "Емкость блендера, л:",
                    "Емкость мельницы, л:", "Шинковочно-терочные диски:",
                    "Ножи для измельчения, рубки:", "Ножи для смешивания, взбивания:",
                    "Терка для дерунов:", "Соковыжималка:", "Регулятор скорости / кол-во скорости:",
                    "Блокировочный механизм:", "Импульсный режим работы:", "Защита от перегрева:",
                    "Аксессуары:"};
            switch (arr_category[id_arr]) {
                case "ST-FP0070":
                    arr_descriptions = new String[]{
                            "1200", "1,5", "пластик", "1,5", "0,3", "Да", "Да", "Да", "Да",
                            "Да", "Да", "Да", "Да", "Да",
                            "насадка-миксер, насадка для томатов, насадка для " +
                                    "сосисок, диск для колбасы и кебаба, пенал для насадок"};
                    image = R.mipmap.processor_st_fp0070;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_kombayny/saturn_st_fp0070/";
                    break;
                case "ST-FP7071":
                    arr_descriptions = new String[]{
                            "800", "1,2", "нерж. Сталь", "1,5", "0,3", "Да", "Да", "Да", "Да",
                            "Да", "2", "Да", "Да", "Да",
                            "Пресс для цитрусовых, венчик, пластиковая лопатка"};
                    image = R.mipmap.processor_st_fp7071;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_kombayny/saturn_st_fp7071/";
                    break;
                case "ST-FP0067":
                    arr_descriptions = new String[]{
                            "600", "1,25", "пластик", "1,5", "0,3", "Да", "Да", "Да", "-",
                            "-", "2", "Да", "Да", "-", "-"};
                    image = R.mipmap.processor_st_fp0067;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_kombayny/saturn_st_fp0067/";
                    break;
                case "ST-FP0067 D":
                    arr_descriptions = new String[]{
                            "600", "1,25", "пластик", "1,5", "0,3", "Да", "Да", "Да", "-",
                            "-", "2", "Да", "Да", "-", "-"};
                    image = R.mipmap.processor_st_fp0067_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_kombayny/saturn_st_fp0067_d/";
                    break;
                default:
                    break;
            }
        } else {
            //NAME_ARR_MIXER_ALL
            arr_naming = new String[]{
                    "Мощность Вт:", "Емкость чаши, л:", "Регулятор скорости:", "Материал чаши:",
                    "Аксессуары:", "Насадки для замешивания:", "Насадки для взбивания:",
                    "Дополнительные свойства:", "Скоростных режимов работы:"};
            switch (arr_category[id_arr]) {
                case "ST-FP1027":
                    arr_descriptions = new String[]{
                            "400", "4,2", "Да", "нерж. Сталь", "венчик", "Да", "Да",
                            "вращающаяся чаша", "-"};
                    image = R.mipmap.mixer_st_fp1027;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1027/";
                    break;
                case "ST-FP1025":
                    arr_descriptions = new String[]{"280", "2", "-", "нерж. Сталь", "-", "Да", "Да",
                            "вращающаяся чаша, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1025;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1025/";
                    break;
                case "ST-FP1025 New":
                    arr_descriptions = new String[]{"280", "2", "-", "нерж. Сталь", "-", "Да", "Да",
                            "вращающаяся чаша, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1025_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1025_new/";
                    break;
                case "ST-FP1024":
                    arr_descriptions = new String[]{"280", "2", "-", "пластик", "-", "Да", "Да",
                            "вращающаяся чаша, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1024;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1024/";
                    break;
                case "ST-FP1024 New":
                    arr_descriptions = new String[]{"280", "2", "-", "пластик", "-", "Да", "Да",
                            "вращающаяся чаша, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1024_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1024_new/";
                    break;
                case "ST-FP1023 New":
                    arr_descriptions = new String[]{"280", "-", "-", "-", "-", "Да", "Да",
                            "насадка-блендер, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1023_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1023_new/";
                    break;
                case "ST-FP1023":
                    arr_descriptions = new String[]{"280", "-", "-", "-", "-", "Да", "Да",
                            "насадка-блендер, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1023;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1023/";
                    break;
                case "ST-FP1022":
                    arr_descriptions = new String[]{"280", "-", "-", "-", "-", "Да", "Да",
                            "Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1022;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1022/";
                    break;
                case "ST-FP1021 New":
                    arr_descriptions = new String[]{"150", "-", "-", "-", "-", "Да", "Да",
                            "подставка, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1021_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1021_new/";
                    break;
                case "ST-FP1021 White":
                    arr_descriptions = new String[]{"150", "-", "-", "-", "-", "Да", "Да",
                            "подставка, Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1021_white;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1021_white/";
                    break;
                case "ST-FP1050 New":
                    arr_descriptions = new String[]{"150", "-", "-", "-", "-", "Да", "Да",
                            "Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1050_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1050_new/";
                    break;
                case "ST-FP1035":
                    arr_descriptions = new String[]{"150", "-", "-", "-", "-", "Да", "Да",
                            "-", "7"};
                    image = R.mipmap.mixer_st_fp1035;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1035/";
                    break;
                case "ST-FP1050":
                    arr_descriptions = new String[]{"150", "-", "-", "-", "-", "Да", "Да",
                            "Функция Турбо", "5"};
                    image = R.mipmap.mixer_st_fp1050;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/miksery/saturn_st_fp1050/";
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
