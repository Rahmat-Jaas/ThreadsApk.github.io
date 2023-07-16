package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.KtLambdaShape6S1100000_I2;

/* renamed from: X.6rB  reason: invalid class name and case insensitive filesystem */
public final class C113336rB {
    public final /* synthetic */ C89395Ei A00;

    public C113336rB(C89395Ei r1) {
        this.A00 = r1;
    }

    public final void A00(String str) {
        C89395Ei r1 = this.A00;
        KtLambdaShape6S1100000_I2 ktLambdaShape6S1100000_I2 = new KtLambdaShape6S1100000_I2(str, r1, 5);
        C148838sG r2 = r1.A08;
        if (r2 == null || !r2.isActive() || r2.BQv(new KtLambdaShape6S1100000_I2(str, ktLambdaShape6S1100000_I2, 4)) == null) {
            ktLambdaShape6S1100000_I2.invoke(str);
        }
    }

    public final void A01(String str) {
        String str2;
        C114926u8 r2 = this.A00.A01;
        if (r2 != null) {
            WeakReference weakReference = r2.A00;
            if (weakReference != null) {
                IF5 if5 = (IF5) weakReference.get();
                if (if5 != null) {
                    C1189172u.A00(new AnonymousClass82E(r2, if5, str));
                    return;
                }
                throw C18180wK.A0a(I17.A00(436));
            }
            str2 = "browserLiteWebView";
        } else {
            str2 = "jSInjector";
        }
        C04220Ms.A0E(str2);
        throw null;
    }
}
