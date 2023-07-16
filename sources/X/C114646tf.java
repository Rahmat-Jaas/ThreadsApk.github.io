package X;

import java.util.Arrays;

/* renamed from: X.6tf  reason: invalid class name and case insensitive filesystem */
public final class C114646tf {
    public String A00;
    public byte[] A01;

    public C114646tf(String str, byte[] bArr) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114646tf) {
                C114646tf r5 = (C114646tf) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("BackupDataFeatureEntry(feature=", this.A00, ", backupData=", Arrays.toString(this.A01), ')');
    }

    public final int hashCode() {
        return C86164wN.A07(this.A01, C18180wK.A03(this.A00));
    }
}
