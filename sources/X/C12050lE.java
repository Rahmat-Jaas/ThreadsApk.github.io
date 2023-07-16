package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: X.0lE  reason: invalid class name and case insensitive filesystem */
public final class C12050lE extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (X.C15470rN.A1N.contains(r1) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor query(android.net.Uri r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19) {
        /*
            r14 = this;
            java.lang.String r5 = "COL_PHONE_ID"
            java.lang.String r4 = "COL_TIMESTAMP"
            java.lang.String r3 = "COL_ORIGIN"
            java.lang.String[] r0 = new java.lang.String[]{r5, r4, r3}
            android.database.MatrixCursor r6 = new android.database.MatrixCursor
            r6.<init>(r0)
            java.lang.String r8 = r14.getCallingPackage()
            android.content.Context r7 = r14.getContext()
            if (r7 == 0) goto L_0x00e7
            if (r8 == 0) goto L_0x00e7
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.0rM r0 = X.C15470rN.A0c
            r2.add(r0)
            X.0rM r0 = X.C15470rN.A0f
            r2.add(r0)
            X.0rM r0 = X.C15470rN.A0t
            r2.add(r0)
            X.0rM r0 = X.C15470rN.A1F
            r2.add(r0)
            java.lang.String r0 = r7.getPackageName()
            android.content.pm.PackageInfo r0 = X.C15980sH.A00(r7, r0)
            android.content.pm.Signature r0 = X.C15980sH.A01(r0)
            X.0rM r1 = X.C15980sH.A03(r0)
            java.util.Set r0 = X.C15470rN.A1H
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.util.Set r0 = X.C15470rN.A1N
            boolean r1 = r0.contains(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            X.0rM r0 = X.AnonymousClass0QK.A01
            r2.add(r0)
        L_0x005d:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)
            X.0rs r1 = X.C15760rq.A01(r0)
            r2 = 0
            android.content.pm.PackageInfo r0 = X.C15980sH.A00(r7, r8)     // Catch:{ Exception -> 0x00a4 }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ Exception -> 0x00a4 }
            int r13 = r0.uid     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r0 = new java.lang.String[]{r8}     // Catch:{ Exception -> 0x00a4 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x00a4 }
            java.util.List r12 = java.util.Collections.unmodifiableList(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object[] r0 = r12.toArray(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x00a4 }
            X.0rM r9 = X.C15980sH.A02(r7, r0)     // Catch:{ Exception -> 0x00a4 }
            r10 = 0
            X.0sO r8 = new X.0sO     // Catch:{ Exception -> 0x00a4 }
            r11 = r10
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00a4 }
            boolean r0 = X.C15980sH.A04(r7)     // Catch:{ Exception -> 0x00a4 }
            boolean r0 = r1.A06(r8, r0)     // Catch:{ Exception -> 0x00a4 }
            if (r0 != 0) goto L_0x00a3
            X.0rs r1 = X.AnonymousClass0QK.A00     // Catch:{ Exception -> 0x00a4 }
            boolean r0 = X.C15980sH.A04(r7)     // Catch:{ Exception -> 0x00a4 }
            boolean r0 = r1.A06(r8, r0)     // Catch:{ Exception -> 0x00a4 }
            if (r0 == 0) goto L_0x00a4
        L_0x00a3:
            r2 = 1
        L_0x00a4:
            if (r2 == 0) goto L_0x00e7
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[]{r5, r4, r3}     // Catch:{ Exception -> 0x00e6 }
            android.database.MatrixCursor r9 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x00e6 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x00e6 }
            android.content.Context r1 = r14.getContext()     // Catch:{ Exception -> 0x00e6 }
            if (r1 == 0) goto L_0x00e5
            java.lang.String r0 = "analyticsprefs"
            android.content.SharedPreferences r8 = r1.getSharedPreferences(r0, r2)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "analytics_device_id"
            r1 = 0
            java.lang.String r7 = r8.getString(r0, r1)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "analytic_device_timestamp"
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r8.getLong(r0, r4)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "origin"
            java.lang.String r1 = r8.getString(r0, r1)     // Catch:{ Exception -> 0x00e6 }
            if (r7 == 0) goto L_0x00e5
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r1}     // Catch:{ Exception -> 0x00e6 }
            r9.addRow(r0)     // Catch:{ Exception -> 0x00e6 }
        L_0x00e5:
            return r9
        L_0x00e6:
            return r6
        L_0x00e7:
            java.lang.String r1 = "Access to FDID denied"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12050lE.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
