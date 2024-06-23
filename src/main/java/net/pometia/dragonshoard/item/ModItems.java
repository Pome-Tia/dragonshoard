package net.pometia.dragonshoard.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pometia.dragonshoard.DragonsHoard;

public class ModItems {
    // Ores
//    public static final Item SILVER_ORE = registerItem("silver_ore", new Item(new FabricItemSettings()));
//    public static final Item INDIUM_DUST = registerItem("indium", new Item(new FabricItemSettings()));

    // Metal Ingots
//    public static final Item INDIUM_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings()));
    public static final Item BLUE_GOLD_INGOT = registerItem("blue_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item STAR_BLUE_GOLD_INGOT = registerItem("star_blue_gold_ingot", new Item(new FabricItemSettings()));

    // Gems
//    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings()));
    public static final Item IOLITE = registerItem("iolite", new Item(new FabricItemSettings()));
//    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings()));
//    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new FabricItemSettings()));
    public static final Item EMERALD = registerItem("emerald", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item ALEXANDRITE = registerItem("alexandrite", new Item(new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings()));

    // Flowers
//    public static final Item SNOWDROP = registerItem("snowdrop", new Item(new FabricItemSettings()));
//    public static final Item VIOLETS = registerItem("violets", new Item(new FabricItemSettings()));
//    public static final Item DAFFODIL = registerItem("daffodil", new Item(new FabricItemSettings()));
//    public static final Item SWEET_PEA = registerItem("sweet_pea", new Item(new FabricItemSettings()));
//    public static final Item BLUE_ROSE = registerItem("blue_rose", new Item(new FabricItemSettings()));
//    public static final Item LARKSPUR = registerItem("larkspur", new Item(new FabricItemSettings()));
//    public static final Item GLADIOLUS = registerItem("gladiolus", new Item(new FabricItemSettings()));
//    public static final Item MORNING_GLORY = registerItem("morning_glory", new Item(new FabricItemSettings()));
//    public static final Item MARIGOLD = registerItem("marigold", new Item(new FabricItemSettings()));
//    public static final Item CHRYSANTHEMUM = registerItem("chrysanthemum", new Item(new FabricItemSettings()));
//    public static final Item NARCISSUS = registerItem("narcissus", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        //metal
        entries.add(SILVER_INGOT);
        entries.add(ROSE_GOLD_INGOT);
        entries.add(ELECTRUM_INGOT);
        entries.add(BLUE_GOLD_INGOT);
        entries.add(STAR_BLUE_GOLD_INGOT);
        //gems
        entries.add(IOLITE);
        entries.add(EMERALD);
        entries.add(SAPPHIRE);
        entries.add(RUBY);
        entries.add(ALEXANDRITE);
        entries.add(CITRINE);
        entries.add(TANZANITE);
        entries.add(TOPAZ);
        entries.add(OPAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DragonsHoard.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DragonsHoard.LOGGER.info("Registering Mod Items for " + DragonsHoard.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
