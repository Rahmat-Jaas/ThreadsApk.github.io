package X;

/* renamed from: X.0NM  reason: invalid class name */
public final class AnonymousClass0NM {
    public final String A00;
    public final boolean A01;

    public final String toString() {
        String str;
        if (this.A01) {
            str = "Succeeded";
        } else {
            str = "Failed";
        }
        String str2 = this.A00;
        if (str2 == null) {
            str2 = "<none>";
        }
        return AnonymousClass00U.A0h("[Success State: ", str, " Err Msg If Present: ", str2, "]");
    }

    public AnonymousClass0NM(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
