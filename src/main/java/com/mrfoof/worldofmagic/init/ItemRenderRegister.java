package com.mrfoof.worldofmagic.init;

import com.mrfoof.worldofmagic.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRender()
	{
		reg(ModItems.leaf);
	}
	
	public static void reg(Item item)
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
