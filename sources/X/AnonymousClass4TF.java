package X;

import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.4TF  reason: invalid class name */
public final class AnonymousClass4TF implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ C82804qI A03;
    public final /* synthetic */ C82824qK A04;
    public final /* synthetic */ RegFlowExtras A05;
    public final /* synthetic */ C07530bf A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public AnonymousClass4TF(Handler handler, C34640IcN icN, C11630kW r3, C82804qI r4, C82824qK r5, RegFlowExtras regFlowExtras, C07530bf r7, String str, boolean z) {
        this.A05 = regFlowExtras;
        this.A07 = str;
        this.A06 = r7;
        this.A01 = icN;
        this.A00 = handler;
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = z;
        this.A03 = r4;
    }

    public final void run() {
        RegFlowExtras regFlowExtras = this.A05;
        regFlowExtras.A0Z = this.A07;
        C07530bf r6 = this.A06;
        AnonymousClass01V.A0p.markerPoint(4197923, "start_create_account");
        C34640IcN icN = this.A01;
        Handler handler = this.A00;
        C11630kW r2 = this.A02;
        Integer A012 = C67283zI.A01(regFlowExtras);
        C67283zI.A03(handler, icN, r2, this.A03, this.A04, regFlowExtras, r6, A012, true);
    }
}
