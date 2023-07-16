package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.3VZ  reason: invalid class name */
public final class AnonymousClass3VZ {
    public long A00;
    public String A01;
    public HashMap A02;
    public List A03;

    public AnonymousClass3VZ() {
        this((String) null, (HashMap) null, (List) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3VZ) {
                AnonymousClass3VZ r8 = (AnonymousClass3VZ) obj;
                if (!C04220Ms.A0I(this.A01, r8.A01) || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass3VZ(String str, HashMap hashMap, List list, int i) {
        long j = 0;
        str = (i & 1) != 0 ? "" : str;
        list = (i & 2) != 0 ? AnonymousClass0ZV.A00 : list;
        hashMap = (i & 4) != 0 ? AnonymousClass0wJ.A0y() : hashMap;
        j = (i & 8) != 0 ? System.currentTimeMillis() : j;
        AnonymousClass0wJ.A1O(str, list);
        C04220Ms.A0B(hashMap, 3);
        this.A01 = str;
        this.A03 = list;
        this.A02 = hashMap;
        this.A00 = j;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A03, C18180wK.A03(this.A01))) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxService(status=");
        A0s.append(this.A01);
        A0s.append(", identityMapping=");
        A0s.append(this.A03);
        A0s.append(", customData=");
        A0s.append(this.A02);
        A0s.append(", lastUpdateTimeMs=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
