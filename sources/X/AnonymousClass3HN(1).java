package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.3HN  reason: invalid class name */
public final class AnonymousClass3HN {
    public C10300i6 A00;
    public final Fragment A01;
    public final AnonymousClass3Y3 A02;
    public volatile RegFlowExtras A03;

    public final void A00() {
        AnonymousClass3Y3 r3 = this.A02;
        r3.A00.A02(new C686544x(new AnonymousClass35W(this), r3), "reg_flow_extras_serialize_key");
    }

    public AnonymousClass3HN(Fragment fragment, C10300i6 r3) {
        this.A00 = r3;
        this.A01 = fragment;
        this.A02 = AnonymousClass3Y3.A00(fragment.getContext());
    }

    public final void A01() {
        Bundle A06;
        Fragment r2;
        Integer num = AnonymousClass3VH.A00().A05;
        Integer num2 = AnonymousClass006.A0C;
        if (num == num2 || AnonymousClass3YV.A00().A01() == num2) {
            if (this.A03 != null) {
                RegFlowExtras regFlowExtras = this.A03;
                A06 = C18180wK.A06();
                A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            } else {
                A06 = C18180wK.A06();
            }
            C63463hW.A03();
            C18180wK.A0w(A06, this.A00);
            r2 = new AnonymousClass1bG();
        } else {
            RegFlowExtras regFlowExtras2 = new RegFlowExtras();
            A06 = C18180wK.A06();
            A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            C10300i6 r0 = this.A00;
            C18180wK.A0w(A06, r0);
            C63463hW.A01();
            C18190wL.A13(A06, r0.getToken());
            r2 = new AnonymousClass1cj();
        }
        r2.setArguments(A06);
        C18200wM.A1G(r2, this.A01.mFragmentManager);
    }
}
