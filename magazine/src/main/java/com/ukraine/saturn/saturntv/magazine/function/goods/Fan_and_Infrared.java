package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

import java.util.Arrays;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.NAME_ARR_FAN_ALL;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Fan_and_Infrared {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Fan_and_Infrared(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_FAN_ALL)) {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Диаметр, см:", "Тип:", "Скоростных режимов работы: ",
                    "Функция вращения:", "Крестовидное основание, мм:", "Регулируемая высота:",
                    "Защитная сетка:", "Таймер, ч: ", "Световой индикатор: ",
                    "Дистанционное управление:", "Дополнительные свойства: ",
                    "Защита от перегрева:", "Частота, Гц:"};

            switch (arr_category[id_arr]) {
                case "ST-FN8272":
                    arr_descriptions = new String[]{
                            "50", "40", "напольный", "3", "Да", "круглое", "Да", "Да", "9", "Да",
                            "Да", "ионизация, 3 режима обдува", "Да", "50"};
                    image = R.mipmap.fan_st_fn8272;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/ventilyatory/saturn_st_fn8272/";
                    break;
                case "ST-FN8273":
                    arr_descriptions = new String[]{
                            "45", "40", "напольный", "3", "Да", "круглое", "Да", "Да", "7,5", "Да",
                            "-", "-", "Да", "50"};
                    image = R.mipmap.fan_st_fn8273;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/ventilyatory/saturn_st_fn8273/";
                    break;
                case "ST-FN8262":
                    arr_descriptions = new String[]{
                            "45", "40", "напольный", "3", "Да", "600", "Да", "Да", "-", "Да",
                            "-", "-", "Да", "50"};
                    image = R.mipmap.fan_st_fn8262;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/ventilyatory/saturn_st_fn8262/";
                    break;
                case "ST-FN8250":
                    arr_descriptions = new String[]{
                            "55", "40", "напольный", "3", "Да", "600", "Да", "Да", "-", "Да",
                            "-", "-", "Да", "50"};
                    image = R.mipmap.fan_st_fn8250;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/ventilyatory/saturn_st_fn8250/";
                    break;
                case "ST-FN8266":
                    arr_descriptions = new String[]{
                            "40", "40", "напольный", "3", "Да", "450", "Да", "Да", "-", "Да",
                            "-", "-", "Да", "50"};
                    image = R.mipmap.fan_st_fn8266;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/ventilyatory/saturn_st_fn8266/";
                    break;
                case "ST-FN8269":
                    arr_descriptions = new String[]{
                            "40", "40", "напольный", "3", "Да", "450", "Да", "Да", "-", "Да",
                            "-", "-", "Да", "50"};
                    image = R.mipmap.fan_st_fn8269;
                    url_goods = "";
                    break;
                default:
                    break;
            }
        } else {
            arr_naming = new String[]{
                    "Мощность, Вт:", "Площадь обогрева, м2:", "Регулируемый термостат:",
                    "Комплект для установки на полу:", "Защитная сетка:", "Защита от перегрева:",
                    "Возможность крепления на стену: ", "Комплект для установки на стену:"};
            switch (arr_category[id_arr]) {

                case "ST-HT0494":
                    arr_descriptions = new String[]{
                            "2800", "35", "Да", "Да", "Да", "Да", "-", "-"};
                    image = R.mipmap.infrared_st_ht0494;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht0494/";
                    break;
                case "ST-HT7657":
                    arr_descriptions = new String[]{"2000", "21", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht7657;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht7657/";
                    break;
                case "ST-HT7658":
                    arr_descriptions = new String[]{"1600", "17", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht7658;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht7658/";
                    break;
                case "ST-HT8642":
                    arr_descriptions = new String[]{"2500", "26", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht8642;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht8642/";
                    break;
                case "ST-HT8640":
                    arr_descriptions = new String[]{"1800", "19", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht8640;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht8640/";
                    break;
                case "ST-HT8641":
                    arr_descriptions = new String[]{"2000", "21", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht8641;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht8641/";
                    break;
                case "ST-HT0491":
                    arr_descriptions = new String[]{"2500", "26", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht0491;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht0491/";
                    break;
                case "ST-HT0493":
                    arr_descriptions = new String[]{
                            "2500", "30", "Да", "Да", "Да", "Да", "-", "-"};
                    image = R.mipmap.infrared_st_ht0493;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht0493/";
                    break;
                case "ST-HT0490":
                    arr_descriptions = new String[]{"2000", "15", "Да", "Да", "Да", "Да", "Да", "Да"};
                    image = R.mipmap.infrared_st_ht0490;
                    url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/infrakrasnye_obogrevateli/saturn_st_ht0490/";
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
