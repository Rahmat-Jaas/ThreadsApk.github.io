package X;

/* renamed from: X.3E1  reason: invalid class name */
public abstract class AnonymousClass3E1 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r3.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        r2 = X.C18180wK.A0k(r3);
        X.C04220Ms.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if (X.AnonymousClass8bP.A0j(r2, r6, false) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r0 = r4.getString(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r9.add(X.AnonymousClass3Q2.A01(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        return X.C18190wL.A1a(r9) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r7.hasNext() == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r3 = X.C18180wK.A0k(r7);
        r2 = r4.getAll().keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r2.hasNext() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r1 = X.C18180wK.A0k(r2);
        X.C04220Ms.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (X.AnonymousClass8bP.A0j(r1, r3, false) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        X.C18180wK.A0u(r4.edit(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (r1 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r7.hasNext() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r6 = X.C18180wK.A0k(r7);
        r3 = r4.getAll().keySet().iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.util.List r9, libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest r10) {
        /*
            r8 = this;
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r10.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x000a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r4.next()
            X.3Sl r3 = (X.C61243Sl) r3
            X.24m r0 = r3.A01
            java.lang.String r2 = r0.A00
            X.24G r0 = r3.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            r6.add(r0)
            goto L_0x000a
        L_0x0028:
            boolean r1 = r8 instanceof X.C81144nE
            r5 = 0
            java.lang.String r0 = "access_library_shared_storage"
            android.content.SharedPreferences r4 = X.C08340dC.A01(r0)
            java.util.Iterator r7 = r6.iterator()
            if (r1 == 0) goto L_0x0074
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.String r6 = X.C18180wK.A0k(r7)
            java.util.Map r0 = r4.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x004d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = X.C18180wK.A0k(r3)
            X.C04220Ms.A04(r2)
            r1 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r6, r5)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r4.getString(r2, r1)
            if (r0 == 0) goto L_0x004d
            X.3HZ r0 = X.AnonymousClass3Q2.A01(r0)
            r9.add(r0)
            goto L_0x004d
        L_0x006f:
            boolean r0 = X.C18190wL.A1a(r9)
            return r0
        L_0x0074:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.String r3 = X.C18180wK.A0k(r7)
            java.util.Map r0 = r4.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x008a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = X.C18180wK.A0k(r2)
            X.C04220Ms.A04(r1)
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r3, r5)
            if (r0 == 0) goto L_0x008a
            android.content.SharedPreferences$Editor r0 = r4.edit()
            X.C18180wK.A0u(r0, r1)
            goto L_0x008a
        L_0x00a5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E1.A00(java.util.List, libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest):int");
    }
}
