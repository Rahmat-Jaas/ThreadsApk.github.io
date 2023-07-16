package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0rs  reason: invalid class name and case insensitive filesystem */
public final class C15780rs {
    public final Map A00;
    public final Set A01;

    public static C16050sO A00(Context context, int i) {
        String[] A07 = C15980sH.A07(context, i);
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(A07));
        return new C16050sO(C15980sH.A02(context, A07), (String) null, (String) null, unmodifiableList, i);
    }

    public final boolean A06(C16050sO r10, boolean z) {
        C15460rM A002;
        if (!(r10 == null || r10.A00() == null || (A002 = r10.A00()) == null)) {
            for (C15460rM A02 : this.A01) {
                if (A02(A002, A02, z)) {
                    return true;
                }
            }
            Map map = this.A00;
            for (C15460rM r3 : map.keySet()) {
                if (A02(A002, r3, z)) {
                    for (Object contains : r10.A03) {
                        if (((Set) map.get(r3)).contains(contains)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15780rs)) {
            return false;
        }
        C15780rs r5 = (C15780rs) obj;
        Set set = r5.A01;
        Set set2 = this.A01;
        if (set != null) {
            z = set.equals(set2);
        } else {
            z = false;
            if (set2 == null) {
                z = true;
            }
        }
        Map map = r5.A00;
        Map map2 = this.A00;
        if (map != null) {
            z2 = map.equals(map2);
        } else {
            z2 = false;
            if (map2 == null) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public final boolean A05(Context context) {
        if (context == null) {
            return false;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            return A06(A00(context, Binder.getCallingUid()), C15980sH.A04(context));
        }
        throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C15780rs(Map map) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Set set = (Set) entry.getValue();
            if (set == null || !set.contains("*|all_packages|*")) {
                if (!hashMap.containsKey(key)) {
                    hashMap.put(key, new HashSet());
                }
                ((Set) hashMap.get(key)).addAll(set);
            } else {
                hashSet.add(key);
            }
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A00 = Collections.unmodifiableMap(hashMap);
    }

    public static boolean A01(Context context) {
        try {
            return C15980sH.A05(context, context.getApplicationInfo().uid, Binder.getCallingUid());
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean A02(C15460rM r2, C15460rM r3, boolean z) {
        if (!r2.equals(r3)) {
            if (!z) {
                return false;
            }
            Set set = (Set) C15470rN.A1G.get(r3);
            if (set == null) {
                set = C15470rN.A00(C15470rN.A0Z);
            }
            if (set.contains(r2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final ContentProviderClient A03(Context context, Uri uri) {
        PackageManager packageManager;
        ProviderInfo resolveContentProvider;
        String authority = uri.getAuthority();
        if (authority == null || (packageManager = context.getPackageManager()) == null || (resolveContentProvider = packageManager.resolveContentProvider(authority, 0)) == null) {
            return null;
        }
        C16050sO A002 = C16010sK.A00(context, resolveContentProvider.packageName);
        if (A06(A002, C15980sH.A04(context))) {
            ContentResolver contentResolver = context.getContentResolver();
            AnonymousClass0UD.A00(authority, -635758405, AnonymousClass006.A00);
            return contentResolver.acquireUnstableContentProviderClient(authority);
        }
        throw new SecurityException(String.format("The provider for uri '%s' is not trusted: %s", new Object[]{authority, A002}));
    }

    public final void A04(Context context) {
        if (Binder.getCallingPid() == Process.myPid()) {
            throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
        } else if (!A06(A00(context, Binder.getCallingUid()), C15980sH.A04(context))) {
            throw new SecurityException("Access denied.");
        }
    }
}
