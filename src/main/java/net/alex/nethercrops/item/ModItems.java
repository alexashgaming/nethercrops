package net.alex.nethercrops.item;

import net.alex.nethercrops.item.custom.RandomStickItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.alex.nethercrops.NetherCrops;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RYE = registerItem("rye",
            new Item(new FabricItemSettings().group(ModItemGroup.RYE)));

    public static final Item RAW_MOISSANITE = registerItem("raw_moissanite",
            new Item(new FabricItemSettings().group(ModItemGroup.RYE)));

    public static final Item MOISSANITE = registerItem("moissanite",
            new Item(new FabricItemSettings().group(ModItemGroup.RYE)));

    public static final Item RYESEED = registerItem("ryeseed",
            new Item(new FabricItemSettings().group(ModItemGroup.RYE)));


    public static final Item RANDOMSTICK = registerItem("random_stick",
            new RandomStickItem(new FabricItemSettings().group(ModItemGroup.RYE).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NetherCrops.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NetherCrops.LOGGER.debug("Registering Mod Items for " + NetherCrops.MOD_ID);
    }
}