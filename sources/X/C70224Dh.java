package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDListenerShape320S0100000_1_I2;

/* renamed from: X.4Dh  reason: invalid class name and case insensitive filesystem */
public class C70224Dh implements C84634tZ {
    public final FragmentActivity A00;

    public final void BjS(String str, String str2) {
    }

    public final void C5R() {
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

    public final /* synthetic */ void C5y(C58453Fr r5) {
        boolean z;
        if (this instanceof C26851rK) {
            C26851rK r3 = (C26851rK) this;
            C25828Dsm A0W = C18190wL.A0W(r3.A01);
            A0W.A0K(2131835226);
            C18180wK.A1M(A0W);
            Dialog A0G = A0W.A0G();
            r3.A00 = A0G;
            A0G.setOnDismissListener(new IDxDListenerShape320S0100000_1_I2(r3, 4));
            if (r3.A02.mLifecycleRegistry.A00.A00(AnonymousClass061.RESUMED)) {
                C26851rK.A00(r3.A00, r3);
            }
            z = true;
        } else {
            z = false;
        }
        r5.A00(z);
    }

    public C70224Dh(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void CM6(AnonymousClass1TP r3, C07530bf r4) {
        C18250wR.A08().post(new AnonymousClass4SM(r3, this, r4));
    }
}
