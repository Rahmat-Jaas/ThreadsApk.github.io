package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7UD  reason: invalid class name */
public final class AnonymousClass7UD implements C142678fP {
    public final C81784oM A00;
    public final /* synthetic */ AnonymousClass7U8 A01;

    public AnonymousClass7UD(C81784oM r1, AnonymousClass7U8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AIz(C147558pX r17) {
        C81784oM r4 = this.A00;
        C147558pX r5 = r17;
        if (C18240wQ.A00(r4.getValue()) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            long j = this.A01.A00;
            long A04 = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), C18240wQ.A00(r4.getValue()) * AnonymousClass7KE.A00(j));
            long BCH = r5.BCH();
            r5.AJA((C104136bI) null, C877353x.A00, 1.0f, 3, A04, AnonymousClass7KC.A03, BCH);
        }
        r5.AIq();
    }
}
