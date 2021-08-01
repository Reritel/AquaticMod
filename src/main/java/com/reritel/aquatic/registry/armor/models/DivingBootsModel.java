package com.reritel.aquatic.registry.armor.models;

import com.google.common.collect.Lists;
import com.reritel.aquatic.registry.ModEntitiesRenders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.LivingEntity;

import java.util.Collections;

@Environment(EnvType.CLIENT)
public class DivingBootsModel extends HumanoidModel<LivingEntity> {

    final ModelPart leftBoot;
    final ModelPart rightBoot;

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        CubeListBuilder right = CubeListBuilder.create().texOffs(90, 0).addBox(-3.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        right.texOffs(90, 0).addBox(-3.0F, 8.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        right.texOffs(93, 11).addBox(1.0F, 9.0F, -3.0F, 1.0F, 2.0F, 6.0F);
        right.texOffs(114, 21).addBox(-1.9F, 9.0F, -2.0F, 3.0F, 2.0F, 4.0F);

        CubeListBuilder left = CubeListBuilder.create().texOffs(90, 0).addBox(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        left.texOffs(90, 0).addBox(-2.0F, 8.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        left.texOffs(93, 11).addBox(-2.0F, 9.0F, -3.0F, 1.0F, 2.0F, 6.0F);
        left.texOffs(114, 21).addBox(-0.9F, 9.0F, -2.0F, 3.0F, 2.0F, 4.0F);

        modelPartData.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

//        modelPartData.addOrReplaceChild("leftBoot", left, PartPose.offset(0.0F, 24.0F, 0.0F));
        modelPartData.addOrReplaceChild("leftBoot", left, PartPose.offset(0.0F, 12.0F, 0.0F));
//        modelPartData.addOrReplaceChild("rightBoot", right, PartPose.offset(0.0F, 24.0F, 0.0F));
        modelPartData.addOrReplaceChild("rightBoot", right, PartPose.offset(0.0F, 12.0F, 0.0F));

        return LayerDefinition.create(modelData, 128, 128);
    }

    public static DivingBootsModel createModel(EntityModelSet entityModelSet) {
        return new DivingBootsModel(entityModelSet == null ? getTexturedModelData().bakeRoot() : entityModelSet.bakeLayer(ModEntitiesRenders.DIVING_SUIT_BOOTS));
    }

    public DivingBootsModel(ModelPart modelPart) {
        super(modelPart, RenderType::entityTranslucent);

        leftBoot = modelPart.getChild("leftBoot");
        rightBoot = modelPart.getChild("rightBoot");
    }

    @Override
    public void copyPropertiesTo(HumanoidModel<LivingEntity> bipedEntityModel) {
        super.copyPropertiesTo(bipedEntityModel);
        this.leftBoot.copyFrom(leftLeg);
        this.rightBoot.copyFrom(rightLeg);
    }

    @Override
    protected Iterable<ModelPart> headParts() {
        return Collections::emptyIterator;
    }

    @Override
    protected Iterable<ModelPart> bodyParts() {
        return Lists.newArrayList(leftBoot, rightBoot);
    }
}
