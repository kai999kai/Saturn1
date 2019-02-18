package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Multi_food {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Multi_food(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{"Мощность Вт:", "Автоприготовление, программ:", "Емкость чаши, л:",
                "Материал корпуса:", "Изменение времени приготовления:", "Функция подогрева блюда 3D:",
                "ЖК дисплей:", "Таймер, ч:", "Мерный стакан:", "Мерная ложка:",
                "Функция поддержания температуры:", "Защита от перегрева:", "Аксессуары:",
                "Керамическое напыление чаши:"};

        switch (arr_category[id_arr]) {

            case "ST-MC9181-39 Red":
                arr_descriptions = new String[]{
                        "700", "39", "5", "металл", "Да", "Да", "Да", "24", "Да", "Да", "Да", "Да",
                        "ложка для супа, ложка для риса насадка для приготовления на пару," +
                                " стаканы для йогурта", "Да"};
                image = R.mipmap.multi_food_st_mc9181_39_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9181_39_red/";
                break;
            case "ST-MC9184":
                arr_descriptions = new String[]{
                        "1000", "13", "5", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да", "-", "-"};
                image = R.mipmap.multi_food_st_mc9184;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9184/";
                break;
            case "ST-MC9181":
                arr_descriptions = new String[]{
                        "1000", "13", "6", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да", "ложка для супа, ложка для риса", "-"};
                image = R.mipmap.multi_food_st_mc9181;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9181/";
                break;
            case "ST-MC9194":
                arr_descriptions = new String[]{
                        "860", "18", "5", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для супа, ложка для риса, насадка для приготовления на пару", "Да"};
                image = R.mipmap.multi_food_st_mc9194;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9194/";
                break;
            case "ST-MC9184New":
                arr_descriptions = new String[]{
                        "1000", "8", "6", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для супа, ложка для риса, насадка для приготовления на пару", "-"};
                image = R.mipmap.multi_food_st_mc9184new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9184new/";
                break;
            case "ST-MC9181New":
                arr_descriptions = new String[]{
                        "1000", "5", "6", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да", "ложка для супа, ложка для риса", "-"};
                image = R.mipmap.multi_food_st_mc9181new;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9181new/";
                break;
            case "ST-MC9181-39":
                arr_descriptions = new String[]{
                        "700", "39", "5", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для супа, ложка для риса насадка для приготовления на пару, " +
                                "стаканы для йогурта", "Да"};
                image = R.mipmap.multi_food_st_mc9181_39;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9181_39/";
                break;
            case "ST-MC9203":
                arr_descriptions = new String[]{
                        "900", "45", "5", "нерж. Сталь", "Да", "-", "-", "-", "Да",
                        "-", "Да", "-",
                        "насадка для приготовления на пару, стаканы для йогурта, Прозрачная крышка",
                        "Да"};
                image = R.mipmap.multi_food_st_mc9203;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9203/";
                break;
            case "ST-MC9203 red":
                arr_descriptions = new String[]{
                        "900", "45", "5", "нерж. Сталь", "Да", "-", "-", "-", "Да",
                        "-", "Да", "-",
                        "насадка для приготовления на пару, стаканы для йогурта, Прозрачная крышка",
                        "Да"};
                image = R.mipmap.multi_food_st_mc9203_red;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9203_red/";
                break;
            case "ST-MC9205":
                arr_descriptions = new String[]{
                        "860", "27", "5", "-", "Да", "-", "-", "-", "Да",
                        "-", "Да", "-",
                        "Мерная чашка, ложка для супа, ложка для риса, " +
                                "насадка для приготовления на пару, стаканы для йогурта", "Да"};
                image = R.mipmap.multi_food_st_mc9205;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9205/";
                break;
            case "ST-MC9193":
                arr_descriptions = new String[]{
                        "900", "10", "5", "пластик", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для супа, ложка для риса, насадка для приготовления на пару, " +
                                "крышка для внутренней чаши", "-"};
                image = R.mipmap.multi_food_st_mc9193;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9193/";
                break;
            case "ST-MC9189Round":
                arr_descriptions = new String[]{
                        "700", "6", "5", "пластик", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "насадка для приготовления на пару, Антипригарное покрытие ", "-"};
                image = R.mipmap.multi_food_st_mc9189round;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9189round/";
                break;
            case "ST-MC9186Round":
                arr_descriptions = new String[]{
                        "700", "3", "5", "пластик", "-", "-", "-", "-", "Да",
                        "Да", "Да", "Да",
                        "мерный стакан, ложка для риса, насадка для приготовления на пару", "-"};
                image = R.mipmap.multi_food_st_mc9186round;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9186round/";
                break;
            case "ST-MC9199":
                arr_descriptions = new String[]{"1000", "8", "6", "-", "Да", "Да", "-", "-", "-",
                        "-", "Да", "-",
                        "мерный стакан, ложка для супа, ложка для риса, " +
                                "насадка для приготовления на пару, Антипригарное покрытие", "-"};
                image = R.mipmap.multi_food_st_mc9199;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9199/";
                break;
            case "ST-MC9180":
                arr_descriptions = new String[]{
                        "900", "9", "5", "пластик", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для супа, ложка для риса, решетка для приготовления на пару", "-"};
                image = R.mipmap.multi_food_st_mc9180;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9180/";
                break;
            case "ST-MC9187Touch":
                arr_descriptions = new String[]{
                        "860", "15", "5", "металл", "Да", "Да", "Да", "24", "Да",
                        "Да", "Да", "Да",
                        "ложка для риса, ложка для супа, решетка для приготовления на пару, " +
                                "Сенсорное управление", "Да"};
                image = R.mipmap.multi_food_st_mc9187touch;
                url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/multivarki/saturn_st_mc9187touch/";
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
