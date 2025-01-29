package net.ducktm.cuend.ChorisiumModelRendering;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ChorisiumArmorRenderer extends GeoArmorRenderer<ChorisiumArmorItem> {
    public ChorisiumArmorRenderer() {
        super(new ChorisiumArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
