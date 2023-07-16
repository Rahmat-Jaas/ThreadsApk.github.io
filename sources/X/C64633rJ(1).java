package X;

import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

/* renamed from: X.3rJ  reason: invalid class name and case insensitive filesystem */
public final class C64633rJ implements View.OnClickListener {
    public final /* synthetic */ C29371xr A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C64633rJ(C29371xr r1, User user, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-809014510);
        C29371xr r5 = this.A00;
        String str = r5.A06;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r5.A03, "change_privacy_setting_confirmation_tapped"), 150);
        A0I.A0T("change_privacy_option_to", "private");
        A0I.A0T("qpid", str);
        C18210wN.A1C(A0I, "privacy_updater");
        C25745DrH A022 = C25745DrH.A00.A02(r5.A02.getContext());
        if (A022 != null) {
            C18240wQ.A1K(this, 7, A022);
            A022.A0C();
        }
        C14030oh.A0C(945433923, A05);
    }
}
