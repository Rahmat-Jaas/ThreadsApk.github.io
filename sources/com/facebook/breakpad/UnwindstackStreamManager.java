package com.facebook.breakpad;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.C15020qa;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class UnwindstackStreamManager {
    public static volatile boolean isRegistered;
    public static boolean isUnwindstackJniLoaded = true;

    public static native void nativeRegister(String str, String str2);

    public static native void nativeUnregister();

    static {
        try {
            C15020qa.A0A("unwindstack_stream");
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0E("unwindstack", "Failed to load unwindstack jni library: ", e);
        }
    }

    public static boolean register() {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock;
        synchronized (UnwindstackStreamManager.class) {
            if (!isRegistered) {
                if (!isUnwindstackJniLoaded) {
                    AnonymousClass0LU.A0B("unwindstack", "Loading unwindstack jni native library failed. Cannot register unwindstack stream to breakpad");
                } else {
                    try {
                        String A03 = C15020qa.A03("libunwindstack_binary.so");
                        if (A03 == null) {
                            AnonymousClass0LU.A0B("unwindstack", "Unable to find libunwindstack_binary.so");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("libunwindstack_binary.so");
                            ArrayList arrayList2 = new ArrayList();
                            File parentFile = new File(A03).getParentFile();
                            if (parentFile != null) {
                                arrayList2.add(parentFile.getCanonicalPath());
                            }
                            for (int i = 0; i < arrayList.size(); i++) {
                                String str = (String) arrayList.get(i);
                                reentrantReadWriteLock = C15020qa.A09;
                                reentrantReadWriteLock.readLock().lock();
                                String[] strArr = null;
                                if (C15020qa.A0D != null) {
                                    int i2 = 0;
                                    while (i2 < C15020qa.A0D.length) {
                                        strArr = C15020qa.A0D[i2].A04(str);
                                        i2++;
                                        if (strArr == null) {
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                if (strArr == null) {
                                    AnonymousClass0LU.A0C("unwindstack", AnonymousClass00U.A0L("unable to find dependencies for ", (String) arrayList.get(i)));
                                } else {
                                    for (String str2 : strArr) {
                                        String A032 = C15020qa.A03(str2);
                                        if (A032 == null) {
                                            AnonymousClass0LU.A0C("unwindstack", AnonymousClass00U.A0L("unable to find path for ", str2));
                                        } else if (!arrayList.contains(str2) && !A032.startsWith("/system") && !A032.startsWith("/vendor") && !A032.startsWith("/apex") && !A032.startsWith("/odm")) {
                                            arrayList.add(str2);
                                            File parentFile2 = new File(A032).getParentFile();
                                            if (parentFile2 != null) {
                                                String canonicalPath = parentFile2.getCanonicalPath();
                                                if (!arrayList2.contains(canonicalPath)) {
                                                    arrayList2.add(canonicalPath);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
                            for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                                sb.append(":");
                                sb.append((String) arrayList2.get(i3));
                            }
                            nativeRegister(A03, sb.toString());
                            z = true;
                            isRegistered = z;
                        }
                    } catch (IOException e) {
                        AnonymousClass0LU.A0E("unwindstack", "Error registering unwindstack stream", e);
                    } catch (Throwable th) {
                        reentrantReadWriteLock.readLock().unlock();
                        throw th;
                    }
                }
                z = false;
                isRegistered = z;
            }
        }
        return isRegistered;
    }
}
