package com.facebook.browser.lite.callback;

import X.AnonymousClass7Ep;
import X.C111716oC;
import X.I17;
import android.os.Bundle;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.Map;

public class IDxSRunnableShape2S0400000_2_I2 extends C111716oC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape2S0400000_2_I2(Bundle bundle, AnonymousClass7Ep r3, IABEvent iABEvent, ZonePolicy zonePolicy) {
        super(r3);
        this.A00 = r3;
        this.A01 = iABEvent;
        this.A03 = bundle;
        this.A02 = zonePolicy;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        if (this.A04 != 0) {
            browserLiteCallback.AAz(I17.A00(HttpStatus.SC_NOT_ACCEPTABLE), (Map) this.A02, (Bundle) this.A03, (ZonePolicy) this.A01);
        } else {
            browserLiteCallback.C1p((IABEvent) this.A01, (Bundle) this.A03, (ZonePolicy) this.A02);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape2S0400000_2_I2(Bundle bundle, AnonymousClass7Ep r3, ZonePolicy zonePolicy, Map map) {
        super(r3);
        this.A00 = r3;
        this.A02 = map;
        this.A03 = bundle;
        this.A01 = zonePolicy;
    }
}
