package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.4SU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4SU implements Runnable {
    public final /* synthetic */ C22181Tr A00;
    public final /* synthetic */ C24411ih A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass4SU(C22181Tr r1, C24411ih r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        C25786Drz A0Q;
        Bundle A06;
        Fragment r0;
        C24411ih r4 = this.A01;
        String str = this.A02;
        C22181Tr r1 = this.A00;
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A08 = str;
        regFlowExtras.A0m = r1.A07;
        regFlowExtras.A0X = r1.A02;
        regFlowExtras.A0C = r1.A00;
        regFlowExtras.A0g = r1.A04;
        RegFlowExtras regFlowExtras2 = r4.A04;
        if (regFlowExtras2 != null) {
            C313625r r2 = C313625r.SAC;
            if (r2 == regFlowExtras2.A01()) {
                regFlowExtras.A0g = regFlowExtras2.A0g;
                regFlowExtras.A0J = regFlowExtras2.A0J;
                regFlowExtras.A0M = regFlowExtras2.A0M;
                regFlowExtras.A0t = regFlowExtras2.A0t;
            }
            regFlowExtras.A04 = regFlowExtras2.A04;
            regFlowExtras.A03 = regFlowExtras2.A03;
            if (r2 == regFlowExtras2.A01()) {
                regFlowExtras.A0Z = regFlowExtras2.A0Z;
                regFlowExtras.A0P = regFlowExtras2.A0P;
                regFlowExtras.A03(r2);
                Integer A022 = regFlowExtras2.A02();
                if (A022 != null) {
                    regFlowExtras.A0V = AnonymousClass2TT.A00(A022);
                }
                regFlowExtras.A0v = regFlowExtras2.A0v;
                regFlowExtras.A06 = regFlowExtras2.A06;
                regFlowExtras.A07 = regFlowExtras2.A07;
                AnonymousClass3WW.A01(regFlowExtras2, regFlowExtras);
                if (regFlowExtras2.A0s) {
                    regFlowExtras.A0t = false;
                    A0Q = C18180wK.A0Q(r4.A01.getActivity(), r4.A02);
                    A06 = C18180wK.A06();
                    A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                    r0 = new AnonymousClass1dA();
                } else if (regFlowExtras.A0t) {
                    regFlowExtras.A0t = false;
                    C07530bf r8 = (C07530bf) r4.A02;
                    String str2 = regFlowExtras2.A0Z;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C34640IcN icN = r4.A01;
                    C34640IcN icN2 = icN;
                    C67283zI.A02(AnonymousClass0wJ.A0F(), icN, icN2, (C82804qI) null, r4.A03, regFlowExtras, r4.A05, r8, AnonymousClass265.A1F, str2, (String) null, false);
                    return;
                } else {
                    A0Q = C18180wK.A0Q(r4.A01.getActivity(), r4.A02);
                    A06 = C18180wK.A06();
                    A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                    r0 = new C21261Qa();
                }
                C18180wK.A0x(A06, r0, A0Q);
                return;
            }
        }
        C61753Vf A012 = C63463hW.A01();
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        C10300i6 r22 = r4.A02;
        AnonymousClass0wJ.A19(A012.A01(A062, r22.getToken()), r4.A01.getActivity(), r22);
    }
}
