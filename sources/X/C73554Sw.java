package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.4Sw  reason: invalid class name and case insensitive filesystem */
public final class C73554Sw implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C22191Ts A01;
    public final /* synthetic */ C07530bf A02;
    public final /* synthetic */ boolean A03;

    public C73554Sw(FragmentActivity fragmentActivity, C22191Ts r2, C07530bf r3, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void run() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String str = this.A01.A07;
        C04220Ms.A06(str);
        A0y.put("user_id", str);
        boolean z = this.A03;
        if (z) {
            A0y.put("present_as_modal", String.valueOf(z));
            C63743iE A022 = C63743iE.A02("com.instagram.account_security.contact_form", A0y);
            FragmentActivity fragmentActivity = this.A00;
            C07530bf r3 = this.A02;
            IgBloksScreenConfig A0N = C18190wL.A0N(r3);
            A0N.A0g = false;
            A0N.A0O = AnonymousClass006.A01;
            Fragment A0B = A022.A0B(fragmentActivity, A0N);
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r3);
            A0Q.A0D = true;
            A0Q.A03 = A0B;
            A0Q.A05();
            return;
        }
        C63743iE A023 = C63743iE.A02("com.instagram.account_security.contact_form", A0y);
        FragmentActivity fragmentActivity2 = this.A00;
        IgBloksScreenConfig A0N2 = C18190wL.A0N(this.A02);
        A0N2.A0g = false;
        C63743iE.A07(fragmentActivity2, A0N2, A023);
    }
}
