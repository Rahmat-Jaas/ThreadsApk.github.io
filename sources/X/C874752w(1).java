package X;

import androidx.compose.material.ripple.RippleAnimation;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;

/* renamed from: X.52w  reason: invalid class name and case insensitive filesystem */
public final class C874752w extends AnonymousClass7UC implements C145728kz {
    public final float A00;
    public final C81784oM A01;
    public final AnonymousClass84T A02 = new AnonymousClass84T();
    public final boolean A03;
    public final C81784oM A04;

    public final void CFR() {
    }

    public final void AIz(C147558pX r32) {
        float A002;
        float CxL;
        long A0A = C86114wI.A0A(this.A04);
        C147558pX r15 = r32;
        r15.AIq();
        A01(r15, this.A00, A0A);
        Iterator it = this.A02.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) C18180wK.A0o(it).getValue();
            float f = ((C115076uT) this.A01.getValue()).A03;
            if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                long A042 = C121657He.A04(C86154wM.A0G(A0A), AnonymousClass7KE.A03(A0A), AnonymousClass7KE.A02(A0A), AnonymousClass7KE.A01(A0A), f);
                if (rippleAnimation.A02 == null) {
                    long BCH = r15.BCH();
                    rippleAnimation.A02 = Float.valueOf(Math.max(AnonymousClass7JK.A02(BCH), AnonymousClass7JK.A00(BCH)) * 0.3f);
                }
                if (rippleAnimation.A03 == null) {
                    float f2 = rippleAnimation.A04;
                    if (Float.isNaN(f2)) {
                        CxL = AnonymousClass72X.A00(r15, r15.BCH(), rippleAnimation.A0B);
                    } else {
                        CxL = r15.CxL(f2);
                    }
                    rippleAnimation.A03 = Float.valueOf(CxL);
                }
                if (rippleAnimation.A00 == null) {
                    rippleAnimation.A00 = C86124wJ.A0O(r15.AX0());
                }
                if (rippleAnimation.A01 == null) {
                    long BCH2 = r15.BCH();
                    rippleAnimation.A01 = C86124wJ.A0O(C86104wH.A0C(AnonymousClass7JK.A02(BCH2) / 2.0f, AnonymousClass7JK.A00(BCH2) / 2.0f));
                }
                if (!C86104wH.A1X(rippleAnimation.A08) || C86104wH.A1X(rippleAnimation.A09)) {
                    A002 = C18240wQ.A00(AnonymousClass7JH.A01(rippleAnimation.A05));
                } else {
                    A002 = 1.0f;
                }
                float A022 = C86164wN.A02(rippleAnimation.A02);
                float A023 = C86164wN.A02(rippleAnimation.A03);
                float A003 = C18240wQ.A00(AnonymousClass7JH.A01(rippleAnimation.A07));
                float f3 = (float) 1;
                float A004 = C86144wL.A00(f3 - A003, A022, A003, A023);
                AnonymousClass7KC r2 = rippleAnimation.A00;
                C04220Ms.A0A(r2);
                float A012 = AnonymousClass7KC.A01(r2.A00);
                AnonymousClass7KC r22 = rippleAnimation.A01;
                C04220Ms.A0A(r22);
                float A013 = AnonymousClass7KC.A01(r22.A00);
                C147368pE r12 = rippleAnimation.A06.A04.A05;
                float A005 = C18240wQ.A00(r12.getValue());
                float A006 = C86144wL.A00(f3 - A005, A012, A005, A013);
                AnonymousClass7KC r23 = rippleAnimation.A00;
                C04220Ms.A0A(r23);
                float A024 = AnonymousClass7KC.A02(r23.A00);
                AnonymousClass7KC r24 = rippleAnimation.A01;
                C04220Ms.A0A(r24);
                float A025 = AnonymousClass7KC.A02(r24.A00);
                float A007 = C18240wQ.A00(r12.getValue());
                long A0C = C86104wH.A0C(A006, C86144wL.A00(f3 - A007, A024, A007, A025));
                long A043 = C121657He.A04(C86154wM.A0G(A042), AnonymousClass7KE.A03(A042), AnonymousClass7KE.A02(A042), AnonymousClass7KE.A01(A042), AnonymousClass7KE.A00(A042) * A002);
                if (rippleAnimation.A0B) {
                    long BCH3 = r15.BCH();
                    float A026 = AnonymousClass7JK.A02(BCH3);
                    float A008 = AnonymousClass7JK.A00(BCH3);
                    C146708mj Ae6 = r15.Ae6();
                    AnonymousClass7X9 r1 = (AnonymousClass7X9) Ae6;
                    C121167El r7 = r1.A01.A02;
                    long A009 = C121167El.A00(r7);
                    r1.A00.ADO(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A026, A008, 1);
                    r15.AIp((C104136bI) null, C877353x.A00, A004, 1.0f, 3, A043, A0C);
                    C146708mj.A00(r7, Ae6, A009);
                } else {
                    r15.AIp((C104136bI) null, C877353x.A00, A004, 1.0f, 3, A043, A0C);
                }
            }
        }
    }

    public final void Biz() {
        this.A02.clear();
    }

    public final void Bzv() {
        this.A02.clear();
    }

    public C874752w(C81784oM r2, C81784oM r3, float f, boolean z) {
        super(r3, z);
        this.A03 = z;
        this.A00 = f;
        this.A04 = r2;
        this.A01 = r3;
    }
}
