package X;

import android.content.Context;

/* renamed from: X.0R9  reason: invalid class name */
public final class AnonymousClass0R9 implements C04050Mb {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04 = true;
    public final Context A05;

    public final void CWp(C04170Mn r3, AnonymousClass0ND r4) {
        if (this.A04) {
            this.A00 = C02640Cf.A01("ro.lmk.critical_upgrade");
            this.A02 = C02640Cf.A01("ro.lmk.upgrade_pressure");
            this.A03 = C02640Cf.A01("ro.lmk.use_minfree_levels");
            this.A01 = C02640Cf.A01("ro.config.low_ram");
            this.A04 = false;
        }
        String str = this.A00;
        if (str != null && !str.isEmpty()) {
            r3.A03(AnonymousClass0MU.A68, str);
        }
        String str2 = this.A02;
        if (str2 != null && !str2.isEmpty()) {
            r3.A03(AnonymousClass0MU.A6A, str2);
        }
        String str3 = this.A03;
        if (str3 != null && !str3.isEmpty()) {
            r3.A03(AnonymousClass0MU.A6B, str3);
        }
        String str4 = this.A01;
        if (str4 != null && !str4.isEmpty()) {
            r3.A03(AnonymousClass0MU.A69, str4);
        }
    }

    public AnonymousClass0R9(Context context) {
        this.A05 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0H;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
