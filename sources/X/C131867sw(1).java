package X;

/* renamed from: X.7sw  reason: invalid class name and case insensitive filesystem */
public final class C131867sw implements C41882MfV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C131867sw(String str, String str2, String str3, String str4, String str5, boolean z) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(str3, str4);
        C04220Ms.A0B(str5, 6);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A05 = z;
        this.A00 = str5;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131867sw r3 = (C131867sw) obj;
        C04220Ms.A0B(r3, 0);
        if (!C04220Ms.A0I(this.A04, r3.A04) || !C04220Ms.A0I(this.A01, r3.A01) || this.A05 != r3.A05 || !C04220Ms.A0I(this.A00, r3.A00)) {
            return false;
        }
        return true;
    }
}
