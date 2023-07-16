package X;

/* renamed from: X.06v  reason: invalid class name and case insensitive filesystem */
public final class C014706v {
    public static AnonymousClass06u A00;
    public static final AnonymousClass55S A01 = AnonymousClass55S.A00();
    public static final Object A02 = new Object();

    public static void A00() {
        AnonymousClass06u r1 = new AnonymousClass06u();
        A00 = r1;
        A01.A06(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r11 <= 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r21 <= 0) goto L_0x0060;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0120 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0121 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r22, boolean r23) {
        /*
            if (r23 != 0) goto L_0x0007
            X.06u r0 = A00
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r13 = A02
            monitor-enter(r13)
            if (r23 != 0) goto L_0x000e
            goto L_0x0125
        L_0x000e:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012b }
            r4 = 0
            r0 = 30
            if (r5 != r0) goto L_0x001a
            A00()     // Catch:{ all -> 0x012b }
            goto L_0x0129
        L_0x001a:
            java.lang.String r3 = "/data/misc/profiles/ref/"
            r2 = r22
            java.lang.String r0 = r2.getPackageName()     // Catch:{ all -> 0x012b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x012b }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r9 = "primary.prof"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x012b }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x012b }
            long r11 = r0.length()     // Catch:{ all -> 0x012b }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x012b }
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0040
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r10 = 1
            if (r0 > 0) goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            java.lang.String r6 = "/data/misc/profiles/cur/0/"
            java.lang.String r0 = r2.getPackageName()     // Catch:{ all -> 0x012b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x012b }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x012b }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x012b }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x012b }
            long r21 = r0.length()     // Catch:{ all -> 0x012b }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0060
            int r0 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            r9 = 1
            if (r0 > 0) goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0121 }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0121 }
            r0 = 33
            if (r5 < r0) goto L_0x0074
            android.content.pm.PackageInfo r0 = X.AnonymousClass06s.A00(r2, r1)     // Catch:{ NameNotFoundException -> 0x0121 }
        L_0x0071:
            long r5 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x0121 }
            goto L_0x007d
        L_0x0074:
            java.lang.String r0 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0121 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x0121 }
            goto L_0x0071
        L_0x007d:
            java.io.File r1 = r2.getFilesDir()     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "profileInstalled"
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x012b }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x012b }
            r14 = 0
            boolean r0 = r2.exists()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00b7
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            int r15 = r0.readInt()     // Catch:{ all -> 0x00b2 }
            int r16 = r0.readInt()     // Catch:{ all -> 0x00b2 }
            long r17 = r0.readLong()     // Catch:{ all -> 0x00b2 }
            long r19 = r0.readLong()     // Catch:{ all -> 0x00b2 }
            X.06t r14 = new X.06t     // Catch:{ all -> 0x00b2 }
            r14.<init>(r15, r16, r17, r19)     // Catch:{ all -> 0x00b2 }
            r0.close()     // Catch:{  }
            goto L_0x00b7
        L_0x00b2:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0120 }
            goto L_0x0120
        L_0x00b7:
            r8 = 2
            if (r14 == 0) goto L_0x00c6
            long r0 = r14.A03     // Catch:{ all -> 0x012b }
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00c6
            int r0 = r14.A00     // Catch:{ all -> 0x012b }
            if (r0 == r8) goto L_0x00c6
            r4 = r0
            goto L_0x00c9
        L_0x00c6:
            if (r10 == 0) goto L_0x00d3
            r4 = 1
        L_0x00c9:
            if (r23 == 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            if (r4 == r3) goto L_0x00d0
            r4 = 2
        L_0x00d0:
            if (r14 == 0) goto L_0x00e4
            goto L_0x00d7
        L_0x00d3:
            if (r9 == 0) goto L_0x00c9
            r4 = 2
            goto L_0x00c9
        L_0x00d7:
            int r0 = r14.A00     // Catch:{ all -> 0x012b }
            if (r0 != r8) goto L_0x00e4
            if (r4 != r3) goto L_0x00e4
            long r0 = r14.A02     // Catch:{ all -> 0x012b }
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e4
            r4 = 3
        L_0x00e4:
            X.06t r7 = new X.06t     // Catch:{ all -> 0x012b }
            r16 = r7
            r17 = r3
            r18 = r4
            r19 = r5
            r16.<init>(r17, r18, r19, r21)     // Catch:{ all -> 0x012b }
            if (r14 == 0) goto L_0x00f9
            boolean r0 = r14.equals(r7)     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0121
        L_0x00f9:
            r2.delete()     // Catch:{  }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{  }
            r0.<init>(r2)     // Catch:{  }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{  }
            r2.<init>(r0)     // Catch:{  }
            r2.writeInt(r3)     // Catch:{ all -> 0x011c }
            int r0 = r7.A00     // Catch:{ all -> 0x011c }
            r2.writeInt(r0)     // Catch:{ all -> 0x011c }
            long r0 = r7.A03     // Catch:{ all -> 0x011c }
            r2.writeLong(r0)     // Catch:{ all -> 0x011c }
            long r0 = r7.A02     // Catch:{ all -> 0x011c }
            r2.writeLong(r0)     // Catch:{ all -> 0x011c }
            r2.close()     // Catch:{  }
            goto L_0x0121
        L_0x011c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0120 }
        L_0x0120:
            throw r1     // Catch:{  }
        L_0x0121:
            A00()     // Catch:{ all -> 0x012b }
            goto L_0x0129
        L_0x0125:
            X.06u r0 = A00     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x000e
        L_0x0129:
            monitor-exit(r13)     // Catch:{ all -> 0x012b }
            return
        L_0x012b:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x012b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014706v.A01(android.content.Context, boolean):void");
    }
}
