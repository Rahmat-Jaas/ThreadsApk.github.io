package X;

import android.app.Activity;
import android.net.Uri;

/* renamed from: X.1r9  reason: invalid class name and case insensitive filesystem */
public final class C26751r9 extends C24431ij {
    public final /* synthetic */ C27191s7 A00;
    public final /* synthetic */ C81574o1 A01;
    public final /* synthetic */ C18330wh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26751r9(Activity activity, Uri uri, C11630kW r13, C84634tZ r14, C27191s7 r15, C81574o1 r16, C07530bf r17, C18330wh r18, AnonymousClass265 r19, Integer num) {
        super(activity, uri, r13, r14, r17, r19, num, (String) null);
        this.A00 = r15;
        this.A01 = r16;
        this.A02 = r18;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-1501269581);
        super.onFail(r3);
        this.A02.dismiss();
        C14030oh.A0A(-1374641595, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-887789641);
        super.onStart();
        C13950oZ.A00(this.A02);
        C14030oh.A0A(-2123229941, A03);
    }
}
