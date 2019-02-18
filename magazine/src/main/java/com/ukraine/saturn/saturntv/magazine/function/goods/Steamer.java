package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Steamer {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private String url_goods;
    private int image;


    public Steamer(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{"Мощность Вт:", "Объем:", "Количество ярусов:", "Материал корпуса:",
                "Емкость контейнера для риса, л:", "Контейнеры со слотами для яиц:",
                "Максимальная емкость резервуара для воды, л:",
                "Минимальная емкость резервуара для воды, л:", "Управление:", "Таймер, мин:",
                "Шкала уровня воды:", "Функция автоотключения:", "Световой индикатор:",
                "ЖК дисплей:"};

        switch (arr_category[id_arr]) {
            case "ST-EC0100_white":
                arr_descriptions = new String[]{
                        "900", "12", "3", "пластик", "1,2", "Да", "1,5", "0,3",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec0100_white;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec0100_white/";
                break;
            case "ST-EC0105":
                arr_descriptions = new String[]{
                        "800", "9", "3", "нерж. Сталь", "1", "Да", "1,2", "0,5",
                        "электронное", "90", "Да", "-", "-", "-"};
                image = R.mipmap.steamer_st_ec0105;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec0105/";
                break;
            case "ST-EC0104":
                arr_descriptions = new String[]{
                        "800", "6", "2", "нерж. Сталь", "1", "Да", "1,2", "0,5",
                        "электронное", "90", "Да", "Да", "-", "-"};
                image = R.mipmap.steamer_st_ec0104;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec0104/";
                break;
            case "ST-EC7177":
                arr_descriptions = new String[]{
                        "800", "9", "3", "нерж. Сталь", "1", "Да", "1,2", "0,5",
                        "электронное", "90", "Да", "Да", "-", "-"};
                image = R.mipmap.steamer_st_ec7177;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec7177/";
                break;
            case "ST-EC1180":
                arr_descriptions = new String[]{
                        "1000", "12", "3", "нерж. Сталь", "1,5", "Да", "1,4", "0,6",
                        "механическое", "75", "Да", "Да", "-", "-"};
                image = R.mipmap.steamer_st_ec1180;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1180/";
                break;
            case "ST-EC7178":
                arr_descriptions = new String[]{
                        "800", "9", "3", "пластик", "1", "Да", "1,2", "0,5",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec7178;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec7178/";
                break;
            case "ST-EC1179":
                arr_descriptions = new String[]{
                        "800", "5", "2", "пластик", "1,5", "Да", "1,4", "0,9",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec1179;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1179/";
                break;
            case "ST-EC1179 Grey":
                arr_descriptions = new String[]{
                        "800", "5", "2", "пластик", "1,5", "Да", "1,4", "0,9",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec1179_grey;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1179_grey/";
                break;
            case "ST-EC7181":
                arr_descriptions = new String[]{
                        "800", "5", "2", "пластик", "1", "Да", "1,2", "0,5",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec7181;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec7181/";
                break;
            case "ST-EC1186":
                arr_descriptions = new String[]{
                        "900", "9", "3", "пластик", "0,5", "Да", "1,8", "0,3",
                        "механическое", "60", "Да", "Да", "Да"};
                image = R.mipmap.steamer_st_ec1186;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1186/";
                break;
            case "ST-EC1185":
                arr_descriptions = new String[]{
                        "900", "6", "2", "пластик", "0,5", "Да", "1,8", "0,3",
                        "механическое", "60", "Да", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec1185;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1185/";
                break;
            case "ST-EC1181":
                arr_descriptions = new String[]{
                        "400", "5", "2", "пластик", "0,6", "-", "0,4", "0,3",
                        "механическое", "60", "-", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec1181;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1181/";
                break;
            case "ST-EC1181 Beige":
                arr_descriptions = new String[]{
                        "400", "5", "2", "пластик", "0,6", "-", "0,4", "0,3",
                        "механическое", "60", "-", "Да", "Да", "-"};
                image = R.mipmap.steamer_st_ec1181_beige;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1181_beige/";
                break;
            case "ST-EC1182":
                arr_descriptions = new String[]{
                        "400", "4", "2", "нерж. Сталь", "0,6", "Да", "0,4", "0,3",
                        "механическое", "60", "-", "Да", "-", "-"};
                image = R.mipmap.steamer_st_ec1182;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1182/";
                break;
            case "ST-EC1183":
                arr_descriptions = new String[]{
                        "800", "9", "3", "нерж. Сталь", "1", "Да", "1,2", "0,4",
                        "электронное", "60", "-", "Да", "-", "Да"};
                image = R.mipmap.steamer_st_ec1183;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1183/";
                break;
            case "ST-EC1184":
                arr_descriptions = new String[]{
                        "800", "6", "2", "нерж. Сталь", "1", "Да", "1,2", "0,5",
                        "электронное", "90", "Да", "Да", "-", "-"};
                image = R.mipmap.steamer_st_ec1184;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/parovarki/saturn_st_ec1184/";
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
