package com.ukraine.saturn.saturntv.magazine.function.goods;

import com.ukraine.saturn.saturntv.magazine.R;

/**
 * when calling a class in MainGetGoods,
 * start processing the result through the constructor
 * !!!!Attention!!!!.
 * Some classes goods have two kinds of goods.
 * Made to reduce the program code.
 */
public class Tv {

    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;
    private String url_gods;


    public Tv(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();
    }

    private void result() {

        arr_naming = new String[]{
                "Диагональ экрана, дюймов:", "Угол обзора:", "SMART TV:", "Оперативная память:",
                "Частота процессора, Ггц:", "ОС, версия:", "Wi-Fi (b/g/n):", "Разрешение:",
                "Формат экрана:", "Яркость, кд/м2:", "Контрастность:", "Макс. Кол. цветов, млн:",
                "Частота развертки, Гц:", "Время отклика, мс:", "Встроенный цифровой тюнер:",
                "Кол. аналоговых каналов:", "Кол. цифровых каналов:", "Срок службы подсветки, ч:",
                "Таймер сна:", "Потребление, Вт:", "Мощность колонок, Вт: ", "Разъемы", " -USB",
                " -HDMI", " -SCART", " -PC Audio", " -VGA", " -RF", " -CVBS",
                " -Mini YPBPR", " -YPBPR", " -CI+", " -CI", " -Mini AV", " -AV", " -RJ45", "COAX",
                "LINEOut L/R",                ""};

        switch (arr_category[id_arr]) {
            case "TV LED65NF":
                arr_descriptions = new String[]{
                        "65", "178", "Да", "-", "-", "-", "-", "1920x1080", "16:9", "900", "200000:1",
                        "16.7", "240", "3.7", "DVB-T2, DVB-C", "100", "1600", "150000", "Да", "-", "-",
                        "", "3", "2", "1", "1", "1", "1", "1", "1", "-", "1", "-", "1", "-", "1", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb, mp3, wma, m4a, " +
                                "aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led65nf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led65nf/";
                break;
            case "TV LED55FHD500UT2":
                arr_descriptions = new String[]{"55", "-", "-", "-", "-", "-", "-", "1920x1080",
                        "16:9", "500", "80000:1", "-",
                        "50-60", "9", "DVB-T2", "200", "1600", "150000", "Да", "115", "2*10",
                        "", "3", "1", "1", "1", "1", "1", "1", "-", "1", "-", "1", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, " +
                                "rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led55fhd500ut2;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led55fhd500ut2/";
                break;
            case "TV LED49FHD500U":
                arr_descriptions = new String[]{
                        "49", "178", "-", "-", "-", "-", "-", "1920x1080", "16:9", "700", "90000:1",
                        "16.7", "60", "7", "-", "200", "-", "150000", "Да", "-", "2*10",
                        "", "1", "3", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, " +
                                "rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led49fhd500u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led49fhd500u/";
                break;
            case "TV LED49FHD300U":
                arr_descriptions = new String[]{
                        "49", "178", "-", "-", "-", "-", "-", "1920x1080", "16:9", "700", "90000:1",
                        "16.7", "60", "6", "-", "-", "-", "150000", "Да", "-", "2*10",
                        "", "1", "3", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb, mp3, wma, " +
                                "m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led49fhd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led49fhd300u/";
                break;
            case "TV LED50FHD800UT2":
                arr_descriptions = new String[]{
                        "50", "-", "-", "-", "-", "-", "-", "1920x1080", "16:9", "500", "50000:1",
                        "-", "60", "7", "DVB-T2", "200", "1000", "150000",
                        "Да", "100", "2*10",
                        "", "3", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb," +
                                " mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led50fhd800ut2;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led50fhd800ut2/";
                break;
            case "TV LED50NF":
                arr_descriptions = new String[]{
                        "50", "178", "Да", "-", "-", "-", "-", "1920x1080", "16:9", "750",
                        "100000:1", "-", "60", "3,7", "DVB-T2, DVB-C", "100", "1600",
                        "150000", "Да", "-", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "1", "-", "1", "-", "1", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led50nf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led50nf/";
                break;
            case "TV LED46KF":
                arr_descriptions = new String[]{
                        "46", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9", "350",
                        "10000:1", "16,7", "120", "6,5", "-", "200", "-", "30000", "Да",
                        "100", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (AVI, MP4, TS, TRP, MKV, MOV, MPG, DAT," +
                                " VOB, RM, RMVB, MP3, WMA, M4A, AAC, JPG, JPEG, BMP, PNG)"};
                image = R.mipmap.tv_led46kf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led46kf/";
                break;
            case "TV LED42NF":
                arr_descriptions = new String[]{
                        "42", "176", "-", "-", "-", "-", "-", "1920x1080", "16:9", "550",
                        "70000:1", "16,7", "60", "3,7", "DVB-T2, DVB-C", "100", "1600",
                        "150000", "Да", "-", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "1", "-", "1", "-", "-", "-", "-",
                        "Поддержка:  (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led42nf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led42nf/";
                break;
            case "TV LED40NF":
                arr_descriptions = new String[]{
                        "40", "176", "-", "-", "-", "-", "-", "1920x1080", "16:9", "500",
                        "50000:1", "16,7",
                        "60", "3,7", "DVB-T2, DVB-C", "100", "1600", "150000", "Да", "-", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "1", "-", "1", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, " +
                                "vob, rm, rmvb, mp3, wma, m4a, aac, jpg," +
                                " jpeg, bmp, png)"};
                image = R.mipmap.tv_led40nf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40nf/";
                break;
            case "TV LED40FHD400U":
                arr_descriptions = new String[]{"40", "176", "-", "-", "-", "-", "-",
                        "1920x1080", "16:9", "500", "50000:1", "16,7",
                        "60", "6,5", "-", "200", "-", "150000", "Да", "60", "-",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, " +
                                "jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led40fhd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40fhd400u/";
                break;
            case "TV LED40FHD200U":
                arr_descriptions = new String[]{"40", "176", "-", "-", "-", "-", "-",
                        "1920x1080", "16:9", "500", "50000:1", "16,7",
                        "60", "8", "-", "199", "-", "150000", "Да", "-", "-",
                        "", "1", "3", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg, " +
                                "jpeg, bmp, png)"};
                image = R.mipmap.tv_led40fhd200u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40fhd200u/";
                break;
            case "TV LED40HD400U":
                arr_descriptions = new String[]{"40", "176", "-", "-", "-", "-", "-", "1366x768",
                        "16:9", "500", "50000:1", "16,7",
                        "60", "6,5", "-", "200", "-", "150000", "Да", "-", "2х10",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, " +
                                "dat, vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led40hd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40hd400u/";
                break;
            case "TV LED40KF":
                arr_descriptions = new String[]{"40", "170", "-", "-", "-", "-", "-",
                        "1920x1080", "16:9", "250", "20000:1", "16,7",
                        "60", "5", "DVB-T, DVB-C", "200", "-", "30000", "Да", "100", "2х8",
                        "", "1", "2", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (AVI, MP4, TS, TRP, MKV, MOV, MPG, " +
                                "DAT, VOB, RM, RMVB, MP3, WMA, M4A, AAC, JPG, JPEG, " +
                                "BMP, PNG)"};
                image = R.mipmap.tv_led40kf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40kf/";
                break;
            case "TV LED40P New":
                arr_descriptions = new String[]{"40", "178", "-", "-", "-", "-", "-",
                        "1920x1080", "16:9", "500", "50000:1", "16,7",
                        "60", "5", "-", "200", "-", "150000", "Да", "-", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, " +
                                "rmvb, mp3, wma, m4a, aac, jpg, jpeg," +
                                " bmp, png)"};
                image = R.mipmap.tv_led40p_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40p_new/";
                break;
            case "TV LED40D":
                arr_descriptions = new String[]{"40", "178", "-", "-", "-", "-",
                        "-", "1920x1080", "16:9", "500", "50000:1", "16,7",
                        "60", "5", "-", "199", "-", "150000", "Да", "-", "2х5",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, " +
                                "jpeg, bmp, png)"};
                image = R.mipmap.tv_led40d;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40d/";
                break;
            case "TV LED40FHD300U":
                arr_descriptions = new String[]{"40", "-", "-", "-", "-", "-",
                        "-", "1920x1080", "16:9", "500", "50000:1", "16,7",
                        "60", "5", "-", "-", "-", "150000", "Да", "80", "2х10",
                        "", "1", "3", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (AVI, MP4, TS, TRP, MKV, MOV, MPG, DAT, VOB, RM, " +
                                "RMVB, MP3, WMA, M4A, AAC, JPG, " +
                                "JPEG, BMP, PNG)"};
                image = R.mipmap.tv_led40fhd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led40fhd300u/";
                break;
            case "TV LED32HD900UST2":
                arr_descriptions = new String[]{"32", "176", "Да", "512мб",
                        "1", "Android 4.4", "Да", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "6,5", "DVB-T2", "99",
                        "1600", "150000", "Да", "-", "2х10",
                        "", "3", "1", "1", "1", "1", "1", "1", "-", "1", "-", "1", "-", "1", "-", "1", "-",
                        "Поддержка: movie HD (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg," +
                                " jpeg, bmp, png)"};
                image = R.mipmap.tv_led32hd900ust2;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd900ust2/";
                break;
            case "TV LED32HD900US":
                arr_descriptions = new String[]{"32", "176", "Да", "512мб",
                        "1", "Android 4.4", "Да", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "6,5", "-", "200",
                        "-", "150000", "Да", "-", "2х10",
                        "", "3", "2", "-", "1", "1", "1", "-", "-", "1", "-", "1", "-", "1", "-", "1", "1",
                        "Поддержка: movie HD (avi, mp4, ts, trp, mkv, mov, mpg," +
                                " dat, vob, rm, rmvb,mp3, wma, m4a, aac, " +
                                "jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32hd900us;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd900us/";
                break;
            case "TV LED32HD800UT2":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "DVB-T2", "200",
                        "1000", "150000", "Да", "45", "2х10",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov,mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg," +
                                " jpeg)"};
                image = R.mipmap.tv_led32hd800ut2;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd800ut2/";
                break;
            case "TV LED32HD500U":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "6,5", "-", "199", "-",
                        "150000", "Да", "60", "2х10",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, " +
                                "rmvb, mp3, wma, m4a, aac, ac3, jpg, " +
                                "jpeg, bmp, png) + подсветка"};
                image = R.mipmap.tv_led32hd500u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd500u/";
                break;
            case "TV LED32HD800U":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "200", "-",
                        "150000", "Да", "45", "2х8",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov,mpg, " +
                                "dat, vob, rm, rmvb, mp3, wma," +
                                " m4a, aac, jpg, jpeg)"};
                image = R.mipmap.tv_led32hd800u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd800u/";
                break;
            case "TV LED32HD200U":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "199", "-",
                        "150000", "Да", "56", "2х8",
                        "", "2", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg," +
                                " jpeg, bmp, png) + Гнездо для наушников"};
                image = R.mipmap.tv_led32hd200u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd200u/";
                break;
            case "TV LED32NF":
                arr_descriptions = new String[]{
                        "32", "186", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "3,7", "DVB-T2/C",
                        "199", "-", "150000", "Да", "56", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32nf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32nf/";
                break;
            case "TV LED32T":
                arr_descriptions = new String[]{
                        "32", "178", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "270", "3000:1", "16,7", "60", "6,5", "-", "199",
                        "-", "30000", "Да", "-", "2х5",
                        "", "1", "1", "-", "-", "1", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (AVI, MKV, MP4,3GPP, VOB, PS, TS, RM, RMVB," +
                                " DAT, Xvid, H.264, MPEG1, MPEG2," +
                                " MPEG4, RMVB, DAT, DIVX MP3, WMA , AAC," +
                                " JPG, JPEG, BMP, PNG)"};
                image = R.mipmap.tv_led32t;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32t/";
                break;
            case "TV LED32 O Black":
                arr_descriptions = new String[]{
                        "32", "178", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "60000:1", "16,7", "60", "5", "-", "200", "-",
                        "150000", "Да", "60", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, " +
                                "rmvb, mp3, wma, m4a, aac," +
                                " jpg,jpeg, bmp, png)"};
                image = R.mipmap.tv_led32_o_black;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32_o_black/";
                break;
            case "TV LED32OF":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "199", "-",
                        "150000", "Да", "-", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg," +
                                " jpeg, bmp, png)"};
                image = R.mipmap.tv_led32of;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32of/";
                break;
            case "TV LED32HD100U":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "199", "-",
                        "150000", "Да", "-", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32hd100u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd100u/";
                break;
            case "TV LED32A New":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "5", "-",
                        "200", "-", "150000", "Да", "-", "-",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, " +
                                "aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32a_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32a_new/";
                break;
            case "TV LED32HD400U":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "199",
                        "-", "150000", "Да", "-", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob," +
                                " rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32hd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32hd400u/";
                break;
            case "TV LED32K New":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "40000:1", "16,7", "60", "8", "-", "199",
                        "-", "150000", "Да", "60", "2х8",
                        "", "2", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32k_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32k_new/";
                break;
            case "TV LED32 O Silver":
                arr_descriptions = new String[]{
                        "32", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "60000:1", "16,7", "60", "5", "-", "200",
                        "-", "150000", "Да", "60", "2х8",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob," +
                                " rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led32_o_silver;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led32_o_silver/";
                break;
            case "TV LED29HD100U":
                arr_descriptions = new String[]{
                        "29", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "30000:1", "16,7", "60", "5", "-", "200", "-",
                        "150000", "Да", "-", "2х10",
                        "", "1", "2", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, " +
                                "vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led29hd100u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led29hd100u/";
                break;
            case "TV LED29HD400U":
                arr_descriptions = new String[]{
                        "29", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "50000:1", "16,7", "60", "6,5", "-", "-", "-",
                        "150000", "Да", "40", "2х10",
                        "", "1", "2", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led29hd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led29hd400u/";
                break;
            case "TV LED29HD300U":
                arr_descriptions = new String[]{
                        "29", "176", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "450", "30000:1", "16,7", "60", "5", "-", "-", "-",
                        "150000", "Да", "40", "2х5",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob," +
                                " rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led29hd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led29hd300u/";
                break;
            case "TV LED293":
                arr_descriptions = new String[]{
                        "29", "178", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "300", "30000:1", "16,7", "60", "5", "-", "-",
                        "-", "150000", "Да", "40", "2х5",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb, mp3," +
                                " wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led293;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led293/";
                break;
            case "TV LED291":
                arr_descriptions = new String[]{
                        "29", "178", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "300", "30000:1", "16,7", "60", "5", "-", "199", "-",
                        "150000", "Да", "40", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb, mp3, " +
                                "wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led291;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led291/";
                break;
            case "TV LED24HD300U":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "400", "20000:1", "16,7", "60", "6,5", "-", "199", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb," +
                                " mp3, wma, m4a, aac, ac3, jpg, jpeg, bmp, png) + подсветка"};
                image = R.mipmap.tv_led24hd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24hd300u/";
                break;
            case "TV LED24 PF":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "220", "1000:1", "16,7", "60", "5", "DVB-T2", "-", "-", "150000",
                        "Да", "35", "2х3",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "1", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm, rmvb," +
                                " mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led24_pf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24_pf/";
                break;
            case "TV LED24K New":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "400", "20000:1", "16,7", "60", "5", "-", "-", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led24k_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24k_new/";
                break;
            case "TV LED24FHD100U":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "400", "20000:1", "16,7", "60", "8", "-", "-", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led24fhd100u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24fhd100u/";
                break;
            case "TV LED24A NEW":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "400", "20000:1", "16,7", "60", "3,5", "-", "200",
                        "-", "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, " +
                                "vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led24a_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24a_new/";
                break;
            case "TV LED24FHD300U":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "400", "20000:1", "16,7", "60", "5", "-", "-", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob," +
                                " rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led24fhd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24fhd300u/";
                break;
            case "TV LED24HD500U":
                arr_descriptions = new String[]{
                        "24", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "400", "20000:1", "16,7", "60", "5", "-", "100", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "2", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg," +
                                " dat, vob, rm, rmvb, mp3, wma, m4a, aac, ac3, jpg," +
                                " jpeg, bmp, png) + подсветка"};
                image = R.mipmap.tv_led24hd500u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led24hd500u/";
                break;
            case "TV LED22FHD400U":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "-", "-", "150000",
                        "Да", "35", "2х3",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22fhd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22fhd400u/";
                break;
            case "TV LED22A NEW":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "200", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22a_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22a_new/";
                break;
            case "TV LED22 PF":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "220", "1000:1", "16,7", "60", "5", "DVB T2", "200",
                        "-", "150000", "Да", "35", "2х3",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "1", "1", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22_pf;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22_pf/";
                break;
            case "TV LED22K New":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "200",
                        "-", "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22k_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22k_new/";
                break;
            case "TV LED22FHD300U":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "5", "-",
                        "-", "-", "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, " +
                                "dat, vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22fhd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22fhd300u/";
                break;
            case "TV LED22FHD500U":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "3.7", "-",
                        "100", "-", "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: movie HD (avi, mp4, ts, trp, mkv, mov, mpg," +
                                " dat, vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22fhd500u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22fhd500u/";
                break;
            case "TV LED22FHD200U":
                arr_descriptions = new String[]{
                        "22", "170", "-", "-", "-", "-", "-", "1920x1080", "16:9",
                        "350", "10000:1", "16,7", "60", "5", "-", "199",
                        "-", "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, " +
                                "dat, vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led22fhd200u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led22fhd200u/";
                break;
            case "TV LED19HD300U":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "5", "-", "-", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "1", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob," +
                                " rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19hd300u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19hd300u/";
                break;
            case "TV LED19HD400U":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "100", "" +
                        "-", "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac," +
                                " jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19hd400u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19hd400u/";
                break;
            case "TV LED19HD500U":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,5", "-", "200", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "1", "-", "1", "1", "1", "1", "-", "-", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg,¶bmp, png)"};
                image = R.mipmap.tv_led19hd500u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19hd500u/";
                break;
            case "TV LED19HD200U":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,5", "-", "200", "-",
                        "150000", "Да", "35", "2х5",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19hd200u;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19hd200u/";
                break;
            case "TV LED19K New":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "200", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat," +
                                " vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19k_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19k_new/";
                break;
            case "TV LED19P New":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "200", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, " +
                                "vob, rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19p_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19p_new/";
                break;
            case "TV LED19A NEW":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "350", "10000:1", "16,7", "60", "3,7", "-", "200",
                        "-", "150000", "Да", "35", "2х3",
                        "", "1", "3", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, " +
                                "rm, rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19a_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19a_new/";
                break;
            case "TV LED19 P":
                arr_descriptions = new String[]{
                        "19", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "250", "1000:1", "16,7", "60", "5", "DVB-T2", "200", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led19_p;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led19_p/";
                break;
            case "TV LED15A NEW":
                arr_descriptions = new String[]{
                        "15", "170", "-", "-", "-", "-", "-", "1366x768", "16:9",
                        "250", "8000:1", "16,7", "60", "6", "-", "200", "-",
                        "150000", "Да", "35", "2х3",
                        "", "1", "1", "1", "1", "1", "1", "1", "-", "1", "-", "-", "-", "-", "-", "-", "-",
                        "Поддержка: (avi, mp4, ts, trp, mkv, mov, mpg, dat, vob, rm," +
                                " rmvb, mp3, wma, m4a, aac, jpg, jpeg, bmp, png)"};
                image = R.mipmap.tv_led15a_new;
                url_goods = "http://saturn.ua/ru/catalog/multimedia/led_televizory/saturn_tv_led15a_new/";
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
