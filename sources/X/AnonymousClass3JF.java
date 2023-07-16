package X;

import android.os.Bundle;

/* renamed from: X.3JF  reason: invalid class name */
public final class AnonymousClass3JF {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(android.content.ContentResolver r9, android.net.Uri r10, android.os.Bundle r11, X.AnonymousClass39S r12, java.lang.String r13) {
        /*
            r4 = 0
            java.lang.String r2 = r10.getAuthority()
            if (r2 == 0) goto L_0x00eb
            android.content.pm.PackageManager r1 = r12.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r2, r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r3 = r0.packageName
            if (r3 == 0) goto L_0x00d3
            r0 = 64
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c5
            android.content.pm.Signature[] r1 = r0.signatures
            if (r1 == 0) goto L_0x00c5
            int r0 = r1.length
            if (r0 == 0) goto L_0x00c5
            com.google.common.collect.ImmutableSet r8 = com.google.common.collect.ImmutableSet.A03(r1)
            if (r8 == 0) goto L_0x00c5
            com.google.common.collect.ImmutableSetMultimap r0 = r12.A02
            com.google.common.collect.ImmutableSet r5 = r0.AO8(r3)
            X.83w r2 = r8.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r2.next()
            com.google.common.collect.ImmutableSet r0 = r12.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x0034
        L_0x004c:
            r2 = 1838451259(0x6d948a3b, float:5.7463615E27)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            java.lang.String r0 = r10.getAuthority()
            X.AnonymousClass0UD.A00(r0, r2, r1)
            android.content.ContentProviderClient r1 = r9.acquireUnstableContentProviderClient(r10)
            if (r1 == 0) goto L_0x006b
            android.os.Bundle r0 = r1.call(r13, r4, r11)     // Catch:{ all -> 0x0066 }
            r1.close()
            return r0
        L_0x0066:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x006b:
            java.lang.String r0 = "Failed to acquire client"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0072:
            java.lang.String r6 = "Untrusted provider package "
            java.lang.String r5 = " ["
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r8.iterator()
        L_0x007e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r8.next()
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00a7 }
            r1 = 0
            int r0 = r4.length     // Catch:{ NoSuchAlgorithmException -> 0x00a7 }
            r2.update(r4, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00a7 }
            byte[] r1 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x00a7 }
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00a7 }
            r7.add(r0)
            goto L_0x007e
        L_0x00a7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00ae:
            java.lang.String r1 = ", "
            X.GdW r0 = new X.GdW
            r0.<init>(r1)
            java.lang.String r1 = r0.A04(r7)
            java.lang.String r0 = "]"
            java.lang.String r1 = X.AnonymousClass00U.A0h(r6, r3, r5, r1, r0)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            java.lang.String r1 = "No signature for package "
            java.lang.String r0 = " resolving authority "
            java.lang.String r0 = X.AnonymousClass00U.A0d(r1, r3, r0, r2)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L_0x00d3:
            java.lang.String r0 = "No package name for authority "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00df:
            java.lang.String r0 = "No provider for authority "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            java.lang.String r0 = "No authority in URI "
            java.lang.String r1 = X.AnonymousClass0wJ.A0t(r0, r10)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JF.A00(android.content.ContentResolver, android.net.Uri, android.os.Bundle, X.39S, java.lang.String):android.os.Bundle");
    }

    public static void A01(Bundle bundle, AnonymousClass3E8 r5, String str) {
        String str2;
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 != null) {
            Throwable A01 = r5.A00(bundle2).A01();
            String message = A01.getMessage();
            String A0e = C18210wN.A0e(A01);
            if (message != null) {
                str2 = AnonymousClass00U.A0L(": ", message);
            } else {
                str2 = "";
            }
            throw new AnonymousClass2AX(AnonymousClass00U.A0h("Exception in provider when invoking ", str, "(): ", A0e, str2), A01);
        }
    }
}
