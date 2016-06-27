package com.mrfoof.worldofmagic.init;

import com.mrfoof.worldofmagic.Reference;
import com.mrfoof.worldofmagic.items.ItemLeaf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item leaf;
	
	public static void init() {
		
		leaf = new ItemLeaf();
	}
	
	public static void register() {
		
		GameRegistry.register(leaf);
	}
	
	public static void registerRenders() {
		
		registerRender(leaf);
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
