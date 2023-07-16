package X;

/* renamed from: X.3Tw  reason: invalid class name and case insensitive filesystem */
public final class C61553Tw {
    public static final C61553Tw A00 = new C61553Tw();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder A00(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            r5 = 0
            X.C04220Ms.A0B(r11, r5)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            int r0 = r12.length()
            boolean r1 = X.C18180wK.A1W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            java.lang.String r0 = "\\{|\\}"
            java.lang.String[] r7 = X.C18190wL.A1b(r12, r0, r5)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            int r3 = r7.length
            r2 = 0
        L_0x0021:
            if (r2 >= r3) goto L_0x0031
            r1 = r7[r2]
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x002e
            r6.add(r1)
        L_0x002e:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0031:
            java.util.List r0 = X.AnonymousClass00J.A0N(r6)
            java.util.Iterator r9 = r0.iterator()
        L_0x0039:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.String r7 = X.C18180wK.A0k(r9)
            java.lang.String r0 = "|"
            boolean r0 = X.AnonymousClass8bP.A0j(r7, r0, r5)
            if (r0 == 0) goto L_0x0067
            java.lang.String r6 = "Failed to decode embedded text: "
            java.lang.String r3 = "EventsRichText"
            r2 = 1
            X.C04220Ms.A0B(r7, r2)
            java.lang.String r0 = "\\|"
            X.7yC r1 = X.C18250wR.A0h(r0)
            r0 = 4
            java.util.List r8 = r1.A02(r7, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x006b
            r7 = 0
        L_0x0065:
            if (r7 == 0) goto L_0x0039
        L_0x0067:
            r4.append(r7)
            goto L_0x0039
        L_0x006b:
            java.lang.String r1 = X.C18190wL.A0p(r8, r5)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0079 }
            java.lang.String r0 = "UTF-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0079 }
            X.C04220Ms.A06(r7)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0079 }
            goto L_0x0089
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = X.C18190wL.A0p(r8, r5)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)
            X.C10450iM.A06(r3, r0, r1)
            java.lang.String r7 = X.C18190wL.A0q(r8, r5)
        L_0x0089:
            r1 = 35
            java.lang.String r0 = X.C18190wL.A0p(r8, r2)     // Catch:{ NumberFormatException -> 0x0098 }
            java.lang.String r0 = X.AnonymousClass00U.A0B(r0, r1)     // Catch:{ NumberFormatException -> 0x0098 }
            int r6 = android.graphics.Color.parseColor(r0)     // Catch:{ NumberFormatException -> 0x0098 }
            goto L_0x00a8
        L_0x0098:
            java.lang.String r1 = "Failed to parse the color string: "
            java.lang.String r0 = X.C18190wL.A0p(r8, r2)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "EventsRichText_Color"
            X.C10450iM.A03(r0, r1)
            r6 = -1
        L_0x00a8:
            boolean r0 = X.C34822La.A00(r11)
            if (r0 == 0) goto L_0x00b3
            r0 = -1
            int r6 = X.C09760gd.A08(r6, r0)
        L_0x00b3:
            r3 = 2
            java.lang.String r0 = X.C18190wL.A0p(r8, r3)     // Catch:{ NumberFormatException -> 0x00bd }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00bd }
            goto L_0x00da
        L_0x00bd:
            r2 = move-exception
            java.lang.String r0 = "Failed to parse style info: "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.String r0 = X.C18190wL.A0p(r8, r3)
            r1.append(r0)
            java.lang.String r0 = ", Exception: "
            r1.append(r0)
            java.lang.String r1 = X.C18200wM.A0m(r2, r1)
            java.lang.String r0 = "EventsRichText_Style"
            X.C10450iM.A03(r0, r1)
            r1 = 0
        L_0x00da:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r7)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            int r2 = r7.length()
            r1 = 33
            r3.setSpan(r0, r5, r2, r1)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r7.append(r3)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            r7.setSpan(r0, r5, r2, r1)
            goto L_0x0065
        L_0x00ff:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61553Tw.A00(android.content.Context, java.lang.String):android.text.SpannableStringBuilder");
    }
}
