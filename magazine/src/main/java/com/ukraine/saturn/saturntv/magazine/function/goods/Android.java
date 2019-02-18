package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Android {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Android(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        arr_naming = new String[]{
                "Диагональ экрана, дюймов:", "Внутренняя память ГБ:", "Оперативная память ГБ:",
                "Тип экрана:", "Разрешение экрана:", "Процессор:", "Количество ядер:",
                "Частота процессора, Ггц: ", "Графический процессор: ", "Материал корпуса:",
                "Основная камера, Мп:", "Фронтальная камера, Мп:", "Емкость батареи, мАч:",
                "ОС, версия:", "Wi-Fi (b/g/n):", "Дополнительные свойства:"};

        switch (arr_category[id_arr]) {
            case "ST-TPC9701":

                arr_descriptions = new String[]{"9,7", "8", "1", "IPS", "1024x768", "Cortex-A9",
                        "2", "1,5", "Mali 400", "алюминий", "2", "0,3", "6000", "Android 4,0", "Да",
                        "Кабель USB 2.0 + Зарядка"};
                image = R.mipmap.tablet_st_tpc9701;
                url_goods = "http://saturn.ua/ru/catalog/planshety/saturn_st_tpc9701/";
                break;
            case "ST-TPC9702":

                arr_descriptions = new String[]{"9,7", "16", "1", "IPS", "1024x600", "Cortex-A7",
                        "4", "1", "SGX544MP2", "алюминий", "2", "2", "6500", "Android 4.2", "Да",
                        "Кабель USB 2.0 + Зарядка"};
                image = R.mipmap.tablet_st_tpc9702;
                url_goods = "http://saturn.ua/ru/catalog/planshety/saturn_st_tpc9702/";
                break;
            case "ST-TPC0708 Black":

                arr_descriptions = new String[]{
                        "7", "4", "512мб", "TFT", "800x480", "RockChip 3026", "2", "1.2", "Mali 400",
                        "софт-тач пластик", "3", "0,3", "3000", "Android 4.4", "Да",
                        "Кабель USB 2.0 + Зарядка"};
                image = R.mipmap.tablet_st_tpc0708_black;
                url_goods = "http://saturn.ua/ru/catalog/planshety/saturn_st_tpc0708_black/";
                break;
            case "ST-TPC0708 White":

                arr_descriptions = new String[]{"7", "4", "512мб", "TFT", "800x480", "RockChip 3026",
                        "2", "1.2", "Mali 400", "софт-тач пластик", "3", "0,3", "3000",
                        "Android 4.4", "Да", "Кабель USB 2.0 + Зарядка"};
                image = R.mipmap.tablet_st_tpc0708_white;
                url_goods = "http://saturn.ua/ru/catalog/planshety/saturn_st_tpc0708_white/";
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
