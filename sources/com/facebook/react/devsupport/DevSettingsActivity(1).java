package com.facebook.react.devsupport;

import X.C14030oh;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.instagram.barcelona.R;

public class DevSettingsActivity extends PreferenceActivity {
    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(119104746);
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(2131823126));
        addPreferencesFromResource(R.xml.rn_dev_preferences);
        C14030oh.A07(1299475090, A00);
    }
}
