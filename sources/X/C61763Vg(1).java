package X;

/* renamed from: X.3Vg  reason: invalid class name and case insensitive filesystem */
public final class C61763Vg {
    public AnonymousClass32J A00;
    public C15730rn A01;
    public C10300i6 A02;

    public static void A00(C61763Vg r1, boolean z) {
        r1.A04("is_account_linked", z);
        r1.A01();
    }

    public final void A01() {
        C10300i6 r2 = this.A02;
        C12090lI.A00(r2).Cd7(this.A01);
        synchronized (C18250wR.A0C(r2)) {
        }
    }

    public final void A02(String str, int i) {
        this.A01.A08(Integer.valueOf(i), str);
        AnonymousClass32J r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass32J();
        }
        synchronized (r0) {
        }
    }

    public final void A03(String str, String str2) {
        this.A01.A0D(str, str2);
        AnonymousClass32J r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass32J();
        }
        synchronized (r0) {
        }
    }

    public final void A04(String str, boolean z) {
        this.A01.A09(str, Boolean.valueOf(z));
        AnonymousClass32J r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass32J();
        }
        synchronized (r0) {
        }
    }

    public C61763Vg(C10300i6 r4, C313625r r5, AnonymousClass265 r6, String str) {
        this.A02 = r4;
        C15730rn A03 = AnonymousClass1o2.A01("log_in").A03(str);
        if (r6 != null) {
            C18250wR.A19(A03, r6.A01);
        }
        if (r5 != null) {
            A03.A0D("flow", r5.A00);
        }
        this.A01 = A03;
        if (r5 != null) {
            AnonymousClass32J r0 = new AnonymousClass32J();
            synchronized (r0) {
            }
            this.A00 = r0;
        }
    }
}
