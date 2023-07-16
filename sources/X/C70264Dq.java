package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.4Dq  reason: invalid class name and case insensitive filesystem */
public final class C70264Dq implements C82664q4 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ C83634rj A02;
    public final /* synthetic */ AnonymousClass265 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C70264Dq(Fragment fragment, ImageUrl imageUrl, C83634rj r3, AnonymousClass265 r4, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A06 = z;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void BrJ(Object obj) {
        String str;
        FragmentActivity activity;
        AnonymousClass3YF r5 = (AnonymousClass3YF) obj;
        Fragment fragment = this.A00;
        String str2 = this.A05;
        String str3 = this.A04;
        ImageUrl imageUrl = this.A01;
        boolean z = this.A06;
        AnonymousClass265 r3 = this.A03;
        C83634rj r7 = this.A02;
        if (TextUtils.isEmpty(str3)) {
            str = "Password is empty";
        } else if (r5 == null || (activity = fragment.getActivity()) == null) {
            str = "SmartLock broker or Activity null";
        } else {
            IDxLListenerShape125S0100000_1_I2 iDxLListenerShape125S0100000_1_I2 = new IDxLListenerShape125S0100000_1_I2(r5, 0);
            if (activity instanceof BaseFragmentActivity) {
                ((BaseFragmentActivity) activity).A0E(iDxLListenerShape125S0100000_1_I2);
            }
            FragmentActivity activity2 = fragment.getActivity();
            C70324Dw r2 = new C70324Dw(fragment, iDxLListenerShape125S0100000_1_I2, r7);
            if (r5.A00 != null) {
                Credential credential = new Credential(C15430rJ.A01(imageUrl.getUrl()), str2, (String) null, str3, (String) null, (String) null, (String) null, (List) null);
                AnonymousClass7lN r1 = r5.A00;
                r1.getClass();
                r1.A00(new AnonymousClass4Do(activity2, credential, r5, r2, r3, z));
                return;
            }
            return;
        }
        r7.BrI(false, str);
    }
}
