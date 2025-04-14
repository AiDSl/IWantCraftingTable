package xyz.iwct;

import net.minecraftforge.fml.common.Mod;

/*
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
*/
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(iwct.MODID)
public class iwct
{
    public static final String MODID = "iwct";
    /*
    //log4j logger
    private static final Logger LOGGER = LogManager.getLogger(MODID);
    */
   //slf4j logger

   public static final Logger LOGGER = LogUtils.getLogger();

    public iwct()
    {
        LOGGER.info("slf4j!");
    }
}
