package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3GC  reason: invalid class name */
public final class AnonymousClass3GC {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C11630kW A03;
    public final /* synthetic */ C82844qM A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public AnonymousClass3GC(Activity activity, Fragment fragment, FragmentActivity fragmentActivity, C11630kW r4, C82844qM r5, UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        this.A07 = z;
        this.A04 = r5;
        this.A05 = userSession;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = fragment;
        this.A06 = str;
        this.A02 = fragmentActivity;
        this.A08 = z2;
        this.A09 = z3;
    }

    public final void A00(boolean z, String str) {
        C61603Ul r7;
        String str2 = str;
        C04220Ms.A0B(str2, 1);
        boolean z2 = this.A07;
        if (!z2 && this.A04 != null) {
            C54212z5.A00(this.A05, "contacts_upsell");
        }
        C11630kW r6 = this.A03;
        UserSession userSession = this.A05;
        if (r6 == null) {
            r7 = new C61603Ul(userSession);
        }
        Activity activity = this.A00;
        C82844qM r8 = this.A04;
        if (AnonymousClass7K8.A02(activity, new AnonymousClass483(activity, this.A01, this.A02, r6, r7, r8, userSession, str2, this.A06, z2, this.A08, z, this.A09), new String[]{"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"})) {
            r7.A00(str2, AnonymousClass006.A00);
        }
    }
}
