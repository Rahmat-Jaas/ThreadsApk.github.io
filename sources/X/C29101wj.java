package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1wj  reason: invalid class name and case insensitive filesystem */
public final class C29101wj extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "DonationOptionsFragment";
    public C145538kf A00;
    public UserSession A01;
    public User A02;
    public boolean A03;

    public final String getModuleName() {
        return "donation_settings";
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i = 2131822780;
        if (this.A03) {
            i = 2131822784;
        }
        AnonymousClass4u2.A07(r3, i);
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public static List A0B(C29101wj r4) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i = 2131822779;
        if (r4.A03) {
            i = 2131822790;
        }
        A0v.add(AnonymousClass4MC.A05(r4, 44, i, r4.A02.A32()));
        int i2 = 2131822778;
        if (r4.A03) {
            i2 = 2131822789;
        }
        C63293hC.A00(r4, A0v, i2);
        return A0v;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(916069966);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(this.mArguments);
        this.A00 = C31155GhB.A00();
        this.A02 = AnonymousClass0wJ.A0Y(this.A01);
        this.A03 = C63803iN.A05(AnonymousClass0TJ.A06, this.A01, 36316400914009181L).booleanValue();
        C14030oh.A09(453372704, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1981996584);
        super.onResume();
        setItems(A0B(this));
        C14030oh.A09(-1781490095, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        setItems(A0B(this));
        UserSession userSession = this.A01;
        if (this.A02.A32()) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("profile_fundraiser_initial_state", str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, userSession), "ig_cg_view_donation_settings"), 1137);
        A0I.A0V("attributes", A0y);
        A0I.Bb4();
    }
}
