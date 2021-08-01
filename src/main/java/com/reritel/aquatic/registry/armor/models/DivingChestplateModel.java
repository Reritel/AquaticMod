package com.reritel.aquatic.registry.armor.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.reritel.aquatic.registry.ModEntitiesRenders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;

import java.util.Collections;

@Environment(EnvType.CLIENT)
public class DivingChestplateModel extends HumanoidModel<LivingEntity> {
    private final ModelPart Body;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;


    public DivingChestplateModel(ModelPart modelPart) {
        super(modelPart, RenderType::entityTranslucent);

        Body = modelPart.getChild("body");
        LeftArm = modelPart.getChild("left_arm");
        RightArm = modelPart.getChild("right_arm");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();

        CubeListBuilder body = CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F);
        body.texOffs(20, 1).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 2.0F, 1.0F);
        body.texOffs(24, 4).addBox(-3.0F, 2.0F, -3.0F, 6.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(-1.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(0, 16).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 9.0F, 1.0F);
        body.texOffs(24, 4).addBox(-3.0F, 9.0F, 2.0F, 6.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(-1.0F, 10.0F, 2.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(-1.0F, 9.0F, 3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(-3.0F, 8.0F, 3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(1.0F, 8.0F, 3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(-3.0F, 0.0F, 3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(24, 6).addBox(1.0F, 0.0F, 3.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(18, 16).addBox(3.0F, 1.0F, 3.0F, 1.0F, 7.0F, 1.0F);
        body.texOffs(24, 8).addBox(-1.0F, 1.0F, 3.0F, 2.0F, 7.0F, 1.0F);
        body.texOffs(18, 16).addBox(-4.0F, 1.0F, 3.0F, 1.0F, 7.0F, 1.0F);
        body.texOffs(24, 6).addBox(-1.0F, 1.0F, -4.0F, 2.0F, 1.0F, 1.0F);
        body.texOffs(32, 6).addBox(1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F);
        body.texOffs(32, 6).addBox(-2.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F);

        CubeListBuilder right = CubeListBuilder.create().texOffs(0, 26).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F);
        right.texOffs(16, 26).addBox(-4.0F, 7.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        right.texOffs(16, 26).addBox(-4.0F, -1.0F, -3.0F, 5.0F, 1.0F, 6.0F);

        CubeListBuilder left = CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F);
        left.texOffs(16, 26).addBox(-1.0F, 7.0F, -3.0F, 5.0F, 1.0F, 6.0F);
        left.texOffs(16, 26).addBox(-1.0F, -1.0F, -3.0F, 5.0F, 1.0F, 6.0F);

        modelPartData.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);

        modelPartData.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);

        modelPartData.addOrReplaceChild("body", body, PartPose.ZERO);
        modelPartData.addOrReplaceChild("leftShoulder", left, PartPose.offset(5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("rightShoulder", right, PartPose.offset(-5.0F, 2.0F, 0.0F));

        modelPartData.addOrReplaceChild("right_arm", right, PartPose.offset(-5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("left_arm", left, PartPose.offset(5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        modelPartData.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

        return LayerDefinition.create(modelData, 128, 128);
    }

    public static DivingChestplateModel createModel(EntityModelSet entityModelSet) {
        return new DivingChestplateModel(entityModelSet == null ? getTexturedModelData().bakeRoot() : entityModelSet.bakeLayer(ModEntitiesRenders.DIVING_SUIT_CHESTPLATE));
    }

    @Override
    protected Iterable<ModelPart> headParts() {
        return Collections::emptyIterator;
    }

    @Override
    public void copyPropertiesTo(HumanoidModel<LivingEntity> bipedEntityModel) {
        super.copyPropertiesTo(bipedEntityModel);
        this.LeftArm.copyFrom(leftArm);
        this.RightArm.copyFrom(rightArm);
    }

    @Override
    public void translateToHand(HumanoidArm arm, PoseStack matrices) {
        ModelPart modelPart = this.getArm(arm);
        modelPart.translateAndRotate(matrices);
    }

//	@Override
//	protected Iterable<ModelPart> bodyParts() {
//		return Lists.newArrayList(Head);
//	}
}