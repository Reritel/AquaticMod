//// Made with Blockbench 3.9.2
//// Exported for Minecraft version 1.17
//// Paste this class into your mod and generate all required imports
//
//package com.reritel.aquatic.registry.armor.models;
//
//import net.minecraft.client.model.*;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.entity.Entity;
//
//public class DivingSuitHelmet extends EntityModel<Entity> {
//	private final ModelPart Head;
//	private final ModelPart cube_r1;
//	private final ModelPart cube_r2;
//	private final ModelPart cube_r3;
//
//	public DivingSuitHelmet(ModelPart root) {
//		//  TODO: add bone fields here!
//	}
//	ArmorRender
//	public static ModelData getModelData(){
//		ModelData modelData = new ModelData();
//		ModelPartData modelPartData = modelData.getRoot();
//
//		ModelPartData Head = modelData.addChild("Head", ModelPartBuilder.create().uv(0, 112).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(32, 121).cuboid(-3.0F, -7.0F, 4.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(2.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(-3.0F, -7.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(1.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(-2.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(-2.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(1.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -7.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(3.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(46, 123).cuboid(-2.0F, -6.0F, -5.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(2.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(-3.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(-4.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
//
//		ModelPartData cube_r1 = Head.addChild("cube_r1", ModelPartBuilder.create().uv(25, 114).cuboid(-6.0F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(25, 114).cuboid(-3.0F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-6.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-6.0F, 1.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-6.0F, 2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(24, 117).cuboid(-5.0F, -1.0F, 4.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(24, 117).cuboid(-5.0F, -1.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-6.0F, -3.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(-7.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(-2.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
//
//		ModelPartData cube_r2 = Head.addChild("cube_r2", ModelPartBuilder.create().uv(25, 114).cuboid(2.0F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(25, 114).cuboid(5.0F, -1.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(2.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(2.0F, 1.0F, -6.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(2.0F, 2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(2.0F, -3.0F, -5.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(1.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(6.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));
//
//		ModelPartData cube_r3 = Head.addChild("cube_r3", ModelPartBuilder.create().uv(4, 115).cuboid(3.0F, -2.0F, -9.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(2.0F, -3.0F, -9.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(46, 123).cuboid(-2.0F, -2.0F, -9.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(2.0F, -2.0F, -10.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(1.0F, 1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(1.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -4.0F, -9.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(-2.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, -3.0F, -10.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(-4.0F, -2.0F, -9.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(4, 115).cuboid(-3.0F, -2.0F, -10.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(0, 113).cuboid(-3.0F, -3.0F, -9.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(19, 110).cuboid(-2.0F, 1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, 2.0F, -10.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(8, 110).cuboid(-2.0F, 3.0F, -9.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
//				.uv(32, 117).cuboid(-1.0F, -1.0F, -10.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
//
//		return modelData;
//	}
//
//
//	public static TexturedModelData getTexturedModelData() {
//		return TexturedModelData.of(getModelData(), 128, 128);
//	}
//
//	@Override
//	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}
//	@Override
//	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
//	}
//	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
//		bone.pitch = x;
//		bone.yaw = y;
//		bone.roll = z;
//	}
//
//}