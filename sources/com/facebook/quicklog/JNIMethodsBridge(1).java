package com.facebook.quicklog;

public class JNIMethodsBridge {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void markerPoint(int r7, int r8, java.lang.String r9, java.lang.String[] r10, int r11, long r12, boolean r14, com.facebook.quicklog.QuickPerformanceLogger r15) {
        /*
            if (r15 == 0) goto L_0x0104
            int r2 = r10.length
            int r0 = r2 % 3
            if (r0 != 0) goto L_0x0104
            com.facebook.quicklog.MarkerEditor r0 = r15.withMarker(r7, r8)
            r0.withLevel(r11)
            com.facebook.quicklog.PointEditor r0 = r0.pointEditor(r9)
            com.facebook.quicklog.PointEditor r0 = r0.pointCustomTimestamp(r12)
            com.facebook.quicklog.PointEditor r5 = r0.pointShouldIncludeMetadata(r14)
            r4 = 0
        L_0x001b:
            if (r4 >= r2) goto L_0x00fd
            r3 = r10[r4]
            int r0 = r4 + 1
            r1 = r10[r0]
            int r0 = r4 + 2
            r6 = r10[r0]
            int r0 = r6.hashCode()
            switch(r0) {
                case 49: goto L_0x003a;
                case 50: goto L_0x0047;
                case 51: goto L_0x0058;
                case 52: goto L_0x0069;
                case 53: goto L_0x007d;
                case 54: goto L_0x008f;
                case 55: goto L_0x00b2;
                case 56: goto L_0x00d5;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.String r0 = "Type entry is not supported: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r6)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            java.lang.String r0 = "1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            r5.addPointData((java.lang.String) r3, (java.lang.String) r1)
            goto L_0x00f9
        L_0x0047:
            java.lang.String r0 = "2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = java.lang.Integer.parseInt(r1)
            r5.addPointData((java.lang.String) r3, (int) r0)
            goto L_0x00f9
        L_0x0058:
            java.lang.String r0 = "3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            double r0 = java.lang.Double.parseDouble(r1)
            r5.addPointData((java.lang.String) r3, (double) r0)
            goto L_0x00f9
        L_0x0069:
            java.lang.String r0 = "4"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r5.addPointData((java.lang.String) r3, (boolean) r0)
            goto L_0x00f9
        L_0x007d:
            java.lang.String r0 = "5"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r0 = r1.split(r0)
            r5.addPointData((java.lang.String) r3, (java.lang.String[]) r0)
            goto L_0x00f9
        L_0x008f:
            java.lang.String r0 = "6"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r8 = r1.split(r0)
            int r7 = r8.length
            int[] r6 = new int[r7]
            r1 = 0
        L_0x00a1:
            if (r1 >= r7) goto L_0x00ae
            r0 = r8[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00ae:
            r5.addPointData((java.lang.String) r3, (int[]) r6)
            goto L_0x00f9
        L_0x00b2:
            java.lang.String r0 = "7"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r9 = r1.split(r0)
            int r8 = r9.length
            double[] r7 = new double[r8]
            r6 = 0
        L_0x00c4:
            if (r6 >= r8) goto L_0x00d1
            r0 = r9[r6]
            double r0 = java.lang.Double.parseDouble(r0)
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x00c4
        L_0x00d1:
            r5.addPointData((java.lang.String) r3, (double[]) r7)
            goto L_0x00f9
        L_0x00d5:
            java.lang.String r0 = "8"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r9 = r1.split(r0)
            int r8 = r9.length
            boolean[] r7 = new boolean[r8]
            r6 = 0
        L_0x00e7:
            if (r6 >= r8) goto L_0x00f6
            r1 = r9[r6]
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x00e7
        L_0x00f6:
            r5.addPointData((java.lang.String) r3, (boolean[]) r7)
        L_0x00f9:
            int r4 = r4 + 3
            goto L_0x001b
        L_0x00fd:
            com.facebook.quicklog.MarkerEditor r0 = r5.pointEditingCompleted()
            r0.markerEditingCompleted()
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.JNIMethodsBridge.markerPoint(int, int, java.lang.String, java.lang.String[], int, long, boolean, com.facebook.quicklog.QuickPerformanceLogger):void");
    }

    public static void markerPoint(int i, int i2, String str, String str2, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).addPointData("__key", str2).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }

    public static void markerPoint(int i, int i2, String str, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }
}
