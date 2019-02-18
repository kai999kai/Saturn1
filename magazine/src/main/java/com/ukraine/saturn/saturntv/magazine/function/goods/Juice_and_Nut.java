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
public class Juice_and_Nut {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Juice_and_Nut(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_JUICE_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Частота вращения, об/мин:", "Материал корпуса:",
                    "Скоростных режимов работы:", "Емкость для сока, л:", "Емкость для мякоти, л:",
                    "Дополнительные свойства:", "Режимов работы, количество:",
                    "Импульсный режим работы:", "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-FP8083":
                    arr_descriptions = new String[]{
                            "1000", "18000", "нерж. Сталь", "2", "1,25", "1,8",
                            "Терка-фильтр из нержавеющей стали", "2", "Да", "Да"};
                    image = R.mipmap.juice_st_fp8083;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8083/";
                    break;
                case "ST-FP8086":
                    arr_descriptions = new String[]{"200", "85", "пластик", "1", "0,8", "0,8",
                            "шнековая, реверс", "-", "-", "-"};
                    image = R.mipmap.juice_st_fp8086;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8086/";
                    break;
                case "ST-FP8059 D":
                    arr_descriptions = new String[]{"600", "18000", "нерж. Сталь", "2", "0,35", "1",
                            "универсальная", "-", "-", "Да"};
                    image = R.mipmap.juice_st_fp8059_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8059_d/";
                    break;
                case "ST-FP8051":
                    arr_descriptions = new String[]{"350", "17000", "пластик", "1", "0,3", "0,5",
                            "универсальная", "-", "-", "Да"};
                    image = R.mipmap.juice_st_fp8051;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8051/";
                    break;
                case "ST-FP8055":
                    arr_descriptions = new String[]{
                            "600", "18200", "нерж. Сталь", "2", "0,55", "1,6",
                            "универсальная", "-", "-", "-"};
                    image = R.mipmap.juice_st_fp8055;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8055/";
                    break;
                case "ST-FP0073 D":
                    arr_descriptions = new String[]{"300", "17000", "пластик", "1", "0,25", "0,3",
                            "универсальная", "-", "-", "Да"};
                    image = R.mipmap.juice_st_fp0073_d;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp0073_d/";
                    break;
                case "ST-FP8052":
                    arr_descriptions = new String[]{"350", "18000", "пластик", "2", "0,2", "1",
                            "универсальная", "-", "Да", "-"};
                    image = R.mipmap.juice_st_fp8052;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8052/";
                    break;
                case "ST-FP8079":
                    arr_descriptions = new String[]{"350", "15000", "пластик", "2", "0,3", "1",
                            "универсальная", "-", "Да", "-"};
                    image = R.mipmap.juice_st_fp8079;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8079/";
                    break;
                case "ST-FP0072":
                    arr_descriptions = new String[]{"40", "-", "пластик", "1", "1,2", "-",
                            "цитрус-пресс, реверс", "-", "-", "-"};
                    image = R.mipmap.juice_st_fp0072;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp0072/";
                    break;
                case "ST-FP8089":
                    arr_descriptions = new String[]{"350", "15000", "пластик", "2", "0,3", "0.4",
                            "-", "-", "Да", "-"};
                    image = R.mipmap.juice_st_fp8089;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/sokovyzhimalki/saturn_st_fp8089/";
                    break;
                default:
                    break;
            }

        } else {
            //  NAME_ARR_NUT_ALL
            arr_naming = new String[]{
                    "Мощность Вт:", "Регулируемый термостат:", "Отсек для хранения шнура:",
                    "Световой индикатор готовности блюда:", "Количество половинок, шт:",
                    "Антипригарное покрытие:", "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-EC0154":
                    arr_descriptions = new String[]{"700", "Да", "Да", "Да", "9", "Да", "Да"};
                    image = R.mipmap.nut_st_ec0154;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/oreshnitsy/saturn_st_ec0154/";
                    break;
                case "ST-EC0154 New":
                    arr_descriptions = new String[]{"750", "-", "Да", "Да", "9", "Да", "Да"};
                    image = R.mipmap.nut_st_ec0154_new;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/oreshnitsy/saturn_st_ec0154_new/";
                    break;
                case "ST-EC0155":
                    arr_descriptions = new String[]{"750", "-", "Да", "Да", "9", "-", "Да"};
                    image = R.mipmap.nut_st_ec0155;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/oreshnitsy/saturn_st_ec0155/";
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
