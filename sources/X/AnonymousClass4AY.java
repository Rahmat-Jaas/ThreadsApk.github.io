package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.4AY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4AY implements C33475HoU {
    public final /* synthetic */ C31157GhF A00;
    public final /* synthetic */ E79 A01;

    public /* synthetic */ AnonymousClass4AY(C31157GhF ghF, E79 e79) {
        this.A00 = ghF;
        this.A01 = e79;
    }

    public final void BnO(Integer num) {
        C31157GhF ghF = this.A00;
        E79 e79 = this.A01;
        if (num == AnonymousClass006.A01) {
            e79.A0Z(9);
            C25831Dsp A02 = C25567Do3.A02(ghF.A1z);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A02.A0W, "ig_camera_clips_effect_button_tap"), 872);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C18230wP.A1C(A02.A06, A0I);
                A0I.A0O(C25831Dsp.A01(A02), "capture_type");
                A0I.A0T("camera_session_id", A02.A0K);
                C18180wK.A1C(A0I, A02.A0T);
                C18240wQ.A13(D3Q.PRE_CAPTURE, A0I);
                C18190wL.A1L(A0I);
                A0I.Bb4();
            }
        }
    }
}
