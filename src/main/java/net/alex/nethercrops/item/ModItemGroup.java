package net.alex.nethercrops.item;

import net.alex.nethercrops.NetherCrops;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RYE = FabricItemGroupBuilder.build(
            new Identifier(NetherCrops.MOD_ID, "rye"), () -> new ItemStack(ModItems.RYE));

}
