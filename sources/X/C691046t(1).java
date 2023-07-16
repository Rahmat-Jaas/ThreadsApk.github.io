package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.46t  reason: invalid class name and case insensitive filesystem */
public final class C691046t implements C82394pY {
    public final /* synthetic */ AnonymousClass1ci A00;

    public C691046t(AnonymousClass1ci r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        RegFlowExtras regFlowExtras;
        C25786Drz A0Q;
        Bundle A06;
        Fragment r0;
        int A03 = C14030oh.A03(-2081279229);
        AnonymousClass45S r8 = (AnonymousClass45S) obj;
        int A032 = C14030oh.A03(1319395224);
        AnonymousClass1ci r9 = this.A00;
        String A002 = C63553hn.A00(r9.A09, r9.A0B);
        String str = r8.A02;
        if (!A002.equals(str)) {
            C10450iM.A03("PhoneConfirmationFragment.PhoneConfirmedSuccessfullyEventListener", C18180wK.A0j("Unexpected phone number got confirmed. Expected: %s Actual: %s", new Object[]{C63553hn.A00(r9.A09, r9.A0B), str}));
            i = 620349918;
        } else {
            if (r9.A0E && (regFlowExtras = r9.A05) != null) {
                regFlowExtras.A0Q = str;
                regFlowExtras.A05 = r8.A01;
                if (!regFlowExtras.A0t) {
                    AnonymousClass3R7.A01(r9, r8, regFlowExtras, r9.A07, r9.BDt());
                }
                FragmentActivity activity = r9.getActivity();
                if (activity != null) {
                    C313625r r1 = C313625r.SAC;
                    RegFlowExtras regFlowExtras2 = r9.A05;
                    if (r1 == regFlowExtras2.A01()) {
                        if (regFlowExtras2.A0s) {
                            regFlowExtras2.A0t = false;
                            A0Q = C18180wK.A0Q(activity, r9.A07);
                            RegFlowExtras regFlowExtras3 = r9.A05;
                            A06 = C18180wK.A06();
                            A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                            r0 = new AnonymousClass1dA();
                        } else if (regFlowExtras2.A0t) {
                            regFlowExtras2.A0t = false;
                            r9.A0G = true;
                            AnonymousClass1ci r10 = r9;
                            AnonymousClass1ci r12 = r9;
                            C67283zI.A02(AnonymousClass0wJ.A0F(), r9, r10, (C82804qI) null, r12, regFlowExtras2, r9.A06, r9.A07, r9.BDt(), regFlowExtras2.A0Z, (String) null, false);
                        } else {
                            A0Q = C18180wK.A0Q(activity, r9.A07);
                            RegFlowExtras regFlowExtras4 = r9.A05;
                            A06 = C18180wK.A06();
                            A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                            r0 = new C21261Qa();
                        }
                        C18180wK.A0x(A06, r0, A0Q);
                    }
                }
                AnonymousClass0wJ.A0F().post(new C73384Se(r9, r9.A07, r9.A05));
            }
            i = -2016232001;
        }
        C14030oh.A0A(i, A032);
        C14030oh.A0A(1648641595, A03);
    }
}
