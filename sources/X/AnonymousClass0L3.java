package X;

import java.io.IOException;

/* renamed from: X.0L3  reason: invalid class name */
public final class AnonymousClass0L3 extends AnonymousClass0Y2 {
    public final /* synthetic */ AnonymousClass0Q1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0L3(AnonymousClass0O7 r1, AnonymousClass0Q1 r2) {
        super(r1);
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass0O6 r6) {
        String str = r6.A00;
        if (str != null) {
            AnonymousClass0Q1 r3 = this.A00;
            if (!r3.A01.contains(str)) {
                try {
                    String A002 = r3.A00(AnonymousClass00U.A0V(r6.A00, "=", r6.A01));
                    int indexOf = A002.indexOf(61);
                    if (indexOf != -1) {
                        r6.A00 = A002.substring(0, indexOf);
                        r6.A01 = A002.substring(indexOf + 1);
                        return true;
                    }
                } catch (IOException unused) {
                    C04790Pd.A00();
                }
            }
        }
        return false;
    }
}
