package X;

import android.content.BroadcastReceiver;

/* renamed from: X.0C9  reason: invalid class name */
public final class AnonymousClass0C9 extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0DO A00;

    public AnonymousClass0C9(AnonymousClass0DO r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r0.compareTo(r1) > 0) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 1734254982(0x675ea186, float:1.05134494E24)
            int r3 = X.C14030oh.A01(r0)
            if (r11 != 0) goto L_0x0010
            r0 = 44045524(0x2a014d4, float:2.3521842E-37)
        L_0x000c:
            X.C14030oh.A0E(r0, r3, r11)
            return
        L_0x0010:
            java.lang.String r0 = "uploader_service_broadcast_auth_token"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x00ef
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = r0.getCreatorPackage()
            java.lang.String r0 = r10.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ef
            android.os.Bundle r5 = r11.getExtras()
            java.lang.String r0 = "job_id"
            r2 = -1
            int r4 = r5.getInt(r0, r2)
            java.lang.String r0 = "hack_action"
            java.lang.String r7 = r5.getString(r0)
            java.lang.String r0 = "will_retry"
            boolean r8 = r5.getBoolean(r0)
            java.lang.String r0 = "successful_processes"
            java.util.ArrayList r1 = r5.getStringArrayList(r0)
            java.lang.String r0 = "newest_files_uploaded"
            java.util.ArrayList r0 = r5.getStringArrayList(r0)
            X.00x r6 = X.AnonymousClass0CH.A00(r1, r0)
            if (r4 == r2) goto L_0x00fe
            X.0DO r2 = r9.A00
            int r0 = r2.A08
            if (r4 == r0) goto L_0x005b
            r0 = 1966293539(0x75334223, float:2.2723695E32)
            goto L_0x000c
        L_0x005b:
            java.lang.String r4 = "UploadManager"
            if (r7 == 0) goto L_0x008a
            monitor-enter(r2)
            boolean r0 = r2.A07     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "com.facebook.analytics2.logger.UPLOAD_NOW"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0077
            X.0CE r5 = X.AnonymousClass0CE.A01()     // Catch:{ all -> 0x00f4 }
            android.content.Context r1 = r2.A09     // Catch:{ all -> 0x00f4 }
            boolean r0 = r2.A0F     // Catch:{ all -> 0x00f4 }
            r5.A04(r1, r0)     // Catch:{ all -> 0x00f4 }
        L_0x0077:
            monitor-exit(r2)
            if (r8 != 0) goto L_0x00ea
            monitor-enter(r2)
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0088
            r0 = 0
            r2.A04 = r0     // Catch:{ all -> 0x00f4 }
        L_0x0088:
            monitor-exit(r2)
            goto L_0x008f
        L_0x008a:
            if (r8 != 0) goto L_0x00ea
            X.AnonymousClass0DO.A01(r2)
        L_0x008f:
            java.lang.String r0 = X.C29896Fw7.A00()
            int r0 = r6.A04(r0)
            if (r0 < 0) goto L_0x00ea
            java.lang.Object[] r1 = r6.A02
            int r0 = r0 << 1
            int r0 = r0 + 1
            r1 = r1[r0]
            java.io.File r1 = (java.io.File) r1
            monitor-enter(r2)     // Catch:{ NullPointerException -> 0x00d8 }
            java.io.File r0 = r2.A02     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00ab
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00ab:
            if (r0 == 0) goto L_0x00b7
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00d5 }
            if (r0 <= 0) goto L_0x00b7
        L_0x00b3:
            r2.Bhx()     // Catch:{ all -> 0x00d5 }
            goto L_0x00c1
        L_0x00b7:
            java.io.File r0 = r2.A03     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            if (r0 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00bf:
            if (r0 != 0) goto L_0x00c9
        L_0x00c1:
            r0 = 0
            goto L_0x00cd
        L_0x00c3:
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00d5 }
            if (r0 <= 0) goto L_0x00c1
        L_0x00c9:
            r2.Bi1()     // Catch:{ all -> 0x00d5 }
            goto L_0x00c1
        L_0x00cd:
            r2.A02 = r0     // Catch:{ all -> 0x00d3 }
            r2.A03 = r0     // Catch:{ all -> 0x00d3 }
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00d8 }
            goto L_0x00ea
        L_0x00d3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00d8 }
            throw r0     // Catch:{ NullPointerException -> 0x00d8 }
        L_0x00d8:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'int com.android.server.job.controllers.JobStatus.getUid()' on a null object reference"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "system error while performing catch-up scheduling"
            X.AnonymousClass0LU.A0J(r4, r0, r2)
        L_0x00ea:
            r0 = 885315441(0x34c4d771, float:3.66646E-7)
            goto L_0x000c
        L_0x00ef:
            r0 = -1671353625(0xffffffff9c612ae7, float:-7.4501705E-22)
            goto L_0x000c
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00f7:
            r0 = -619235238(0xffffffffdb17385a, float:-4.2564681E16)
            X.C14030oh.A0E(r0, r3, r11)
            throw r2
        L_0x00fe:
            java.lang.String r0 = "jobId = -1"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C9.onReceive(android.content.Context, android.content.Intent):void");
    }
}
