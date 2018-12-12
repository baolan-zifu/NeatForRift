package vazkii.neat.listener;

import net.minecraft.client.renderer.WorldRenderer;

public interface RenderWorldLastListener {
    void onRenderWorldLast(WorldRenderer worldRenderer, float partialTicks);
}
