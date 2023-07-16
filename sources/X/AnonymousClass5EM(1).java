package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.5EM  reason: invalid class name */
public final class AnonymousClass5EM extends C111716oC {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass7Ep A01;
    public final /* synthetic */ ZonePolicy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ long[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EM(Bundle bundle, AnonymousClass7Ep r2, ZonePolicy zonePolicy, String str, long[] jArr, boolean z) {
        super(r2);
        this.A01 = r2;
        this.A05 = jArr;
        this.A00 = bundle;
        this.A03 = str;
        this.A04 = z;
        this.A02 = zonePolicy;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        long[] jArr = this.A05;
        if (jArr.length > 0) {
            browserLiteCallback.Cdd(jArr, this.A00);
        }
        browserLiteCallback.CAP(this.A03, this.A04, this.A00, this.A02);
    }
}
