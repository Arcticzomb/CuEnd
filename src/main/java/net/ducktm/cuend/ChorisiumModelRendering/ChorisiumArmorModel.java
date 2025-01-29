package net.ducktm.cuend.ChorisiumModelRendering;

import net.ducktm.cuend.CuEnd;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChorisiumArmorModel extends AnimatedGeoModel<ChorisiumArmorItem> {

    @Override
    public ResourceLocation getModelLocation(ChorisiumArmorItem object) {
        return new ResourceLocation(CuEnd.MOD_ID, "geo/chorisium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ChorisiumArmorItem object) {
        return new ResourceLocation(CuEnd.MOD_ID, "textures/models/armor/chorisium_armor_texture_v2.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ChorisiumArmorItem object) {
        return new ResourceLocation(CuEnd.MOD_ID, "animations/armor_animation.json");
    }
}
