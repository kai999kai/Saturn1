package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Blender_in {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Blender_in(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;


        result();
    }

    private void result() {

        arr_naming = new String[]{"Мощность, Вт:", "Материал корпуса:", "Скоростных режимов работы:",
                "Терки:", "Материал ноги блендера:", "Чаша комбайна / применение:", "Венчик:",
                "Дополнительные свойства:", "Емкость чаши, л:", "Функция Турбо:", "Мерный стакан:",
                "Ножи из нержавеющей стали:", "Частота, Гц:",
                "Регулятор скорости:"};

        switch (arr_category[id_arr]) {
            case "ST-FP9091":
                arr_descriptions = new String[]{
                        "1000", "нерж. Сталь", "2", "Да", "нерж. Сталь", "Да", "Да",
                        "Чаша комбайна с 3 ножами (1250 мл), мерный стакан (600 мл), венчик, терки",
                        "1,25", "Да", "Да", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp9091;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9091/";
                break;
            case "ST-FP9090":
                arr_descriptions = new String[]{
                        "1000", "нерж. Сталь", "2", "Да", "нерж. Сталь", "Да", "Да",
                        "-", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9090;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9090/";
                break;
            case "ST-FP0043":
                arr_descriptions = new String[]{
                        "700", "нерж. Сталь", "2", "Да", "нерж. Сталь", "Да", "Да",
                        "кнопки с LED подсветкой, прорезиненная ручка, регулятор мощности, " +
                                "ножи из нержавеющей стали",
                        "-", "-", "Да", "-", "50", "Да"};
                image = R.mipmap.blender_in_st_fp0043;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0043/";
                break;
            case "ST-FP0057":
                arr_descriptions = new String[]{
                        "1100", "нерж. Сталь", "2", "Да", "нерж. Сталь", "Да", "Да",
                        "ножи из нержавеющей стали", "-", "-", "Да", "-", "50", "Да"};
                image = R.mipmap.blender_in_st_fp0057;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0057/";
                break;
            case "ST-FP0052":
                arr_descriptions = new String[]{
                        "800", "пластик", "2", "Да", "нерж. Сталь", "пластик", "Да",
                        "имеет функцию Чоппера", "-", "-", "Да", "-", "50", "Да"};
                image = R.mipmap.blender_in_st_fp0052;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0052/";
                break;
            case "ST-FP9062":
                arr_descriptions = new String[]{
                        "600", "-", "2", "Да", "нерж. Сталь", "пластик", "Да",
                        "стаканчик, диски-терки", "1,5", "Да", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9062;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9062/";
                break;
            case "ST-FP0051":
                arr_descriptions = new String[]{
                        "700", "пластик", "-", "-", "нерж. Сталь", "чоппер", "-",
                        "підставка-тримач", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp0051;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0051/";
                break;
            case "ST-FP1065 Red":
                arr_descriptions = new String[]{
                        "350", "пластик", "2", "Да", "нерж. Сталь", "пластик", "Да",
                        "чоппер", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp1065_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp1065_red/";
                break;
            case "ST-FP9086 D":
                arr_descriptions = new String[]{
                        "500", "нерж. Сталь", "2", "-", "нерж. Сталь", "чоппер", "Да",
                        "-", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9086_d;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9086_d/";
                break;
            case "ST-FP9061":
                arr_descriptions = new String[]{
                        "500", "пластик", "2", "-", "нерж. Сталь", "чоппер", "Да",
                        "чоппер с ручкой и двойными лезвиями",
                        "-", "-", "Да", "-", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9061;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9061/";
                break;
            case "ST-FP9064 D":
                arr_descriptions = new String[]{
                        "500", "пластик", "2", "-", "нерж. Сталь", "чоппер", "Да",
                        "-", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9064_d;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9064_d/";
                break;
            case "ST-FP9084":
                arr_descriptions = new String[]{
                        "500", "пластик", "2", "-", "нерж. Сталь", "чоппер", "Да",
                        "-", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9084;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9084/";
                break;
            case "ST-FP9084 D":
                arr_descriptions = new String[]{
                        "400", "пластик", "1", "-", "пластик", "чоппер", "Да",
                        "-", "-", "-", "Да", "-", "50", "-"};
                image = R.mipmap.blender_in_st_fp9084_d;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9084_d/";
                break;
            case "ST-FP0041 Green":
                arr_descriptions = new String[]{
                        "400", "пластик", "1", "-", "пластик", "чоппер", "Да",
                        "-", "-", "-", "Да", "-", "50", "-"};
                image = R.mipmap.blender_in_st_fp0041_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0041_green/";
                break;
            case "ST-FP0041 Black":
                arr_descriptions = new String[]{
                        "400", "пластик", "1", "-", "пластик", "чоппер", "Да",
                        "-", "-", "-", "Да", "-", "50", "-"};
                image = R.mipmap.blender_in_st_fp0041_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0041_black/";
                break;
            case "ST-FP9066":
                arr_descriptions = new String[]{"400", "пластик", "2", "-", "пластик", "-", "Да",
                        "подставка-держатель", "-", "-", "Да", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9066;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9066/";
                break;
            case "ST-FP0058":
                arr_descriptions = new String[]{"400", "пластик", "2", "-", "нерж. Сталь", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0058;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0058/";
                break;
            case "ST-FP0048":
                arr_descriptions = new String[]{"400", "пластик", "2", "-", "нерж. Сталь", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp0048;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0048/";
                break;
            case "ST-FP9081":
                arr_descriptions = new String[]{"400", "пластик", "2", "-", "нерж. Сталь", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9081;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9081/";
                break;
            case "ST-FP0050":
                arr_descriptions = new String[]{"300", "пластик", "2", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0050;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0050/";
                break;
            case "ST-FP9082":
                arr_descriptions = new String[]{"300", "пластик", "2", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp9082;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9082/";
                break;
            case "ST-FP0040 Black":
                arr_descriptions = new String[]{"250", "пластик", "1", "-", "пластик", "-", "-",
                        "-",
                        "-", "-", "-", "-", "50", "-"};
                image = R.mipmap.blender_in_st_fp0040_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0040_black/";
                break;
            case "ST-FP8063":
                arr_descriptions = new String[]{"300", "пластик", "2", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "Да"};
                image = R.mipmap.blender_in_st_fp8063;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp8063/";
                break;
            case "ST-FP0054 Yellow":
                arr_descriptions = new String[]{"200", "пластик", "1", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0054_yellow;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0054_yellow/";
                break;
            case "ST-FP0054 Black":
                arr_descriptions = new String[]{"200", "пластик", "1", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0054_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0054_black/";
                break;
            case "ST-FP0054 White":
                arr_descriptions = new String[]{"200", "пластик", "1", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0054_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0054_white/";
                break;
            case "ST-FP0046 Yellow":
                arr_descriptions = new String[]{"200", "пластик", "1", "-", "пластик", "-", "-",
                        "подставка-держатель",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp0046_yellow;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp0046_yellow/";
                break;
            case "ST-FP9075":
                arr_descriptions = new String[]{"225", "пластик", "1", "-", "пластик", "-", "-",
                        "-",
                        "-", "-", "-", "Да", "50", "-"};
                image = R.mipmap.blender_in_st_fp9075;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/blendery_pogruzhnye/saturn_st_fp9075/";
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
