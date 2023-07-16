package X;

import java.util.List;

/* renamed from: X.5MJ  reason: invalid class name */
public final class AnonymousClass5MJ extends AnonymousClass0Sf implements C41882MfV {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MJ) {
                AnonymousClass5MJ r5 = (AnonymousClass5MJ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
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
        return Integer.valueOf(this.A01.hashCode());
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A01)));
    }

    public AnonymousClass5MJ(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }
}
