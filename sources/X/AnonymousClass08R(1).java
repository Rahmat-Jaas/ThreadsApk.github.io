package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08R  reason: invalid class name */
public final class AnonymousClass08R implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MultiSignalANRDetector A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass08R(MultiSignalANRDetector multiSignalANRDetector, String str, String str2, long j, long j2, boolean z, boolean z2) {
        this.A02 = multiSignalANRDetector;
        this.A04 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A00 = j2;
        this.A05 = z;
        this.A06 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bf */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00b7=Splitter:B:42:0x00b7, B:47:0x00bf=Splitter:B:47:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r6 = r11.A02
            X.0tV r1 = r6.A0B
            X.0tV r0 = X.C16650tV.NO_ANR_DETECTED
            if (r1 == r0) goto L_0x003e
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED
            if (r1 == r0) goto L_0x003e
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED
            if (r1 == r0) goto L_0x003e
            java.lang.Integer r2 = X.AnonymousClass006.A00
        L_0x0012:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r2 != r0) goto L_0x0041
            java.lang.String r1 = r6.A0C
            java.lang.String r0 = "Ignoring new sigquit"
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.String r1 = r11.A04
            if (r1 == 0) goto L_0x0029
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
        L_0x0029:
            X.08l r0 = r6.A0T
            r0.cleanupAppStateFile()
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x003d
            X.0NG r0 = r6.A0V
            X.0aW r2 = r0.A03
            long r0 = r11.A01
            r2.A06 = r0
            X.C06870aW.A00(r2)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            goto L_0x0012
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            java.lang.String r1 = r6.A0C
            if (r2 != r0) goto L_0x0074
            java.lang.String r0 = "Will clear error state"
            X.AnonymousClass0LU.A0C(r1, r0)
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A01(r6)
        L_0x004f:
            long r2 = r11.A01
            r6.A05 = r2
            java.lang.String r0 = r11.A03
            r6.A0D = r0
            java.lang.String r0 = r11.A04
            r6.A0E = r0
            long r0 = r11.A00
            r6.A04 = r0
            X.08X r7 = X.AnonymousClass08X.SIGQUIT_RECEIVED
            boolean r1 = r11.A05
            boolean r0 = r11.A06
            r6.A02(r7, r1, r0)
            X.0NG r0 = r6.A0V
            java.lang.String r8 = r0.A00()
            if (r8 == 0) goto L_0x00d6
            java.lang.Class<X.08F> r10 = X.AnonymousClass08F.class
            monitor-enter(r10)
            goto L_0x007a
        L_0x0074:
            java.lang.String r0 = "Will start new report"
            X.AnonymousClass0LU.A0C(r1, r0)
            goto L_0x004f
        L_0x007a:
            java.util.ArrayList r5 = X.AnonymousClass08F.A01     // Catch:{ all -> 0x00d3 }
            int r0 = r5.size()     // Catch:{ all -> 0x00d3 }
            if (r0 <= 0) goto L_0x0096
            int r0 = r5.size()     // Catch:{ all -> 0x00d3 }
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00d3 }
            X.08F r0 = (X.AnonymousClass08F) r0     // Catch:{ all -> 0x00d3 }
            long r0 = r0.A00     // Catch:{ all -> 0x00d3 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0096
        L_0x0094:
            monitor-exit(r10)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x0096:
            java.lang.String r4 = "SigquitRecord"
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c0 }
            r9.<init>(r8)     // Catch:{ IOException -> 0x00c0 }
            r1 = 8
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x00bb }
            int r0 = r9.read(r0)     // Catch:{ all -> 0x00bb }
            if (r0 == r1) goto L_0x00b1
            java.lang.String r1 = "Corrupted file %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x00bb }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00b7
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x00b7
            goto L_0x00b2
        L_0x00b7:
            r9.close()     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00ca
        L_0x00bb:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r0     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r0}     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Could not read from file %s"
            X.AnonymousClass0LU.A0O(r4, r0, r1)     // Catch:{ all -> 0x00d3 }
        L_0x00ca:
            X.08F r0 = new X.08F     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r5.add(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x0094
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d3 }
            throw r0
        L_0x00d6:
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A00(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08R.run():void");
    }
}
