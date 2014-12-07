package com.vizitech.parachute;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ParachuteMod.MODID, version = ParachuteMod.VERSION)
public class ParachuteMod {
	public static final String MODID = "Parabulider";
	public static final String VERSION = "0.1";

	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("Approaching Drop Point...");
		ItemStack outputStack = new ItemStack(Items.diamond_pickaxe);
		Object[] recipe = new Object[] {"XXX", " X ", " X ", 'X', Blocks.dirt};
		GameRegistry.addRecipe(outputStack, recipe);	
		
		GameRegistry.addRecipe(ParachuteRecipe.output(), ParachuteRecipe.shape());
	}
}
