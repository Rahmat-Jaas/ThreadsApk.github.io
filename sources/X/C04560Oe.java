package X;

import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;

/* renamed from: X.0Oe  reason: invalid class name and case insensitive filesystem */
public interface C04560Oe {
    Object get();

    static C04840Pi A00(AnonymousClass0OK r2) {
        C04560Oe r1 = r2.A0B;
        if (r1 == null) {
            r1 = new IDxLProviderShape84S0100000_I2(r2, 4);
            r2.A0B = r1;
        }
        return (C04840Pi) r1.get();
    }
}
