package com.vizitech.parachute;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class Parachute extends ItemArmor {
	public static final String name = "parachute";
	
	public Parachute(ArmorMaterial material){
		super(material, 0, 1); // always chest armor
		setUnlocalizedName(ParachuteMod.MODID + ":" + Parachute.name);
		setCreativeTab(CreativeTabs.tabTransport);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(player.motionY < -0.15){
			player.motionY = -0.15;
			player.fallDistance = 0.0f;
		}
	}
}
