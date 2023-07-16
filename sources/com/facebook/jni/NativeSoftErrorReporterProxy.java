package com.facebook.jni;

import X.AnonymousClass00U;
import X.AnonymousClass0IB;
import X.AnonymousClass0IH;
import X.C05230Sa;
import X.C09700fx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

public final class NativeSoftErrorReporterProxy {
    public static ExecutorService sErrorReportingExecutorService;
    public static C09700fx sErrorReportingGkReader;
    public static WeakReference sFbErrorReporterWeakReference;
    public static final LinkedList sSoftErrorCache = new LinkedList();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, (Throwable) null, i2);
    }

    public static synchronized void flushSoftErrorCacheAsync() {
        AnonymousClass0IB r3;
        synchronized (NativeSoftErrorReporterProxy.class) {
            WeakReference weakReference = sFbErrorReporterWeakReference;
            if (!(weakReference == null || (r3 = (AnonymousClass0IB) weakReference.get()) == null || sErrorReportingGkReader == null)) {
                LinkedList linkedList = sSoftErrorCache;
                if (!linkedList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    synchronized (linkedList) {
                        arrayList.addAll(linkedList);
                        linkedList.clear();
                    }
                    sErrorReportingExecutorService.execute(new C05230Sa(r3, arrayList));
                }
            }
        }
    }

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        if (i == 1) {
            str3 = "<level:warning> ";
        } else if (i != 2) {
            str3 = "<level:unknown> ";
        } else {
            str3 = "<level:mustfix> ";
        }
        String A0V = AnonymousClass00U.A0V("[Native] ", str3, str);
        synchronized (NativeSoftErrorReporterProxy.class) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                linkedList.addLast(new AnonymousClass0IH(A0V, str2, i2, th));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        flushSoftErrorCacheAsync();
    }
}
