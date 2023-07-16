package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.4Se  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73384Se implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ RegFlowExtras A02;

    public /* synthetic */ C73384Se(Fragment fragment, C10300i6 r2, RegFlowExtras regFlowExtras) {
        this.A02 = regFlowExtras;
        this.A01 = r2;
        this.A00 = fragment;
    }

    public final void run() {
        RegFlowExtras regFlowExtras = this.A02;
        C10300i6 r4 = this.A01;
        Fragment fragment = this.A00;
        C61753Vf A012 = C63463hW.A01();
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        C18220wO.A1A(A012.A01(A06, r4.getToken()), C18180wK.A0Q(fragment.requireActivity(), r4));
    }
}
