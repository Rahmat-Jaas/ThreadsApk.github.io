package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6nu  reason: invalid class name and case insensitive filesystem */
public final class C111576nu {
    public final C145388kQ A00(C113806sA r5) {
        try {
            C126267es r3 = (C126267es) C86104wH.A0p("create", C116316wm.class);
            r3.A00.A05("payment_type", "FBPAY_HUB");
            r3.A02 = true;
            return AnonymousClass6BW.A00(r5, AnonymousClass7Kz.A0C().A00.A00, r3.build(), C86164wN.A0N(8));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
