package net.alex.nethercrops.block;

import net.alex.nethercrops.NetherCrops;
import net.alex.nethercrops.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PUMICE_BLOCK = registerBlock("pumice_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.RYE);

    public static final Block MOISSANITE_ORE = registerBlock("moissanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(13, 50)), ModItemGroup.RYE);

    public static final Block DEEPSLATE_MOISSANITE_ORE = registerBlock("deepslate_moissanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(13, 50)), ModItemGroup.RYE);

    public static final Block MOISSANITE_BLOCK = registerBlock("moissanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.RYE);

    public static final Block NETHER_SOIL = registerBlock("nether_soil",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(1f).requiresTool()), ModItemGroup.RYE);




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(NetherCrops.MOD_ID, name), block);
    }
     private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(NetherCrops.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
     }


    public static void registerModBlocks() {
        NetherCrops.LOGGER.debug("Registering ModBlocks for" + NetherCrops.MOD_ID);


    }
}
