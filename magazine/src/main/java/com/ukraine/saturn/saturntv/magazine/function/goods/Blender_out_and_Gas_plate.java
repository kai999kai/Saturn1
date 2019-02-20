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
public class Blender_out_and_Gas_plate {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Blender_out_and_Gas_plate(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_BLENDER_OUT_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Материал корпуса:", "Скоростных режимов работы:",
                    "Регулятор скорости:", "Материал чаши:", "Блокировочный механизм:",
                    "Импульсный режим работы:", "Свойства:", "Защита от перегрева:"};
            switch (arr_category[id_arr]) {
                case "ST-FP0055":
                    arr_descriptions = new String[]{
                            "500", "нерж. Сталь", "3", "Да", "стекло", "Да", "Да",
                            "ножи из нержавеющей стали", "Да"};
                    image = R.mipmap.blender_out_st_fp0055;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_statsionarnye/saturn_st_fp0055/";
                    break;
                case "ST-FP9076":
                    arr_descriptions = new String[]{"250", "пластик", "1", "-", "-", "-", "-",
                            "-", "-"};
                    image = R.mipmap.blender_out_st_fp9076;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_statsionarnye/saturn_st_fp9076/";
                    break;
                case "ST-FP9088":
                    arr_descriptions = new String[]{"800", "-", "-", "-", "пластик", "-", "-",
                            "Ножи из нержавеющей стали, " +
                                    "Две бутылочки по 450 мл с герметичными крышками", "-"};
                    image = R.mipmap.blender_out_st_fp9088;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_statsionarnye/saturn_st_fp9088/";
                    break;
                default:
                    break;
            }
        } else {
            //  NAME_ARR_GAS_PLATE_ALL
            arr_naming = new String[]{
                    "Тепловая мощность, кВт:", "Количество конфорок:", "Размер конфорок, мм:",
                    "Тип газа - пропан, бутан G30 (LPG):", "Расход газа, г/ч:",
                    "Номинальное давление газа, мбар:",                    "Решетка:", "Крышка:",
                    "Регулируемый термостат:"};
            switch (arr_category[id_arr]) {
                case "63-010-04":
                    arr_descriptions = new String[]{
                            "5,5", "4 газовые", "50 + 60 + 60 + 70", "Да", "576",
                            "30", "Да", "Да", "Да"};
                    image = R.mipmap.gas_grinder_63_010_04;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/gazovye_taganki/saturn_63_010_04/";
                    break;
                case "63-010-11":
                    arr_descriptions = new String[]{"4.2", "3 газовые", "50 + 60 + 70", "Да", "432",
                            "30", "Да", "Да", "Да"};
                    image = R.mipmap.gas_grinder_63_010_11;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/gazovye_taganki/saturn_63_010_11/";
                    break;
                case "63-010-02":
                    arr_descriptions = new String[]{"3.2", "2 газовые", "60 + 70", "Да", "288",
                            "30", "Да", "Да", "Да"};
                    image = R.mipmap.gas_grinder_63_010_02;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/gazovye_taganki/saturn_63_010_02/";
                    break;
                case "63-010-01":
                    arr_descriptions = new String[]{"1.9", "1 газовые", "70", "Да", "150",
                            "30", "Да", "-", "Да"};
                    image = R.mipmap.gas_grinder_63_010_01;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/gazovye_taganki/saturn_63_010_01/";
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
