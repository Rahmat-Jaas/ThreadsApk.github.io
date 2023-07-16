package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.5EJ  reason: invalid class name */
public final class AnonymousClass5EJ extends C111716oC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ AnonymousClass7Ep A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EJ(Bundle bundle, AnonymousClass7Ep r2, String str, int i) {
        super(r2);
        this.A02 = r2;
        this.A03 = str;
        this.A01 = bundle;
        this.A00 = i;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.C9x(this.A03, this.A01, this.A00);
    }
}
