package com.duckblade.osrs.toa;

import ch.qos.logback.classic.Level;
import javax.inject.Singleton;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@PluginDescriptor(
	name = "ToA Debug"
)
public class ToaDebugPlugin extends Plugin
{

	@Override
	protected void startUp()
	{
		((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.WARN);
		((Logger) LoggerFactory.getLogger("com.duckblade.osrs.toa")).setLevel(Level.DEBUG);
	}

	@Override
	protected void shutDown() throws Exception
	{
		((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.DEBUG);
	}
}
