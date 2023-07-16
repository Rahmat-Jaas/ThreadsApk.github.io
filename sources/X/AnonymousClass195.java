package X;

/* renamed from: X.195  reason: invalid class name */
public final class AnonymousClass195 extends AnonymousClass0Sf implements C41882MfV {
    public final String A00;
    public final String A01;
    public final AnonymousClass0ZU A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass195) {
                AnonymousClass195 r5 = (AnonymousClass195) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A00));
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A02, (A07 + (z ? 1 : 0)) * 31);
    }

    public AnonymousClass195(String str, String str2, AnonymousClass0ZU r3, boolean z) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = r3;
    }
}
