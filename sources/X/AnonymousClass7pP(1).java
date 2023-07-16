package X;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Synchronized$SynchronizedQueue;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.service.session.UserSession;
import java.util.Queue;

/* renamed from: X.7pP  reason: invalid class name */
public final class AnonymousClass7pP implements C33788HuV, AnonymousClass0i4 {
    public final UserSession A00;
    public final Queue A01 = new Synchronized$SynchronizedQueue(new EvictingQueue(5));

    public AnonymousClass7pP(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        X.C10450iM.A00().Ccy(X.AnonymousClass006.A0Y, "AppreciationReportLogsProviderImpl", X.C18170wI.A00(278), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getContentInBackground(android.content.Context r7) {
        /*
            r6 = this;
            r5 = 0
            java.util.Queue r4 = r6.A01     // Catch:{ JSONException -> 0x003d }
            monitor-enter(r4)     // Catch:{ JSONException -> 0x003d }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ JSONException -> 0x003d }
            return r5
        L_0x000c:
            X.M4h r1 = new X.M4h     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            r0 = 1
            r1.A06 = r0     // Catch:{ all -> 0x003a }
            com.google.gson.Gson r3 = r1.A03()     // Catch:{ all -> 0x003a }
            org.json.JSONArray r2 = X.C18250wR.A0i()     // Catch:{ all -> 0x003a }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x003a }
        L_0x0020:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x003a }
            X.2FS r0 = (X.AnonymousClass2FS) r0     // Catch:{ all -> 0x003a }
            com.google.gson.JsonElement r0 = r3.A01(r0)     // Catch:{ all -> 0x003a }
            r2.put(r0)     // Catch:{ all -> 0x003a }
            goto L_0x0020
        L_0x0034:
            java.lang.String r0 = r3.A08(r2)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ JSONException -> 0x003d }
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ JSONException -> 0x003d }
            throw r0     // Catch:{ JSONException -> 0x003d }
        L_0x003d:
            r4 = move-exception
            java.lang.Integer r3 = X.AnonymousClass006.A0Y
            java.lang.String r2 = "AppreciationReportLogsProviderImpl"
            r0 = 278(0x116, float:3.9E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            X.0IB r0 = X.C10450iM.A00()
            r0.Ccy(r3, r2, r1, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7pP.getContentInBackground(android.content.Context):java.lang.String");
    }

    public final String getFilenamePrefix() {
        return "content_appreciation_debug_info";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "AppreciationReportLogsProviderImpl";
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
