package com.food_decoloring;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FoodDeColoringPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FoodDeColoringPlugin.class);
		RuneLite.main(args);
	}
}