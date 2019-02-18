package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Clean {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Clean(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{"Мощность, Вт:", "Мощность всасывания, Вт:", "Регулятор мощности: ",
                "Вместимость пылесборника, л: ", "Система очистки «Циклон»:", "HEPA фильтр:",
                "Ступени фильтрации:", "Насадки:", "Трубка: ", "Уровень шума, дБ:",
                "Аквафильтр", "Индикатор заполнения:"};

        switch (arr_category[id_arr]) {
            case "ST-VC7293 White":
                arr_descriptions = new String[]{"1600", "200", "Да", "2,5", "Да", "на входе", "6",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "Да",
                        "-"};
                image = R.mipmap.clean_st_vc7293_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc7293_white/";
                break;
            case "ST-VC0264 Orange":
                arr_descriptions = new String[]{"1600", "-", "-", "2", "Да", "на входе", "5",
                        "турбо-щетка, усиленная металлом пол/ковер, мебель/щель", "мет./телеск.",
                        "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0264_orange;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0264_orange/";
                break;
            case "ST-VC0266 Red":
                arr_descriptions = new String[]{"2000", "-", "Да", "2,5", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0266_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0266_red/";
                break;
            case "ST-VC0266 Blue":
                arr_descriptions = new String[]{"2000", "-", "Да", "2,5", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0266_blue;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0266_blue/";
                break;
            case "ST-VC0266 Green":
                arr_descriptions = new String[]{"2000", "-", "Да", "2,5", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0266_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0266_green/";
                break;
            case "ST-VC7296 New":
                arr_descriptions = new String[]{"2000", "-", "Да", "3", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc7296_new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc7296_new/";
                break;
            case "ST-VC1288 Green":
                arr_descriptions = new String[]{"1800", "-", "Да", "3", "-", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "Да"};
                image = R.mipmap.clean_st_vc1288_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc1288_green/";
                break;
            case "ST-VC1288 Orange":
                arr_descriptions = new String[]{"1800", "-", "Да", "3", "-", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "Да"};
                image = R.mipmap.clean_st_vc1288_orange;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc1288_orange/";
                break;
            case "ST-VC7278":
                arr_descriptions = new String[]{"2000", "-", "Да", "3", "-", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<74", "-", "Да"};
                image = R.mipmap.clean_st_vc7278;
                url_goods = "";
                break;
            case "ST-VC7279 Red":
                arr_descriptions = new String[]{"1800", "-", "Да", "2", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc7279_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc7279_red/";
                break;
            case "ST-VC7279 Black":
                arr_descriptions = new String[]{"1800", "-", "Да", "2", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc7279_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc7279_black/";
                break;
            case "ST-VC0274":
                arr_descriptions = new String[]{"1400", "-", "Да", "3", "Да", "на входе", "5",
                        "усиленная металлом пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0274;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0274/";
                break;
            case "ST-VC0278":
                arr_descriptions = new String[]{"900", "210", "Да", "3", "Да", "на входе", "5",
                        "металл. щетка, пол/ковер, мебель/щель", "мет./телеск.", "<76", "-", "-"};
                image = R.mipmap.clean_st_vc0278;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0278/";
                break;
            case "ST-VC0279":
                arr_descriptions = new String[]{"1600", "250", "Да", "3", "Да", "на входе", "5",
                        "-", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0279;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0279/";
                break;
            case "ST-VC0257":
                arr_descriptions = new String[]{"1400", "210", "-", "2", "Да", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<76", "-", "-"};
                image = R.mipmap.clean_st_vc0257;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0257/";
                break;
            case "ST-VC0276":
                arr_descriptions = new String[]{"1600", "230", "-", "2.5", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0276;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0276/";
                break;
            case "ST-VC0273":
                arr_descriptions = new String[]{"1600", "230", "-", "3", "-", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<75", "-", "Да"};
                image = R.mipmap.clean_st_vc0273;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0273/";
                break;
            case "ST-VC0260 Purple":
                arr_descriptions = new String[]{"1400", "180", "-", "2", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0260_purple;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0260_purple/";
                break;
            case "ST-VC0256":
                arr_descriptions = new String[]{"1400", "210", "-", "3", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0256;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0256/";
                break;
            case "ST-VC0272":
                arr_descriptions = new String[]{"1400", "210", "Да", "2", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0272;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0272/";
                break;
            case "ST-VC0271 Green":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<80", "-", "-"};
                image = R.mipmap.clean_st_vc0271_green;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0271_green/";
                break;
            case "ST-VC0271 Purple":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "Да", "на входе", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<80", "-", "-"};
                image = R.mipmap.clean_st_vc0271_purple;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0271_purple/";
                break;
            case "ST-VC0270 Purple":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "Да", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0270_purple;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0270_purple/";
                break;
            case "ST-VC0270 Gold":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "Да", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<78", "-", "-"};
                image = R.mipmap.clean_st_vc0270_gold;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0270_gold/";
                break;
            case "ST-VC0268":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "-", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<80", "-", "Да"};
                image = R.mipmap.clean_st_vc0268;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0268/";
                break;
            case "ST-VC0268 Black":
                arr_descriptions = new String[]{"1400", "180", "-", "1,5", "-", "-", "5",
                        "пол/ковер, мебель/щель", "мет./телеск.", "<80", "-", "Да"};
                image = R.mipmap.clean_st_vc0268_black;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc0268_black/";
                break;
            case "ST-VC1299 EU":
                arr_descriptions = new String[]{"600", "-", "-", "0,5", "Да", "на входе", "5",
                        "Щетка для пола и насадка для щелей", "-.", "-", "-", "-"};
                image = R.mipmap.clean_st_vc1299_eu;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc1299_eu/";
                break;
            case "ST-VC7297":
                arr_descriptions = new String[]{"2200", "400", "Да", "4", "-", "на входе", "5",
                        "пол/ковер, мебель/щель", "-.", "-", "-", "Да"};
                image = R.mipmap.clean_st_vc7297;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_doma/pylesosy/saturn_st_vc7297/";
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
