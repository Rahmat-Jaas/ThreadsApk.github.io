package X;

import android.os.Build;

/* renamed from: X.3hF  reason: invalid class name and case insensitive filesystem */
public final class C63313hF {
    public final C10300i6 A00;
    public final String A01;
    public final String A02;

    public static C15730rn A00(C10300i6 r3, String str) {
        C15730rn A03 = AnonymousClass1o2.A01("log_in").A03(str);
        A03.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        A03.A0D("fb_family_device_id", C18190wL.A0l(r3));
        A03.A0D("guid", C18200wM.A0g());
        if (C18250wR.A01(r3) > 0) {
            A03.A0D("source", "mas");
        }
        return A03;
    }

    public static C15730rn A01(AnonymousClass1cj r3, AnonymousClass269 r4) {
        return r4.A0B(r3.A0M).A06(r3.Aiy(), r3.BDt());
    }

    public static C61763Vg A02(C10300i6 r3, C313625r r4, AnonymousClass265 r5, String str) {
        C61763Vg r2 = new C61763Vg(r3, r4, r5, str);
        r2.A02("os_version", Build.VERSION.SDK_INT);
        r2.A03("guid", C09140ev.A02.A04(C10600ic.A00));
        if (C05030Qo.A01(r3).A0B() > 0) {
            r2.A03("source", "mas");
        }
        return r2;
    }

    public final C15730rn A05() {
        C15730rn A03 = AnonymousClass1o2.A01("log_in").A03(this.A02);
        A03.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        C10300i6 r2 = this.A00;
        A03.A0D("fb_family_device_id", C18190wL.A0l(r2));
        A03.A0D("guid", C18200wM.A0g());
        if (C18250wR.A01(r2) > 0) {
            A03.A0D("source", "mas");
        }
        return A03;
    }

    public C63313hF(C10300i6 r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public static C61763Vg A03(C10300i6 r1, C313625r r2, AnonymousClass265 r3, String str) {
        C61763Vg A022 = A02(r1, r2, r3, str);
        if (r3 == AnonymousClass265.DONE) {
            A022.A03("reg_type", "consumer");
        }
        return A022;
    }

    public static void A04(C10300i6 r0, C313625r r1, AnonymousClass265 r2, String str) {
        A03(r0, r1, r2, str).A01();
    }

    public final C15730rn A06(C313625r r4, AnonymousClass265 r5) {
        C15730rn A05 = A05();
        if (r5 != null) {
            C18250wR.A19(A05, r5.A01);
        }
        if (r4 != null) {
            A05.A0D("flow", r4.A00);
        }
        return A05;
    }
}
