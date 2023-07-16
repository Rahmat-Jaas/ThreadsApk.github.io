package com.google.vr.dynamite.client;

import X.AnonymousClass6CJ;
import X.C113726s2;
import X.C114776ts;
import X.C18180wK;
import X.C86114wI;
import X.C86134wK;
import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;

public final class DynamiteClient {
    public static final ArrayMap a = new ArrayMap();

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C114776ts r4 = new C114776ts(str, str2);
            C113726s2 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(r4);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String obj = r4.toString();
                    StringBuilder A0s = C86114wI.A0s(obj.length() + 72);
                    A0s.append("Failed to load native library ");
                    A0s.append(obj);
                    Log.e("DynamiteClient", C18180wK.A0i(" from remote package: no loader available.", A0s));
                } else {
                    int checkVersion = newNativeLibraryLoader.checkVersion(str3);
                    return checkVersion;
                }
            } catch (AnonymousClass6CJ | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = r4.toString();
                C86134wK.A1R("Failed to load native library ", obj2, C86114wI.A0s(obj2.length() + 54), e);
            }
        }
        return -1;
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        ClassLoader classLoader;
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                classLoader = null;
            } else {
                classLoader = remoteContext.getClassLoader();
            }
        }
        return classLoader;
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context context2;
        synchronized (DynamiteClient.class) {
            C114776ts r1 = new C114776ts(str, str2);
            try {
                context2 = getRemoteLibraryLoaderFromInfo(r1).A00(context);
            } catch (AnonymousClass6CJ e) {
                String obj = r1.toString();
                C86134wK.A1R("Failed to get remote Context", obj, C86114wI.A0s(obj.length() + 52), e);
                context2 = null;
            }
        }
        return context2;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext == null) {
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                return dexClassLoader;
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    public static synchronized C113726s2 getRemoteLibraryLoaderFromInfo(C114776ts r3) {
        C113726s2 r0;
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = a;
            r0 = (C113726s2) arrayMap.get(r3);
            if (r0 == null) {
                r0 = new C113726s2(r3);
                arrayMap.put(r3, r0);
            }
        }
        return r0;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C114776ts r4 = new C114776ts(str, str2);
            C113726s2 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(r4);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String obj = r4.toString();
                    StringBuilder A0s = C86114wI.A0s(obj.length() + 72);
                    A0s.append("Failed to load native library ");
                    A0s.append(obj);
                    Log.e("DynamiteClient", C18180wK.A0i(" from remote package: no loader available.", A0s));
                } else {
                    long initializeAndLoadNativeLibrary = newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                    return initializeAndLoadNativeLibrary;
                }
            } catch (AnonymousClass6CJ | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = r4.toString();
                C86134wK.A1R("Failed to load native library ", obj2, C86114wI.A0s(obj2.length() + 54), e);
            }
        }
        return 0;
    }
}
