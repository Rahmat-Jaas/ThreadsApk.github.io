package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70274Dr implements C82664q4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CredentialRequest A01;
    public final /* synthetic */ C10300i6 A02;
    public final /* synthetic */ AnonymousClass3YF A03;
    public final /* synthetic */ C82664q4 A04;
    public final /* synthetic */ C82664q4 A05;
    public final /* synthetic */ AnonymousClass265 A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C70274Dr(Activity activity, CredentialRequest credentialRequest, C10300i6 r3, AnonymousClass3YF r4, C82664q4 r5, C82664q4 r6, AnonymousClass265 r7, boolean z) {
        this.A03 = r4;
        this.A01 = credentialRequest;
        this.A00 = activity;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A07 = z;
    }

    public final void BrJ(Object obj) {
        AnonymousClass3YF r7 = this.A03;
        CredentialRequest credentialRequest = this.A01;
        Activity activity = this.A00;
        AnonymousClass265 r10 = this.A06;
        C82664q4 r8 = this.A04;
        C82664q4 r9 = this.A05;
        C10300i6 r6 = this.A02;
        boolean z = this.A07;
        AnonymousClass7AL r13 = (AnonymousClass7AL) obj;
        if (r13 != null) {
            r13.A04(new AnonymousClass5pO(r13));
            C13320nQ.A02(credentialRequest, "request must not be null");
            AnonymousClass5pP r3 = new AnonymousClass5pP(credentialRequest, r13);
            r13.A07(r3);
            r3.A03(new AnonymousClass415(activity, r6, r7, r8, r9, r10, z), TimeUnit.MILLISECONDS, AnonymousClass3YF.A05);
        }
    }
}
