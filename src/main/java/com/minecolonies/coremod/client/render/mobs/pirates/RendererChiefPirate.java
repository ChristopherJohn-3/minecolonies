package com.minecolonies.coremod.client.render.mobs.pirates;

import com.minecolonies.coremod.entity.mobs.pirates.EntityCaptainPirate;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

/**
 * Renderer used for Chief Barbarians.
 */
public class RendererChiefPirate extends AbstractRendererPirate<EntityCaptainPirate, BipedModel<EntityCaptainPirate>>
{
    /**
     * Texture of the entity.
     */
    private static final ResourceLocation TEXTURE = new ResourceLocation("minecolonies:textures/entity/pirate_nude.png");

    /**
     * Constructor method for renderer
     *
     * @param renderManagerIn the renderManager
     */
    public RendererChiefPirate(final EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new BipedModel<>(1.0F), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(final EntityCaptainPirate entity)
    {
        return TEXTURE;
    }
}
