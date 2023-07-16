package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.5EH  reason: invalid class name */
public final class AnonymousClass5EH extends C111716oC {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass7Ep A01;
    public final /* synthetic */ ZonePolicy A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EH(Bundle bundle, AnonymousClass7Ep r2, ZonePolicy zonePolicy, String str) {
        super(r2);
        this.A01 = r2;
        this.A03 = str;
        this.A00 = bundle;
        this.A02 = zonePolicy;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.CHL(this.A03, this.A00, this.A02);
    }
}
