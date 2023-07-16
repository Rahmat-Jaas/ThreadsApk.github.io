package X;

import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7yF  reason: invalid class name and case insensitive filesystem */
public final class C134727yF implements Appendable {
    public final StringBuilder A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C134727yF() {
        this((DefaultConstructorMarker) null, 0, 1);
    }

    public final void A04(C134747yH r13) {
        C04220Ms.A0B(r13, 0);
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(r13.A00);
        List list = r13.A03;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7HE A0H = C86154wM.A0H(list, i);
                A05((AnonymousClass7F0) A0H.A02, A0H.A01 + length, A0H.A00 + length);
            }
        }
        List list2 = r13.A02;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnonymousClass7HE A0H2 = C86154wM.A0H(list2, i2);
                Object obj = A0H2.A02;
                C04220Ms.A0B(obj, 0);
                this.A02.add(new C115486vC(obj, "", A0H2.A01 + length, A0H2.A00 + length));
            }
        }
        List list3 = r13.A01;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                AnonymousClass7HE A0H3 = C86154wM.A0H(list3, i3);
                this.A01.add(new C115486vC(A0H3.A02, A0H3.A03, A0H3.A01 + length, A0H3.A00 + length));
            }
        }
    }

    public final void A05(AnonymousClass7F0 r4, int i, int i2) {
        C04220Ms.A0B(r4, 0);
        this.A03.add(new C115486vC(r4, "", i, i2));
    }

    public final void A07(String str) {
        C04220Ms.A0B(str, 0);
        this.A00.append(str);
    }

    public final void A08(String str, String str2) {
        C04220Ms.A0B(str2, 1);
        C115486vC r2 = new C115486vC(str2, str, this.A00.length(), Process.WAIT_RESULT_TIMEOUT);
        List list = this.A04;
        list.add(r2);
        this.A01.add(r2);
        list.size();
    }

    public final void A09(String str, String str2, int i, int i2) {
        C04220Ms.A0B(str2, 1);
        this.A01.add(new C115486vC(str2, str, i, i2));
    }

    public /* synthetic */ C134727yF(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A00 = C86114wI.A0s(16);
        this.A03 = AnonymousClass0wJ.A0v();
        this.A02 = AnonymousClass0wJ.A0v();
        this.A01 = AnonymousClass0wJ.A0v();
        this.A04 = AnonymousClass0wJ.A0v();
    }

    public final int A00(AnonymousClass7F0 r5) {
        C115486vC r2 = new C115486vC(r5, "", this.A00.length(), Process.WAIT_RESULT_TIMEOUT);
        List list = this.A04;
        list.add(r2);
        this.A03.add(r2);
        return C86104wH.A0B(list);
    }

    public final C134747yH A01() {
        StringBuilder sb = this.A00;
        String A0n = C18190wL.A0n(sb);
        List list = this.A03;
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0t.add(((C115486vC) list.get(i)).A00(sb.length()));
        }
        ArrayList arrayList = null;
        if (A0t.isEmpty()) {
            A0t = null;
        }
        List list2 = this.A02;
        ArrayList A0t2 = C18200wM.A0t(list2);
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A0t2.add(((C115486vC) list2.get(i2)).A00(sb.length()));
        }
        if (A0t2.isEmpty()) {
            A0t2 = null;
        }
        List list3 = this.A01;
        ArrayList A0t3 = C18200wM.A0t(list3);
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            A0t3.add(((C115486vC) list3.get(i3)).A00(sb.length()));
        }
        if (!A0t3.isEmpty()) {
            arrayList = A0t3;
        }
        return new C134747yH(A0n, A0t, A0t2, arrayList);
    }

    public final void A02() {
        List list = this.A04;
        if (C18190wL.A1a(list)) {
            ((C115486vC) list.remove(C86104wH.A0B(list))).A00 = this.A00.length();
            return;
        }
        throw C18180wK.A0a("Nothing to pop.");
    }

    public final void A03(int i) {
        List list = this.A04;
        if (i >= list.size()) {
            throw C18180wK.A0a(AnonymousClass00U.A0K(" should be less than ", i, list.size()));
        }
        while (C86144wL.A0C(list, 1) >= i) {
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r10 >= r8.length()) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        if (r10 >= r8.length()) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.CharSequence r18, int r19, int r20) {
        /*
            r17 = this;
            r12 = r18
            boolean r0 = r12 instanceof X.C134747yH
            r10 = r20
            r11 = r19
            r13 = r17
            if (r0 == 0) goto L_0x012a
            X.7yH r12 = (X.C134747yH) r12
            r9 = 0
            X.C04220Ms.A0B(r12, r9)
            java.lang.StringBuilder r0 = r13.A00
            int r16 = r0.length()
            java.lang.String r8 = r12.A00
            r0.append(r8, r11, r10)
            java.util.List r5 = X.AnonymousClass7G7.A00(r12, r11, r10)
            r7 = 0
            if (r5 == 0) goto L_0x0041
            int r4 = r5.size()
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x0041
            X.7HE r0 = X.C86154wM.A0H(r5, r3)
            java.lang.Object r2 = r0.A02
            X.7F0 r2 = (X.AnonymousClass7F0) r2
            int r1 = r0.A01
            int r1 = r1 + r16
            int r0 = r0.A00
            int r0 = r0 + r16
            r13.A05(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0041:
            if (r11 == r10) goto L_0x00b4
            java.util.List r6 = r12.A02
            if (r6 == 0) goto L_0x00b4
            if (r19 != 0) goto L_0x0076
            int r0 = r8.length()
            if (r10 < r0) goto L_0x0076
        L_0x004f:
            int r15 = r6.size()
            r14 = 0
        L_0x0054:
            if (r14 >= r15) goto L_0x00b4
            X.7HE r0 = X.C86154wM.A0H(r6, r14)
            java.lang.Object r5 = r0.A02
            int r4 = r0.A01
            int r4 = r4 + r16
            int r3 = r0.A00
            int r3 = r3 + r16
            X.C04220Ms.A0B(r5, r9)
            java.util.List r2 = r13.A02
            java.lang.String r1 = ""
            X.6vC r0 = new X.6vC
            r0.<init>(r5, r1, r4, r3)
            r2.add(r0)
            int r14 = r14 + 1
            goto L_0x0054
        L_0x0076:
            java.util.ArrayList r5 = X.C18200wM.A0t(r6)
            int r1 = r6.size()
            r4 = 0
            r0 = 0
        L_0x0080:
            if (r0 >= r1) goto L_0x0088
            X.AnonymousClass7HE.A02(r5, r6, r0, r11, r10)
            int r0 = r0 + 1
            goto L_0x0080
        L_0x0088:
            int r0 = r5.size()
            java.util.ArrayList r6 = X.C18240wQ.A0k(r0)
            int r3 = r5.size()
        L_0x0094:
            if (r4 >= r3) goto L_0x004f
            java.lang.Object r14 = r5.get(r4)
            X.7HE r14 = (X.AnonymousClass7HE) r14
            java.lang.Object r2 = r14.A02
            int r0 = r14.A01
            int r1 = X.AnonymousClass8bI.A02(r0, r11, r10)
            int r1 = r1 - r19
            int r0 = r14.A00
            int r0 = X.AnonymousClass8bI.A02(r0, r11, r10)
            int r0 = r0 - r19
            X.AnonymousClass7HE.A01(r2, r6, r1, r0)
            int r4 = r4 + 1
            goto L_0x0094
        L_0x00b4:
            if (r11 == r10) goto L_0x012f
            java.util.List r9 = r12.A01
            if (r9 == 0) goto L_0x012f
            if (r19 != 0) goto L_0x00e5
            int r0 = r8.length()
            if (r10 < r0) goto L_0x00e5
        L_0x00c2:
            int r6 = r9.size()
        L_0x00c6:
            if (r7 >= r6) goto L_0x012f
            X.7HE r0 = X.C86154wM.A0H(r9, r7)
            java.util.List r5 = r13.A01
            java.lang.Object r4 = r0.A02
            int r3 = r0.A01
            int r3 = r3 + r16
            int r2 = r0.A00
            int r2 = r2 + r16
            java.lang.String r1 = r0.A03
            X.6vC r0 = new X.6vC
            r0.<init>(r4, r1, r3, r2)
            r5.add(r0)
            int r7 = r7 + 1
            goto L_0x00c6
        L_0x00e5:
            java.util.ArrayList r8 = X.C18200wM.A0t(r9)
            int r1 = r9.size()
            r6 = 0
            r0 = 0
        L_0x00ef:
            if (r0 >= r1) goto L_0x00f7
            X.AnonymousClass7HE.A02(r8, r9, r0, r11, r10)
            int r0 = r0 + 1
            goto L_0x00ef
        L_0x00f7:
            int r0 = r8.size()
            java.util.ArrayList r9 = X.C18240wQ.A0k(r0)
            int r5 = r8.size()
        L_0x0103:
            if (r6 >= r5) goto L_0x00c2
            java.lang.Object r1 = r8.get(r6)
            X.7HE r1 = (X.AnonymousClass7HE) r1
            java.lang.String r4 = r1.A03
            java.lang.Object r3 = r1.A02
            int r0 = r1.A01
            int r2 = X.AnonymousClass8bI.A02(r0, r11, r10)
            int r2 = r2 - r19
            int r0 = r1.A00
            int r1 = X.AnonymousClass8bI.A02(r0, r11, r10)
            int r1 = r1 - r19
            X.7HE r0 = new X.7HE
            r0.<init>(r3, r4, r2, r1)
            r9.add(r0)
            int r6 = r6 + 1
            goto L_0x0103
        L_0x012a:
            java.lang.StringBuilder r0 = r13.A00
            r0.append(r12, r11, r10)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134727yF.A06(java.lang.CharSequence, int, int):void");
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        A06(charSequence, i, i2);
        return this;
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C134747yH) {
            A04((C134747yH) charSequence);
            return this;
        }
        this.A00.append(charSequence);
        return this;
    }

    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }
}
