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
public class Multimedia {


    private String[] arr_category;
    private int id_arr;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;
    private String url_goods;


    public Multimedia(String[] arr_category, int id_arr) {
        this.arr_category = arr_category;
        this.id_arr = id_arr;

        result();

    }

    private void result() {

        if (Arrays.equals(arr_category, NAME_ARR_DVD_ALL)) {
            arr_naming = new String[]{"Мощность, Вт:", "Разъемы:", "Прогрессивное сканирование:",
                    "Совместимый с форматами дисков:", "AудиоВыходы:"};
            switch (arr_category[id_arr]) {
                case "ST-DV7724":
                    arr_descriptions = new String[]{"25", "USB 2.0, SCART", "Да",
                            "DivX, DVD, DVD+/-RW, VCD, CD, MP3, MPEG4, WMA, Kodak CD",
                            "2.1, Coaxial, Optical"};
                    image = R.mipmap.dvd_st_dv7724;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/dvd_proigryvateli/saturn_st_dv7724/";
                    break;
                case "ST-DV7704":
                    arr_descriptions = new String[]{"25", "USB 2.0, SCART", "Да",
                            "DivX, DVD, DVD+/-RW, VCD, CD, MP3, MPEG4, WMA, Kodak CD",
                            "2.1, Coaxial, Optical"};
                    image = R.mipmap.dvd_st_dv7704;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/dvd_proigryvateli/saturn_st_dv7704/";
                    break;
                case "ST-DV7707":
                    arr_descriptions = new String[]{"25", "USB 2.0, SCART", "Да",
                            "DivX, DVD, DVD+/-RW, VCD, CD, MP3, MPEG4, Kodak CD",
                            "2.1, Coaxial, Optical"};
                    image = R.mipmap.dvd_st_dv7707;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/dvd_proigryvateli/saturn_st_dv7707/";
                    break;
                case "ST-DV7731":
                    arr_descriptions = new String[]{"15", "USB 2.0, SCART", "Да",
                            "DIVX/MPEG 4/DVD, DVD-/+R, DVD-/+RW, VCD, SVCD, CD, CD-R," +
                                    " CD-RW, Kodak CD", "2.0, Coaxial, Optical"};
                    image = R.mipmap.dvd_st_dv7731;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/dvd_proigryvateli/saturn_st_dv7731/";
                    break;
                case "ST-DV7705":
                    arr_descriptions = new String[]{"25", "USB 2.0, SCART; HDMI", "Да",
                            "DivX, DVD, DVD+/-RW, VCD, CD, MP3, MPEG4, WMA, JPG, Kodak CD",
                            "5.1, Coaxial, Optical"};
                    image = R.mipmap.dvd_st_dv7705;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/dvd_proigryvateli/saturn_st_dv7705/";
                    break;
                default:
                    break;
            }
        } else if (Arrays.equals(arr_category, NAME_ARR_VIDEO_RECORDER_ALL)) {
            arr_naming = new String[]{
                    "Диагональ экрана, дюймов:", "Аккумулятор, мАч:", "Разрешение видео:",
                    "Количество камер записи:", "Угол обзора:", "Формат записи видео:",
                    "Частота видео, кадров/сек:", "Съемка фото:",
                    "Подсветка для записи в ночное время:", "Цикличная запись:",
                    "Поддержка карт памяти:", "Детекторы движения:", "Запись звука:",
                    "Сенсор:", "Вращение дисплея:", "Гарантия"};
            switch (arr_category[id_arr]) {

                case "ST-VDR0001":
                    arr_descriptions = new String[]{
                            "2", "800", "1280х720", "1", "120", "AVI", "30", "Да", "Да", "Да",
                            "TF до 32 Гб", "Да", "Да", "СMOS, 1 MP", "Да", "2 года"};
                    image = R.mipmap.video_recorder_st_vdr0001;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/videoregistratory/saturn_st_vdr0009/";
                    break;
                case "ST-VDR0002":
                    arr_descriptions = new String[]{
                            "2", "520", "1280х720", "1", "120", "AVI", "30", "Да", "Да", "Да",
                            "TF до 32 Гб", "Да", "Да", "СMOS, 1 MP", "-", "2 года"};
                    image = R.mipmap.video_recorder_st_vdr0002;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/videoregistratory/saturn_st_vdr0002/";
                    break;
                case "ST-VDR0009":
                    arr_descriptions = new String[]{
                            "2", "1200", "1920х1080", "1", "120", "MOV, H.264", "30", "Да", "Да", "Да",
                            "TF до 32 Гб", "Да", "Да", "СMOS, 3 MP", "-", "2 года"};
                    image = R.mipmap.video_recorder_st_vdr0009;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/videoregistratory/saturn_st_vdr0001/";
                    break;

                default:
                    break;
            }
        } else if (Arrays.equals(arr_category, NAME_ARR_FASTENING_ALL)) {
            arr_naming = new String[]{
                    "Совместимость диагоналей:", "VESA, мм:", "Материал корпуса:",
                    "Максимальная нагрузка, кг:", "Вращение в лево/право:", "Регулировка наклона:"};
            switch (arr_category[id_arr]) {

                case "ST-TWM1012":
                    arr_descriptions = new String[]{
                            "10 - 37", "200х200", "твердая сталь", "25", "Да", "Да"};
                    image = R.mipmap.fastening_st_twm1012;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1012/";
                    break;
                case "ST-TWM1013":
                    arr_descriptions = new String[]{
                            "14 - 42", "200х200", "твердая сталь", "25", "Да", "Да"};
                    image = R.mipmap.fastening_st_twm1013;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1013/";
                    break;
                case "ST-TWM1017":
                    arr_descriptions = new String[]{
                            "32 - 65", "600х400", "твердая сталь", "40", "-", "Да"};
                    image = R.mipmap.fastening_st_twm1017;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1017/";
                    break;
                case "ST-TWM1015":
                    arr_descriptions = new String[]{
                            "32 - 50", "400х400", "твердая сталь", "40", "-", "Да"};
                    image = R.mipmap.fastening_st_twm1015;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1015/";
                    break;
                case "ST-TWM1016":
                    arr_descriptions = new String[]{
                            "32 - 65", "600х400", "твердая сталь", "40", "-", "-"};
                    image = R.mipmap.fastening_st_twm1016;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1016/";
                    break;
                case "ST-TWM1014":
                    arr_descriptions = new String[]{
                            "32 - 50", "400х400", "твердая сталь", "40", "-", "-"};
                    image = R.mipmap.fastening_st_twm1014;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1014/";
                    break;
                case "ST-TWM1011":
                    arr_descriptions = new String[]{
                            "10 - 32", "200х100", "твердая сталь", "25", "-", "-"};
                    image = R.mipmap.fastening_st_twm1011;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1011/";
                    break;
                case "ST-TWM1010":
                    arr_descriptions = new String[]{
                            "10 - 24", "100х100", "твердая сталь", "25", "-", "-"};
                    image = R.mipmap.fastening_st_twm1010;
                    url_goods = "http://saturn.ua/ru/catalog/multimedia/krepleniya_pod_televizory/saturn_st_twm1010/";
                    break;
                default:
                    break;


            }
        } else {
            //NAME_ARR_MEDIA_PLAYER_ALL
            arr_naming = new String[]{
                    "Внутренняя память, Гб:", "Оперативная память:", "Частота процессора, Ггц:",
                    "ОС, версия:", "Wi-Fi (b/g/n):", "Процессор:", "Карты памяти:", "Интерфейс:",
                    "Аксессуары:", "Файловая система:", "Поддерживаемые форматы: кодеки:"};
            arr_descriptions = new String[]{
                    "4", "1Gb", "1", "Android 4.0", "Да", "Cortex A8", "SD, SDHC, MMC",
                    "USB 2.0 х 3 / USB 2.0 OTG х 1 / Card Reader " +
                            "(макс. 32 Гб) х 1 / WI-FI: IEEE 802.11 b/g/n / " +
                            "LAN Интернет: RJ45 (10/100Mbps) / HDMI 1.3 / Композитный AV / DC",
                    "Адаптер питания, Пульт ДУ, Композитный AV-кабель, HDMI кабель",
                    "FAT16, FAT32, NTFS",
                    "AVI, DAT, DIVX, FLV, Google VP8, H.263, H.264, IFO, MKV, MOV, MPG, MP4, " +
                            "MPEG1/2/4, REAL Media, RM, RMVB, Sorenson Spark, VOB, WMV, WMV9, " +
                            "XVID; 3D-видео: TS, M2TS; аудио: AAC, AC3, FLAC, LPCM, MP3, WAV, WMA," +
                            "OGG; изображения: JPEG, BMP, PNG, GIF; субтитры: IDX + SUB, SMI, SRT," +
                            "SSA, SUB"};
            image = R.mipmap.media_player_tv_mphdi_01_3d;
            url_goods = "http://saturn.ua/ru/catalog/multimedia/mediapleery/saturn_tv_mphdi_01_3d/";


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
