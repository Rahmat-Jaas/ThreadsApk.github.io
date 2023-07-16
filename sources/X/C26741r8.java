package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;

/* renamed from: X.1r8  reason: invalid class name and case insensitive filesystem */
public class C26741r8 extends C24431ij {
    public final C18330wh A00;

    public C26741r8(Fragment fragment, C11630kW r11, C84634tZ r12, C07530bf r13, AnonymousClass265 r14) {
        super(fragment.requireActivity(), (Uri) null, r11, r12, r13, r14, AnonymousClass006.A01, (String) null);
        C18330wh A01 = C18330wh.A01(fragment);
        this.A00 = A01;
        C18330wh.A03(fragment, A01, 2131830126);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-561326594);
        super.onFinish();
        this.A00.dismiss();
        C14030oh.A0A(-1913343371, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-147299384);
        super.onStart();
        C13950oZ.A00(this.A00);
        C14030oh.A0A(-1919438038, A03);
    }
}
