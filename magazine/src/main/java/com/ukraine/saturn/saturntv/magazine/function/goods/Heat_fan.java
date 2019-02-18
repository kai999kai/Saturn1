package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Heat_fan {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Heat_fan(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Площадь обогрева, м2:", "Материал корпуса:",
                "Нагревательный елемент:", "Регулируемый термостат:",
                "Позиции режимов мощности, Вт:", "Световой индикатор:", "Режим холодного обдува:",
                "Защита от перегрева:", "Функция вращения:", "Дополнительные свойства:"};

        switch (arr_category[id_arr]) {

            case "ST-HT8357":
                arr_descriptions = new String[]{
                        "3000", "22", "пластик", "керамический", "Да", "750/1500",
                        "Да", "Да", "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht8357;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8357/";
                break;
            case "ST-HT0479":
                arr_descriptions = new String[]{
                        "1500", "17", "пластик", "-", "Да", "750/1500", "Да", "Да", "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht0479;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht0479/";
                break;
            case "ST-HT8354":
                arr_descriptions = new String[]{
                        "1500", "17", "пластик", "керамический", "Да", "750/1500", "-",
                        "Да", "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht8354;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8354/";
                break;
            case "ST-HT1245":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "спиральный", "Да", "1000/2000", "Да",
                        "Да", "Да", "Да", "-"};
                image = R.mipmap.heat_fan_st_ht1245;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht1245/";
                break;
            case "ST-HT8341":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "спиральный", "Да", "1000/2000", "Да",
                        "Да", "Да", "Да", "-"};
                image = R.mipmap.heat_fan_st_ht8341;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8341/";
                break;
            case "ST-HT8340":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", "-"};
                image = R.mipmap.heat_fan_st_ht8340;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8340/";
                break;
            case "ST-HT8349":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", "-"};
                image = R.mipmap.heat_fan_st_ht8349;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8349/";
                break;
            case "ST-HT8355 Green":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", " отключение при опрокидывании"};
                image = R.mipmap.heat_fan_st_ht8355_green;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8355_green/";
                break;
            case "ST-HT8355 Pink":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", " отключение при опрокидывании"};
                image = R.mipmap.heat_fan_st_ht8355_pink;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8355_pink/";
                break;
            case "ST-HT8355 Blue":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", " отключение при опрокидывании"};
                image = R.mipmap.heat_fan_st_ht8355_blue;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8355_blue/";
                break;
            case "ST-HT8355 Orange":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "-", "Да", "1000/2000", "Да", "Да", "Да",
                        "-", " отключение при опрокидывании"};
                image = R.mipmap.heat_fan_st_ht8355_orange;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht8355_orange/";
                break;
            case "ST-HT7645":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "спиральный", "Да", "1000/2000", "Да", "Да",
                        "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht7645;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht7645/";
                break;
            case "ST-HT7643":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "спиральный", "Да", "1000/2000", "Да",
                        "Да", "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht7643;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht7643/";
                break;
            case "ST-HT7644":
                arr_descriptions = new String[]{
                        "2000", "22", "пластик", "спиральный", "Да", "1000/2000", "Да",
                        "Да", "Да", "-", "-"};
                image = R.mipmap.heat_fan_st_ht7644;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/teploventilyatory/saturn_st_ht7644/";
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
