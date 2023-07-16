package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3WE  reason: invalid class name */
public final class AnonymousClass3WE {
    public static AnonymousClass3BK A00(Map map, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (AnonymousClass3BK) map.get(valueOf);
        }
        AnonymousClass3BK r0 = new AnonymousClass3BK();
        map.put(valueOf, r0);
        return r0;
    }

    public static String A01(Map map) {
        StringWriter A0d = C18230wP.A0d();
        try {
            MMp A04 = C18987Aon.A00.A04(A0d);
            A04.A0I();
            for (AnonymousClass3BK r4 : map.values()) {
                A04.A0J();
                A04.A0U("phone_numbers");
                A04.A0I();
                Iterator it = r4.A03.iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    if (A0k != null) {
                        A04.A0Y(A0k);
                    }
                }
                A04.A0F();
                A04.A0U("email_addresses");
                A04.A0I();
                Iterator it2 = r4.A02.iterator();
                while (it2.hasNext()) {
                    String A0k2 = C18180wK.A0k(it2);
                    if (A0k2 != null) {
                        A04.A0Y(A0k2);
                    }
                }
                A04.A0F();
                String str = r4.A00;
                if (str != null) {
                    A04.A0d("first_name", str);
                }
                String str2 = r4.A01;
                if (str2 != null) {
                    A04.A0d("last_name", str2);
                }
                A04.A0G();
            }
            A04.A0F();
            A04.close();
            return A0d.toString();
        } catch (IOException e) {
            throw new RuntimeException("Error creating json string", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (0 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r4.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r7 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r4.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (0 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00da, code lost:
        if (r4 == null) goto L_0x00df;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 r7 
      PHI: (r4v1 android.content.ContentProviderClient) = (r4v2 android.content.ContentProviderClient), (r4v0 android.content.ContentProviderClient) binds: [B:19:0x004c, B:3:0x000d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v0 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v5 android.database.Cursor) binds: [B:19:0x004c, B:3:0x000d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap A02(android.content.Context r11) {
        /*
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            android.content.ContentProviderClient r4 = X.C09400fM.A00(r11, r5)
            if (r4 == 0) goto L_0x0043
            r7 = 0
            java.lang.String[] r6 = X.C548030d.A00     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            java.lang.String r9 = "contact_id"
            r8 = r7
            android.database.Cursor r7 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            if (r7 != 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            boolean r1 = r7.moveToNext()     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            if (r1 == 0) goto L_0x0033
            r1 = 0
            int r3 = r7.getInt(r1)     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            r1 = 1
            java.lang.String r2 = r7.getString(r1)     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            X.3BK r1 = A00(r0, r3)     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            java.util.List r1 = r1.A03     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            r1.add(r2)     // Catch:{ RemoteException -> 0x0037, all -> 0x0076 }
            goto L_0x0019
        L_0x0033:
            r4.release()
            goto L_0x003c
        L_0x0037:
            r4.release()
            if (r7 == 0) goto L_0x0043
        L_0x003c:
            r7.close()
            goto L_0x0043
        L_0x0040:
            r4.release()
        L_0x0043:
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI
            android.content.ContentProviderClient r4 = X.C09400fM.A00(r11, r5)
            if (r4 == 0) goto L_0x008c
            r7 = 0
            java.lang.String[] r6 = X.C547830b.A00     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            java.lang.String r9 = "contact_id"
            r8 = r7
            android.database.Cursor r7 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            if (r7 != 0) goto L_0x0058
            goto L_0x0089
        L_0x0058:
            boolean r1 = r7.moveToNext()     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            if (r1 == 0) goto L_0x0072
            r1 = 0
            int r3 = r7.getInt(r1)     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            r1 = 1
            java.lang.String r2 = r7.getString(r1)     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            X.3BK r1 = A00(r0, r3)     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            java.util.List r1 = r1.A02     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            r1.add(r2)     // Catch:{ RemoteException -> 0x0080, all -> 0x0076 }
            goto L_0x0058
        L_0x0072:
            r4.release()
            goto L_0x0085
        L_0x0076:
            r0 = move-exception
            r4.release()
            if (r7 == 0) goto L_0x00d6
            r7.close()
            throw r0
        L_0x0080:
            r4.release()
            if (r7 == 0) goto L_0x008c
        L_0x0085:
            r7.close()
            goto L_0x008c
        L_0x0089:
            r4.release()
        L_0x008c:
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI
            android.content.ContentProviderClient r6 = X.C09400fM.A00(r11, r7)
            if (r6 == 0) goto L_0x00df
            r4 = 0
            java.lang.String[] r8 = X.C547930c.A00     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            java.lang.String r9 = "mimetype = ? AND data1 IS NOT NULL"
            r5 = 1
            java.lang.String r1 = "vnd.android.cursor.item/name"
            r3 = 0
            java.lang.String[] r10 = new java.lang.String[]{r1}     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            java.lang.String r11 = "contact_id"
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            if (r4 != 0) goto L_0x00ad
            r6.release()
            return r0
        L_0x00ad:
            boolean r1 = r4.moveToNext()     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            if (r1 == 0) goto L_0x00c9
            int r1 = r4.getInt(r3)     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            X.3BK r2 = A00(r0, r1)     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            java.lang.String r1 = r4.getString(r5)     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            r2.A00 = r1     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            r1 = 2
            java.lang.String r1 = r4.getString(r1)     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            r2.A01 = r1     // Catch:{ RemoteException -> 0x00d7, all -> 0x00cd }
            goto L_0x00ad
        L_0x00c9:
            r6.release()
            goto L_0x00dc
        L_0x00cd:
            r0 = move-exception
            r6.release()
            if (r4 == 0) goto L_0x00d6
            r4.close()
        L_0x00d6:
            throw r0
        L_0x00d7:
            r6.release()
            if (r4 == 0) goto L_0x00df
        L_0x00dc:
            r4.close()
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WE.A02(android.content.Context):java.util.LinkedHashMap");
    }
}
