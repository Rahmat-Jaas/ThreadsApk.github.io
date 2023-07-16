package com.instagram.direct.stella;

import X.AnonymousClass006;
import X.AnonymousClass0gE;
import X.AnonymousClass0i1;
import X.AnonymousClass0wJ;
import X.AnonymousClass7M3;
import X.AnonymousClass802;
import X.C103196Ye;
import X.C109376ju;
import X.C15470rN;
import X.C15760rq;
import X.C16420t2;
import X.C18170wI;
import X.C18230wP;
import X.C24128D9z;
import X.C30954Gc6;
import X.C86144wL;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Handler;
import com.facebook.redex.IDxFCallbackShape79S0300000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.util.Collections;

public class StellaIpcDirectMessagingServiceClient implements AnonymousClass0i1 {
    public static final String FB_PERMISSION = "com.instagram.android.fbpermission.SEND_ACTION_RESULT";
    public static final long KEEP_CONNECTION_ALIVE_MS = 60000;
    public static final String VIEW_APP_DIRECT_MESSAGING_HANDLER = "com.facebook.assistant.stella.ipc.instagram.service.InstagramIpcDirectMessagingServiceServer";
    public static volatile StellaIpcDirectMessagingServiceClient sInstance;
    public Application mContext;
    public final Runnable mDisconnectRunnable = new AnonymousClass802(this);
    public Handler mHandler;
    public boolean mIsServiceConnectionInProgress = false;
    public final Object mLock = C86144wL.A0d();
    public int mRunningRequests = 0;
    public final ServiceConnection mServiceConnection = new AnonymousClass7M3(this);
    public SettableFuture mServiceInterfaceFuture = new SettableFuture();
    public UserSession mUserSession;

    private ListenableFuture connect() {
        synchronized (this.mLock) {
            if (this.mIsServiceConnectionInProgress || this.mServiceInterfaceFuture.isDone()) {
                SettableFuture settableFuture = this.mServiceInterfaceFuture;
                return settableFuture;
            }
            if (!(this.mContext == null || this.mUserSession == null)) {
                this.mIsServiceConnectionInProgress = true;
                this.mServiceInterfaceFuture = new SettableFuture();
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mDisconnectRunnable);
                }
                Intent A0B = C18230wP.A0B();
                PackageInfo A00 = C103196Ye.A00(this.mContext, this.mUserSession);
                if (A00 != null) {
                    A0B.setComponent(new ComponentName(A00.packageName, VIEW_APP_DIRECT_MESSAGING_HANDLER));
                    try {
                        C16420t2.A00().A0A(C15760rq.A01(Collections.singleton(C15470rN.A1C))).A01(C18170wI.A00(683)).A0A(this.mContext, A0B, this.mServiceConnection);
                    } catch (Exception e) {
                        this.mServiceInterfaceFuture.setException(e);
                        this.mContext.unbindService(this.mServiceConnection);
                        C24128D9z.A00(this.mUserSession, AnonymousClass006.A01, e.toString());
                    }
                }
            }
            SettableFuture settableFuture2 = this.mServiceInterfaceFuture;
            return settableFuture2;
        }
    }

    /* access modifiers changed from: private */
    public void disconnect() {
        synchronized (this.mLock) {
            try {
                Application application = this.mContext;
                if (application != null) {
                    application.unbindService(this.mServiceConnection);
                }
            } catch (Exception e) {
                C24128D9z.A00(this.mUserSession, AnonymousClass006.A0C, e.toString());
            }
            this.mIsServiceConnectionInProgress = false;
            this.mServiceInterfaceFuture = new SettableFuture();
        }
    }

    public static StellaIpcDirectMessagingServiceClient getInstance(Context context, UserSession userSession) {
        Class<StellaIpcDirectMessagingServiceClient> cls = StellaIpcDirectMessagingServiceClient.class;
        if (sInstance == null) {
            synchronized (cls) {
                sInstance = (StellaIpcDirectMessagingServiceClient) C86144wL.A0i(userSession, cls, context, 7);
            }
        }
        return sInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isPackageValid() {
        /*
            r15 = this;
            android.app.Application r1 = r15.mContext
            r14 = 0
            if (r1 == 0) goto L_0x00b5
            com.instagram.service.session.UserSession r0 = r15.mUserSession
            if (r0 == 0) goto L_0x00b5
            android.content.pm.PackageInfo r0 = X.C103196Ye.A00(r1, r0)
            if (r0 == 0) goto L_0x00b5
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x00b5
            android.app.Application r1 = r15.mContext
            com.instagram.service.session.UserSession r0 = r15.mUserSession
            android.content.pm.PackageInfo r0 = X.C103196Ye.A00(r1, r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.versionName
            java.lang.String r2 = "124.0.0.0.15"
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "\\."
            java.lang.String[] r11 = r0.split(r1)
            java.lang.String r0 = r2.trim()
            java.lang.String[] r10 = r0.split(r1)
            int r9 = r11.length
            int r8 = r10.length
            int r7 = java.lang.Math.max(r9, r8)
            r6 = 0
        L_0x003a:
            if (r6 >= r7) goto L_0x009d
            java.lang.String r13 = ""
            if (r6 >= r9) goto L_0x007d
            r2 = r11[r6]
        L_0x0042:
            if (r6 >= r8) goto L_0x007b
            r1 = r10[r6]
        L_0x0046:
            java.util.regex.Pattern r0 = X.C1365183a.A00
            java.util.regex.Matcher r5 = r0.matcher(r2)
            java.util.regex.Matcher r4 = r0.matcher(r1)
        L_0x0050:
            boolean r3 = r5.find()
            boolean r12 = r4.find()
            if (r3 != 0) goto L_0x005f
            if (r12 != 0) goto L_0x005f
            int r6 = r6 + 1
            goto L_0x003a
        L_0x005f:
            r2 = 1
            if (r3 == 0) goto L_0x006d
            java.lang.String r0 = r5.group(r2)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r1 = 0
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            if (r12 == 0) goto L_0x007f
            java.lang.String r0 = r4.group(r2)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            goto L_0x0080
        L_0x0079:
            r0 = 0
            goto L_0x0080
        L_0x007b:
            r1 = r13
            goto L_0x0046
        L_0x007d:
            r2 = r13
            goto L_0x0042
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r1 < r0) goto L_0x00b5
            if (r1 > r0) goto L_0x009d
            r0 = 2
            if (r3 == 0) goto L_0x00b3
            java.lang.String r3 = r5.group(r0)
        L_0x008b:
            if (r12 == 0) goto L_0x00b1
            java.lang.String r2 = r4.group(r0)
        L_0x0091:
            int r1 = r3.length()
            if (r1 != 0) goto L_0x009f
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x009f
        L_0x009d:
            r14 = 1
            return r14
        L_0x009f:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00a8
            if (r1 <= 0) goto L_0x00a8
            return r14
        L_0x00a8:
            int r0 = r3.compareTo(r2)
            if (r0 == 0) goto L_0x0050
            if (r0 < 0) goto L_0x00b5
            goto L_0x009d
        L_0x00b1:
            r2 = r13
            goto L_0x0091
        L_0x00b3:
            r3 = r13
            goto L_0x008b
        L_0x00b5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.isPackageValid():boolean");
    }

    /* access modifiers changed from: private */
    public void onRequestFinished() {
        synchronized (this.mLock) {
            int i = this.mRunningRequests - 1;
            this.mRunningRequests = i;
            if (i <= 0) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mDisconnectRunnable);
                    this.mHandler.postDelayed(this.mDisconnectRunnable, KEEP_CONNECTION_ALIVE_MS);
                }
                this.mRunningRequests = 0;
            }
        }
    }

    public final SettableFuture runIpcRequest(C109376ju r6) {
        SettableFuture settableFuture = new SettableFuture();
        if (!isPackageValid()) {
            return settableFuture;
        }
        synchronized (this.mLock) {
            this.mRunningRequests++;
            C30954Gc6.A03(new IDxFCallbackShape79S0300000_2_I2(2, settableFuture, r6, this), connect(), AnonymousClass0gE.A00().A00);
        }
        return settableFuture;
    }

    public StellaIpcDirectMessagingServiceClient(Application application, UserSession userSession) {
        this.mContext = application;
        this.mHandler = AnonymousClass0wJ.A0F();
        this.mUserSession = userSession;
    }

    public static /* synthetic */ StellaIpcDirectMessagingServiceClient lambda$getInstance$0(Context context, UserSession userSession) {
        return new StellaIpcDirectMessagingServiceClient((Application) context.getApplicationContext(), userSession);
    }

    public void onUserSessionWillEnd(boolean z) {
        disconnect();
        synchronized (this.mLock) {
            this.mUserSession = null;
            this.mContext = null;
            this.mHandler = null;
            sInstance = null;
        }
    }
}
