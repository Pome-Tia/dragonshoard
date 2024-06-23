package net.pometia.dragonshoard;

import net.fabricmc.api.ModInitializer;

import net.pometia.dragonshoard.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonsHoard implements ModInitializer {
	public static final String MOD_ID = "dragonshoard";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}