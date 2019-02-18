package com.ukraine.saturn.saturntv.magazine.function;

import com.ukraine.saturn.saturntv.magazine.function.goods.Air_grill_and_Blinnitsa_and_Yogurt;
import com.ukraine.saturn.saturntv.magazine.function.goods.Android;
import com.ukraine.saturn.saturntv.magazine.function.goods.Barbecue_and_Electric_plate;
import com.ukraine.saturn.saturntv.magazine.function.goods.Blender_in;
import com.ukraine.saturn.saturntv.magazine.function.goods.Blender_out_and_Gas_plate;
import com.ukraine.saturn.saturntv.magazine.function.goods.Car_cutting_and_Curling;
import com.ukraine.saturn.saturntv.magazine.function.goods.Clean;
import com.ukraine.saturn.saturntv.magazine.function.goods.Coffee_grinder_and_Omelette;
import com.ukraine.saturn.saturntv.magazine.function.goods.Coffee_maker_and_Bowlerway;
import com.ukraine.saturn.saturntv.magazine.function.goods.Cold_camera_and_Lari;
import com.ukraine.saturn.saturntv.magazine.function.goods.Conditioners;
import com.ukraine.saturn.saturntv.magazine.function.goods.Convection;
import com.ukraine.saturn.saturntv.magazine.function.goods.Electric_bake;
import com.ukraine.saturn.saturntv.magazine.function.goods.Fan_and_Infrared;
import com.ukraine.saturn.saturntv.magazine.function.goods.Fri_and_Electric_Grill_and_Drill;
import com.ukraine.saturn.saturntv.magazine.function.goods.Fridge;
import com.ukraine.saturn.saturntv.magazine.function.goods.Hair_dryer;
import com.ukraine.saturn.saturntv.magazine.function.goods.Hair_straightener_and_Massage_water_and_Trimmer_and_Epilator;
import com.ukraine.saturn.saturntv.magazine.function.goods.Heat_fan;
import com.ukraine.saturn.saturntv.magazine.function.goods.Heater;
import com.ukraine.saturn.saturntv.magazine.function.goods.Iron;
import com.ukraine.saturn.saturntv.magazine.function.goods.Juice_and_Nut;
import com.ukraine.saturn.saturntv.magazine.function.goods.Kettle;
import com.ukraine.saturn.saturntv.magazine.function.goods.Kitchen_scales;
import com.ukraine.saturn.saturntv.magazine.function.goods.Kitchen_stove_and_Ice_cream;
import com.ukraine.saturn.saturntv.magazine.function.goods.Meat_and_chopper;
import com.ukraine.saturn.saturntv.magazine.function.goods.Microwave_and_Sandwich;
import com.ukraine.saturn.saturntv.magazine.function.goods.Multi_food;
import com.ukraine.saturn.saturntv.magazine.function.goods.Multimedia;
import com.ukraine.saturn.saturntv.magazine.function.goods.Processor_and_Mixer;
import com.ukraine.saturn.saturntv.magazine.function.goods.Scales;
import com.ukraine.saturn.saturntv.magazine.function.goods.Shavers_and_Massager;
import com.ukraine.saturn.saturntv.magazine.function.goods.Steamer;
import com.ukraine.saturn.saturntv.magazine.function.goods.Thermopot_and_Bread;
import com.ukraine.saturn.saturntv.magazine.function.goods.Toaster_and_Potatoes;
import com.ukraine.saturn.saturntv.magazine.function.goods.Tv;
import com.ukraine.saturn.saturntv.magazine.function.goods.Washing_car_and_Auto;
import com.ukraine.saturn.saturntv.magazine.function.goods.Water_air;
import com.ukraine.saturn.saturntv.magazine.function.goods.Water_iron_and_Car_cloth;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_AIR_GRILL;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BARBECUE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BLENDER_IN;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BLENDER_OUT;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BLINNITSA;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BOWLERWAY;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_BREAD;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CAR_CLOTH;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CAR_CUTTING;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CHOPPER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CLEAN;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_COFFEE_GRINDER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_COFFEE_MAKER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_COLD_CAMERA;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_COLD_LARI;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CONDITIONERS;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CONVECTION;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_CURLING;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_DVD;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_ELECTRIC_BAKE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_ELECTRIC_DRILL;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_ELECTRIC_GRILL;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_ELECTRIC_PLATE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_EPILATOR;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_FAN;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_FASTENING;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_FRI;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_FRIDGE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_GAS_PLATE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_HAIR_DRYER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_HAIR_STRAIGHTENER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_HEATER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_HEAT_FAN;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_ICE_CREAM;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_INFRARED;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_IRON;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_JUICE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_KETTLE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_KITCHEN_SCALES;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_KITCHEN_STOVE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MASSAGER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MASSAGE_WATER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MEAT;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MEDIA_PLAYER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MICROWAVE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MIXER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_MULTI_FOOD;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_NUT;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_OMELETTE;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_POTATOES;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_PROCESSOR;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_SANDWICH;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_SCALES;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_SHAVERS;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_STEAMER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_TABLET;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_THERMOPOT;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_TOASTER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_TRIMMER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_TV;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_VIDEO_RECORDER;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_WASHING_AUTO;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_WASHING_CAR;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_WATER_AIR;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_WATER_IRON;
import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.CHOICE_CONTEXT_YOGURT;

/** class linking product categories for the third active screen */

public class MainGetGoods {

    private String url_Goods;
    private String[] arr_category;
    private int id_arr;
    private int id_category;

    private String[] arr_naming;
    private String[] arr_descriptions;
    private int image;


    public MainGetGoods(String[] arr, int idArr, int id_choice_category) {
        arr_category = arr;
        id_arr = idArr;
        id_category = id_choice_category;

        choiceCategoryGoods();

    }

    private void choiceCategoryGoods() {

        switch (id_category) {
            case CHOICE_CONTEXT_TABLET:
                Android android = new Android(arr_category, id_arr);
                arr_naming = android.getArr_naming();
                arr_descriptions = android.getArr_descriptions();
                image = android.getImage();
                url_Goods = android.getUrl_goods();
                break;
            case CHOICE_CONTEXT_FAN:
            case CHOICE_CONTEXT_INFRARED:
                Fan_and_Infrared fan_and_infrared = new Fan_and_Infrared(arr_category, id_arr);
                arr_naming = fan_and_infrared.getArr_naming();
                arr_descriptions = fan_and_infrared.getArr_descriptions();
                image = fan_and_infrared.getImage();
                url_Goods = fan_and_infrared.getUrl_goods();
                break;
            case CHOICE_CONTEXT_CONVECTION:
                Convection convection = new Convection(arr_category, id_arr);
                arr_naming = convection.getArr_naming();
                arr_descriptions = convection.getArr_descriptions();
                image = convection.getImage();
                url_Goods = convection.getUrl_goods();
                break;
            case CHOICE_CONTEXT_CONDITIONERS:
                Conditioners conditioners = new Conditioners(arr_category, id_arr);
                arr_naming = conditioners.getArr_naming();
                arr_descriptions = conditioners.getArr_descriptions();
                image = conditioners.getImage();
                url_Goods = conditioners.getUrl_goods();
                break;
            case CHOICE_CONTEXT_HEATER:
                Heater heater = new Heater(arr_category, id_arr);
                arr_naming = heater.getArr_naming();
                arr_descriptions = heater.getArr_descriptions();
                image = heater.getImage();
                url_Goods = heater.getUrl_goods();
                break;
            case CHOICE_CONTEXT_HEAT_FAN:
                Heat_fan heat_fan = new Heat_fan(arr_category, id_arr);
                arr_naming = heat_fan.getArr_naming();
                arr_descriptions = heat_fan.getArr_descriptions();
                image = heat_fan.getImage();
                url_Goods = heat_fan.getUrl_goods();
                break;
            case CHOICE_CONTEXT_IRON:
                Iron iron = new Iron(arr_category, id_arr);
                arr_naming = iron.getArr_naming();
                arr_descriptions = iron.getArr_descriptions();
                image = iron.getImage();
                url_Goods = iron.getUrl_goods();
                break;
            case CHOICE_CONTEXT_WATER_IRON:
            case CHOICE_CONTEXT_CAR_CLOTH:
                Water_iron_and_Car_cloth water_iron_and_car_cloth = new
                        Water_iron_and_Car_cloth(arr_category, id_arr);
                arr_naming = water_iron_and_car_cloth.getArr_naming();
                arr_descriptions = water_iron_and_car_cloth.getArr_descriptions();
                image = water_iron_and_car_cloth.getImage();
                url_Goods = water_iron_and_car_cloth.getUrl_goods();
                break;
            case CHOICE_CONTEXT_FRIDGE:
                Fridge fridge = new Fridge(arr_category, id_arr);
                arr_naming = fridge.getArr_naming();
                arr_descriptions = fridge.getArr_descriptions();
                image = fridge.getImage();
                url_Goods = fridge.getUrl_goods();
                break;
            case CHOICE_CONTEXT_COLD_CAMERA:
            case CHOICE_CONTEXT_COLD_LARI:
                Cold_camera_and_Lari cold_camera_and_lari = new
                        Cold_camera_and_Lari(arr_category, id_arr);
                arr_naming = cold_camera_and_lari.getArr_naming();
                arr_descriptions = cold_camera_and_lari.getArr_descriptions();
                image = cold_camera_and_lari.getImage();
                url_Goods = cold_camera_and_lari.getUrl_goods();
                break;
            case CHOICE_CONTEXT_CLEAN:
                Clean clean = new Clean(arr_category, id_arr);
                arr_naming = clean.getArr_naming();
                arr_descriptions = clean.getArr_descriptions();
                image = clean.getImage();
                url_Goods = clean.getUrl_goods();
                break;
            case CHOICE_CONTEXT_WATER_AIR:
                Water_air water_air = new Water_air(arr_category, id_arr);
                arr_naming = water_air.getArr_naming();
                arr_descriptions = water_air.getArr_descriptions();
                image = water_air.getImage();
                url_Goods = water_air.getUrl_goods();
                break;
            case CHOICE_CONTEXT_DVD:
            case CHOICE_CONTEXT_VIDEO_RECORDER:
            case CHOICE_CONTEXT_FASTENING:
            case CHOICE_CONTEXT_MEDIA_PLAYER:
                Multimedia multimedia = new Multimedia(arr_category, id_arr);
                arr_naming = multimedia.getArr_naming();
                arr_descriptions = multimedia.getArr_descriptions();
                image = multimedia.getImage();
                url_Goods = multimedia.getUrl_goods();
                break;
            case CHOICE_CONTEXT_WASHING_CAR:
            case CHOICE_CONTEXT_WASHING_AUTO:
                Washing_car_and_Auto washing_car_and_auto = new
                        Washing_car_and_Auto(arr_category, id_arr);
                arr_naming = washing_car_and_auto.getArr_naming();
                arr_descriptions = washing_car_and_auto.getArr_descriptions();
                image = washing_car_and_auto.getImage();
                url_Goods = washing_car_and_auto.getUrl_goods();
                break;
            case CHOICE_CONTEXT_SHAVERS:
            case CHOICE_CONTEXT_MASSAGER:
                Shavers_and_Massager shavers_and_massager = new
                        Shavers_and_Massager(arr_category, id_arr);
                arr_naming = shavers_and_massager.getArr_naming();
                arr_descriptions = shavers_and_massager.getArr_descriptions();
                image = shavers_and_massager.getImage();
                url_Goods = shavers_and_massager.getUrl_goods();
                break;
            case CHOICE_CONTEXT_CAR_CUTTING:
            case CHOICE_CONTEXT_CURLING:
                Car_cutting_and_Curling car_cutting_and_curling = new
                        Car_cutting_and_Curling(arr_category, id_arr);
                arr_naming = car_cutting_and_curling.getArr_naming();
                arr_descriptions = car_cutting_and_curling.getArr_descriptions();
                image = car_cutting_and_curling.getImage();
                url_Goods = car_cutting_and_curling.getUrl_goods();
                break;
            case CHOICE_CONTEXT_HAIR_DRYER:
                Hair_dryer hair_dryer = new Hair_dryer(arr_category, id_arr);
                arr_naming = hair_dryer.getArr_naming();
                arr_descriptions = hair_dryer.getArr_descriptions();
                image = hair_dryer.getImage();
                url_Goods = hair_dryer.getUrl_goods();
                break;
            case CHOICE_CONTEXT_HAIR_STRAIGHTENER:
            case CHOICE_CONTEXT_MASSAGE_WATER:
            case CHOICE_CONTEXT_TRIMMER:
            case CHOICE_CONTEXT_EPILATOR:
                Hair_straightener_and_Massage_water_and_Trimmer_and_Epilator epilator = new
                        Hair_straightener_and_Massage_water_and_Trimmer_and_Epilator(arr_category, id_arr);
                arr_naming = epilator.getArr_naming();
                arr_descriptions = epilator.getArr_descriptions();
                image = epilator.getImage();
                url_Goods = epilator.getUrl_goods();
                break;
            case CHOICE_CONTEXT_SCALES:
                Scales scales = new Scales(arr_category, id_arr);
                arr_naming = scales.getArr_naming();
                arr_descriptions = scales.getArr_descriptions();
                image = scales.getImage();
                url_Goods = scales.getUrl_goods();
                break;
            case CHOICE_CONTEXT_AIR_GRILL:
            case CHOICE_CONTEXT_BLINNITSA:
            case CHOICE_CONTEXT_YOGURT:
                Air_grill_and_Blinnitsa_and_Yogurt air_grill_and_blinnitsa_and_yogurt = new
                        Air_grill_and_Blinnitsa_and_Yogurt(arr_category, id_arr);
                arr_naming = air_grill_and_blinnitsa_and_yogurt.getArr_naming();
                arr_descriptions = air_grill_and_blinnitsa_and_yogurt.getArr_descriptions();
                image = air_grill_and_blinnitsa_and_yogurt.getImage();
                url_Goods = air_grill_and_blinnitsa_and_yogurt.getUrl_goods();
                break;
            case CHOICE_CONTEXT_KITCHEN_SCALES:
                Kitchen_scales kitchen_scales = new Kitchen_scales(arr_category, id_arr);
                arr_naming = kitchen_scales.getArr_naming();
                arr_descriptions = kitchen_scales.getArr_descriptions();
                image = kitchen_scales.getImage();
                url_Goods = kitchen_scales.getUrl_goods();
                break;
            case CHOICE_CONTEXT_MICROWAVE:
            case CHOICE_CONTEXT_SANDWICH:
                Microwave_and_Sandwich microwave_and_sandwich = new
                        Microwave_and_Sandwich(arr_category, id_arr);
                arr_naming = microwave_and_sandwich.getArr_naming();
                arr_descriptions = microwave_and_sandwich.getArr_descriptions();
                image = microwave_and_sandwich.getImage();
                url_Goods = microwave_and_sandwich.getUrl_goods();
                break;
            case CHOICE_CONTEXT_STEAMER:
                Steamer steamer = new Steamer(arr_category, id_arr);
                arr_naming = steamer.getArr_naming();
                arr_descriptions = steamer.getArr_descriptions();
                image = steamer.getImage();
                url_Goods = steamer.getUrl_goods();
                break;
            case CHOICE_CONTEXT_THERMOPOT:
            case CHOICE_CONTEXT_BREAD:
                Thermopot_and_Bread thermopot_and_bread = new
                        Thermopot_and_Bread(arr_category, id_arr);
                arr_naming = thermopot_and_bread.getArr_naming();
                arr_descriptions = thermopot_and_bread.getArr_descriptions();
                image = thermopot_and_bread.getImage();
                url_Goods = thermopot_and_bread.getUrl_goods();
                break;
            case CHOICE_CONTEXT_CHOPPER:
            case CHOICE_CONTEXT_MEAT:
                Meat_and_chopper meat_and_chopper = new Meat_and_chopper(arr_category, id_arr);
                arr_naming = meat_and_chopper.getArr_naming();
                arr_descriptions = meat_and_chopper.getArr_descriptions();
                image = meat_and_chopper.getImage();
                url_Goods = meat_and_chopper.getUrl_goods();
                break;
            case CHOICE_CONTEXT_KETTLE:
                Kettle kettle = new Kettle(arr_category, id_arr);
                arr_naming = kettle.getArr_naming();
                arr_descriptions = kettle.getArr_descriptions();
                image = kettle.getImage();
                url_Goods = kettle.getUrl_goods();
                break;
            case CHOICE_CONTEXT_BLENDER_IN:
                Blender_in blender_in = new Blender_in(arr_category, id_arr);
                arr_naming = blender_in.getArr_naming();
                arr_descriptions = blender_in.getArr_descriptions();
                image = blender_in.getImage();
                url_Goods = blender_in.getUrl_goods();
                break;
            case CHOICE_CONTEXT_BOWLERWAY:
            case CHOICE_CONTEXT_COFFEE_MAKER:
                Coffee_maker_and_Bowlerway coffee_maker_and_bowlerway = new
                        Coffee_maker_and_Bowlerway(arr_category, id_arr);
                arr_naming = coffee_maker_and_bowlerway.getArr_naming();
                arr_descriptions = coffee_maker_and_bowlerway.getArr_descriptions();
                image = coffee_maker_and_bowlerway.getImage();
                url_Goods = coffee_maker_and_bowlerway.getUrl_goods();
                break;
            case CHOICE_CONTEXT_PROCESSOR:
            case CHOICE_CONTEXT_MIXER:
                Processor_and_Mixer processor_and_mixer = new
                        Processor_and_Mixer(arr_category, id_arr);
                arr_naming = processor_and_mixer.getArr_naming();
                arr_descriptions = processor_and_mixer.getArr_descriptions();
                image = processor_and_mixer.getImage();
                url_Goods = processor_and_mixer.getUrl_goods();
                break;
            case CHOICE_CONTEXT_MULTI_FOOD:
                Multi_food multi_food = new Multi_food(arr_category, id_arr);
                arr_naming = multi_food.getArr_naming();
                arr_descriptions = multi_food.getArr_descriptions();
                image = multi_food.getImage();
                url_Goods =multi_food.getUrl_goods();
                break;
            case CHOICE_CONTEXT_ELECTRIC_BAKE:
                Electric_bake electric_bake = new Electric_bake(arr_category, id_arr);
                arr_naming = electric_bake.getArr_naming();
                arr_descriptions = electric_bake.getArr_descriptions();
                image = electric_bake.getImage();
                url_Goods = electric_bake.getUrl_goods();
                break;
            case CHOICE_CONTEXT_TOASTER:
            case CHOICE_CONTEXT_POTATOES:
                Toaster_and_Potatoes toaster_and_potatoes = new
                        Toaster_and_Potatoes(arr_category, id_arr);
                arr_naming = toaster_and_potatoes.getArr_naming();
                arr_descriptions = toaster_and_potatoes.getArr_descriptions();
                image = toaster_and_potatoes.getImage();
                url_Goods = toaster_and_potatoes.getUrl_goods();
                break;
            case CHOICE_CONTEXT_BARBECUE:
            case CHOICE_CONTEXT_ELECTRIC_PLATE:
                Barbecue_and_Electric_plate barbecue_and_electric_plate = new
                        Barbecue_and_Electric_plate(arr_category, id_arr);
                arr_naming = barbecue_and_electric_plate.getArr_naming();
                arr_descriptions = barbecue_and_electric_plate.getArr_descriptions();
                image = barbecue_and_electric_plate.getImage();
                url_Goods = barbecue_and_electric_plate.getUrl_goods();
                break;
            case CHOICE_CONTEXT_BLENDER_OUT:
            case CHOICE_CONTEXT_GAS_PLATE:
                Blender_out_and_Gas_plate blender_out_and_gas_plate = new
                        Blender_out_and_Gas_plate(arr_category, id_arr);
                arr_naming = blender_out_and_gas_plate.getArr_naming();
                arr_descriptions = blender_out_and_gas_plate.getArr_descriptions();
                image = blender_out_and_gas_plate.getImage();
                url_Goods = blender_out_and_gas_plate.getUrl_goods();
                break;
            case CHOICE_CONTEXT_COFFEE_GRINDER:
            case CHOICE_CONTEXT_OMELETTE:
                Coffee_grinder_and_Omelette coffee_grinder_and_omelette = new
                        Coffee_grinder_and_Omelette(arr_category, id_arr);
                arr_naming = coffee_grinder_and_omelette.getArr_naming();
                arr_descriptions = coffee_grinder_and_omelette.getArr_descriptions();
                image = coffee_grinder_and_omelette.getImage();
                url_Goods = coffee_grinder_and_omelette.getUrl_goods();
                break;
            case CHOICE_CONTEXT_KITCHEN_STOVE:
            case CHOICE_CONTEXT_ICE_CREAM:
                Kitchen_stove_and_Ice_cream kitchen_stove_and_ice_cream = new
                        Kitchen_stove_and_Ice_cream(arr_category, id_arr);
                arr_naming = kitchen_stove_and_ice_cream.getArr_naming();
                arr_descriptions = kitchen_stove_and_ice_cream.getArr_descriptions();
                image = kitchen_stove_and_ice_cream.getImage();
                url_Goods = kitchen_stove_and_ice_cream.getUrl_goods();
                break;
            case CHOICE_CONTEXT_NUT:
            case CHOICE_CONTEXT_JUICE:
                Juice_and_Nut juice_and_nut = new Juice_and_Nut(arr_category, id_arr);
                arr_naming = juice_and_nut.getArr_naming();
                arr_descriptions = juice_and_nut.getArr_descriptions();
                image = juice_and_nut.getImage();
                url_Goods = juice_and_nut.getUrl_goods();
                break;
            case CHOICE_CONTEXT_FRI:
            case CHOICE_CONTEXT_ELECTRIC_GRILL:
            case CHOICE_CONTEXT_ELECTRIC_DRILL:
                Fri_and_Electric_Grill_and_Drill fri_and_electric_grill_and_drill = new
                        Fri_and_Electric_Grill_and_Drill(arr_category, id_arr);
                arr_naming = fri_and_electric_grill_and_drill.getArr_naming();
                arr_descriptions = fri_and_electric_grill_and_drill.getArr_descriptions();
                image = fri_and_electric_grill_and_drill.getImage();
                url_Goods = fri_and_electric_grill_and_drill.getUrl_goods();
                break;
            case CHOICE_CONTEXT_TV:
                Tv tv = new Tv(arr_category, id_arr);
                arr_naming = tv.getArr_naming();
                arr_descriptions = tv.getArr_descriptions();
                image = tv.getImage();
                url_Goods = tv.getUrl_goods();
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

    public String get_Url_Goods() {
        return url_Goods;
    }
}
