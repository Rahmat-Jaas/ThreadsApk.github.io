package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C06750aI;
import X.C08380dH;
import X.C09120et;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C18250wR;
import X.C23411dm;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;

public final class VideoDebugSettingsFragment extends C23411dm implements C82034oy {
    public C10300i6 session;

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825576);
    }

    public String getModuleName() {
        return "video_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C08380dH r3 = C09120et.A3D;
        setItems(C06750aI.A17(AnonymousClass4MC.A03(new VideoDebugSettingsFragment$onViewCreated$items$1(this), 2131825355, r3.A00().A0V()), AnonymousClass4MC.A03(VideoDebugSettingsFragment$onViewCreated$items$2.INSTANCE, 2131825356, AnonymousClass0wJ.A1V(r3.A00().A2L)), AnonymousClass4MC.A03(new VideoDebugSettingsFragment$onViewCreated$items$3(this), 2131825353, r3.A00().A0U()), AnonymousClass4MC.A03(new VideoDebugSettingsFragment$onViewCreated$items$4(this), 2131825539, AnonymousClass0wJ.A1V(r3.A00().A2P)), AnonymousClass4MC.A03(VideoDebugSettingsFragment$onViewCreated$items$5.INSTANCE, 2131825579, AnonymousClass0wJ.A1V(r3.A00().A2R)), AnonymousClass4MC.A03(VideoDebugSettingsFragment$onViewCreated$items$6.INSTANCE, 2131825168, r3.A00().A0K()), AnonymousClass4MC.A03(VideoDebugSettingsFragment$onViewCreated$items$7.INSTANCE, 2131825578, AnonymousClass0wJ.A1V(r3.A00().A0n)), new C63613hu(2131825314), AnonymousClass4MC.A03(VideoDebugSettingsFragment$onViewCreated$items$8.INSTANCE, 2131825169, AnonymousClass0wJ.A1V(r3.A00().A0q)), AnonymousClass4MA.A00(new VideoDebugSettingsFragment$onViewCreated$items$9(this), 2131825577)));
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-953802987);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(-15073536, A02);
    }
}
