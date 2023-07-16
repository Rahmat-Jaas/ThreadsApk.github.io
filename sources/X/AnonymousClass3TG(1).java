package X;

import android.os.BaseBundle;

/* renamed from: X.3TG  reason: invalid class name */
public final class AnonymousClass3TG {
    public final int A00;
    public final AnonymousClass2AC A01;
    public final AnonymousClass2AD A02;
    public final C23949D2u A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public static void A00(BaseBundle baseBundle, AnonymousClass3TG r3) {
        baseBundle.putString("ARG_MEDIA_SOURCE_TYPE", r3.A03.name());
        baseBundle.putString("ARG_UPSELL_ENTRY_POINT", r3.A01.name());
        baseBundle.putString("ARG_UPSELL_VARIANT", r3.A02.name());
    }

    public AnonymousClass3TG(AnonymousClass2AC r2, AnonymousClass2AD r3, C23949D2u d2u, String str, String str2, String str3, int i) {
        AnonymousClass0wJ.A1O(d2u, r2);
        C04220Ms.A0B(r3, 3);
        this.A03 = d2u;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = i;
    }
}
