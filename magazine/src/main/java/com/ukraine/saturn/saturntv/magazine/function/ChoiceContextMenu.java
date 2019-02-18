package com.ukraine.saturn.saturntv.magazine.function;

import android.annotation.SuppressLint;
import android.view.View;

import com.ukraine.saturn.saturntv.magazine.R;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.*;

/** immutable variable processing class - StaticItemList */

@SuppressLint("Registered")
 public class ChoiceContextMenu {

    private int [] image_arr_goods_list;

    public int choice_Menu(View view) {
        int id = view.getId();

        if (id == R.id.android) {
            return R.menu.item_main_android;
        } else if (id == R.id.climate) {
            return R.menu.item_main_climate;
        } else if (id == R.id.cloth) {
            return R.menu.item_main_cloth;
        } else if (id == R.id.cold) {
            return R.menu.item_main_cold;
        } else if (id == R.id.house) {
            return R.menu.item_main_house;
        } else if (id == R.id.multimedia) {
            return R.menu.item_main_multimedia;
        } else if (id == R.id.washer) {
            return R.menu.item_main_washer;
        } else if (id == R.id.beauty) {
            return R.menu.item_main_beauty;
        } else if (id == R.id.kitchen) {
            return R.menu.item_main_kitchen;
        }
        return 0;
    }

    public int item_choice_menu(int id) {
        if (id == R.id.phone) {
            return 100;
        } else if (id == R.id.tablet) {
            return 101;
        } else if (id == R.id.fan) {
            return 102;
        } else if (id == R.id.infrared) {
            return 103;
        } else if (id == R.id.convection) {
            return 104;
        } else if (id == R.id.conditioners) {
            return 105;
        } else if (id == R.id.heater) {
            return 106;
        } else if (id == R.id.heat_fan) {
            return 107;
        } else if (id == R.id.iron) {
            return 108;
        } else if (id == R.id.water_iron) {
            return 109;
        } else if (id == R.id.car_cloth) {
            return 110;
        } else if (id == R.id.fridge) {
            return 111;
        } else if (id == R.id.cold_camera) {
            return 112;
        } else if (id == R.id.cold_lari) {
            return 113;
        } else if (id == R.id.clean) {
            return 114;
        } else if (id == R.id.water_air) {
            return 115;
        } else if (id == R.id.dvd) {
            return 116;
        } else if (id == R.id.tv) {
            return 117;
        } else if (id == R.id.video_recorder) {
            return 118;
        } else if (id == R.id.fastening) {
            return 119;
        } else if (id == R.id.media_player) {
            return 120;
        } else if (id == R.id.washing_car) {
            return 121;
        } else if (id == R.id.washing_auto) {
            return 122;
        } else if (id == R.id.shavers) {
            return 123;
        } else if (id == R.id.massager) {
            return 124;
        } else if (id == R.id.car_cutting) {
            return 125;
        } else if (id == R.id.breadcrumba) {
            return 126;
        } else if (id == R.id.hair_dryer) {
            return 127;
        } else if (id == R.id.hair_straightener) {
            return 128;
        } else if (id == R.id.massage_water) {
            return 129;
        } else if (id == R.id.scales) {
            return 130;
        } else if (id == R.id.trimmer) {
            return 131;
        } else if (id == R.id.epilator) {
            return 132;
        } else if (id == R.id.air_grill) {
            return 133;
        } else if (id == R.id.blinnitsa) {
            return 134;
        } else if (id == R.id.yogurt) {
            return 135;
        } else if (id == R.id.kitchen_scales) {
            return 136;
        } else if (id == R.id.microwave) {
            return 137;
        } else if (id == R.id.sandwich) {
            return 138;
        } else if (id == R.id.steamer) {
            return 139;
        } else if (id == R.id.thermopot) {
            return 140;
        } else if (id == R.id.bread) {
            return 141;
        } else if (id == R.id.chopper) {
            return 142;
        } else if (id == R.id.meat) {
            return 143;
        } else if (id == R.id.kettle) {
            return 144;
        } else if (id == R.id.blender_in) {
            return 145;
        } else if (id == R.id.bowlerway) {
            return 146;
        } else if (id == R.id.coffee_maker) {
            return 147;
        } else if (id == R.id.processor) {
            return 148;
        } else if (id == R.id.mixer) {
            return 149;
        } else if (id == R.id.multi_food) {
            return 150;
        } else if (id == R.id.electric_bake) {
            return 151;
        } else if (id == R.id.toaster) {
            return 152;
        } else if (id == R.id.potatoes) {
            return 153;
        } else if (id == R.id.barbecue) {
            return 154;
        } else if (id == R.id.electric_plate) {
            return 155;
        } else if (id == R.id.blender_out) {
            return 156;
        } else if (id == R.id.gas_plate) {
            return 157;
        } else if (id == R.id.coffee_grinder) {
            return 158;
        } else if (id == R.id.kitchen_stove) {
            return 159;
        } else if (id == R.id.ice_cream) {
            return 160;
        } else if (id == R.id.nut) {
            return 161;
        } else if (id == R.id.juice) {
            return 162;
        } else if (id == R.id.fri) {
            return 163;
        } else if (id == R.id.omelette) {
            return 164;
        } else if (id == R.id.electric_grill) {
            return 165;
        } else if (id == R.id.electric_drill) {
            return 166;
        } else {
            return 0;
        }
    }

    public String[] get_Arr_category_choice_list(int id) {
        String[] arr_name_goods = {};
        switch (id) {

            case CHOICE_CONTEXT_PHONE:
                arr_name_goods = NAME_ARR_PHONE_ALL;
                break;
            case CHOICE_CONTEXT_AIR_GRILL:
                arr_name_goods = NAME_ARR_AIR_GRILL_ALL;
                image_arr_goods_list = IMAGE_ARR_AIR_GRILL_ALL;
                break;
            case CHOICE_CONTEXT_BARBECUE:
                arr_name_goods = NAME_ARR_BARBECUE_ALL;
                image_arr_goods_list = IMAGE_ARR_BARBECUE_ALL;
                break;
            case CHOICE_CONTEXT_BLENDER_IN:
                arr_name_goods = NAME_ARR_BLENDER_IN_ALL;
                image_arr_goods_list = IMAGE_ARR_BLENDER_IN_ALL;
                break;
            case CHOICE_CONTEXT_BLENDER_OUT:
                arr_name_goods = NAME_ARR_BLENDER_OUT_ALL;
                image_arr_goods_list = IMAGE_ARR_BLENDER_OUT_ALL;
                break;
            case CHOICE_CONTEXT_BLINNITSA:
                arr_name_goods = NAME_ARR_BLINNITSA_ALL;
                image_arr_goods_list = IMAGE_ARR_BLINNITSA_ALL;
                break;
            case CHOICE_CONTEXT_BOWLERWAY:
                arr_name_goods = NAME_ARR_BOWLERWAY_ALL;
                image_arr_goods_list = IMAGE_ARR_BOWLERWAY_ALL;
                break;
            case CHOICE_CONTEXT_BREAD:
                arr_name_goods = NAME_ARR_BREAD_ALL;
                image_arr_goods_list = IMAGE_ARR_BREAD_ALL;
                break;
            case CHOICE_CONTEXT_CURLING:
                arr_name_goods = NAME_ARR_CURLING_ALL;
                image_arr_goods_list = IMAGE_ARR_CURLING_ALL;
                break;
            case CHOICE_CONTEXT_CAR_CLOTH:
                arr_name_goods = NAME_ARR_CAR_CLOTH_ALL;
                image_arr_goods_list = IMAGE_ARR_CAR_CLOTH_ALL;
                break;
            case CHOICE_CONTEXT_CAR_CUTTING:
                arr_name_goods = NAME_ARR_CAR_CUTTING_ALL;
                image_arr_goods_list = IMAGE_ARR_CAR_CUTTING_ALL;
                break;
            case CHOICE_CONTEXT_CHOPPER:
                arr_name_goods = NAME_ARR_CHOPPER_ALL;
                break;
            case CHOICE_CONTEXT_CLEAN:
                arr_name_goods = NAME_ARR_CLEAN_ALL;
                image_arr_goods_list = IMAGE_ARR_CLEAN_ALL;
                break;
            case CHOICE_CONTEXT_COFFEE_GRINDER:
                arr_name_goods = NAME_ARR_COFFEE_GRINDER_ALL;
                image_arr_goods_list = IMAGE_ARR_COFFEE_GRINDER_ALL;
                break;
            case CHOICE_CONTEXT_COFFEE_MAKER:
                arr_name_goods = NAME_ARR_COFFEE_MAKER_ALL;
                image_arr_goods_list = IMAGE_ARR_COFFEE_MAKER_ALL;
                break;
            case CHOICE_CONTEXT_COLD_CAMERA:
                arr_name_goods = NAME_ARR_COLD_CAMERA_ALL;
                image_arr_goods_list = IMAGE_ARR_COLD_CAMERA_ALL;
                break;
            case CHOICE_CONTEXT_COLD_LARI:
                arr_name_goods = NAME_ARR_COLD_LARI_ALL;
                image_arr_goods_list = IMAGE_ARR_COLD_LARI_ALL;
                break;
            case CHOICE_CONTEXT_CONDITIONERS:
                arr_name_goods = NAME_ARR_CONDITIONERS_ALL;
                image_arr_goods_list = IMAGE_ARR_CONDITIONERS_ALL;
                break;
            case CHOICE_CONTEXT_CONVECTION:
                arr_name_goods = NAME_ARR_CONVECTION_ALL;
                image_arr_goods_list = IMAGE_ARR_CONVECTION_ALL;
                break;
            case CHOICE_CONTEXT_DVD:
                arr_name_goods = NAME_ARR_DVD_ALL;
                image_arr_goods_list = IMAGE_ARR_DVD_ALL;
                break;
            case CHOICE_CONTEXT_ELECTRIC_BAKE:
                arr_name_goods = NAME_ARR_ELECTRIC_BAKE_ALL;
                image_arr_goods_list = IMAGE_ARR_ELECTRIC_BAKE_ALL;
                break;
            case CHOICE_CONTEXT_ELECTRIC_DRILL:
                arr_name_goods = NAME_ARR_ELECTRIC_DRILL_ALL;
                image_arr_goods_list = IMAGE_ARR_ELECTRIC_DRILL_ALL;
                break;
            case CHOICE_CONTEXT_ELECTRIC_GRILL:
                arr_name_goods = NAME_ARR_ELECTRIC_GRILL_ALL;
                break;
            case CHOICE_CONTEXT_ELECTRIC_PLATE:
                arr_name_goods = NAME_ARR_ELECTRIC_PLATE_ALL;
                image_arr_goods_list = IMAGE_ARR_ELECTRIC_PLATE_ALL;
                break;
            case CHOICE_CONTEXT_EPILATOR:
                arr_name_goods = NAME_ARR_EPILATOR_ALL;
                image_arr_goods_list = IMAGE_ARR_EPILATOR_ALL;
                break;
            case CHOICE_CONTEXT_FAN:
                arr_name_goods = NAME_ARR_FAN_ALL;
                image_arr_goods_list = IMAGE_ARR_FAN_ALL;
                break;
            case CHOICE_CONTEXT_FASTENING:
                arr_name_goods = NAME_ARR_FASTENING_ALL;
                image_arr_goods_list = IMAGE_ARR_FASTENING_ALL;
                break;
            case CHOICE_CONTEXT_FRI:
                arr_name_goods = NAME_ARR_FRI_ALL;
                image_arr_goods_list = IMAGE_ARR_FRI_ALL;
                break;
            case CHOICE_CONTEXT_FRIDGE:
                arr_name_goods = NAME_ARR_FRIDGE_ALL;
                image_arr_goods_list = IMAGE_ARR_FRIDGE_ALL;
                break;
            case CHOICE_CONTEXT_GAS_PLATE:
                arr_name_goods = NAME_ARR_GAS_PLATE_ALL;
                image_arr_goods_list = IMAGE_ARR_GAS_PLATE_ALL;
                break;
            case CHOICE_CONTEXT_HAIR_DRYER:
                arr_name_goods = NAME_ARR_HAIR_DRYER_ALL;
                image_arr_goods_list = IMAGE_ARR_HAIR_DRYER_ALL;
                break;
            case CHOICE_CONTEXT_HAIR_STRAIGHTENER:
                arr_name_goods = NAME_ARR_HAIR_STRAIGHTENER_ALL;
                image_arr_goods_list = IMAGE_ARR_HAIR_STRAIGHTENER_ALL;
                break;
            case CHOICE_CONTEXT_HEAT_FAN:
                arr_name_goods = NAME_ARR_HEAT_FAN_ALL;
                image_arr_goods_list = IMAGE_ARR_HEAT_FAN_ALL;
                break;
            case CHOICE_CONTEXT_HEATER:
                arr_name_goods = NAME_ARR_HEATER_ALL;
                image_arr_goods_list = IMAGE_ARR_HEATER_ALL;
                break;
            case CHOICE_CONTEXT_ICE_CREAM:
                arr_name_goods = NAME_ARR_ICE_CREAM_ALL;
                image_arr_goods_list = IMAGE_ARR_ICE_CREAM_ALL;
                break;
            case CHOICE_CONTEXT_INFRARED:
                arr_name_goods = NAME_ARR_INFRARED_ALL;
                image_arr_goods_list = IMAGE_ARR_INFRARED_ALL;
                break;
            case CHOICE_CONTEXT_IRON:
                arr_name_goods = NAME_ARR_IRON_ALL;
                image_arr_goods_list = IMAGE_ARR_IRON_ALL;
                break;
            case CHOICE_CONTEXT_JUICE:
                arr_name_goods = NAME_ARR_JUICE_ALL;
                image_arr_goods_list = IMAGE_ARR_JUICE_ALL;
                break;
            case CHOICE_CONTEXT_KETTLE:
                arr_name_goods = NAME_ARR_KETTLE_ALL;
                image_arr_goods_list = IMAGE_ARR_KETTLE_ALL;
                break;
            case CHOICE_CONTEXT_KITCHEN_SCALES:
                arr_name_goods = NAME_ARR_KITCHEN_SCALES_ALL;
                image_arr_goods_list = IMAGE_ARR_KITCHEN_SCALES_ALL;
                break;
            case CHOICE_CONTEXT_KITCHEN_STOVE:
                arr_name_goods = NAME_ARR_KITCHEN_STOVE_ALL;
                image_arr_goods_list = IMAGE_ARR_KITCHEN_STOVE_ALL;
                break;
            case CHOICE_CONTEXT_MASSAGE_WATER:
                arr_name_goods = NAME_ARR_MASSAGE_WATER_ALL;
                image_arr_goods_list = IMAGE_ARR_MASSAGE_WATER_ALL;
                break;
            case CHOICE_CONTEXT_MASSAGER:
                arr_name_goods = NAME_ARR_MASSAGER_ALL;
                image_arr_goods_list = IMAGE_ARR_MASSAGER_ALL;
                break;
            case CHOICE_CONTEXT_MEAT:
                arr_name_goods = NAME_ARR_MEAT_ALL;
                image_arr_goods_list = IMAGE_ARR_MEAT_ALL;
                break;
            case CHOICE_CONTEXT_MEDIA_PLAYER:
                arr_name_goods = NAME_ARR_MEDIA_PLAYER_ALL;
                image_arr_goods_list = IMAGE_ARR_MEDIA_PLAYER_ALL;
                break;
            case CHOICE_CONTEXT_MICROWAVE:
                arr_name_goods = NAME_ARR_MICROWAVE_ALL;
                image_arr_goods_list = IMAGE_ARR_MICROWAVE_ALL;
                break;
            case CHOICE_CONTEXT_MIXER:
                arr_name_goods = NAME_ARR_MIXER_ALL;
                image_arr_goods_list = IMAGE_ARR_MIXER_ALL;
                break;
            case CHOICE_CONTEXT_MULTI_FOOD:
                arr_name_goods = NAME_ARR_MULTI_FOOD_ALL;
                image_arr_goods_list = IMAGE_ARR_MULTI_FOOD_ALL;
                break;
            case CHOICE_CONTEXT_NUT:
                arr_name_goods = NAME_ARR_NUT_ALL;
                image_arr_goods_list = IMAGE_ARR_NUT_ALL;
                break;
            case CHOICE_CONTEXT_OMELETTE:
                arr_name_goods = NAME_ARR_OMELETTE_ALL;
                image_arr_goods_list = IMAGE_ARR_OMELETTE_ALL;
                break;
            case CHOICE_CONTEXT_POTATOES:
                arr_name_goods = NAME_ARR_POTATOES_ALL;
                image_arr_goods_list = IMAGE_ARR_POTATOES_ALL;
                break;
            case CHOICE_CONTEXT_PROCESSOR:
                arr_name_goods = NAME_ARR_PROCESSOR_ALL;
                image_arr_goods_list = IMAGE_ARR_PROCESSOR_ALL;
                break;
            case CHOICE_CONTEXT_SANDWICH:
                arr_name_goods = NAME_ARR_SANDWICH_ALL;
                image_arr_goods_list = IMAGE_ARR_SANDWICH_ALL;
                break;
            case CHOICE_CONTEXT_SCALES:
                arr_name_goods = NAME_ARR_SCALES_ALL;
                image_arr_goods_list = IMAGE_ARR_SCALES_ALL;
                break;
            case CHOICE_CONTEXT_SHAVERS:
                arr_name_goods = NAME_ARR_SHAVERS_ALL;
                image_arr_goods_list = IMAGE_ARR_SHAVERS_ALL;
                break;
            case CHOICE_CONTEXT_STEAMER:
                arr_name_goods = NAME_ARR_STEAMER_ALL;
                image_arr_goods_list = IMAGE_ARR_STEAMER_ALL;
                break;
            case CHOICE_CONTEXT_TABLET:
                arr_name_goods = NAME_ARR_TABLET_ALL;
                image_arr_goods_list = IMAGE_ARR_TABLET_ALL;
                break;
            case CHOICE_CONTEXT_THERMOPOT:
                arr_name_goods = NAME_ARR_THERMOPOT_ALL;
                image_arr_goods_list = IMAGE_ARR_THERMOPOT_ALL;
                break;
            case CHOICE_CONTEXT_TOASTER:
                arr_name_goods = NAME_ARR_TOASTER_ALL;
                image_arr_goods_list = IMAGE_ARR_TOASTER_ALL;
                break;
            case CHOICE_CONTEXT_TRIMMER:
                arr_name_goods = NAME_ARR_TRIMMER_ALL;
                image_arr_goods_list = IMAGE_ARR_TRIMMER_ALL;
                break;
            case CHOICE_CONTEXT_TV:
                arr_name_goods = NAME_ARR_TV_ALL;
                image_arr_goods_list = IMAGE_ARR_TV_ALL;
                break;
            case CHOICE_CONTEXT_VIDEO_RECORDER:
                arr_name_goods = NAME_ARR_VIDEO_RECORDER_ALL;
                image_arr_goods_list = IMAGE_ARR_VIDEO_RECORDER_ALL;
                break;
            case CHOICE_CONTEXT_WASHING_AUTO:
                arr_name_goods = NAME_ARR_WASHING_AUTO_ALL;
                image_arr_goods_list = IMAGE_ARR_WASHING_AUTO_ALL;
                break;
            case CHOICE_CONTEXT_WASHING_CAR:
                arr_name_goods = NAME_ARR_WASHING_CAR_ALL;
                image_arr_goods_list = IMAGE_ARR_WASHING_CAR_ALL;
                break;
            case CHOICE_CONTEXT_WATER_AIR:
                arr_name_goods = NAME_ARR_WATER_AIR_ALL;
                image_arr_goods_list = IMAGE_ARR_WATER_AIR_ALL;
                break;
            case CHOICE_CONTEXT_WATER_IRON:
                arr_name_goods = NAME_ARR_WATER_IRON_ALL;
                image_arr_goods_list = IMAGE_ARR_WATER_IRON_ALL;
                break;
            case CHOICE_CONTEXT_YOGURT:
                arr_name_goods = NAME_ARR_YOGURT_ALL;
                image_arr_goods_list = IMAGE_ARR_YOGURT_ALL;
                break;
            default:
                break;
        }
        return arr_name_goods;
    }
    public int[] get_Image_arr_goods_list() {
        return image_arr_goods_list;
    }

}
