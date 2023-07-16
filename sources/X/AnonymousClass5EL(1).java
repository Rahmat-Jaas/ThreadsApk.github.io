package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.Map;

/* renamed from: X.5EL  reason: invalid class name */
public final class AnonymousClass5EL extends C111716oC {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass7Ep A01;
    public final /* synthetic */ ZonePolicy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EL(Bundle bundle, AnonymousClass7Ep r2, ZonePolicy zonePolicy, String str, String str2, Map map) {
        super(r2);
        this.A01 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = map;
        this.A00 = bundle;
        this.A02 = zonePolicy;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.BxD(this.A04, this.A03, this.A05, this.A00, this.A02);
    }
}
