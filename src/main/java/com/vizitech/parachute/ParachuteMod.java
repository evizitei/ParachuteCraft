package com.vizitech.parachute;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ParachuteMod.MODID, version = ParachuteMod.VERSION, name = ParachuteMod.MODID)
public class ParachuteMod {
	public static final String MODID = "parabuilder";
	public static final String VERSION = "0.1";
	public static Item parachute;
	public static ModelResourceLocation parachuteLocation;
	public static ArmorMaterial parachuteMaterial;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		parachuteMaterial = ArmorMaterial.DIAMOND;
		parachute = new Parachute(parachuteMaterial);
		parachuteLocation = new ModelResourceLocation(MODID + ":" + Parachute.name, "inventory");
		GameRegistry.registerItem(parachute, Parachute.name);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("Approaching Drop Point...");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(parachute, 0, parachuteLocation);
		GameRegistry.addRecipe(ParachuteRecipe.output(), ParachuteRecipe.shape());
	}
}
