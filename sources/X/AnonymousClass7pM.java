package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7pM  reason: invalid class name */
public final class AnonymousClass7pM implements C33788HuV {
    public final long A00;
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public final AnonymousClass8AL A02 = new AnonymousClass8AL();
    public final boolean A03;
    public final boolean A04;

    public final String getFilenamePrefix() {
        return "ar_logs";
    }

    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public /* synthetic */ AnonymousClass7pM(UserSession userSession) {
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        long A032 = C63803iN.A03(r5, userSession, 36607754315567867L);
        boolean A0E = C63803iN.A0E(r5, userSession, 36326279338796531L);
        boolean A0E2 = C63803iN.A0E(r5, userSession, 36326279338927604L);
        this.A00 = A032;
        this.A03 = A0E;
        this.A04 = A0E2;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2 r11) {
        /*
            r10 = this;
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0052
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r10.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r8 = 0
            if (r0 != 0) goto L_0x001e
            int r7 = r1.getReadHoldCount()
            r0 = 0
        L_0x0016:
            if (r0 >= r7) goto L_0x001f
            r9.unlock()
            int r0 = r0 + 1
            goto L_0x0016
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r1.writeLock()
            r6.lock()
            X.8AL r5 = r10.A02     // Catch:{ all -> 0x0045 }
            r5.A0X(r11)     // Catch:{ all -> 0x0045 }
            int r0 = r5.size()     // Catch:{ all -> 0x0045 }
            long r3 = (long) r0     // Catch:{ all -> 0x0045 }
            long r1 = r10.A00     // Catch:{ all -> 0x0045 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r5.A0U()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            if (r8 >= r7) goto L_0x0041
            r9.lock()
            int r8 = r8 + 1
            goto L_0x0039
        L_0x0041:
            r6.unlock()
            return
        L_0x0045:
            r0 = move-exception
        L_0x0046:
            if (r8 >= r7) goto L_0x004e
            r9.lock()
            int r8 = r8 + 1
            goto L_0x0046
        L_0x004e:
            r6.unlock()
            throw r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7pM.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2):void");
    }

    public final String getContentInBackground(Context context) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01.readLock();
        readLock.lock();
        try {
            AnonymousClass8AL r0 = this.A02;
            ArrayList A0w = AnonymousClass0wJ.A0w(r0);
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                KtCSuperShape0S3000000_I2 ktCSuperShape0S3000000_I2 = (KtCSuperShape0S3000000_I2) it.next();
                A0w.add(AnonymousClass00U.A0h(ktCSuperShape0S3000000_I2.A02, ": ", ktCSuperShape0S3000000_I2.A01, ": ", ktCSuperShape0S3000000_I2.A00));
            }
            String join = TextUtils.join("\n", A0w);
            C04220Ms.A06(join);
            return join;
        } finally {
            readLock.unlock();
        }
    }

    public final String getTag() {
        return "ArEffectsLogCollector";
    }
}
