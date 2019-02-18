package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Convection {
    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Convection(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        arr_naming = new String[]{
                "Мощность, Вт:", "Площадь обогрева, м2:", "ЖК дисплей:", "Управление:",
                "Регулируемый термостат:", "Таймер, ч:", "Возможность крепления на стену:",
                "Комплект для установки на полу:", "Дистанционное управление:", "Защита от перегрева:",
                "Комплект для крепления на стену:", "Позиции режимов мощности, Вт:", "Частота, Гц:",
                "Дополнительные свойства:"};

        switch (arr_category[id_arr]) {
            case "ST-HT0466":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "-",
                        "-", "50", "-"};
                image = R.mipmap.convection_st_ht0466;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0466/";
                break;
            case "ST-HT0461":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "-", "50", "-"};
                image = R.mipmap.convection_st_ht0461;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0461/";
                break;
            case "ST-HT7273":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht7273;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7273/";
                break;
            case "ST-HT7269 New":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "-", "50", "-"};
                image = R.mipmap.convection_st_ht7269_new;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7269_new/";
                break;
            case "ST-HT7275":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "сенсорное", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht7275;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7275/";
                break;
            case "ST-HT4017":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "-", "50", "-"};
                image = R.mipmap.convection_st_ht4017;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht4017/";
                break;
            case "ST-HT0468":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "Кнопки", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "750/1500", "50", "-"};
                image = R.mipmap.convection_st_ht0468;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0468/";
                break;
            case "ST-HT0467":
                arr_descriptions = new String[]{
                        "2500", "27", "-", "Кнопки", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1250/2500", "50", "-"};
                image = R.mipmap.convection_st_ht0467;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0467/";
                break;
            case "ST-HT7271":
                arr_descriptions = new String[]{
                        "2500", "27", "-", "Кнопки", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1250/2500", "50", "-"};
                image = R.mipmap.convection_st_ht7271;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7271/";
                break;
            case "ST-HT0465":
                arr_descriptions = new String[]{
                        "2500", "27", "-", "Кнопки", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1000/2500", "50", "-"};
                image = R.mipmap.convection_st_ht0465;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0465/";
                break;
            case "ST-HT7272":
                arr_descriptions = new String[]{
                        "1000", "12", "Да", "сенсорное", "Да", "24", "Да", "Да", "Да", "Да", "Да",
                        "500/1000", "50", "-"};
                image = R.mipmap.convection_st_ht7272;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7272/";
                break;
            case "ST-HT0464":
                arr_descriptions = new String[]{
                        "1500", "17", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "750/1500", "50", "-"};
                image = R.mipmap.convection_st_ht0464;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0464/";
                break;
            case "ST-HT0477":
                arr_descriptions = new String[]{
                        "2000", "22", "Да", "электронное", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1000/2000", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0477;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0477/";
                break;
            case "ST-HT0480":
                arr_descriptions = new String[]{
                        "2500", "27", "Да", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "1000/2500", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0480;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0480/";
                break;
            case "ST-HT8663":
                arr_descriptions = new String[]{"2000", "22", "-", "Кнопки", "Да", "2", "Да", "Да",
                        "-", "Да", "Да", "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht8663;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht8663/";
                break;
            case "ST-HT7270":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht7270;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7270/";
                break;
            case "ST-HT7269":
                arr_descriptions = new String[]{
                        "1500", "17", "-", "Кнопки", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "750/1500", "50", "-"};
                image = R.mipmap.convection_st_ht7269;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7269/";
                break;
            case "ST-HT8664":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht8664;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht8664/";
                break;
            case "ST-HT0476":
                arr_descriptions = new String[]{
                        "1500", "17", "Да", "электронное", "Да", "24", "Да", "Да", "-", "Да", "Да",
                        "750/1500", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0476;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0476/";
                break;
            case "ST-HT0462":
                arr_descriptions = new String[]{
                        "1000", "12", "Нет", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "500/1000", "50", "-"};
                image = R.mipmap.convection_st_ht0462;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0462/";
                break;
            case "ST-HT0470":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "750/1250/2000", "50", "-"};
                image = R.mipmap.convection_st_ht0470;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0470/";
                break;
            case "ST-HT0474 T":
                arr_descriptions = new String[]{
                        "2500", "27", "-", "Кнопки", "Да", "-", "Да", "-", "-", "Да", "Да",
                        "1250/2500", "50", "-"};
                image = R.mipmap.convection_st_ht0474_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0474_t/";
                break;
            case "ST-HT0475":
                arr_descriptions = new String[]{
                        "1000", "12", "-", "электронное", "Да", "24", "Да", "Да", "-", "Да",
                        "Да", "500/1000", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0475;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0475/";
                break;
            case "ST-HT7265":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "-", "-", "-", "Да", "-",
                        "800/1200/2000", "50", "-"};
                image = R.mipmap.convection_st_ht7265;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7265/";
                break;
            case "ST-HT0473 T":
                arr_descriptions = new String[]{
                        "2000", "22", "Нет", "Кнопки", "Да", "Нет", "Да", "-", "-", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht0473_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0473_t/";
                break;
            case "ST-HT0453-Т":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "Да", "-", "-", "Да", "Да",
                        "1000/2000", "50", "-"};
                image = R.mipmap.convection_st_ht0453_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0453_t/";
                break;
            case "ST-HT8661":
                arr_descriptions = new String[]{
                        "1000", "12", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "-", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht8661;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht8661/";
                break;
            case "ST-HT0474":
                arr_descriptions = new String[]{
                        "2500", "27", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "1000/2500", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0474;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0474/";
                break;
            case "ST-HT0472 T":
                arr_descriptions = new String[]{
                        "1500", "17", "-", "Кнопки", "Да", "-", "Да", "-", "-", "Да", "Да",
                        "700/1500", "50", "-"};
                image = R.mipmap.convection_st_ht0472_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0472_t/";
                break;
            case "ST-HT0452-Т":
                arr_descriptions = new String[]{
                        "1500", "17", "-", "Кнопки", "Да", "-", "Да", "-", "-", "Да", "Да",
                        "700/1500", "50", "Функция автоотключения"};
                image = R.mipmap.convection_st_ht0452_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0452_t/";
                break;
            case "ST-HT0473":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "Нет", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0473;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0473/";
                break;
            case "ST-HT0472":
                arr_descriptions = new String[]{
                        "1500", "17", "-", "Кнопки", "Да", "-", "Да", "Да", "-", "Да", "Да",
                        "700/1500", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0472;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0472/";
                break;
            case "ST-HT0471":
                arr_descriptions = new String[]{
                        "1000", "12", "Нет", "Кнопки", "Да", "-", "Да", "Да", "Нет", "Да", "Да",
                        "500/1000", "50", "отключение при опрокидывании"};
                image = R.mipmap.convection_st_ht0471;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0471/";
                break;
            case "ST-HT0471 T":
                arr_descriptions = new String[]{
                        "1000", "12", "-", "Кнопки", "Да", "-", "Да", "-", "Нет", "Да", "Да",
                        "500/1000", "50", "-"};
                image = R.mipmap.convection_st_ht0471_t;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht0471_t/";
                break;
            case "ST-HT7267":
                arr_descriptions = new String[]{
                        "2000", "22", "-", "Кнопки", "Да", "-", "-", "-", "-", "-",
                        "Да", "750/1250/2000", "50", "Световой индикатор"};
                image = R.mipmap.convection_st_ht7267;
                url_goods = "http://saturn.ua/ru/catalog/klimaticheskaya_tekhnika/konvektsionnye_obogrevateli/saturn_st_ht7267/";
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
