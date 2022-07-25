package net.alex.nethercrops;

import net.alex.nethercrops.block.ModBlocks;
import net.alex.nethercrops.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherCrops implements ModInitializer {
	public static final String MOD_ID = "nethercrops";
	public static final Logger LOGGER = LoggerFactory.getLogger( MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
