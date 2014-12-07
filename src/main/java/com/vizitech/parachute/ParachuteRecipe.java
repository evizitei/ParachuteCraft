package com.vizitech.parachute;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ParachuteRecipe {
  public static ItemStack output(){
	  return new ItemStack(Items.bed);
  }
  
  public static Object[] shape(){
	  return new Object[] {"XXX", "I I", " I ", 'X', Blocks.wool, 'I', Items.string};
  }
}
