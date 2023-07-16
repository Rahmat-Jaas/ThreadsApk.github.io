package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape1S0420000_I2;

/* renamed from: X.86i  reason: invalid class name and case insensitive filesystem */
public final class C1371586i implements C146838mw {
    public final List A00 = AnonymousClass0wJ.A0v();

    public final void A01(String str, Object obj) {
        this.A00.add(new C58873Hv(str, obj));
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public static Object A00(C1371586i r2, Object obj, String str, KtLambdaShape1S0420000_I2 ktLambdaShape1S0420000_I2) {
        r2.A01(str, obj);
        r2.A01("interactionSource", ktLambdaShape1S0420000_I2.A01);
        r2.A01("indication", ktLambdaShape1S0420000_I2.A00);
        r2.A01("enabled", Boolean.valueOf(ktLambdaShape1S0420000_I2.A04));
        r2.A01("role", ktLambdaShape1S0420000_I2.A03);
        return ktLambdaShape1S0420000_I2.A02;
    }
}
