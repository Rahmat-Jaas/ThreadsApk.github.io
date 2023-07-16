package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.4Dw  reason: invalid class name and case insensitive filesystem */
public final class C70324Dw implements C83634rj {
    public final Fragment A00;
    public final C21800C0z A01;
    public final C83634rj A02;

    public final void BrI(boolean z, String str) {
        Fragment fragment = this.A00;
        C21800C0z c0z = this.A01;
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof BaseFragmentActivity) {
            ((BaseFragmentActivity) activity).A0F(c0z);
        }
        this.A02.BrI(z, str);
    }

    public final void CGo(C82674q5 r3) {
        this.A02.CGo(new AnonymousClass4Dy(r3, this));
    }

    public C70324Dw(Fragment fragment, C21800C0z c0z, C83634rj r3) {
        this.A00 = fragment;
        this.A01 = c0z;
        this.A02 = r3;
    }
}
