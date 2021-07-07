
package net.mcreator.rajganeshsrinivasan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rajganeshsrinivasan.RajganeshsrinivasanModElements;

@RajganeshsrinivasanModElements.ModElement.Tag
public class InfestedDiamondSwordItem extends RajganeshsrinivasanModElements.ModElement {
	@ObjectHolder("rajganeshsrinivasan:infested_diamond_sword")
	public static final Item block = null;
	public InfestedDiamondSwordItem(RajganeshsrinivasanModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 21f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 6f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public boolean hasContainerItem() {
				return true;
			}

			@Override
			public ItemStack getContainerItem(ItemStack itemstack) {
				return new ItemStack(this);
			}

			@Override
			public boolean isRepairable(ItemStack itemstack) {
				return false;
			}
		}.setRegistryName("infested_diamond_sword"));
	}
}
