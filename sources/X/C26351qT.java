package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1qT  reason: invalid class name and case insensitive filesystem */
public final class C26351qT extends AnonymousClass4DQ {
    public final /* synthetic */ C61313Ss A00;
    public final /* synthetic */ AnonymousClass3ZL A01;
    public final /* synthetic */ String A02;

    public C26351qT(C61313Ss r1, AnonymousClass3ZL r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void CPS(C25918DvM dvM) {
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(this.A01), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", true);
        C25831Dsp A022 = C25567Do3.A02(this.A00.A03);
        D3Q d3q = D3Q.SHARE_SHEET;
        String str = this.A02;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022.A0W, "ig_camera_clips_nux_tooltip_impression"), 880);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("camera_session_id", A022.A0K);
            C18240wQ.A15(A0I, str);
            C18240wQ.A13(d3q, A0I);
            A0I.A0O(D3N.A09, "entity_type");
            A0I.A0Q("is_crosspost", true);
            C18190wL.A1L(A0I);
            A0I.Bb4();
        }
    }
}
