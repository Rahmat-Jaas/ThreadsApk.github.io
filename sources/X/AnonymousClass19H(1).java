package X;

/* renamed from: X.19H  reason: invalid class name */
public final class AnonymousClass19H extends AnonymousClass0Sf implements C85824vp {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19H) {
                AnonymousClass19H r5 = (AnonymousClass19H) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("EditableMutedWordItemModel(key=", this.A00, ", value=", this.A01, ')');
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public AnonymousClass19H(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
