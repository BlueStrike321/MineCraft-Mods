
package net.mcreator.rajganeshsrinivasan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.rajganeshsrinivasan.RajganeshsrinivasanModElements;

@RajganeshsrinivasanModElements.ModElement.Tag
public class InfestedDiamondItem extends RajganeshsrinivasanModElements.ModElement {
	@ObjectHolder("rajganeshsrinivasan:infested_diamond")
	public static final Item block = null;
	public InfestedDiamondItem(RajganeshsrinivasanModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("infested_diamond");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
