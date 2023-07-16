package X;

/* renamed from: X.0Dr  reason: invalid class name and case insensitive filesystem */
public final class C02990Dr {
    public final C02930Dl A00;
    public final C02940Dm A01;

    public final C02930Dl A00(AnonymousClass0DW r4, String str) {
        if (r4 == null) {
            return null;
        }
        C02930Dl r1 = this.A00;
        r1.A57((String) null, "mobile_power_stats");
        if (!r1.isSampled()) {
            return null;
        }
        this.A01.Cdb(r4, r1);
        r1.A5T("dimension", str);
        return r1;
    }

    public C02990Dr(C02930Dl r1, C02940Dm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
