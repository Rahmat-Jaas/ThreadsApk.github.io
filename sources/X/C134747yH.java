package X;

import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7yH  reason: invalid class name and case insensitive filesystem */
public final class C134747yH implements CharSequence {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C134747yH(java.util.List r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            r0 = r5 & 2
            if (r0 == 0) goto L_0x0007
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x0007:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x000d
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x000d:
            X.AnonymousClass0wJ.A1O(r6, r4)
            r0 = 3
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r4 = r1
        L_0x001c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0023
            r2 = r1
        L_0x0023:
            r3.<init>(r6, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134747yH.<init>(java.util.List, int, java.lang.String):void");
    }

    public static C134747yH A03(AnonymousClass7HD r4, int i) {
        C04220Ms.A0B(r4, 0);
        C134747yH r2 = r4.A01;
        int A012 = C121767Ia.A01(r4.A00);
        return r2.subSequence(Math.max(0, A012 - i), A012);
    }

    public static C134747yH A04(String str) {
        return new C134747yH((List) null, 6, str);
    }

    public final C134747yH A06(C134747yH r5) {
        C04220Ms.A0B(r5, 0);
        C134727yF r0 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
        r0.A04(this);
        r0.A04(r5);
        return r0.A01();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A08(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.util.List r6 = r7.A01
            if (r6 == 0) goto L_0x002e
            java.util.ArrayList r1 = X.C18200wM.A0t(r6)
            int r5 = r6.size()
            r4 = 0
        L_0x0011:
            if (r4 >= r5) goto L_0x0030
            java.lang.Object r3 = r6.get(r4)
            r2 = r3
            X.7HE r2 = (X.AnonymousClass7HE) r2
            java.lang.Object r0 = r2.A02
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r2.A03
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x002b
            X.AnonymousClass7HE.A00(r2, r3, r1, r9, r10)
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x002e:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0030:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>"
            X.C04220Ms.A0C(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134747yH.A08(java.lang.String, int, int):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134747yH) {
                C134747yH r5 = (C134747yH) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(AnonymousClass7JO r2) {
        r2.A04.A00 = null;
        return r2.A01.A00.length();
    }

    public static int A02(C134747yH r0) {
        return r0.A00.length();
    }

    /* renamed from: A05 */
    public final C134747yH subSequence(int i, int i2) {
        if (i > i2) {
            throw C18190wL.A0a(C86134wK.A0l(i, i2, "start (", ") should be less or equal to end ("));
        } else if (i == 0 && i2 == A02(this)) {
            return this;
        } else {
            return new C134747yH(C18230wP.A0s(this.A00, i, i2), AnonymousClass7G7.A01(this.A03, i, i2), AnonymousClass7G7.A01(this.A02, i, i2), AnonymousClass7G7.A01(this.A01, i, i2));
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A07(int r8, int r9) {
        /*
            r7 = this;
            java.util.List r6 = r7.A01
            if (r6 == 0) goto L_0x0022
            java.util.ArrayList r1 = X.C18200wM.A0t(r6)
            int r5 = r6.size()
            r4 = 0
        L_0x000d:
            if (r4 >= r5) goto L_0x0024
            java.lang.Object r3 = r6.get(r4)
            r2 = r3
            X.7HE r2 = (X.AnonymousClass7HE) r2
            java.lang.Object r0 = r2.A02
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x001f
            X.AnonymousClass7HE.A00(r2, r3, r1, r8, r9)
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0022:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0024:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>"
            X.C04220Ms.A0C(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134747yH.A07(int, int):java.util.List");
    }

    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public final int hashCode() {
        int i = 0;
        int A032 = (((C18180wK.A03(this.A00) + C18230wP.A05(this.A03)) * 31) + C18230wP.A05(this.A02)) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A032 + i;
    }

    public final String toString() {
        return this.A00;
    }

    public static int A01(C81784oM r0) {
        return ((AnonymousClass7HD) r0.getValue()).A01.A00.length();
    }

    public final /* bridge */ int length() {
        return A02(this);
    }

    public C134747yH(String str, List list, List list2, List list3) {
        List A0W;
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 != null && (A0W = AnonymousClass00J.A0W(list2, new IDxComparatorShape95S0000000_2_I2(2))) != null) {
            int size = A0W.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                AnonymousClass7HE A0H = C86154wM.A0H(A0W, i2);
                if (A0H.A01 >= i) {
                    int i3 = A0H.A00;
                    if (i3 <= A02(this)) {
                        i = A0H.A00;
                        i2++;
                    } else {
                        throw C18190wL.A0a(AnonymousClass00U.A0Z("ParagraphStyle range [", ", ", ") is out of boundary", A0H.A01, i3));
                    }
                } else {
                    throw C18190wL.A0a("ParagraphStyle should not overlap");
                }
            }
        }
    }
}
