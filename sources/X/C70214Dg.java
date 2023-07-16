package X;

import android.os.Bundle;
import com.instagram.login.api.TwoFactorInfoConfig;

/* renamed from: X.4Dg  reason: invalid class name and case insensitive filesystem */
public final class C70214Dg implements C84634tZ {
    public final AnonymousClass0YP A00;

    public C70214Dg(AnonymousClass0YP r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void BjS(String str, String str2) {
    }

    public final void C5R() {
    }

    public final /* synthetic */ void C5y(C58453Fr r2) {
        r2.A00(false);
    }

    public final void C8f() {
    }

    public final void CJu() {
    }

    public final void CJv() {
    }

    public final void CJw() {
    }

    public final void CLz(AnonymousClass3GF r1) {
    }

    public final /* synthetic */ void CM7() {
    }

    public final void CM6(AnonymousClass1TP r30, C07530bf r31) {
        AnonymousClass1TP r1 = r30;
        AnonymousClass0wJ.A1N(r31, r1);
        AnonymousClass3Um r0 = r1.A00;
        Bundle A06 = C18180wK.A06();
        r0.A00(A06);
        AnonymousClass3DR r12 = r1.A01;
        C04220Ms.A06(r12);
        String str = r12.A06;
        if (str == null) {
            str = "";
        }
        String str2 = r12.A00;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = r12.A0A;
        boolean z2 = r12.A0E;
        boolean z3 = r12.A0F;
        String str3 = r12.A05;
        if (str3 == null) {
            str3 = "";
        }
        boolean z4 = r12.A0C;
        boolean z5 = r12.A0D;
        boolean z6 = r12.A0B;
        boolean z7 = r12.A09;
        String str4 = r12.A02;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = r12.A01;
        if (str5 == null) {
            str5 = "";
        }
        boolean z8 = r12.A07;
        boolean z9 = r12.A08;
        String str6 = r12.A04;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = r12.A03;
        if (str7 == null) {
            str7 = "";
        }
        boolean z10 = z;
        boolean z11 = z2;
        boolean z12 = z3;
        String str8 = str5;
        String str9 = str6;
        String str10 = str7;
        String str11 = str3;
        String str12 = str4;
        String str13 = str2;
        A06.putParcelable("arg_two_factor_info", new TwoFactorInfoConfig(str, str13, str11, str12, str8, str9, str10, z10, z11, z12, z4, z5, z6, z7, z8, z9));
        this.A00.invoke("two_fac_authentication", A06);
    }
}
