package X;

import android.util.SparseArray;

/* renamed from: X.3b2  reason: invalid class name and case insensitive filesystem */
public final class C62863b2 {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013f, code lost:
        if (r1.A0T(38, false) == false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098 A[LOOP:0: B:36:0x0096->B:37:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3TP A00(X.AnonymousClass4nQ r18, X.AnonymousClass3HX r19, X.C127397h3 r20) {
        /*
            r15 = 0
            r4 = r20
            if (r20 != 0) goto L_0x0006
            return r15
        L_0x0006:
            int r3 = r4.A03
            r2 = 13690(0x357a, float:1.9184E-41)
            boolean r0 = X.AnonymousClass0wJ.A1T(r3, r2)
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x0122
            r0 = 41
            java.lang.String r13 = r4.A0O(r0, r13)
        L_0x0018:
            boolean r0 = X.AnonymousClass0wJ.A1T(r3, r2)
            r5 = 0
            if (r0 == 0) goto L_0x010f
            r0 = 38
        L_0x0021:
            boolean r17 = r4.A0T(r0, r5)
        L_0x0025:
            X.7h3 r1 = X.C32292Bd.A00(r4)
            if (r1 == 0) goto L_0x00f6
            r0 = 36
            boolean r16 = r1.A0T(r0, r5)
            r0 = 51
            X.6jp r6 = r1.A0L(r0)
        L_0x0037:
            r8 = r18
            if (r18 != 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00d4
            if (r6 == 0) goto L_0x00d4
            r7 = r19
            if (r19 == 0) goto L_0x00cc
            X.3iY r0 = X.C63893iY.A01
            java.lang.Object r9 = X.C122047Jt.A03(r7, r1, r0, r6)
            r9.getClass()
            X.7Jj r9 = (X.C121997Jj) r9
        L_0x004e:
            r0 = 44
            if (r1 == 0) goto L_0x00ca
            X.7h3 r11 = r1.A0K(r0)
        L_0x0056:
            if (r1 == 0) goto L_0x00b1
            r0 = 42
            X.6jp r12 = r1.A0L(r0)
            r0 = 41
            X.7h3 r6 = r1.A0K(r0)
            if (r6 == 0) goto L_0x00b2
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r0.add(r6)
        L_0x006d:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x00c8
            java.lang.Object r0 = r0.get(r5)
            X.7h3 r0 = (X.C127397h3) r0
            X.7h3 r10 = A02(r0)
        L_0x007d:
            if (r1 == 0) goto L_0x00a8
            r0 = 43
            java.util.List r0 = r1.A0Q(r0)
        L_0x0085:
            if (r0 == 0) goto L_0x0135
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0135
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            int r4 = r0.size()
            r3 = 0
        L_0x0096:
            if (r3 >= r4) goto L_0x0135
            java.lang.Object r2 = r0.get(r3)
            X.7h3 r2 = (X.C127397h3) r2
            X.7h3 r2 = A02(r2)
            r15.add(r2)
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00a8:
            if (r3 != r2) goto L_0x0142
            r0 = 42
            java.util.List r0 = r4.A0Q(r0)
            goto L_0x0085
        L_0x00b1:
            r12 = r15
        L_0x00b2:
            if (r3 != r2) goto L_0x00bd
            r0 = 40
            java.util.List r0 = r4.A0Q(r0)
            if (r0 == 0) goto L_0x00c8
            goto L_0x006d
        L_0x00bd:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x00c8
            java.lang.String r6 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r6, r0)
        L_0x00c8:
            r10 = r15
            goto L_0x007d
        L_0x00ca:
            r11 = 0
            goto L_0x0056
        L_0x00cc:
            java.lang.String r6 = "IgNavbarModelUtils"
            java.lang.String r0 = "Cannot evaluate custom_title_parseresult with a null BloksContext"
            X.C30967GcS.A02(r6, r0)
            goto L_0x00f3
        L_0x00d4:
            if (r3 != r2) goto L_0x00e8
            r6 = 35
            android.util.SparseArray r0 = r4.A04
            java.lang.Object r0 = r0.get(r6)
            X.7h3 r0 = (X.C127397h3) r0
            if (r0 == 0) goto L_0x00f3
            X.7Jj r9 = X.C121997Jj.A03(r0)
            goto L_0x004e
        L_0x00e8:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x00f3
            java.lang.String r6 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r6, r0)
        L_0x00f3:
            r9 = r15
            goto L_0x004e
        L_0x00f6:
            if (r3 != r2) goto L_0x0101
            r0 = 36
            boolean r16 = r4.A0T(r0, r5)
        L_0x00fe:
            r6 = r15
            goto L_0x0037
        L_0x0101:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x010c
            java.lang.String r6 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r6, r0)
        L_0x010c:
            r16 = 0
            goto L_0x00fe
        L_0x010f:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 != r0) goto L_0x0117
            r0 = 35
            goto L_0x0021
        L_0x0117:
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r1, r0)
            r17 = 0
            goto L_0x0025
        L_0x0122:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 != r0) goto L_0x012c
            java.lang.String r13 = X.C18230wP.A0o(r4)
            goto L_0x0018
        L_0x012c:
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r1, r0)
            goto L_0x0018
        L_0x0135:
            if (r1 == 0) goto L_0x014d
            r0 = 38
            boolean r0 = r1.A0T(r0, r5)
            r18 = 1
            if (r0 != 0) goto L_0x014f
            goto L_0x014d
        L_0x0142:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x014d
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.C30967GcS.A02(r1, r0)
        L_0x014d:
            r18 = 0
        L_0x014f:
            r14 = 0
            X.3TP r7 = new X.3TP
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62863b2.A00(X.4nQ, X.3HX, X.7h3):X.3TP");
    }

    public static AnonymousClass3TP A01(C127397h3 r13) {
        C121997Jj r1 = null;
        if (r13 == null) {
            return null;
        }
        C127397h3 A0K = r13.A0K(36);
        if (A0K != null) {
            r1 = C121997Jj.A03(A0K);
        }
        r13.A0N(35);
        String A0N = r13.A0N(48);
        String A0N2 = r13.A0N(50);
        C109326jp A0L = r13.A0L(44);
        boolean A0T = r13.A0T(38, false);
        boolean A0T2 = r13.A0T(41, false);
        boolean A0T3 = r13.A0T(40, false);
        return new AnonymousClass3TP((AnonymousClass4nQ) null, r1, r13.A0K(43), r13.A0K(46), A0L, A0N, A0N2, r13.A0R(45), A0T, A0T2, A0T3);
    }

    public static C127397h3 A02(C127397h3 r6) {
        String A0N;
        if (r6.A03 == 13412) {
            return r6;
        }
        C95245zh r5 = new C95245zh(13412);
        String A0N2 = r6.A0N(38);
        if (A0N2 != null) {
            r5.A04.put(36, A0N2);
        }
        C109326jp A0L = r6.A0L(36);
        if (A0L != null) {
            r5.A04.put(35, A0L);
        }
        String A00 = AnonymousClass2JW.A00(r6.A0N(41));
        SparseArray sparseArray = r5.A04;
        sparseArray.put(40, A00);
        C127397h3 A0K = r6.A0K(35);
        if (!(A0K == null || (A0N = A0K.A0N(35)) == null)) {
            sparseArray.put(38, A0N);
        }
        r5.A0V();
        return r5;
    }

    public static void A04(String str) {
        if (str != null) {
            try {
                AnonymousClass7Kk.A04(str);
            } catch (C29721zB unused) {
                C30967GcS.A03("IgNavbarModelUtils", new C29721zB(AnonymousClass00U.A0L("Parsing error for color ", str)));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r3.equals(com.facebook.smartcapture.logging.SCEventNames.Params.STEP_CHANGE_NEXT) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3.equals("more") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r3.equals("mail") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3.equals("info") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r3.equals(r0) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r3.equals("cart") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r3.equals("back") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r3.equals("add") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r3.equals("menu_horizontal") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r3.equals("report") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r3.equals("reload") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        if (r3.equals("delete") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r3.equals("questions") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00da, code lost:
        if (r3.equals("edit_list") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        return X.AnonymousClass006.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ee, code lost:
        return X.AnonymousClass006.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f1, code lost:
        return X.AnonymousClass006.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        return X.AnonymousClass006.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f7, code lost:
        return X.AnonymousClass006.A1C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fa, code lost:
        return X.AnonymousClass006.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fd, code lost:
        return X.AnonymousClass006.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        return X.AnonymousClass006.A1L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0103, code lost:
        return X.AnonymousClass006.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0106, code lost:
        return X.AnonymousClass006.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0109, code lost:
        return X.AnonymousClass006.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010c, code lost:
        return X.AnonymousClass006.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010f, code lost:
        return X.AnonymousClass006.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0112, code lost:
        return X.AnonymousClass006.A0O;
     */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A03(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -2119261262: goto L_0x00de;
                case -1866255949: goto L_0x00d4;
                case -1782234803: goto L_0x00ca;
                case -1335458389: goto L_0x00c0;
                case -934641255: goto L_0x00b6;
                case -934521548: goto L_0x00ac;
                case -218232060: goto L_0x00a2;
                case 96417: goto L_0x0098;
                case 3015911: goto L_0x008e;
                case 3046176: goto L_0x0084;
                case 3089282: goto L_0x007b;
                case 3237038: goto L_0x0072;
                case 3343799: goto L_0x0069;
                case 3357525: goto L_0x0060;
                case 3377907: goto L_0x0057;
                case 3387192: goto L_0x004c;
                case 94627080: goto L_0x0049;
                case 94756344: goto L_0x003e;
                case 109400031: goto L_0x0033;
                case 1382682413: goto L_0x0028;
                case 1434631203: goto L_0x001d;
                default: goto L_0x0008;
            }
        L_0x0008:
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0110;
                case 2: goto L_0x010d;
                case 3: goto L_0x010a;
                case 4: goto L_0x0107;
                case 5: goto L_0x0104;
                case 6: goto L_0x0101;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00f8;
                case 10: goto L_0x00f5;
                case 11: goto L_0x00f2;
                case 12: goto L_0x00ef;
                case 13: goto L_0x00ec;
                case 14: goto L_0x00e9;
                case 15: goto L_0x001c;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r0 = "Unsupported icon type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r3)
            X.1zB r1 = new X.1zB
            r1.<init>(r0)
            java.lang.String r0 = "IgNavbarModelUtils"
            X.C30967GcS.A03(r0, r1)
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.String r0 = "settings"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass006.A0I
            return r2
        L_0x0028:
            java.lang.String r0 = "payments"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass006.A0L
            return r2
        L_0x0033:
            java.lang.String r0 = "share"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            return r2
        L_0x003e:
            java.lang.String r0 = "close"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass006.A09
            return r2
        L_0x0049:
            java.lang.String r0 = "check"
            goto L_0x007d
        L_0x004c:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1 = 15
            goto L_0x0008
        L_0x0057:
            java.lang.String r0 = "next"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0008
        L_0x0060:
            java.lang.String r0 = "more"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00ec
            goto L_0x0008
        L_0x0069:
            java.lang.String r0 = "mail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00ef
            goto L_0x0008
        L_0x0072:
            java.lang.String r0 = "info"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00f2
            goto L_0x0008
        L_0x007b:
            java.lang.String r0 = "done"
        L_0x007d:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00f5
            goto L_0x0008
        L_0x0084:
            java.lang.String r0 = "cart"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00f8
            goto L_0x0008
        L_0x008e:
            java.lang.String r0 = "back"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00fb
            goto L_0x0008
        L_0x0098:
            java.lang.String r0 = "add"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00fe
            goto L_0x0008
        L_0x00a2:
            java.lang.String r0 = "menu_horizontal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0101
            goto L_0x0008
        L_0x00ac:
            java.lang.String r0 = "report"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0104
            goto L_0x0008
        L_0x00b6:
            java.lang.String r0 = "reload"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0107
            goto L_0x0008
        L_0x00c0:
            java.lang.String r0 = "delete"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x010a
            goto L_0x0008
        L_0x00ca:
            java.lang.String r0 = "questions"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x010d
            goto L_0x0008
        L_0x00d4:
            java.lang.String r0 = "edit_list"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x0008
        L_0x00de:
            java.lang.String r0 = "sliders"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass006.A0K
            return r2
        L_0x00e9:
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            return r2
        L_0x00ec:
            java.lang.Integer r2 = X.AnonymousClass006.A00
            return r2
        L_0x00ef:
            java.lang.Integer r2 = X.AnonymousClass006.A0J
            return r2
        L_0x00f2:
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            return r2
        L_0x00f5:
            java.lang.Integer r2 = X.AnonymousClass006.A1C
            return r2
        L_0x00f8:
            java.lang.Integer r2 = X.AnonymousClass006.A0H
            return r2
        L_0x00fb:
            java.lang.Integer r2 = X.AnonymousClass006.A0B
            return r2
        L_0x00fe:
            java.lang.Integer r2 = X.AnonymousClass006.A1L
            return r2
        L_0x0101:
            java.lang.Integer r2 = X.AnonymousClass006.A0G
            return r2
        L_0x0104:
            java.lang.Integer r2 = X.AnonymousClass006.A0E
            return r2
        L_0x0107:
            java.lang.Integer r2 = X.AnonymousClass006.A0D
            return r2
        L_0x010a:
            java.lang.Integer r2 = X.AnonymousClass006.A0u
            return r2
        L_0x010d:
            java.lang.Integer r2 = X.AnonymousClass006.A0M
            return r2
        L_0x0110:
            java.lang.Integer r2 = X.AnonymousClass006.A0O
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62863b2.A03(java.lang.String):java.lang.Integer");
    }
}
