package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7AL  reason: invalid class name */
public abstract class AnonymousClass7AL {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public final void A06() {
        NullPointerException th;
        boolean z;
        C93285lJ r6 = (C93285lJ) this;
        Lock lock = r6.A0H;
        lock.lock();
        try {
            Set set = r6.A0A.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A0B.set((Object) null);
                synchronized (basePendingResult.A07) {
                    try {
                        if (((AnonymousClass7AL) basePendingResult.A08.get()) == null || !basePendingResult.A04) {
                            basePendingResult.A05();
                        }
                        z = basePendingResult.A03;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            C146548mQ r0 = r6.A01;
            if (r0 != null) {
                r0.DBn();
            }
            Set set2 = r6.A09.A00;
            Iterator it = set2.iterator();
            if (it.hasNext()) {
                it.next();
                th = C18210wN.A0W(QuickExperimentDumperPlugin.CLEAR_CMD);
                throw th;
            }
            set2.clear();
            Queue<C93345lQ> queue = r6.A0G;
            for (C93345lQ r2 : queue) {
                r2.A0B.set((Object) null);
                r2.A05();
            }
            queue.clear();
            if (r6.A01 != null) {
                r6.A09();
                AnonymousClass7MH r1 = r6.A0C;
                r1.A08 = false;
                r1.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public final void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C93285lJ r3 = (C93285lJ) this;
        printWriter.append(str).append("mContext=").println(r3.A05);
        printWriter.append(str).append("mResuming=").print(r3.A0K);
        printWriter.append(" mWorkQueue.size()=").print(r3.A0G.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(r3.A0A.A01.size());
        C146548mQ r0 = r3.A01;
        if (r0 != null) {
            r0.DBo(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Context A02() {
        if (this instanceof C93275lI) {
            return ((C93275lI) this).A00.A01;
        }
        return ((C93285lJ) this).A05;
    }

    public final C148598rX A03(C99286Iv r3) {
        if (this instanceof C93285lJ) {
            C148598rX r1 = (C148598rX) ((C93285lJ) this).A0E.get(r3);
            C13320nQ.A02(r1, "Appropriate Api was not requested.");
            return r1;
        }
        throw C18240wQ.A0j();
    }

    public final C93345lQ A04(C93345lQ r7) {
        if (this instanceof C93275lI) {
            C129167lR.A02(((C93275lI) this).A00, r7, 1);
            return r7;
        }
        C93285lJ r5 = (C93285lJ) this;
        C108946jD r2 = r7.A01;
        boolean containsKey = r5.A0E.containsKey(r7.A00);
        String str = r2.A02;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 65);
        A0s.append("GoogleApiClient is not configured to use ");
        A0s.append(str);
        C13320nQ.A06(containsKey, C18180wK.A0i(" required for this call.", A0s));
        Lock lock = r5.A0H;
        lock.lock();
        try {
            C146548mQ r1 = r5.A01;
            if (r1 != null) {
                if (r5.A0K) {
                    Queue queue = r5.A0G;
                    queue.add(r7);
                    while (!queue.isEmpty()) {
                        C93345lQ r22 = (C93345lQ) queue.remove();
                        C1195175q r12 = r5.A0A;
                        r12.A01.add(r22);
                        r22.A0B.set(r12.A00);
                        r22.A0A(Status.A07);
                    }
                } else {
                    r7 = r1.DBh(r7);
                }
                return r7;
            }
            throw C18180wK.A0a("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.8mQ] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.7ln] */
    /* JADX WARNING: type inference failed for: r14v4, types: [X.7lm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ all -> 0x0232, all -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A[Catch:{ all -> 0x0232, all -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6 A[Catch:{ all -> 0x0232, all -> 0x023f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r30 = this;
            r13 = r30
            X.5lJ r13 = (X.C93285lJ) r13
            java.util.concurrent.locks.Lock r0 = r13.A0H
            r28 = r0
            r28.lock()
            int r0 = r13.A04     // Catch:{ all -> 0x023f }
            r3 = 2
            r4 = 0
            r5 = 1
            if (r0 < 0) goto L_0x001e
            java.lang.Integer r0 = r13.A02     // Catch:{ all -> 0x023f }
            boolean r1 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.C13320nQ.A07(r1, r0)     // Catch:{ all -> 0x023f }
            goto L_0x0053
        L_0x001e:
            java.lang.Integer r0 = r13.A02     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x0040
            java.util.Map r0 = r13.A0E     // Catch:{ all -> 0x023f }
            java.util.Iterator r2 = X.C86144wL.A0z(r0)     // Catch:{ all -> 0x023f }
            r1 = 0
        L_0x0029:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x023f }
            X.8rX r0 = (X.C148598rX) r0     // Catch:{ all -> 0x023f }
            boolean r0 = r0.CeJ()     // Catch:{ all -> 0x023f }
            r1 = r1 | r0
            goto L_0x0029
        L_0x003b:
            r0 = 3
            if (r1 == 0) goto L_0x004d
            r0 = 1
            goto L_0x004d
        L_0x0040:
            int r0 = r0.intValue()     // Catch:{ all -> 0x023f }
            if (r0 != r3) goto L_0x0053
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x023f }
        L_0x004c:
            throw r0     // Catch:{ all -> 0x023f }
        L_0x004d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023f }
            r13.A02 = r0     // Catch:{ all -> 0x023f }
        L_0x0053:
            java.lang.Integer r0 = r13.A02     // Catch:{ all -> 0x023f }
            X.C13320nQ.A01(r0)     // Catch:{ all -> 0x023f }
            int r0 = r0.intValue()     // Catch:{ all -> 0x023f }
            r28.lock()     // Catch:{ all -> 0x023f }
            r2 = 3
            if (r0 == r2) goto L_0x0068
            if (r0 == r5) goto L_0x0068
            if (r0 == r3) goto L_0x0069
            r3 = r0
            goto L_0x006a
        L_0x0068:
            r3 = r0
        L_0x0069:
            r4 = 1
        L_0x006a:
            r0 = 33
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r3)     // Catch:{ all -> 0x0232 }
            X.C13320nQ.A06(r4, r0)     // Catch:{ all -> 0x0232 }
            java.lang.Integer r0 = r13.A02     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00a6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0232 }
            r13.A02 = r0     // Catch:{ all -> 0x0232 }
        L_0x0083:
            X.8mQ r0 = r13.A01     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01de
            java.util.Map r5 = r13.A0E     // Catch:{ all -> 0x0232 }
            java.util.Iterator r4 = X.C86104wH.A14(r5)     // Catch:{ all -> 0x0232 }
            r3 = 0
            r2 = 0
        L_0x008f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0232 }
            X.8rX r1 = (X.C148598rX) r1     // Catch:{ all -> 0x0232 }
            boolean r0 = r1.CeJ()     // Catch:{ all -> 0x0232 }
            r3 = r3 | r0
            boolean r0 = r1.CYG()     // Catch:{ all -> 0x0232 }
            r2 = r2 | r0
            goto L_0x008f
        L_0x00a6:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0232 }
            if (r1 == r3) goto L_0x0083
            goto L_0x01e2
        L_0x00ae:
            java.lang.Integer r0 = r13.A02     // Catch:{ all -> 0x0232 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0232 }
            r0 = 1
            if (r1 == r0) goto L_0x0181
            r0 = 2
            if (r1 != r0) goto L_0x018d
            if (r3 == 0) goto L_0x018d
            android.content.Context r0 = r13.A05     // Catch:{ all -> 0x0232 }
            r29 = r0
            android.os.Looper r15 = r13.A06     // Catch:{ all -> 0x0232 }
            com.google.android.gms.common.GoogleApiAvailability r14 = r13.A07     // Catch:{ all -> 0x0232 }
            X.6mR r12 = r13.A0B     // Catch:{ all -> 0x0232 }
            java.util.Map r1 = r13.A0F     // Catch:{ all -> 0x0232 }
            X.5l8 r11 = r13.A08     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r10 = r13.A0D     // Catch:{ all -> 0x0232 }
            X.06f r9 = new X.06f     // Catch:{ all -> 0x0232 }
            r9.<init>()     // Catch:{ all -> 0x0232 }
            X.06f r8 = new X.06f     // Catch:{ all -> 0x0232 }
            r8.<init>()     // Catch:{ all -> 0x0232 }
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r5)     // Catch:{ all -> 0x0232 }
            r19 = 0
        L_0x00dc:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0232 }
            r2 = 1
            if (r0 == 0) goto L_0x0107
            java.util.Map$Entry r4 = X.C18180wK.A0o(r5)     // Catch:{ all -> 0x0232 }
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x0232 }
            X.8rX r3 = (X.C148598rX) r3     // Catch:{ all -> 0x0232 }
            boolean r0 = r3.CYG()     // Catch:{ all -> 0x0232 }
            if (r2 != r0) goto L_0x00f5
            r19 = r3
        L_0x00f5:
            boolean r2 = r3.CeJ()     // Catch:{ all -> 0x0232 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x0103
            r9.put(r0, r3)     // Catch:{ all -> 0x0232 }
            goto L_0x00dc
        L_0x0103:
            r8.put(r0, r3)     // Catch:{ all -> 0x0232 }
            goto L_0x00dc
        L_0x0107:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0232 }
            r2 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.C13320nQ.A07(r2, r0)     // Catch:{ all -> 0x0232 }
            X.06f r7 = new X.06f     // Catch:{ all -> 0x0232 }
            r7.<init>()     // Catch:{ all -> 0x0232 }
            X.06f r6 = new X.06f     // Catch:{ all -> 0x0232 }
            r6.<init>()     // Catch:{ all -> 0x0232 }
            java.util.Iterator r4 = X.C18220wO.A0x(r1)     // Catch:{ all -> 0x0232 }
        L_0x0120:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0152
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0232 }
            X.6jD r2 = (X.C108946jD) r2     // Catch:{ all -> 0x0232 }
            X.6Iv r3 = r2.A01     // Catch:{ all -> 0x0232 }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0232 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0120
        L_0x013c:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0232 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0120
        L_0x014a:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0231
        L_0x0152:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0232 }
            int r3 = r10.size()     // Catch:{ all -> 0x0232 }
            r2 = 0
        L_0x015f:
            if (r2 >= r3) goto L_0x01be
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x0232 }
            X.7lM r1 = (X.C129137lM) r1     // Catch:{ all -> 0x0232 }
            X.6jD r0 = r1.A01     // Catch:{ all -> 0x0232 }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0173
            r5.add(r1)     // Catch:{ all -> 0x0232 }
            goto L_0x017e
        L_0x0173:
            X.6jD r0 = r1.A01     // Catch:{ all -> 0x0232 }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x022b
            r4.add(r1)     // Catch:{ all -> 0x0232 }
        L_0x017e:
            int r2 = r2 + 1
            goto L_0x015f
        L_0x0181:
            if (r3 == 0) goto L_0x01b7
            if (r2 == 0) goto L_0x018d
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0231
        L_0x018d:
            android.content.Context r8 = r13.A05     // Catch:{ all -> 0x0232 }
            android.os.Looper r7 = r13.A06     // Catch:{ all -> 0x0232 }
            com.google.android.gms.common.GoogleApiAvailability r6 = r13.A07     // Catch:{ all -> 0x0232 }
            X.6mR r4 = r13.A0B     // Catch:{ all -> 0x0232 }
            java.util.Map r3 = r13.A0F     // Catch:{ all -> 0x0232 }
            X.5l8 r1 = r13.A08     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r0 = r13.A0D     // Catch:{ all -> 0x0232 }
            X.7ln r2 = new X.7ln     // Catch:{ all -> 0x0232 }
            r14 = r2
            r15 = r8
            r16 = r7
            r17 = r6
            r18 = r1
            r19 = r13
            r20 = r13
            r21 = r4
            r22 = r0
            r23 = r5
            r24 = r3
            r25 = r28
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0232 }
            goto L_0x01dc
        L_0x01b7:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0231
        L_0x01be:
            X.7lm r2 = new X.7lm     // Catch:{ all -> 0x0232 }
            r24 = r9
            r25 = r8
            r26 = r7
            r27 = r6
            r20 = r13
            r21 = r12
            r22 = r5
            r23 = r4
            r16 = r15
            r17 = r14
            r18 = r11
            r14 = r2
            r15 = r29
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0232 }
        L_0x01dc:
            r13.A01 = r2     // Catch:{ all -> 0x0232 }
        L_0x01de:
            X.C93285lJ.A00(r13)     // Catch:{ all -> 0x0232 }
            goto L_0x0238
        L_0x01e2:
            if (r3 == r5) goto L_0x01f2
            r0 = 2
            if (r3 == r0) goto L_0x01ef
            if (r3 == r2) goto L_0x01ec
            java.lang.String r3 = "UNKNOWN"
            goto L_0x01f4
        L_0x01ec:
            java.lang.String r3 = "SIGN_IN_MODE_NONE"
            goto L_0x01f4
        L_0x01ef:
            java.lang.String r3 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01f4
        L_0x01f2:
            java.lang.String r3 = "SIGN_IN_MODE_REQUIRED"
        L_0x01f4:
            if (r1 == r5) goto L_0x0202
            r0 = 2
            if (r1 == r0) goto L_0x01ff
            if (r1 == r2) goto L_0x01fc
            goto L_0x0205
        L_0x01fc:
            java.lang.String r2 = "SIGN_IN_MODE_NONE"
            goto L_0x0207
        L_0x01ff:
            java.lang.String r2 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x0207
        L_0x0202:
            java.lang.String r2 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x0207
        L_0x0205:
            java.lang.String r2 = "UNKNOWN"
        L_0x0207:
            int r0 = r3.length()     // Catch:{ all -> 0x0232 }
            int r0 = r0 + 51
            int r0 = X.C86154wM.A06(r2, r0)     // Catch:{ all -> 0x0232 }
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "Cannot use sign-in mode: "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
            r1.append(r3)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = ". Mode was already set to "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)     // Catch:{ all -> 0x0232 }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0231
        L_0x022b:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0232 }
        L_0x0231:
            throw r0     // Catch:{ all -> 0x0232 }
        L_0x0232:
            r0 = move-exception
            r28.unlock()     // Catch:{ all -> 0x023f }
            goto L_0x004c
        L_0x0238:
            r28.unlock()     // Catch:{ all -> 0x023f }
            r28.unlock()
            return
        L_0x023f:
            r0 = move-exception
            r28.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AL.A05():void");
    }

    public final void A07(C93345lQ r6) {
        if (this instanceof C93275lI) {
            C129167lR.A02(((C93275lI) this).A00, r6, 0);
            return;
        }
        C93285lJ r4 = (C93285lJ) this;
        C108946jD r2 = r6.A01;
        boolean containsKey = r4.A0E.containsKey(r6.A00);
        String str = r2.A02;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 65);
        A0s.append("GoogleApiClient is not configured to use ");
        A0s.append(str);
        C13320nQ.A06(containsKey, C18180wK.A0i(" required for this call.", A0s));
        Lock lock = r4.A0H;
        lock.lock();
        try {
            C146548mQ r0 = r4.A01;
            if (r0 == null) {
                r4.A0G.add(r6);
            } else {
                r0.DBe(r6);
            }
        } finally {
            lock.unlock();
        }
    }
}
