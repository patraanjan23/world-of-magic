package com.mrfoof.worldofmagic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WMItem extends Item
{
	public WMItem(String unlocalizedName, String registryName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
	}

}
