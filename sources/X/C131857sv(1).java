package X;

/* renamed from: X.7sv  reason: invalid class name and case insensitive filesystem */
public final class C131857sv implements C41882MfV {
    public Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131857sv r3 = (C131857sv) obj;
        C04220Ms.A0B(r3, 0);
        if (!C04220Ms.A0I(this.A04, r3.A04) || !C04220Ms.A0I(this.A05, r3.A05) || !C04220Ms.A0I(this.A01, r3.A01) || !C04220Ms.A0I(this.A03, r3.A03) || !C04220Ms.A0I(this.A02, r3.A02)) {
            return false;
        }
        return true;
    }

    public C131857sv(Long l, String str, Long l2, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(str, str2);
        C18230wP.A1R(str3, 3, str4);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = l;
        this.A00 = l2;
        this.A02 = str4;
    }
}
