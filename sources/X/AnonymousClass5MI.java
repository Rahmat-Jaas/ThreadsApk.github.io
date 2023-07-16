package X;

/* renamed from: X.5MI  reason: invalid class name */
public final class AnonymousClass5MI extends AnonymousClass0Sf implements C41882MfV {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MI) {
                AnonymousClass5MI r5 = (AnonymousClass5MI) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
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
        return AnonymousClass00U.A0L(this.A01, this.A00);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, C18180wK.A03(this.A01));
    }

    public AnonymousClass5MI(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
