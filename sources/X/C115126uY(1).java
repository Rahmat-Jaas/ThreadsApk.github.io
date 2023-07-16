package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6uY  reason: invalid class name and case insensitive filesystem */
public final class C115126uY {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public C115126uY(String str, List list, List list2, boolean z) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(list, list2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList A0k = C18240wQ.A0k(size);
            for (int i = 0; i < size; i++) {
                A0k.add("ASC");
            }
            arrayList = A0k;
        }
        this.A00 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C115126uY) {
            C115126uY r5 = (C115126uY) obj;
            if (this.A03 == r5.A03 && C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A00, r5.A00)) {
                String str = this.A01;
                AnonymousClass0wJ.A1Y(str, "index_");
                boolean startsWith = str.startsWith("index_");
                String str2 = r5.A01;
                if (!startsWith) {
                    return str.equals(str2);
                }
                AnonymousClass0wJ.A1Y(str2, "index_");
                return str2.startsWith("index_");
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        AnonymousClass0wJ.A1Y(str, "index_");
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Index{name='");
        A0s.append(this.A01);
        A0s.append("', unique=");
        A0s.append(this.A03);
        A0s.append(", columns=");
        A0s.append(this.A02);
        A0s.append(", orders=");
        A0s.append(this.A00);
        return C18180wK.A0i("'}", A0s);
    }
}
