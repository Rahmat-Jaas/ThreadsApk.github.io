package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7gk  reason: invalid class name and case insensitive filesystem */
public final class C127217gk implements C146298m0 {
    public final C14100oo A00;
    public final AnonymousClass6U9 A01;
    public final C04530Oa A02;

    public final void A6h(String str) {
    }

    public final void A64(Exception exc) {
        this.A00.Ciu(exc);
    }

    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    public final void report() {
        C14100oo r3 = this.A00;
        if (r3.isSampled()) {
            Iterator A0z = AnonymousClass0wJ.A0z(AnonymousClass4WJ.A0A());
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                r3.A8U(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            r3.report();
        }
    }

    public C127217gk(AnonymousClass6U9 r4, Integer num, C04530Oa r6) {
        this.A02 = r6;
        this.A01 = r4;
        int A002 = C116776xX.A00(num);
        this.A00 = ((C14090on) r6.getValue()).ABJ(C116776xX.A01(num), A002);
    }

    public final void A8X(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A00.A8U(str, str2);
    }
}
