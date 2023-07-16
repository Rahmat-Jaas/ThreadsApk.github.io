package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Do  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4Do implements C82664q4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Credential A01;
    public final /* synthetic */ AnonymousClass3YF A02;
    public final /* synthetic */ C83634rj A03;
    public final /* synthetic */ AnonymousClass265 A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass4Do(Activity activity, Credential credential, AnonymousClass3YF r3, C83634rj r4, AnonymousClass265 r5, boolean z) {
        this.A02 = r3;
        this.A01 = credential;
        this.A00 = activity;
        this.A04 = r5;
        this.A05 = z;
        this.A03 = r4;
    }

    public final void BrJ(Object obj) {
        String str;
        AnonymousClass3YF r6 = this.A02;
        Credential credential = this.A01;
        Activity activity = this.A00;
        AnonymousClass265 r8 = this.A04;
        boolean z = this.A05;
        C83634rj r7 = this.A03;
        AnonymousClass7AL r11 = (AnonymousClass7AL) obj;
        if (r11 != null) {
            C13320nQ.A02(credential, "credential must not be null");
            r11.A04(new AnonymousClass5pQ(credential, r11)).A03(new AnonymousClass414(activity, r6, r7, r8, z), TimeUnit.MILLISECONDS, AnonymousClass3YF.A05);
            return;
        }
        if (!z) {
            C10300i6 r0 = r6.A03;
            if (r8 == null) {
                str = null;
            } else {
                str = r8.A01;
            }
            C04220Ms.A0B(r0, 0);
            C63523hf.A04(r0, str, (String) null, 48, false, false);
        }
        r7.BrI(false, (String) null);
    }
}
