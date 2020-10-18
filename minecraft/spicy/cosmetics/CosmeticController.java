package spicy.cosmetics;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import spicy.SpicyClient;
import spicy.cosmetics.impl.DougDimmadome;
import spicy.cosmetics.impl.Tophat;

public class CosmeticController {
	
	public static boolean shouldRenderTophat(AbstractClientPlayer player) {
		
		return SpicyClient.config.tophat.toggled;
		
	}
	
	public static boolean shouldRenderDougDimmadomeHat(AbstractClientPlayer player) {
		
		return SpicyClient.config.dougDimmadome.toggled;
		
	}
	
	public static float[] getTophatColor(AbstractClientPlayer player) {
		
		// R G B values should be between 0 and 1
		return new float[] {1, 0, 0};
		
	}
	
	public static void addModels(RenderPlayer renderPlayer) {
		
		renderPlayer.addLayer(new Tophat(renderPlayer));
		renderPlayer.addLayer(new DougDimmadome(renderPlayer));
		
	}
	
}
