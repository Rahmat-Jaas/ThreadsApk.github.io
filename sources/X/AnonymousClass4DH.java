package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.login.twofac.model.TotpSeed;

/* renamed from: X.4DH  reason: invalid class name */
public final class AnonymousClass4DH implements C33516HpC {
    public final /* synthetic */ AnonymousClass1wr A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4DH(AnonymousClass1wr r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean onToggle(boolean z) {
        Fragment r0;
        Integer num;
        String str;
        AnonymousClass1wr r4 = this.A00;
        if (z) {
            C04530Oa r5 = r4.A02;
            AnonymousClass3WQ.A00(AnonymousClass0wJ.A0X(r5), AnonymousClass006.A03);
            boolean A0E = C63833iQ.A0E(r4.requireContext());
            boolean A0F = C63833iQ.A0F(r4.requireContext());
            C04220Ms.A06(C62653aT.A01());
            Bundle requireArguments = r4.requireArguments();
            if (A0E) {
                if (A0F) {
                    num = AnonymousClass006.A0C;
                } else {
                    num = AnonymousClass006.A00;
                }
            } else if (A0F) {
                num = AnonymousClass006.A01;
            } else {
                r0 = new AnonymousClass1bM();
                new C25786Drz(C18210wN.A0F(requireArguments, r0, r4), AnonymousClass0wJ.A0U(r5));
                return true;
            }
            switch (num.intValue()) {
                case 0:
                    str = "Duo Mobile";
                    break;
                case 1:
                    str = "Google Authenticator";
                    break;
                default:
                    str = "Authentication App";
                    break;
            }
            requireArguments.putString("arg_two_fac_app_name", str);
            r0 = new AnonymousClass1bN();
            new C25786Drz(C18210wN.A0F(requireArguments, r0, r4), AnonymousClass0wJ.A0U(r5));
            return true;
        }
        AnonymousClass3WQ.A00(AnonymousClass0wJ.A0X(r4.A02), AnonymousClass006.A05);
        AnonymousClass1wr.A0C(r4, (TotpSeed) null, this.A02, this.A01, false);
        return true;
    }
}
