package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3EL  reason: invalid class name */
public final class AnonymousClass3EL {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        if (r4.equals(java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_B) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (r4.equals(java.lang.Character.UnicodeBlock.GREEK_EXTENDED) != false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r12) {
        /*
            r11 = this;
            r2 = 0
            X.C04220Ms.A0B(r12, r2)
            X.0Ok r0 = X.C06810aP.A01
            com.instagram.service.session.UserSession r4 = r11.A00
            com.instagram.user.model.User r0 = r0.A01(r4)
            boolean r0 = r0.A3X()
            if (r0 == 0) goto L_0x0126
            boolean r0 = X.C35422Nj.A00(r4)
            if (r0 == 0) goto L_0x0126
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0035
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36312947762529521(0x81026f002204f1, double:3.027792613303279E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 != 0) goto L_0x0126
        L_0x0035:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36312947762136301(0x81026f001c04ed, double:3.027792613054605E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r10 = 1
            if (r0 == 0) goto L_0x0089
            r0 = 36594422739109484(0x82026f0020066c, double:3.2057985219012044E-306)
            int r6 = X.C63803iN.A01(r3, r4, r0)
            r5 = 0
            r1 = 0
        L_0x004e:
            int r0 = r12.length()
            if (r5 >= r0) goto L_0x0080
            int r8 = r12.codePointAt(r5)
            java.lang.Character$UnicodeBlock r7 = java.lang.Character.UnicodeBlock.of(r8)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.IPA_EXTENSIONS
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 != 0) goto L_0x007c
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 != 0) goto L_0x007c
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 != 0) goto L_0x007c
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 == 0) goto L_0x0083
        L_0x007c:
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x0083
        L_0x0080:
            if (r1 < r6) goto L_0x0089
            return r10
        L_0x0083:
            int r0 = java.lang.Character.charCount(r8)
            int r5 = r5 + r0
            goto L_0x004e
        L_0x0089:
            r0 = 36312947762267375(0x81026f001e04ef, double:3.027792613137497E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x0126
            java.util.List r0 = X.C120707Cc.A01(r12)
            java.util.Iterator r9 = r0.iterator()
        L_0x009c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0126
            java.lang.String r8 = X.C18180wK.A0k(r9)
            r1 = 0
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x00aa:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x009c
            int r3 = r12.codePointAt(r1)
            java.lang.Character$UnicodeBlock r4 = java.lang.Character.UnicodeBlock.of(r3)
            if (r7 != 0) goto L_0x00d5
            X.C04220Ms.A06(r4)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.BASIC_LATIN
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0124
            r0 = 65
            if (r3 < r0) goto L_0x0124
            r0 = 90
            if (r3 <= r0) goto L_0x00d5
            r0 = 97
            if (r3 < r0) goto L_0x0124
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 > r0) goto L_0x0124
        L_0x00d5:
            r7 = 1
        L_0x00d6:
            if (r6 != 0) goto L_0x00fc
            X.C04220Ms.A06(r4)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_SUPPLEMENTARY
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_A
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CYRILLIC_EXTENDED_B
            boolean r0 = r4.equals(r0)
            r6 = 0
            if (r0 == 0) goto L_0x00fd
        L_0x00fc:
            r6 = 1
        L_0x00fd:
            if (r7 == 0) goto L_0x0102
            if (r6 == 0) goto L_0x0102
            return r10
        L_0x0102:
            if (r5 != 0) goto L_0x0118
            X.C04220Ms.A06(r4)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.GREEK
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0118
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.GREEK_EXTENDED
            boolean r0 = r4.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0119
        L_0x0118:
            r5 = 1
        L_0x0119:
            if (r7 == 0) goto L_0x011e
            if (r5 == 0) goto L_0x011e
            return r10
        L_0x011e:
            int r0 = java.lang.Character.charCount(r3)
            int r1 = r1 + r0
            goto L_0x00aa
        L_0x0124:
            r7 = 0
            goto L_0x00d6
        L_0x0126:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EL.A00(java.lang.String):boolean");
    }

    public AnonymousClass3EL(UserSession userSession) {
        this.A00 = userSession;
    }
}
