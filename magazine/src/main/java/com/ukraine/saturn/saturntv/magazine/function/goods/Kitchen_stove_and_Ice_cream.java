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
public class Kitchen_stove_and_Ice_cream {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Kitchen_stove_and_Ice_cream(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_KITCHEN_STOVE_ALL)) {
            arr_naming = new String[]{
                    "Тип:", "Мощность конфорок, Вт:", "Количество конфорок:", "Объем духовки, л:",
                    "Тип духовки:", "Мощность духовки:", "Макс. температура духовки:",
                    "Газовый контроль конфорок:", "Автоматическое зажигание конфорок:",
                    "Дверца духовки с двойным стеклом:", "Металлическая крышка:", "Подсветка духовки:",
                    "Ящик для хранения посуды:", "Длина шнура:", "Таймер, мин:", "Габариты, см:",
                    "Аксессуары:", "Euro Pool:"};
            switch (arr_category[id_arr]) {
                case "ST-GE2001":
                    arr_descriptions = new String[]{
                            "комбинированная", "770/1310/1310/2000", "4 газовые", "62",
                            "электрическая", "2400", "290", "Да", "Да", "Да", "Да", "Да",
                            "выдвижной", "1,5", "90", "89х60х60", "противень, решетка", "Да"};
                    image = R.mipmap.kitchen_stove_st__ge2001;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_ge2001/";
                    break;
                case "ST-GE2000":
                    arr_descriptions = new String[]{
                            "комбинированная", "770/1310/1310/2000", "4 газовые", "51",
                            "электрическая", "1600", "260", "Да", "Да", "Да",
                            "Да", "Да", "выдвижной", "1,5", "90",
                            "89х50х55", "противень, решетка", "Да"};
                    image = R.mipmap.kitchen_stove_st__ge2000;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_ge2000/";
                    break;
                case "ST-EO3011":
                    arr_descriptions = new String[]{
                            "электрическая", "1000/1000/1500/1500", "4 электрические", "51",
                            "электрическая", "1600", "260", "-", "-", "Да",
                            "Да", "Да", "выдвижной", "1,5", "90",
                            "89х50х55", "противень, решетка", "-"};
                    image = R.mipmap.kitchen_stove_st_go3011;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_eo3011/";
                    break;
                case "ST-EO3010":
                    arr_descriptions = new String[]{
                            "электрическая", "1000/1000/1500/1500", "4 электрические", "51",
                            "электрическая", "1600", "260", "-", "-", "Да",
                            "Да", "Да", "выдвижной", "1,5", "90",
                            "89х50х55", "противень, решетка", "-"};
                    image = R.mipmap.kitchen_stove_st_go3010;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_eo3010/";
                    break;
                case "ST-GO1011":
                    arr_descriptions = new String[]{
                            "газовая", "770/1310/1310/2000", "4 газовые", "62",
                            "газовая", "2160", "220", "-", "-", "Да", "-", "Да",
                            "выдвижной", "1,5", "-",
                            "89х60х60", "противень, решетка", "-"};
                    image = R.mipmap.kitchen_stove_st_go1011;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_go1011/";
                    break;
                case "ST-GO1010":
                    arr_descriptions = new String[]{
                            "газовая", "770/1310/1310/2000", "4 газовые", "51",
                            "газовая", "1800", "220", "-", "-", "Да", "-", "Да",
                            "выдвижной", "1,5", "-", "89х50х55", "противень, решетка", "-"};
                    image = R.mipmap.kitchen_stove_st_go1010;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/kukhonnye_plity/saturn_st_go1010/";
                    break;
                default:
                    break;
            }

        } else {
            //  NAME_ARR_ICE_CREAM_ALL

            arr_naming = new String[]{
                    "Мощность Вт:", "Объем:", "Материал корпуса:", "Система интенсивного охлаждения:",
                    "Время приготовления мороженного, мин:"};
            switch (arr_category[id_arr]) {
                case "ST-FP8521 black":
                    arr_descriptions = new String[]{"50", "2", "пластик", "Да", "30-40"};
                    image = R.mipmap.ice_cream_st_fp8521_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/morozhenitsy/saturn_st_fp8521_black/";
                    break;
                case "ST-FP8521 white":
                    arr_descriptions = new String[]{"50", "2", "пластик", "Да", "30-40"};
                    image = R.mipmap.ice_cream_st_fp8521_white;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/morozhenitsy/saturn_st_fp8521_white/";
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
