package com.mrfoof.worldofmagic.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.mrfoof.worldofmagic.WMItem;

public class ModItems {
	
	public static Item leaf;
		
	public static void registerItems()
	{	
		GameRegistry.register(leaf = new WMItem("leaf", "leaf"));
		
	}
	
//	public static void registerRenders() {
//		
//		registerRender(leaf);
//	}
	
//	private static void registerRender(Item item) {
//		
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//	}
}
