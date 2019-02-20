package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Electric_bake {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Electric_bake(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Объем: ", "Мощность конфорок, Вт:",
                "Нагревательные элементы, количество:", "Режимы нагрева:", "Внутреннее покрытие:",
                "Решетка-гриль:", "Круглый противень:", "Прямоугольный противень:", "Таймер, мин:",
                "Регулятор температуры, C:", "Световой индикатор:",
                "Функция автоотключения:", "Вертел:"};

        switch (arr_category[id_arr]) {
            case "ST-EC10711 Green":
                arr_descriptions = new String[]{
                        "1500", "-", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10711_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10711_green/";
                break;
            case "ST-EC10711 Black":
                arr_descriptions = new String[]{
                        "1500", "-", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10711_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10711_black/";
                break;
            case "ST-EC10711 Gray":
                arr_descriptions = new String[]{
                        "1500", "-", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10711_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10711_gray/";
                break;
            case "ST-EC10711 Red":
                arr_descriptions = new String[]{
                        "1500", "-", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10711_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10711_red/";
                break;
            case "ST-EC10711 White":
                arr_descriptions = new String[]{
                        "1500", "-", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10711_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10711_white/";
                break;
            case "ST-EC1078 Grey":
                arr_descriptions = new String[]{
                        "1500", "54", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1078_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1078_grey/";
                break;
            case "ST-EC1078 Black":
                arr_descriptions = new String[]{
                        "1500", "54", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1078_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1078_black/";
                break;
            case "ST-EC10704 White":
                arr_descriptions = new String[]{
                        "1650", "48", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10704_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10704_white/";
                break;
            case "ST-EC10704 Green":
                arr_descriptions = new String[]{
                        "1650", "48", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10704_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10704_green/";
                break;
            case "ST-EC10704 Red":
                arr_descriptions = new String[]{
                        "1650", "48", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10704_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10704_red/";
                break;
            case "ST-EC10708 Gray":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10708_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10708_gray/";
                break;
            case "ST-EC10708 Red":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10708_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10708_red/";
                break;
            case "ST-EC10708 White":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10708_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10708_white/";
                break;
            case "ST-EC10708 Green":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10708_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10708_green/";
                break;
            case "ST-EC10708 Black":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10708_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10708_black/";
                break;
            case "ST-EC1072 Red":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_red/";
                break;
            case "ST-EC1072 Green":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_green/";
                break;
            case "ST-EC1072 Black":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_black/";
                break;
            case "ST-EC1072 White":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_white/";
                break;
            case "ST-EC1072 Violet":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_violet;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_violet/";
                break;
            case "ST-EC1072 Grey":
                arr_descriptions = new String[]{
                        "1200", "-", "1000/1000", "4", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1072_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1072_grey/";
                break;
            case "ST-EC10705 Green":
                arr_descriptions = new String[]{
                        "1650", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10705_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10705_green/";
                break;
            case "ST-EC10705 White":
                arr_descriptions = new String[]{
                        "1650", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10705_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10705_white/";
                break;
            case "ST-EC10705 Black":
                arr_descriptions = new String[]{
                        "1650", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10705_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10705_black/";
                break;
            case "ST-EC10705 Red":
                arr_descriptions = new String[]{
                        "1650", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10705_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10705_red/";
                break;
            case "ST-EC1070 Black":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_black/";
                break;
            case "ST-EC1070 Gray":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_gray/";
                break;
            case "ST-EC1070 White":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_white/";
                break;
            case "ST-EC1070 Green":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_green/";
                break;
            case "ST-EC1070 Red":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_red/";
                break;
            case "ST-EC1070 Violet":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1070_violet;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1070_violet/";
                break;
            case "ST-EC10709 Green":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10709_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10709_green/";
                break;
            case "ST-EC10709 White":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10709_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10709_white/";
                break;
            case "ST-EC10709 Red":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10709_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10709_red/";
                break;
            case "ST-EC10709 Black":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10709_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10709_black/";
                break;
            case "ST-EC10709 Gray":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10709_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10709_gray/";
                break;
            case "ST-EC1077 Violet":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_violet;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_violet/";
                break;
            case "ST-EC1077 Red":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_red/";
                break;
            case "ST-EC1077 Green":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_green/";
                break;
            case "ST-EC1077 Black":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_black/";
                break;
            case "ST-EC1077 Grey":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_grey/";
                break;
            case "ST-EC1077 White":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1077_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1077_white/";
                break;
            case "ST-EC7071 Black":
                arr_descriptions = new String[]{
                        "1300", "40", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec7071_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec7071_black/";
                break;
            case "ST-EC1088 Black":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1088_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1088_black/";
                break;
            case "ST-EC1088 Grey":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1088_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1088_grey/";
                break;
            case "ST-EC1088 Red":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1088_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1088_red/";
                break;
            case "ST-EC1088 White":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1088_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1088_white/";
                break;
            case "ST-EC1090 White":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1090_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1090_white/";
                break;
            case "ST-EC1090 Black":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1090_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1090_black/";
                break;
            case "ST-EC1090 Grey":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1090_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1090_grey/";
                break;
            case "ST-EC1090 Red":
                arr_descriptions = new String[]{
                        "1500", "45", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1090_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1090_red/";
                break;
            case "ST-EC1089 Red":
                arr_descriptions = new String[]{
                        "1500", "-", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1089_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1089_red/";
                break;
            case "ST-EC1089 Black":
                arr_descriptions = new String[]{
                        "1500", "-", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1089_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1089_black/";
                break;
            case "ST-EC1089 White":
                arr_descriptions = new String[]{
                        "1500", "-", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1089_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1089_white/";
                break;
            case "ST-EC1089 Grey":
                arr_descriptions = new String[]{"1500", "-", "-", "2", "верхний, нижний и совместный",
                        "антипригарное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1089_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1089_grey/";
                break;
            case "ST-EC10706 Black":
                arr_descriptions = new String[]{
                        "1420", "-", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10706_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10706_black/";
                break;
            case "ST-EC10706 White":
                arr_descriptions = new String[]{
                        "1420", "-", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10706_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10706_white/";
                break;
            case "ST-EC10706 Gray":
                arr_descriptions = new String[]{
                        "1420", "-", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10706_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10706_gray/";
                break;
            case "ST-EC10706 Red":
                arr_descriptions = new String[]{
                        "1420", "-", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10706_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10706_red/";
                break;
            case "ST-EC3802 White":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_hite;
                url_goods = "";
                break;
            case "ST-EC3802 Red":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_red;
                url_goods = "";
                break;
            case "ST-EC3802 Black":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_black;
                url_goods = "";
                break;
            case "ST-EC3802 Gray":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_gray;
                url_goods = "";
                break;
            case "ST-EC3802 Green":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_green;
                url_goods = "";
                break;
            case "ST-EC3802 Graphite":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "-", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec3802_graphite;
                url_goods = "";
                break;
            case "ST-EC10712 Black":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10712_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10712_black/";
                break;
            case "ST-EC10712 White":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10712_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10712_white/";
                break;
            case "ST-EC10712 Red":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10712_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10712_red/";
                break;
            case "ST-EC10712 Gray":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10712_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10712_gray/";
                break;
            case "ST-EC10712 Green":
                arr_descriptions = new String[]{
                        "1500", "52", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec10712_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10712_green/";
                break;
            case "ST-EC10703 Black":
                arr_descriptions = new String[]{
                        "1300", "36", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10703_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10703_black/";
                break;
            case "ST-EC10703 Gray":
                arr_descriptions = new String[]{
                        "1300", "36", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10703_gray;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10703_gray/";
                break;
            case "ST-EC10703 White":
                arr_descriptions = new String[]{
                        "1300", "36", "1000/1000", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "280", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec10703_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec10703_white/";
                break;
            case "ST-EC1074 Green":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_green/";
                break;
            case "ST-EC1074 Black":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_black/";
                break;
            case "ST-EC1074 Violet":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_violet;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_violet/";
                break;
            case "ST-EC1074 Grey":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_grey/";
                break;
            case "ST-EC1074 Red":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_red/";
                break;
            case "ST-EC1074 White":
                arr_descriptions = new String[]{
                        "1200", "50", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "Да"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1074_white/";
                break;
            case "ST-EC1079 Red":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1079_red/";
                break;
            case "ST-EC1079 White":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = " http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1079_white/";
                break;
            case "ST-EC1079 Gray":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1079_gray/";
                break;
            case "ST-EC1079 Black":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1079_black/";
                break;
            case "ST-EC1079 Green":
                arr_descriptions = new String[]{
                        "1500", "42", "-", "2", "верхний, нижний и совместный",
                        "эмалированное", "Да", "Да", "Да", "90", "320", "Да", "Да", "-"};
                image = R.mipmap.electric_bake_st_ec1074_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/pechi_elektricheskie/saturn_st_ec1079_green/";
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
