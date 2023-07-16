package com.instagram.debug.devoptions.section.zone;

import X.AnonymousClass30D;
import X.C04220Ms;
import X.C127167gf;
import X.C14030oh;
import X.C146158lk;
import X.C63813iO;
import android.content.Context;
import android.view.View;

public final class PolicyZonePreferencesSection$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ PolicyZonePreferencesSection this$0;

    public PolicyZonePreferencesSection$getItems$1(PolicyZonePreferencesSection policyZonePreferencesSection) {
        this.this$0 = policyZonePreferencesSection;
    }

    public final void onClick(View view) {
        C146158lk r1;
        String str;
        int A05 = C14030oh.A05(484882810);
        Context context = this.this$0.context;
        if (AnonymousClass30D.A00 != null) {
            r1 = AnonymousClass30D.A00;
            C04220Ms.A0C(r1, "null cannot be cast to non-null type com.facebook.privacy.zone.api.ZoneInterface");
        } else {
            r1 = C127167gf.A00;
        }
        if (r1.isEnabled()) {
            str = "Yes";
        } else {
            str = "No";
        }
        C63813iO.A0B(context, str);
        C14030oh.A0C(1894166045, A05);
    }
}
