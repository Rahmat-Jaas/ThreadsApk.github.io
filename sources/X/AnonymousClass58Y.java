package X;

import android.util.Patterns;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.barcelona.onboarding.data.OnboardingRespository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.58Y  reason: invalid class name */
public final class AnonymousClass58Y extends C62793ak implements C146568mS {
    public final OnboardingRespository A00;
    public final UserSession A01;
    public final C86074wE A02;
    public final C86094wG A03;

    public final void BPP(AnonymousClass688 r5) {
        C04220Ms.A0B(r5, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r5, (Object) this, (C146958n9) null, 3), AnonymousClass3J5.A00(this), 3);
    }

    public final void C8h(AnonymousClass688 r9) {
        Object obj;
        Object obj2;
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        int A04 = C18230wP.A04(r9, 0);
        if (A04 != 2) {
            if (A04 == 1) {
                obj = ((AnonymousClass5Im) ((KtCSuperShape0S0200000_I2) this.A00.A09.getValue()).A00).A03;
                obj2 = C86144wL.A0T(this.A03).A03;
            }
            do {
            } while (!C86104wH.A1Z(this.A02));
        }
        obj = ((AnonymousClass5Im) ((KtCSuperShape0S0200000_I2) this.A00.A09.getValue()).A00).A00;
        obj2 = C86144wL.A0T(this.A03).A00;
        if (!C04220Ms.A0I(obj, obj2)) {
            C86074wE r6 = this.A02;
            do {
                value = r6.getValue();
                KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
                r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
                z = ktCSuperShape0S0130000_I2.A03;
                z2 = ktCSuperShape0S0130000_I2.A01;
                C04220Ms.A0B(r3, 0);
            } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, z, true, z2)));
            return;
        }
        do {
        } while (!C86104wH.A1Z(this.A02));
    }

    public final void CIF(AnonymousClass688 r9) {
        Object value;
        Object value2;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        if (C18230wP.A04(r9, 0) == 2) {
            String str = C86144wL.A0T(this.A03).A00.A01;
            if (str.length() != 0 && !C18240wQ.A1V(str, Patterns.WEB_URL)) {
                C86074wE r6 = this.A02;
                do {
                    value2 = r6.getValue();
                    KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value2;
                    r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
                    z = ktCSuperShape0S0130000_I2.A02;
                    z2 = ktCSuperShape0S0130000_I2.A01;
                    C04220Ms.A0B(r3, 0);
                } while (!r6.ADi(value2, new KtCSuperShape0S0130000_I2(r3, true, z, z2)));
                return;
            }
        }
        OnboardingRespository onboardingRespository = this.A00;
        AnonymousClass5Im A0T = C86144wL.A0T(this.A03);
        C04220Ms.A0B(A0T, 0);
        C86074wE r2 = onboardingRespository.A08;
        do {
            value = r2.getValue();
        } while (!C86124wJ.A1Z((KtCSuperShape0S0200000_I2) value, A0T, value, r2));
        do {
        } while (!C86104wH.A1Z(this.A02));
    }

    public final void CiG(String str) {
        Object value;
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2;
        C86074wE r3 = this.A02;
        do {
            value = r3.getValue();
            ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
        } while (!C86114wI.A1X(ktCSuperShape0S0130000_I2, AnonymousClass5Im.A00((KtCSuperShape0S2000000_I2) null, (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00, (AnonymousClass6NY) null, (Integer) null, (String) null, (String) null, str, 247, false), value, r3));
    }

    public final C86094wG BJA() {
        return this.A03;
    }

    public final void CeR() {
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        C86074wE r6 = this.A02;
        do {
            value = r6.getValue();
            KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
            r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
            z = ktCSuperShape0S0130000_I2.A03;
            z2 = ktCSuperShape0S0130000_I2.A01;
            C04220Ms.A0B(r3, 0);
        } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, z, false, z2)));
    }

    public final void CeT() {
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        C86074wE r6 = this.A02;
        do {
            value = r6.getValue();
            KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
            r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
            z = ktCSuperShape0S0130000_I2.A02;
            z2 = ktCSuperShape0S0130000_I2.A01;
            C04220Ms.A0B(r3, 0);
        } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, false, z, z2)));
    }

    public final void CmZ(String str) {
        do {
        } while (!AnonymousClass5Im.A01(str, this.A02));
    }

    public /* synthetic */ AnonymousClass58Y(UserSession userSession) {
        OnboardingRespository A002 = AnonymousClass6NJ.A00(userSession);
        C04220Ms.A0B(A002, 2);
        this.A01 = userSession;
        this.A00 = A002;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0130000_I2((AnonymousClass5Im) null, (DefaultConstructorMarker) null, 15, 0, false, false, false));
        this.A02 = A0z;
        this.A03 = A0z;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 12), AnonymousClass3J5.A00(this), 3);
    }
}
