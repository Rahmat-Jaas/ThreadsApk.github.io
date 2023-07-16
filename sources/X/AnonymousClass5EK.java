package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.5EK  reason: invalid class name */
public final class AnonymousClass5EK extends C111716oC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ AnonymousClass7Ep A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EK(Bundle bundle, AnonymousClass7Ep r2, String str, int i, long j) {
        super(r2);
        this.A03 = r2;
        this.A04 = str;
        this.A02 = bundle;
        this.A00 = i;
        this.A01 = j;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.CA0(this.A04, this.A02, this.A00, this.A01);
    }
}
