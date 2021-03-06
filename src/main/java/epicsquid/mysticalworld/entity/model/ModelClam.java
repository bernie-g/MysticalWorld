package epicsquid.mysticalworld.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * clam - By Nerevar
 * Created using Tabula 7.0.1
 */
public class ModelClam extends ModelBase {
    public ModelRenderer Bottom;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape3_1;
    public ModelRenderer shape2_1;
    public ModelRenderer shape1_1;
    public ModelRenderer Bottom_side1;
    public ModelRenderer Bottom_side2;
    public ModelRenderer Bottom_side4;
    public ModelRenderer Bottom_center;
    public ModelRenderer Top;
    public ModelRenderer Bottom_side3;
    public ModelRenderer pearl;
    public ModelRenderer pearl_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape2_2;
    public ModelRenderer shape3_2;
    public ModelRenderer shape3_3;
    public ModelRenderer shape2_3;
    public ModelRenderer shape1_3;

    public ModelClam() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Top = new ModelRenderer(this, 25, 15);
        this.Top.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Top.addBox(-5.5F, -3.0F, 0.0F, 11, 3, 8, 0.0F);
        this.setRotateAngle(Top, -3.141592653589793F, 3.141592653589793F, 0.0F);
        this.Bottom_side2 = new ModelRenderer(this, 0, 4);
        this.Bottom_side2.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.Bottom_side2.addBox(-5.5F, -0.5F, 0.0F, 11, 1, 1, 0.0F);
        this.shape3_1 = new ModelRenderer(this, 0, 18);
        this.shape3_1.setRotationPoint(1.0F, -3.3F, -0.6F);
        this.shape3_1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
        this.setRotateAngle(shape3_1, 0.05585053606381855F, 0.04363323129985824F, 0.0F);
        this.shape3_2 = new ModelRenderer(this, 0, 18);
        this.shape3_2.setRotationPoint(-1.0F, -3.3F, -0.6F);
        this.shape3_2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
        this.setRotateAngle(shape3_2, 0.05585053606381855F, -0.017453292519943295F, 0.0F);
        this.Bottom = new ModelRenderer(this, 25, 16);
        this.Bottom.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Bottom.addBox(-5.5F, -3.0F, 0.0F, 11, 2, 8, 0.0F);
        this.setRotateAngle(Bottom, 3.096039560112741F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 1, 19);
        this.shape2.setRotationPoint(-3.0F, -3.3F, -0.6F);
        this.shape2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        this.setRotateAngle(shape2, 0.05585053606381855F, -0.05235987755982988F, 0.0F);
        this.shape1_3 = new ModelRenderer(this, 2, 20);
        this.shape1_3.setRotationPoint(5.4F, -3.3F, -0.6F);
        this.shape1_3.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
        this.setRotateAngle(shape1_3, 0.05585053606381855F, 0.09075712110370514F, 0.0F);
        this.shape2_2 = new ModelRenderer(this, 1, 19);
        this.shape2_2.setRotationPoint(-3.0F, -3.3F, -0.6F);
        this.shape2_2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        this.setRotateAngle(shape2_2, 0.05585053606381855F, -0.05235987755982988F, 0.0F);
        this.pearl = new ModelRenderer(this, 0, 26);
        this.pearl.setRotationPoint(0.0F, 0.8F, 4.0F);
        this.pearl.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pearl, -0.477696616270848F, 0.0F, -0.0036651914291880917F);
        this.shape3_3 = new ModelRenderer(this, 0, 18);
        this.shape3_3.setRotationPoint(1.0F, -3.3F, -0.6F);
        this.shape3_3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
        this.setRotateAngle(shape3_3, 0.05585053606381855F, 0.04363323129985824F, 0.0F);
        this.shape1 = new ModelRenderer(this, 2, 20);
        this.shape1.setRotationPoint(-5.4F, -3.3F, -0.6F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
        this.setRotateAngle(shape1, 0.05585053606381855F, -0.09075712110370514F, 0.0017453292519943296F);
        this.Bottom_center = new ModelRenderer(this, 0, 10);
        this.Bottom_center.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.Bottom_center.addBox(-4.5F, -0.9F, 1.0F, 9, 1, 6, 0.0F);
        this.setRotateAngle(Bottom_center, 0.031415926535897934F, 0.0F, 0.0F);
        this.Bottom_side1 = new ModelRenderer(this, 0, 7);
        this.Bottom_side1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Bottom_side1.addBox(-5.5F, -0.5F, 0.0F, 11, 1, 1, 0.0F);
        this.pearl_1 = new ModelRenderer(this, 0, 26);
        this.pearl_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pearl_1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pearl_1, 0.0F, 0.7853981633974483F, 0.7853981633974483F);
        this.shape2_3 = new ModelRenderer(this, 1, 19);
        this.shape2_3.setRotationPoint(3.0F, -3.3F, -0.6F);
        this.shape2_3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        this.setRotateAngle(shape2_3, 0.05585053606381855F, 0.03490658503988659F, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 1, 19);
        this.shape2_1.setRotationPoint(3.0F, -3.3F, -0.6F);
        this.shape2_1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        this.setRotateAngle(shape2_1, 0.05585053606381855F, 0.03490658503988659F, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 18);
        this.shape3.setRotationPoint(-1.0F, -3.3F, -0.6F);
        this.shape3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
        this.setRotateAngle(shape3, 0.05585053606381855F, -0.017453292519943295F, 0.0F);
        this.Bottom_side3 = new ModelRenderer(this, 14, 21);
        this.Bottom_side3.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Bottom_side3.addBox(-5.5F, 0.0F, 1.0F, 1, 1, 6, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 2, 20);
        this.shape1_2.setRotationPoint(-5.4F, -3.3F, -0.6F);
        this.shape1_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
        this.setRotateAngle(shape1_2, 0.05585053606381855F, -0.09075712110370514F, 0.0017453292519943296F);
        this.Bottom_side4 = new ModelRenderer(this, 14, 21);
        this.Bottom_side4.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Bottom_side4.addBox(4.5F, -0.5F, 1.0F, 1, 1, 6, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 2, 20);
        this.shape1_1.setRotationPoint(5.4F, -3.3F, -0.6F);
        this.shape1_1.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
        this.setRotateAngle(shape1_1, 0.05585053606381855F, 0.09075712110370514F, 0.0F);
        this.Bottom.addChild(this.Top);
        this.Bottom.addChild(this.Bottom_side2);
        this.Bottom.addChild(this.shape3_1);
        this.Top.addChild(this.shape3_2);
        this.Bottom.addChild(this.shape2);
        this.Top.addChild(this.shape1_3);
        this.Top.addChild(this.shape2_2);
        this.Bottom_center.addChild(this.pearl);
        this.Top.addChild(this.shape3_3);
        this.Bottom.addChild(this.shape1);
        this.Bottom.addChild(this.Bottom_center);
        this.Bottom.addChild(this.Bottom_side1);
        this.pearl.addChild(this.pearl_1);
        this.Top.addChild(this.shape2_3);
        this.Bottom.addChild(this.shape2_1);
        this.Bottom.addChild(this.shape3);
        this.Bottom_side4.addChild(this.Bottom_side3);
        this.Top.addChild(this.shape1_2);
        this.Bottom.addChild(this.Bottom_side4);
        this.Bottom.addChild(this.shape1_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Bottom.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
