package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: X.0Bd  reason: invalid class name and case insensitive filesystem */
public final class C02410Bd extends BroadcastReceiver {
    public Handler A00;
    public final /* synthetic */ C03440Ik A01;

    public C02410Bd(C03440Ik r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        if (r0.compareTo(r1) > 0) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r6, android.content.Intent r7, X.C02410Bd r8) {
        /*
            if (r7 == 0) goto L_0x00ec
            java.lang.String r0 = "uploader_service_broadcast_auth_token"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x00ec
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = r0.getCreatorPackage()
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ec
            android.os.Bundle r4 = r7.getExtras()
            java.lang.String r0 = "job_id"
            r2 = -1
            int r3 = r4.getInt(r0, r2)
            java.lang.String r0 = "hack_action"
            java.lang.String r6 = r4.getString(r0)
            java.lang.String r0 = "will_retry"
            boolean r7 = r4.getBoolean(r0)
            java.lang.String r0 = "successful_processes"
            java.util.ArrayList r1 = r4.getStringArrayList(r0)
            java.lang.String r0 = "newest_files_uploaded"
            java.util.ArrayList r0 = r4.getStringArrayList(r0)
            X.00x r5 = X.AnonymousClass0CH.A00(r1, r0)
            if (r3 == r2) goto L_0x00e4
            X.0Ik r2 = r8.A01
            r0 = 2131302292(0x7f091794, float:1.8222666E38)
            if (r3 != r0) goto L_0x00ec
            java.lang.String r3 = "MicroBatchUploadManager"
            if (r6 == 0) goto L_0x007c
            monitor-enter(r2)
            boolean r0 = r2.A0B     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "com.facebook.analytics2.logger.UPLOAD_NOW"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0066
            X.0CE r4 = X.AnonymousClass0CE.A01()     // Catch:{ all -> 0x0079 }
            android.content.Context r1 = r2.A0D     // Catch:{ all -> 0x0079 }
            boolean r0 = r2.A0H     // Catch:{ all -> 0x0079 }
            r4.A04(r1, r0)     // Catch:{ all -> 0x0079 }
        L_0x0066:
            monitor-exit(r2)
            if (r7 != 0) goto L_0x00ec
            monitor-enter(r2)
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            r0 = 0
            r2.A08 = r0     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r2)
            goto L_0x0081
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x007c:
            if (r7 != 0) goto L_0x00ec
            X.C03440Ik.A03(r2)
        L_0x0081:
            java.lang.String r0 = X.C29896Fw7.A00()
            int r0 = r5.A04(r0)
            if (r0 < 0) goto L_0x00ec
            java.lang.Object[] r1 = r5.A02
            int r0 = r0 << 1
            int r0 = r0 + 1
            r1 = r1[r0]
            java.io.File r1 = (java.io.File) r1
            monitor-enter(r2)     // Catch:{ NullPointerException -> 0x00d0 }
            boolean r0 = r2.A0C     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00b7
            java.io.File r0 = r2.A06     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x00a1
            if (r0 != 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a1:
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00cd }
            if (r0 <= 0) goto L_0x00ad
        L_0x00a9:
            r2.Bhx()     // Catch:{ all -> 0x00cd }
            goto L_0x00b7
        L_0x00ad:
            java.io.File r0 = r2.A07     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b5:
            if (r0 != 0) goto L_0x00bf
        L_0x00b7:
            r0 = 0
            goto L_0x00c3
        L_0x00b9:
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00cd }
            if (r0 <= 0) goto L_0x00b7
        L_0x00bf:
            r2.Bi1()     // Catch:{ all -> 0x00cd }
            goto L_0x00b7
        L_0x00c3:
            r2.A06 = r0     // Catch:{ all -> 0x00cb }
            r2.A07 = r0     // Catch:{ all -> 0x00cb }
            r2.A02 = r0     // Catch:{ all -> 0x00cb }
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00d0 }
            return
        L_0x00cb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ NullPointerException -> 0x00d0 }
            throw r0     // Catch:{ NullPointerException -> 0x00d0 }
        L_0x00d0:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'int com.android.server.job.controllers.JobStatus.getUid()' on a null object reference"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "system error while performing catch-up scheduling"
            X.AnonymousClass0LU.A0J(r3, r0, r2)
            return
        L_0x00e3:
            throw r2
        L_0x00e4:
            java.lang.String r1 = "jobId = -1"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02410Bd.A00(android.content.Context, android.content.Intent, X.0Bd):void");
    }

    public final void onReceive(Context context, Intent intent) {
        int A012 = C14030oh.A01(-1202324253);
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new C02400Bc(context, intent, this));
        } else {
            A00(context, intent, this);
        }
        C14030oh.A0E(1837465845, A012, intent);
    }
}
