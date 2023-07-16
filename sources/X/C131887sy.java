package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.instagram.api.schemas.TrackData;

/* renamed from: X.7sy  reason: invalid class name and case insensitive filesystem */
public final class C131887sy implements C41882MfV {
    public final KtCSuperShape0S0300000_I2 A00;
    public final C11630kW A01;

    public C131887sy(KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2, C11630kW r3) {
        C04220Ms.A0B(ktCSuperShape0S0300000_I2, 1);
        this.A00 = ktCSuperShape0S0300000_I2;
        this.A01 = r3;
    }

    /* renamed from: A00 */
    public final String getKey() {
        String str;
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = this.A00;
        C1535598i r0 = (C1535598i) ktCSuperShape0S0300000_I2.A01;
        if (r0 != null) {
            return r0.A0B;
        }
        TrackData trackData = (TrackData) ktCSuperShape0S0300000_I2.A02;
        if (trackData != null && (str = trackData.A05) != null) {
            return str;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2;
        C131887sy r3 = (C131887sy) obj;
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I22 = this.A00;
        if (r3 != null) {
            ktCSuperShape0S0300000_I2 = r3.A00;
        } else {
            ktCSuperShape0S0300000_I2 = null;
        }
        return C04220Ms.A0I(ktCSuperShape0S0300000_I22, ktCSuperShape0S0300000_I2);
    }
}
