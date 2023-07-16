package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.3rQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64673rQ implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ C313625r A02;
    public final /* synthetic */ AnonymousClass265 A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C64673rQ(Fragment fragment, C10300i6 r2, C313625r r3, AnonymousClass265 r4, boolean z) {
        this.A04 = z;
        this.A00 = fragment;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        boolean z = this.A04;
        Fragment fragment = this.A00;
        C313625r r4 = this.A02;
        C10300i6 r3 = this.A01;
        AnonymousClass265 r2 = this.A03;
        if (z) {
            C18190wL.A1A(fragment);
            return;
        }
        C63103bV.A03.A05(view.getContext());
        C63553hn.A04(fragment.mArguments, fragment.mFragmentManager);
        if (r4 != null) {
            C54302zE.A00(r3, r4, r2.A01);
        }
        AnonymousClass3RH.A00 = null;
        AnonymousClass3Y3.A01(fragment.requireContext());
    }
}
