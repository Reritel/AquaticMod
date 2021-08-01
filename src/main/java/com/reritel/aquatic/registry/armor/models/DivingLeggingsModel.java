package com.reritel.aquatic.registry.armor.models;

import com.reritel.aquatic.registry.ModEntitiesRenders;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartNames;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.LivingEntity;

public class DivingLeggingsModel extends HumanoidModel<LivingEntity> {
    final ModelPart myLeftLeg;
    final ModelPart myRightLeg;

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();

        //        RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        CubeListBuilder rightLeg = CubeListBuilder.create().texOffs(112, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F);
        rightLeg.texOffs(108, 12).addBox(-2.1F, 7.0F, -3.0F, 4.0F, 1.0F, 6.0F);

//        LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        CubeListBuilder leftLeg = CubeListBuilder.create().texOffs(112, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F);
        leftLeg.texOffs(108, 12).addBox(-1.9F, 7.0F, -3.0F, 4.0F, 1.0F, 6.0F);

        modelPartData.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);

        modelPartData.addOrReplaceChild("right_leg", rightLeg, PartPose.offset(-1.9F, 12.0F, 0.0F));
        modelPartData.addOrReplaceChild("left_leg", leftLeg, PartPose.offset(1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(modelData, 128, 128);
    }



    public static DivingLeggingsModel createModel(EntityModelSet entityModelSet) {
        return new DivingLeggingsModel(entityModelSet == null ? getTexturedModelData().bakeRoot() : entityModelSet.bakeLayer(ModEntitiesRenders.DIVING_SUIT_LEGGINGS));
    }

    public DivingLeggingsModel(ModelPart modelPart) {
        super(modelPart, RenderType::entityTranslucent);

        myLeftLeg = modelPart.getChild(PartNames.LEFT_LEG);
        myRightLeg = modelPart.getChild(PartNames.RIGHT_LEG);
    }

}
