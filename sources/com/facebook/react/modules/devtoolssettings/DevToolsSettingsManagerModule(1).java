package com.facebook.react.modules.devtoolssettings;

import X.C18180wK;
import X.C18200wM;
import X.C86164wN;
import X.IPD;
import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DevToolsSettingsManager")
public class DevToolsSettingsManagerModule extends NativeDevToolsSettingsManagerSpec {
    public static final String KEY_CONSOLE_PATCH_SETTINGS = "ConsolePatchSettings";
    public static final String KEY_PROFILING_SETTINGS = "ProfilingSettings";
    public static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    public final SharedPreferences mSharedPreferences;

    public String getConsolePatchSettings() {
        return C18200wM.A0h(this.mSharedPreferences, KEY_CONSOLE_PATCH_SETTINGS);
    }

    public String getProfilingSettings() {
        return C18200wM.A0h(this.mSharedPreferences, KEY_PROFILING_SETTINGS);
    }

    public void setConsolePatchSettings(String str) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(KEY_CONSOLE_PATCH_SETTINGS, str);
        edit.apply();
    }

    public void setProfilingSettings(String str) {
        C18180wK.A0v(this.mSharedPreferences.edit(), KEY_PROFILING_SETTINGS, str);
    }

    public DevToolsSettingsManagerModule(IPD ipd) {
        super(ipd);
        this.mSharedPreferences = C86164wN.A0C(ipd, SHARED_PREFERENCES_PREFIX);
    }
}
