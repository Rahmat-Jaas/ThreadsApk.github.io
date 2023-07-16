package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Dm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70244Dm implements C82664q4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass355 A01;
    public final /* synthetic */ AnonymousClass3YF A02;
    public final /* synthetic */ C82664q4 A03;

    public /* synthetic */ C70244Dm(Activity activity, AnonymousClass355 r2, AnonymousClass3YF r3, C82664q4 r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = r4;
    }

    public final void BrJ(Object obj) {
        AnonymousClass3YF r6 = this.A02;
        AnonymousClass355 r0 = this.A01;
        Activity activity = this.A00;
        C82664q4 r2 = this.A03;
        AnonymousClass7AL r8 = (AnonymousClass7AL) obj;
        Credential credential = r0.A00;
        C13320nQ.A02(r8, "client must not be null");
        C13320nQ.A02(credential, "credential must not be null");
        r8.A04(new AnonymousClass5pR(credential, r8)).A03(new AnonymousClass413(activity, r6, r2), TimeUnit.MILLISECONDS, AnonymousClass3YF.A05);
    }
}
