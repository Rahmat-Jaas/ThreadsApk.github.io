package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.79m  reason: invalid class name and case insensitive filesystem */
public final class C1202779m {
    public static final C1202779m A04 = new C1202779m(AnonymousClass0ZV.A00, (List) null, new int[]{0}, 0);
    public final int A00;
    public final List A01;
    public final List A02;
    public final int[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C04220Ms.A0I(getClass(), C86144wL.A0a(obj))) {
                C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
                C1202779m r5 = (C1202779m) obj;
                if (!Arrays.equals(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A01, Arrays.hashCode(this.A03) * 31) + this.A00) * 31) + C18230wP.A05(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TransformablePage(originalPageOffsets=");
        A0s.append(Arrays.toString(this.A03));
        A0s.append(AnonymousClass000.A00(85));
        A0s.append(this.A01);
        A0s.append(", hintOriginalPageOffset=");
        A0s.append(this.A00);
        A0s.append(", hintOriginalIndices=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C1202779m(List list, List list2, int[] iArr, int i) {
        AnonymousClass0wJ.A1O(iArr, list);
        this.A03 = iArr;
        this.A01 = list;
        this.A00 = i;
        this.A02 = list2;
        if (iArr.length == 0) {
            throw C18190wL.A0a("originalPageOffsets cannot be empty when constructing TransformablePage");
        } else if (list2 != null && list2.size() != list.size()) {
            throw C18190wL.A0a(C86134wK.A0l(list2.size(), list.size(), "If originalIndices (size = ", ") is provided, it must be same length as data (size = "));
        }
    }
}
