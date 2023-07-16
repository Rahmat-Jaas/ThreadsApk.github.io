package X;

/* renamed from: X.2LF  reason: invalid class name */
public final class AnonymousClass2LF {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        if (r6.equals("full") != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r6 == 0) goto L_0x000e
            int r3 = X.AnonymousClass7Kk.A05(r6)     // Catch:{ 1zB -> 0x0009 }
            goto L_0x000f
        L_0x0009:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.C30967GcS.A02(r1, r0)
        L_0x000e:
            r3 = 2
        L_0x000f:
            if (r7 == 0) goto L_0x001b
            int r4 = X.AnonymousClass7Kk.A05(r7)     // Catch:{ 1zB -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = "Error while parsing Time format"
            X.C30967GcS.A02(r1, r0)
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            java.lang.String r6 = "medium"
        L_0x0020:
            int r0 = r5.hashCode()
            r2 = 2
            r1 = -1
            switch(r0) {
                case 3076014: goto L_0x0037;
                case 3560141: goto L_0x0041;
                case 1793702779: goto L_0x004b;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r1) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0055;
                case 2: goto L_0x0094;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "Unknown dateformat type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r5)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0037:
            java.lang.String r0 = "date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 0
            goto L_0x0029
        L_0x0041:
            java.lang.String r0 = "time"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0029
        L_0x004b:
            java.lang.String r0 = "datetime"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 2
            goto L_0x0029
        L_0x0055:
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r4)
            goto L_0x0098
        L_0x005a:
            java.lang.String r0 = "short"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "medium"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "full"
            boolean r1 = r6.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 == 0) goto L_0x008c
            int r0 = X.AnonymousClass7Kk.A05(r6)     // Catch:{ 1zB -> 0x0087 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 1zB -> 0x0087 }
            goto L_0x0098
        L_0x0087:
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r2)
            goto L_0x0098
        L_0x008c:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r6, r0)
            goto L_0x0098
        L_0x0094:
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r4)
        L_0x0098:
            if (r8 != 0) goto L_0x00a6
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r8 = r0.getID()
        L_0x00a6:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r8)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LF.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.CharSequence");
    }
}
