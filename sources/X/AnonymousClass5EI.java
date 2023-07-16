package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.5EI  reason: invalid class name */
public final class AnonymousClass5EI extends C111716oC {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass7Ep A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EI(Bundle bundle, AnonymousClass7Ep r2, String str, String str2) {
        super(r2);
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.CA9(this.A03, this.A02, this.A00);
    }
}
