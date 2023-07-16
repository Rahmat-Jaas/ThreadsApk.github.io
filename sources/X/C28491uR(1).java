package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
public final class C28491uR extends AnonymousClass9UH {
    public final C34640IcN A00;
    public final C07530bf A01;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-468544590);
        int A032 = C14030oh.A03(-216817479);
        C34640IcN icN = this.A00;
        Context requireContext = icN.requireContext();
        FragmentActivity requireActivity = icN.requireActivity();
        C07530bf r8 = this.A01;
        C36132Qd.A00(requireContext, icN, requireActivity, C18230wP.A0S(icN, r8), (C22191Ts) obj, r8, false);
        C14030oh.A0A(-399613532, A032);
        C14030oh.A0A(664811941, A03);
    }

    public C28491uR(C34640IcN icN, C07530bf r3) {
        super(icN.getParentFragmentManager());
        this.A01 = r3;
        this.A00 = icN;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(1206229866);
        C63813iO.A04(2131834837);
        C14030oh.A0A(591122496, A03);
    }
}
