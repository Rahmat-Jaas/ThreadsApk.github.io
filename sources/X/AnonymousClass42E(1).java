package X;

import com.instagram.service.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.42E  reason: invalid class name */
public final class AnonymousClass42E implements C33787HuU, AnonymousClass0i4 {
    public final LinkedList A00 = new LinkedList();

    public final boolean BOC(UserSession userSession, String str) {
        return true;
    }

    public final void Cr5(long j) {
    }

    public final String getTag() {
        return "DirectSearchFlytrapExtrasProvider";
    }

    public final void onSessionWillEnd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A[SYNTHETIC, Splitter:B:13:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map Agv(com.instagram.service.session.UserSession r7, java.io.File r8) {
        /*
            r6 = this;
            java.lang.String r0 = "direct_search.txt"
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r0)
            java.nio.charset.Charset r1 = X.AnonymousClass74V.A05
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r4)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            boolean r0 = r2 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L_0x001f
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r2, r1)
            r2 = r0
        L_0x001f:
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            r5 = r6
            monitor-enter(r5)     // Catch:{ all -> 0x0082 }
        L_0x0026:
            java.util.LinkedList r1 = r6.A00     // Catch:{ all -> 0x007f }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x006a
            java.lang.Object r2 = r1.remove()     // Catch:{ all -> 0x007f }
            kotlin.Pair r2 = (kotlin.Pair) r2     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "Search query: %-30s"
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x007f }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x007f }
            r3.write(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n"
            r3.write(r0)     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x007f }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x007f }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x007f }
        L_0x004c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x007f }
            com.instagram.model.direct.DirectSearchResult r0 = (com.instagram.model.direct.DirectSearchResult) r0     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r0.AB0()     // Catch:{ all -> 0x007f }
            r0 = 10
            java.lang.String r0 = X.AnonymousClass00U.A0A(r1, r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0)     // Catch:{ all -> 0x007f }
            r3.write(r0)     // Catch:{ all -> 0x007f }
            goto L_0x004c
        L_0x006a:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            r3.close()
            java.lang.String r1 = r4.getName()
            android.net.Uri r0 = android.net.Uri.fromFile(r4)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            java.util.Map r0 = X.AnonymousClass4WK.A0O(r0)
            return r0
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.C102596Vu.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass42E.Agv(com.instagram.service.session.UserSession, java.io.File):java.util.Map");
    }
}
