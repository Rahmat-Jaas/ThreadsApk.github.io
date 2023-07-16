package X;

import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2;
import com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2;

/* renamed from: X.4A9  reason: invalid class name */
public final class AnonymousClass4A9 implements C33841Hva {
    public C61733Vd A00;
    public final C32165H8c A01;

    public final int getRunnableId() {
        return -8;
    }

    public final void onCancel() {
    }

    public static void A00(AnonymousClass4A9 r2, Object obj, int i) {
        r2.A00 = new IDxACallbackShape103S0100000_1_I2(obj, i, 42);
    }

    public static void A01(AnonymousClass4A9 r1, Object obj, Object obj2, int i) {
        r1.A00 = new IDxACallbackShape31S0200000_1_I2(i, obj, obj2);
    }

    public static void A02(AnonymousClass4A9 r6, Object obj, Object obj2, Object obj3, int i) {
        r6.A00 = new IDxACallbackShape10S0300000_1_I2(i, 42, obj, obj2, obj3);
    }

    public final String getName() {
        return this.A01.A0A;
    }

    public final void onFinish() {
        this.A01.onFinish();
    }

    public final void onStart() {
        this.A01.onStart();
    }

    public final void run() {
        this.A01.run();
    }

    public AnonymousClass4A9(C32165H8c h8c) {
        this.A01 = h8c;
        C63873iU.A0E(h8c, this, 4);
    }
}
