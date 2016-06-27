package com.mrfoof.worldofmagic.proxy;

import com.mrfoof.worldofmagic.init.ModItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		
		ModItems.registerRenders();
	}
}
