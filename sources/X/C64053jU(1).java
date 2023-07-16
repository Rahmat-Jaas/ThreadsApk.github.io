package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3jU  reason: invalid class name and case insensitive filesystem */
public final class C64053jU implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ C570239l A04;
    public final /* synthetic */ UserSession A05;

    public C64053jU(FragmentActivity fragmentActivity, C570239l r2, UserSession userSession, int i, int i2, int i3) {
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A05;
        C63133bc.A04((C11630kW) null, userSession, (String) null, "av_enrollment", "av_upsell", (String) null);
        FragmentActivity fragmentActivity = this.A03;
        AnonymousClass06E A002 = AnonymousClass06E.A00(fragmentActivity);
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A00;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        C18190wL.A1O(A0O, "age_platform/age_verification/start/", i2, i3, i4);
        A0O.A0O("product_surface", String.valueOf(1));
        C31155GhB.A01(fragmentActivity, A002, AnonymousClass0wJ.A0S(A0O));
        C570239l r0 = this.A04;
        C109326jp r2 = r0.A02;
        C61043Rr.A00(r0.A00, r0.A01, r2);
    }
}
