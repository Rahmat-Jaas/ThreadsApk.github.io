package X;

import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ll  reason: invalid class name and case insensitive filesystem */
public final class C71964Ll implements C21659By5 {
    public final /* synthetic */ C209416t A00;
    public final /* synthetic */ IgSwitch A01;
    public final /* synthetic */ C19000yP A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void Bmq() {
    }

    public C71964Ll(C209416t r1, IgSwitch igSwitch, C19000yP r3, String str, String str2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = igSwitch;
    }

    public final void Bmo() {
        C320129v r4 = C320129v.DEFAULT_PRIVACY_CONSENT_BOTTOMSHEET_DISMISS_CLICK;
        C19000yP r3 = this.A02;
        UserSession userSession = r3.A0P;
        C209416t r1 = this.A00;
        String obj = r1.A02.toString();
        String str = this.A03;
        String str2 = this.A04;
        C59693Lv.A01(r4, userSession, obj, str, str2, r1.A01.toString(), false, C62183Xq.A00(userSession), r1.A05);
        if (!C63073bQ.A02(r1)) {
            return;
        }
        if (C63073bQ.A00(userSession) == null || !C63073bQ.A00(userSession).A0F()) {
            C19000yP.A01(r1, this.A01, r3);
            C63073bQ.A00(userSession).A08(r3.A0M, r3.getContext(), str2);
        }
    }
}
