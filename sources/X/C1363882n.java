package X;

import android.os.Handler;

/* renamed from: X.82n  reason: invalid class name and case insensitive filesystem */
public final class C1363882n implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C111446nh A01;
    public final /* synthetic */ AnonymousClass0MZ A02;
    public final /* synthetic */ Integer[] A03;

    public C1363882n(Handler handler, C111446nh r2, AnonymousClass0MZ r3, Integer[] numArr) {
        this.A01 = r2;
        this.A03 = numArr;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r7.CDU(r4, 100, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r7.Bwi(r4, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.6nh r2 = r9.A01
            java.lang.Integer[] r6 = r9.A03
            X.0MZ r5 = r9.A02
            int r0 = r5.A00
            r1 = r6[r0]
            boolean r0 = r2 instanceof X.AnonymousClass5NI
            if (r0 == 0) goto L_0x0072
            X.5NI r2 = (X.AnonymousClass5NI) r2
            com.facebook.neko.directinstall.installer.FakeXiaomiStoreDownloadService r0 = r2.A00
            com.xiaomi.market.IDownloadCallback r7 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r3 = "FakeXiaomiStoreDownloadService"
            if (r7 == 0) goto L_0x00c6
            if (r4 == 0) goto L_0x00c9
            int r2 = r1.intValue()     // Catch:{ RemoteException -> 0x00cf }
            r0 = 100
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x002f;
                case 2: goto L_0x0037;
                case 3: goto L_0x003a;
                case 4: goto L_0x003d;
                case 5: goto L_0x0040;
                case 6: goto L_0x0047;
                case 7: goto L_0x004f;
                case 8: goto L_0x0057;
                case 9: goto L_0x0063;
                case 10: goto L_0x006b;
                default: goto L_0x0025;
            }     // Catch:{ RemoteException -> 0x00cf }
        L_0x0025:
            goto L_0x00d3
        L_0x0027:
            r1 = 2
            java.lang.String r0 = "Download Waiting"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x002f:
            r1 = 3
            java.lang.String r0 = "Download Started"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0037:
            r2 = 1101004800(0x41a00000, float:20.0)
            goto L_0x0042
        L_0x003a:
            r2 = 1112014848(0x42480000, float:50.0)
            goto L_0x0042
        L_0x003d:
            r2 = 1116471296(0x428c0000, float:70.0)
            goto L_0x0042
        L_0x0040:
            r2 = 1120403456(0x42c80000, float:100.0)
        L_0x0042:
            r7.CDU(r4, r0, r2)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0047:
            r1 = 6
            java.lang.String r0 = "Install Started"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x004f:
            r1 = 9
            java.lang.String r0 = "Install Successful"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0057:
            r1 = 23
            r0 = 669(0x29d, float:9.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RemoteException -> 0x00cf }
            r7.Bwj(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0063:
            r1 = 37
            java.lang.String r0 = "Insufficient space before installation"
            r7.Bwj(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x006b:
            r1 = 1
            java.lang.String r0 = "N/A - There is no installation package for this model."
            r7.Bwj(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0072:
            X.5NH r2 = (X.AnonymousClass5NH) r2
            r8 = 0
            X.C04220Ms.A0B(r1, r8)
            com.facebook.neko.directinstall.installer.FakeGalaxyStoreDownloadService r0 = r2.A00
            com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback r7 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r3 = "FakeGalaxyStoreDownloadService"
            if (r7 == 0) goto L_0x00c6
            if (r4 == 0) goto L_0x00c9
            int r0 = r1.intValue()     // Catch:{ RemoteException -> 0x00cf }
            r1 = 100
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0094;
                case 2: goto L_0x009b;
                case 3: goto L_0x009f;
                case 4: goto L_0x00a2;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00ba;
                case 9: goto L_0x00be;
                case 10: goto L_0x00c0;
                default: goto L_0x008d;
            }     // Catch:{ RemoteException -> 0x00cf }
        L_0x008d:
            goto L_0x00d3
        L_0x008e:
            java.lang.String r0 = "Download Waiting"
            r7.CMF(r4, r8, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x0094:
            r1 = 1
            java.lang.String r0 = "Download Started"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x009b:
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            goto L_0x00a8
        L_0x009f:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x00a8
        L_0x00a2:
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L_0x00a8
        L_0x00a6:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00a8:
            r7.CDU(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x00ac:
            r1 = 3
            java.lang.String r0 = "Install Started"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x00b3:
            r1 = 4
            java.lang.String r0 = "Install Successful"
            r7.CMF(r4, r1, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x00ba:
            r0 = 100001(0x186a1, float:1.40131E-40)
            goto L_0x00c2
        L_0x00be:
            r0 = -4
            goto L_0x00c2
        L_0x00c0:
            r0 = 1004(0x3ec, float:1.407E-42)
        L_0x00c2:
            r7.Bwi(r4, r0)     // Catch:{ RemoteException -> 0x00cf }
            goto L_0x00d3
        L_0x00c6:
            java.lang.String r0 = "sendEvent: callback shouldn't be null."
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r0 = "sendEvent: packageName shouldn't be null."
        L_0x00cb:
            X.AnonymousClass0LU.A0B(r3, r0)
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            X.AnonymousClass0LU.A0E(r3, r4, r0)
        L_0x00d3:
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            int r0 = r6.length
            if (r1 >= r0) goto L_0x00e3
            android.os.Handler r2 = r9.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r9, r0)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363882n.run():void");
    }
}
