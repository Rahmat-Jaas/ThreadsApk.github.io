package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C18200wM;
import android.widget.CompoundButton;

public final class PublicDeveloperOptions$addMainOptions$128 implements CompoundButton.OnCheckedChangeListener {
    public static final PublicDeveloperOptions$addMainOptions$128 INSTANCE = new PublicDeveloperOptions$addMainOptions$128();

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "show_internal_badge", z);
    }
}
