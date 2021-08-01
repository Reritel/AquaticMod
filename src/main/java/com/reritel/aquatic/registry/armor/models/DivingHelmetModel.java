package com.reritel.aquatic.registry.armor.models;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

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
public class DivingHelmetModel extends HumanoidModel<LivingEntity> {
	private final ModelPart Head;


	public DivingHelmetModel(ModelPart modelPart) {
		super(modelPart, RenderType::entityTranslucent);

		Head = modelPart.getChild("hat");
	}

	public static LayerDefinition getTexturedModelData() {
		MeshDefinition modelData = new MeshDefinition();
		PartDefinition modelPartData = modelData.getRoot();

		CubeListBuilder hat = CubeListBuilder.create().texOffs(0, 112).addBox( -4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
		hat.texOffs(0, 112).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
		hat.texOffs(32, 121).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 6.0F, 1.0F);
		hat.texOffs(0, 113).addBox(2.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F);
		hat.texOffs(0, 113).addBox(-3.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(1.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(-2.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(-2.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(1.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -7.0F, -6.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(4, 115).addBox(3.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(46, 123).addBox(-2.0F, -6.0F, -5.0F, 4.0F, 4.0F, 1.0F);
		hat.texOffs(4, 115).addBox(2.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(4, 115).addBox(-3.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(4, 115).addBox(-4.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(32, 117).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -10.0F, -3.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(-2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(0, 113).addBox(-3.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(4, 115).addBox(-3.0F, -10.0F, -2.0F, 1.0F, 1.0F, 4.0F);
		hat.texOffs(4, 115).addBox(-4.0F, -9.0F, -2.0F, 1.0F, 1.0F, 4.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -10.0F, 2.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(-2.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-2.0F, -9.0F, 3.0F, 4.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(19, 110).addBox(1.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F);
		hat.texOffs(4, 115).addBox(2.0F, -10.0F, -2.0F, 1.0F, 1.0F, 4.0F);
		hat.texOffs(43, 123).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 1.0F, 4.0F);
		hat.texOffs(0, 113).addBox(2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(4, 115).addBox(3.0F, -9.0F, -2.0F, 1.0F, 1.0F, 4.0F);

		hat.texOffs(25, 113).addBox(5.0F, -6.0F, -2.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(25, 113).addBox(5.0F, -6.0F, 1.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(8, 110).addBox(5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 2.0F);
		hat.texOffs(8, 110).addBox(5.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F);
		hat.texOffs(8, 110).addBox(4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(25, 116).addBox(4.0F, -5.0F, -1.0F, 1.0F, 2.0F, 2.0F);
		hat.texOffs(8, 110).addBox(4.0F, -7.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(0, 113).addBox(4.0F, -6.0F, -3.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(0, 113).addBox(4.0F, -6.0F, 2.0F, 1.0F, 4.0F, 1.0F);

		hat.texOffs(25, 117).addBox(-5.0F, -5.0F, -1.0F, 0.0F, 2.0F, 2.0F);

		hat.texOffs(25, 113).addBox(-6.0F, -6.0F, 1.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(25, 113).addBox(-6.0F, -6.0F, -2.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(8, 110).addBox(-6.0F, -6.0F, -1.0F, 1.0F, 1.0F, 2.0F);
		hat.texOffs(8, 110).addBox(-6.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F);
		hat.texOffs(8, 110).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(8, 110).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 1.0F, 6.0F);
		hat.texOffs(0, 113).addBox(-5.0F, -6.0F, 2.0F, 1.0F, 4.0F, 1.0F);
		hat.texOffs(0, 113).addBox(-5.0F, -6.0F, -3.0F, 1.0F, 4.0F, 1.0F);

		modelPartData.addOrReplaceChild("hat", hat, PartPose.ZERO);

		modelPartData.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);

		modelPartData.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		modelPartData.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		modelPartData.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		modelPartData.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		modelPartData.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		return LayerDefinition.create(modelData, 128, 128);
	}

	public static DivingHelmetModel createModel(EntityModelSet entityModelSet) {
		return new DivingHelmetModel(entityModelSet == null ? getTexturedModelData().bakeRoot() : entityModelSet.bakeLayer(ModEntitiesRenders.DIVING_SUIT_HELMET));
	}

	@Override
	protected Iterable<ModelPart> headParts() {
		return Collections::emptyIterator;
	}

//	@Override
//	protected Iterable<ModelPart> bodyParts() {
//		return Lists.newArrayList(Head);
//	}
}