package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.redex.IDxProviderShape243S0100000_I2;
import java.util.Random;

/* renamed from: X.0nv  reason: invalid class name and case insensitive filesystem */
public final class C13570nv {
    public final AnonymousClass03R A00;
    public final C13540ns A01;

    public C13570nv(Context context, AnonymousClass0W4 r17) {
        AnonymousClass0IB A002 = C10450iM.A00();
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I2 = new IDxProviderShape243S0100000_I2(context, 12, 42);
        C13840oO r11 = C13840oO.A00;
        C13800oK r12 = C13800oK.A00;
        C13690o8 r13 = C13690o8.A00;
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I22 = new IDxProviderShape243S0100000_I2(A002, 13, 42);
        C13920oW r8 = new C13920oW();
        C12440lu r7 = new C12440lu();
        Random random = new Random();
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C04220Ms.A06(awakeTimeSinceBootClock);
        AnonymousClass03R r4 = new AnonymousClass03R(awakeTimeSinceBootClock, r17, r7, r8, random, iDxProviderShape243S0100000_I2, r11, r12, r13, iDxProviderShape243S0100000_I22);
        this.A00 = r4;
        this.A01 = new C13540ns(new C18020vw(A002, new C12440lu(), C13580nw.A00), r4);
    }
}
