package sugiforest.world;

import java.util.Random;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGenSugiForest extends BiomeGenBase
{
	protected static final Height height_Sugi = new Height(0.05F, 0.65F);

	public BiomeGenSugiForest(int biomeID)
	{
		super(biomeID);
		this.setBiomeName("Sugi Forest");
		this.setTemperatureRainfall(0.25F, 0.9F);
		this.setHeight(height_Sugi);
		this.func_150563_c(5159473);
		this.setColor(6726755);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
		this.theBiomeDecorator.treesPerChunk = 16;
		this.theBiomeDecorator.grassPerChunk = 6;
		this.theBiomeDecorator.mushroomsPerChunk = 2;
		this.theBiomeDecorator.reedsPerChunk = 5;
		this.theBiomeDecorator.clayPerChunk = 3;
	}

	@Override
	public WorldGenAbstractTree genBigTreeChance(Random random)
	{
		return new WorldGenSugiTree(false);
	}

	@Override
	public float getSpawningChance()
	{
		return 0.075F;
	}
}