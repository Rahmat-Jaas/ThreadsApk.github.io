package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C10600ic;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CompoundButton;

public final class PublicDeveloperOptions$addMainOptions$70 implements CompoundButton.OnCheckedChangeListener {
    public static final PublicDeveloperOptions$addMainOptions$70 INSTANCE = new PublicDeveloperOptions$addMainOptions$70();

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences sharedPreferences;
        Context context = C10600ic.A00;
        if (context != null && (sharedPreferences = context.getSharedPreferences("BinderGroupDebugUtil_Prefs", 0)) != null) {
            AnonymousClass0wJ.A13(sharedPreferences.edit(), "recyclerview_bind_debug_enabled", z);
        }
    }
}
