package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

import java.util.Arrays;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.*;
/** when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.*/
public class Barbecue_and_Electric_plate {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;

    public Barbecue_and_Electric_plate(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_BARBECUE_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Материал корпуса:", "Нагревательный елемент:",
                    "Шампура, кол-во:", "Блокировочный механизм:", "Поддон для сбора жира:",
                    "Наличие таймера:"};
            switch (arr_category[id_arr]) {
                case "ST-FP8561":
                    arr_descriptions = new String[]{"1000", "алюминий", "керамический", "5",
                            "Да", "Да", "-"};
                    image = R.mipmap.barbecue_st_fp8561;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/shashlychnitsy/saturn_st_fp8561/";
                    break;
                case "ST-FP8560T":
                    arr_descriptions = new String[]{"1400", "закаленное стекло", "керамический",
                            "5", "Да", "Да", "-"};
                    image = R.mipmap.barbecue_st_fp8560t;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/shashlychnitsy/saturn_st_fp8560t/";
                    break;
                case "ST-FP8560C":
                    arr_descriptions = new String[]{"1000", "нерж. Сталь", "керамический",
                            "5", "Да", "Да", "Да"};
                    image = R.mipmap.barbecue_st_fp8560c;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/shashlychnitsy/saturn_st_fp8560c/";
                    break;
                case "ST-FP8562":
                    arr_descriptions = new String[]{"1000", "нерж. Сталь", "керамический",
                            "6", "Да", "Да", "-"};
                    image = R.mipmap.barbecue_st_fp8562;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/shashlychnitsy/saturn_st_fp8562/";
                    break;
                default:
                    break;
            }
        } else {
            //  NAME_ARR_ELECTRIC_PLATE_ALL
            arr_naming = new String[]{
                    "Мощность, Вт:", "Мощность конфорок, Вт:", "Количество конфорок:",
                    "Нагревательный елемент:", "Управление:", "Регулируемый термостат:",
                    "Световой индикатор:", "Таймер, ч:"};
            switch (arr_category[id_arr]) {
                case "ST-EC1160":
                    arr_descriptions = new String[]{"2250", "750/1500", "2", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec1160;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec1160/";
                    break;
                case "ST-ЕС0191":
                    arr_descriptions = new String[]{"2500", "1000/1500", "2", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec0191;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_es0191/";
                    break;
                case "ST-EC0181_Black":
                    arr_descriptions = new String[]{"2250", "750/1500", "2", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec0181_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec0181_black/";
                    break;
                case "ST-ЕС0190":
                    arr_descriptions = new String[]{"1500", "1500", "1", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec0190;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_es0190/";
                    break;
                case "ST-EC1161":
                    arr_descriptions = new String[]{"1500", "1500", "1", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec1161;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec1161/";
                    break;
                case "ST-EC0180_Black":
                    arr_descriptions = new String[]{"1500", "1500", "1", "чугунный",
                            "механическое", "Да", "Да", "-"};
                    image = R.mipmap.electric_plate_st_ec0180_black;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec0180_black/";
                    break;
                case "ST-EC0187":
                    arr_descriptions = new String[]{"2000", "индукция", "1", "чугунный",
                            "механическое", "Да", "Да", "Да"};
                    image = R.mipmap.electric_plate_st_ec0187;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec0187/";
                    break;
                case "ST-EC0197":
                    arr_descriptions = new String[]{"2000", "индукция", "1", "закаленное стекло",
                            "электронное", "Да", "Да", "Да"};
                    image = R.mipmap.electric_plate_st_ec0197;
                    url_goods = "http://saturn.ua/ru/catalog/tekhnika_dlya_kukhni/elektroplitki/saturn_st_ec0197/";
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
