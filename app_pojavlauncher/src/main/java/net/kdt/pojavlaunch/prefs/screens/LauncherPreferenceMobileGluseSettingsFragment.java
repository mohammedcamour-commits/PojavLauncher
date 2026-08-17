package net.kdt.pojavlaunch.prefs.screens;

import android.os.Bundle;
import java.io.File;

import net.kdt.pojavlaunch.R;
import net.kdt.pojavlaunch.Tools;

public class LauncherPreferenceMobileGluseSettingsFragment extends LauncherPreferenceFragment {

    private File configFile;

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        configFile = new File(Tools.DIR_DATA + "/MobileGlues", "config.json");

        addPreferencesFromResource(R.xml.pref_mobilegluse);
    }
}
