package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1lV  reason: invalid class name */
public final class AnonymousClass1lV extends C30809GWj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C83634rj A03;
    public final /* synthetic */ AnonymousClass265 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass1lV(Fragment fragment, C10300i6 r2, ImageUrl imageUrl, C83634rj r4, AnonymousClass265 r5, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void A02(Exception exc) {
        this.A03.BrI(false, "Failure getting SmartLock instance");
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        FragmentActivity activity;
        C62783aj r11 = (C62783aj) obj;
        Fragment fragment = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        ImageUrl imageUrl = this.A02;
        boolean z = this.A07;
        AnonymousClass265 r6 = this.A04;
        C10300i6 r1 = this.A01;
        C83634rj r5 = this.A03;
        if (fragment == null || (activity = fragment.getActivity()) == null || r11 == null) {
            r5.BrI(false, "Activity or SmartLock plugin null");
        } else {
            r11.getSmartLockBroker(activity, new C70264Dq(fragment, imageUrl, r5, r6, str, str2, z), r1);
        }
    }
}
