package X;

import java.util.Map;

/* renamed from: X.7ki  reason: invalid class name and case insensitive filesystem */
public final class C128967ki implements C145378kP {
    public final /* synthetic */ AnonymousClass5qq A00;
    public final /* synthetic */ C92755jo A01;

    public C128967ki(AnonymousClass5qq r1, C92755jo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Bnr() {
        this.A00.A06();
    }

    public final void Bs6() {
        C92835jw r3 = this.A01.A01;
        C112716q4 r0 = r3.A07;
        if (r0 != null) {
            M5J m5j = r3.A02;
            if (m5j == null) {
                m5j = r0.A01;
                r3.A02 = m5j;
            }
            m5j.A0E(r3.A0D);
            Map A06 = C122037Js.A06(r3.A06);
            C86134wK.A1N("target_name", "add_shoppay", A06);
            r3.A0E.Bb8("user_add_credential_enter", A06);
        }
        this.A00.A06();
    }
}
