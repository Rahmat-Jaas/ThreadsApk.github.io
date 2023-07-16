package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

/* renamed from: X.4SN  reason: invalid class name */
public final class AnonymousClass4SN implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C26621qw A01;
    public final /* synthetic */ AnonymousClass1iT A02;

    public AnonymousClass4SN(Bundle bundle, C26621qw r2, AnonymousClass1iT r3) {
        this.A02 = r3;
        this.A00 = bundle;
        this.A01 = r2;
    }

    public final void run() {
        String str;
        Bundle A06 = C18180wK.A06();
        A06.putAll(this.A00);
        AnonymousClass1iT r4 = this.A02;
        AnonymousClass01V.A0p.markerEnd(725096125, 4);
        C26621qw r2 = this.A01;
        if (TextUtils.isEmpty(r2.A03)) {
            str = r4.A07;
        } else {
            str = r2.A03;
        }
        A06.putString("lookup_user_input", str);
        User user = r2.A00;
        if (user != null) {
            A06.putParcelable("user_profile_pic", user.B4M());
        }
        A06.putBoolean("can_email_reset", r2.A06);
        A06.putBoolean("can_sms_reset", r2.A07);
        A06.putBoolean("can_wa_reset", r2.A08);
        A06.putBoolean("has_fb_login_option", r2.A0A);
        A06.putString("lookup_source", r2.A04);
        Boolean bool = r2.A01;
        if (bool != null) {
            A06.putBoolean("is_autoconf_test_user", bool.booleanValue());
        }
        AnonymousClass1c9 r1 = r4.A04;
        if (!r1.A0K && !C18240wQ.A1U(r1)) {
            C63463hW.A03();
            C07530bf r3 = r4.A05;
            C18190wL.A13(A06, "IgSessionManager.LOGGED_OUT_TOKEN");
            AnonymousClass1c3 r22 = new AnonymousClass1c3();
            r22.setArguments(A06);
            AnonymousClass05O r12 = r4.A02;
            if (r12 != null) {
                r12.A0D(r22, R.id.layout_container_main);
                r12.A0K("recovery_lookup_screen");
                r12.A00();
                return;
            }
            AnonymousClass0wJ.A19(r22, r4.A01, r3);
        }
    }
}
