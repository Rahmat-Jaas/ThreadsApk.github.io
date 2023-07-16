package X;

/* renamed from: X.0ip  reason: invalid class name and case insensitive filesystem */
public final class C10730ip implements C16110sV {
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (java.util.Collections.unmodifiableList(r6.A00).isEmpty() != false) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16830to A00(android.net.Uri r15, X.C16120sW r16) {
        /*
            java.lang.String r5 = r15.getScheme()
            java.lang.String r4 = r15.getAuthority()
            if (r5 == 0) goto L_0x0180
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0180
            if (r4 == 0) goto L_0x0180
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = r15.getPath()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = r16
            if (r0 == 0) goto L_0x0034
            r9 = 0
        L_0x0027:
            java.lang.String r0 = r15.getQuery()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0198
            goto L_0x00c9
        L_0x0034:
            java.lang.String r9 = "/--sanitized--"
            if (r16 == 0) goto L_0x0027
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0027
            java.util.List r1 = r6.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
            java.lang.String r2 = r15.getPath()
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r11 = r0.iterator()
        L_0x0054:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r10 = r11.next()
            java.util.List r10 = (java.util.List) r10
            r0 = 2
            java.lang.Object r0 = r10.get(r0)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r7 = r0.matcher(r2)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L_0x0054
            r8 = 0
            java.lang.Object r1 = r10.get(r8)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.lang.String r0 = r15.getScheme()
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0054
            r3 = 1
            java.lang.Object r1 = r10.get(r3)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.lang.String r0 = r15.getAuthority()
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0054
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r7.groupCount()
            if (r1 > 0) goto L_0x00b3
            java.lang.String r0 = r7.group(r8)
        L_0x00aa:
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            goto L_0x0027
        L_0x00b3:
            if (r3 >= r1) goto L_0x00c4
            java.lang.String r0 = r7.group(r3)
            r2.append(r0)
            r0 = 59
            r2.append(r0)
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00c4:
            java.lang.String r0 = r7.group(r1)
            goto L_0x00aa
        L_0x00c9:
            java.util.Set r1 = r15.getQueryParameterNames()     // Catch:{ UnsupportedOperationException -> 0x0198 }
            if (r1 == 0) goto L_0x0198
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0198
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r8 = 0
            r7 = 1
            if (r16 == 0) goto L_0x00ef
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x00ef
            java.util.List r0 = r6.A00
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = r0.isEmpty()
            r14 = 1
            if (r0 == 0) goto L_0x0178
        L_0x00ef:
            r14 = 0
            if (r16 != 0) goto L_0x0178
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x00f6:
            java.util.Iterator r13 = r1.iterator()
        L_0x00fa:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r12 = r13.next()
            java.lang.String r12 = (java.lang.String) r12
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0111
            r0 = 38
            r10.append(r0)
        L_0x0111:
            r10.append(r12)
            java.lang.String r11 = "=--sanitized--"
            if (r14 == 0) goto L_0x0174
            r2 = 0
        L_0x0119:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0174
            java.lang.Object r3 = r6.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r3.get(r8)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x016d
            java.lang.String r1 = r15.getQueryParameter(r12)
            if (r1 == 0) goto L_0x016d
            java.lang.Object r0 = r3.get(r7)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r3 = r0.matcher(r1)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x016d
            r0 = 61
            r10.append(r0)
            int r2 = r3.groupCount()
            if (r2 <= 0) goto L_0x0168
            r1 = 1
        L_0x0157:
            if (r1 >= r2) goto L_0x0170
            java.lang.String r0 = r3.group(r1)
            r10.append(r0)
            r0 = 59
            r10.append(r0)
            int r1 = r1 + 1
            goto L_0x0157
        L_0x0168:
            java.lang.String r11 = r3.group(r8)
            goto L_0x0174
        L_0x016d:
            int r2 = r2 + 1
            goto L_0x0119
        L_0x0170:
            java.lang.String r11 = r3.group(r2)
        L_0x0174:
            r10.append(r11)
            goto L_0x00fa
        L_0x0178:
            java.util.List r0 = r6.A00
            java.util.List r6 = java.util.Collections.unmodifiableList(r0)
            goto L_0x00f6
        L_0x0180:
            X.0sa r1 = new X.0sa
            r1.<init>()
            java.lang.String r0 = r15.getPath()
            r1.A01 = r0
            r1.A02 = r5
            r1.A00 = r4
            java.lang.String r2 = r15.getQuery()
            goto L_0x01a3
        L_0x0194:
            java.lang.String r2 = r10.toString()
        L_0x0198:
            X.0sa r1 = new X.0sa
            r1.<init>()
            r1.A02 = r5
            r1.A00 = r4
            r1.A01 = r9
        L_0x01a3:
            java.lang.String r4 = r1.A02
            java.lang.String r3 = r1.A00
            java.lang.String r1 = r1.A01
            X.0to r0 = new X.0to
            r0.<init>(r4, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10730ip.A00(android.net.Uri, X.0sW):X.0to");
    }
}
