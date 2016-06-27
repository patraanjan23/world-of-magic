package com.mrfoof.worldofmagic.items;

import com.mrfoof.worldofmagic.Reference;

import net.minecraft.item.Item;

public class ItemLeaf extends Item {
	
	public ItemLeaf() {
		setUnlocalizedName(Reference.wmItems.LEAF.getUnlocalizedName());
		setRegistryName(Reference.wmItems.LEAF.getRegistryName());
	}
}
