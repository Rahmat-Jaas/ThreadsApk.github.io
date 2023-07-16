package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7UC  reason: invalid class name */
public abstract class AnonymousClass7UC implements C142678fP {
    public final C110216lJ A00;

    public final void A01(C147848q1 r20, float f, long j) {
        float CxL;
        C110216lJ r3 = this.A00;
        float f2 = f;
        C147848q1 r5 = r20;
        if (Float.isNaN(f2)) {
            CxL = AnonymousClass72X.A00(r5, r5.BCH(), r3.A04);
        } else {
            CxL = r5.CxL(f2);
        }
        float A002 = C18240wQ.A00(AnonymousClass7JH.A01(r3.A01));
        if (A002 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            long A04 = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), A002);
            if (r3.A04) {
                long BCH = r5.BCH();
                float A02 = AnonymousClass7JK.A02(BCH);
                float A003 = AnonymousClass7JK.A00(BCH);
                C146708mj Ae6 = r5.Ae6();
                AnonymousClass7X9 r4 = (AnonymousClass7X9) Ae6;
                C121167El r32 = r4.A01.A02;
                long A004 = C121167El.A00(r32);
                r4.A00.ADO(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A02, A003, 1);
                r5.AIp((C104136bI) null, C877353x.A00, CxL, 1.0f, 3, A04, r5.AX0());
                C146708mj.A00(r32, Ae6, A004);
                return;
            }
            r5.AIp((C104136bI) null, C877353x.A00, CxL, 1.0f, 3, A04, r5.AX0());
        }
    }

    public AnonymousClass7UC(C81784oM r2, boolean z) {
        this.A00 = new C110216lJ(r2, z);
    }
}
