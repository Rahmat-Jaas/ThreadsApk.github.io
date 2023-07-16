package X;

import android.os.Looper;

/* renamed from: X.5q4  reason: invalid class name */
public final class AnonymousClass5q4 extends C86864zF {
    public final /* synthetic */ C121837Ij A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5q4(Looper looper, C121837Ij r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.app.PendingIntent} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0227 A[Catch:{ RuntimeException -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            X.7Ij r2 = r13.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0B
            int r1 = r0.get()
            int r0 = r14.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r14.what
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0017
            if (r2 == r1) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x0086
        L_0x0017:
            java.lang.Object r4 = r14.obj
            X.6jF r4 = (X.C108966jF) r4
        L_0x001b:
            monitor-enter(r4)
            r0 = 0
            goto L_0x029e
        L_0x001f:
            int r1 = r14.what
            r7 = 4
            r3 = 1
            r4 = 5
            if (r1 == r3) goto L_0x002d
            r0 = 7
            if (r1 == r0) goto L_0x002d
            if (r1 == r7) goto L_0x002d
            if (r1 != r4) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.BST()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r1 = r14.what
            r6 = 8
            r8 = 3
            r5 = 0
            if (r1 != r7) goto L_0x0063
            int r1 = r14.arg2
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r1)
            r2.A07 = r0
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            X.C121837Ij.A00(r5, r2, r8)
            return
        L_0x0063:
            if (r1 == r4) goto L_0x0087
            if (r1 != r8) goto L_0x0091
            java.lang.Object r1 = r14.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r5 = r1
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
        L_0x0070:
            int r0 = r14.arg2
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r5)
        L_0x0077:
            X.8hL r0 = r2.A08
            r0.CGB(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
        L_0x0086:
            return
        L_0x0087:
            com.google.android.gms.common.ConnectionResult r1 = r2.A07
            if (r1 != 0) goto L_0x0077
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r6)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r1 != r0) goto L_0x00b2
            X.C121837Ij.A00(r5, r2, r4)
            X.8eI r0 = r2.A0H
            if (r0 == 0) goto L_0x00a4
            int r1 = r14.arg2
            X.7lo r0 = (X.C129397lo) r0
            X.8kR r0 = r0.A00
            r0.Brq(r1)
        L_0x00a4:
            int r0 = r14.arg2
            r2.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A03 = r0
            X.C121837Ij.A02(r5, r2, r4, r3)
            return
        L_0x00b2:
            r9 = 2
            if (r1 != r9) goto L_0x00bb
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00bb:
            int r2 = r14.what
            if (r2 == r9) goto L_0x00e1
            if (r2 == r3) goto L_0x00e1
            r0 = 7
            if (r2 == r0) goto L_0x00e1
            r0 = 45
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Don't know how to handle message: "
            r1.append(r0)
            r1.append(r2)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r1, r2)
            return
        L_0x00e1:
            java.lang.Object r4 = r14.obj
            X.6jF r4 = (X.C108966jF) r4
            monitor-enter(r4)
            java.lang.Object r10 = r4.A00     // Catch:{ all -> 0x02b6 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x02b6 }
            if (r0 == 0) goto L_0x010d
            java.lang.String r7 = "GmsClient"
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x02b6 }
            int r0 = r2.length()     // Catch:{ all -> 0x02b6 }
            int r0 = r0 + 47
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x02b6 }
            java.lang.String r0 = "Callback proxy "
            r1.append(r0)     // Catch:{ all -> 0x02b6 }
            r1.append(r2)     // Catch:{ all -> 0x02b6 }
            java.lang.String r0 = " being reused. This is not safe."
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ all -> 0x02b6 }
            android.util.Log.w(r7, r0)     // Catch:{ all -> 0x02b6 }
        L_0x010d:
            monitor-exit(r4)     // Catch:{ all -> 0x02b6 }
            if (r10 == 0) goto L_0x0298
            r2 = r4
            X.5oo r2 = (X.AnonymousClass5oo) r2     // Catch:{ RuntimeException -> 0x02b1 }
            int r7 = r2.A00     // Catch:{ RuntimeException -> 0x02b1 }
            r0 = 0
            if (r7 != 0) goto L_0x022c
            boolean r0 = r2 instanceof X.AnonymousClass5ol     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0129
            X.5ol r2 = (X.AnonymousClass5ol) r2     // Catch:{ RuntimeException -> 0x02b1 }
            X.7Ij r0 = r2.A00     // Catch:{ RuntimeException -> 0x02b1 }
            X.8hL r1 = r0.A08     // Catch:{ RuntimeException -> 0x02b1 }
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.A04     // Catch:{ RuntimeException -> 0x02b1 }
            r1.CGB(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0298
        L_0x0129:
            r0 = r2
            X.5om r0 = (X.AnonymousClass5om) r0     // Catch:{ RuntimeException -> 0x02b1 }
            java.lang.String r10 = "GmsClient"
            android.os.IBinder r1 = r0.A00     // Catch:{ RemoteException -> 0x0229 }
            X.C13320nQ.A01(r1)     // Catch:{ RemoteException -> 0x0229 }
            java.lang.String r11 = r1.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0229 }
            X.7Ij r7 = r0.A01     // Catch:{ RuntimeException -> 0x02b1 }
            java.lang.String r12 = r7.A04()     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r12.equals(r11)     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0145
            goto L_0x0243
        L_0x0145:
            boolean r0 = r7 instanceof X.C93615lt     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.signin.internal.zaf     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.signin.internal.zaf r10 = new com.google.android.gms.signin.internal.zaf     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0225
        L_0x015a:
            boolean r0 = r7 instanceof X.C93565lo     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.safetynet.zzi     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.safetynet.zzj r10 = new com.google.android.gms.internal.safetynet.zzj     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x016d:
            r1 = 4
            boolean r0 = X.C121837Ij.A02(r10, r7, r9, r1)     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x017a
            boolean r0 = X.C121837Ij.A02(r10, r7, r8, r1)     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0266
        L_0x017a:
            r7.A07 = r5     // Catch:{ RuntimeException -> 0x02b1 }
            X.8eI r0 = r7.A0H     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0298
            X.7lo r0 = (X.C129397lo) r0     // Catch:{ RuntimeException -> 0x02b1 }
            X.8kR r0 = r0.A00     // Catch:{ RuntimeException -> 0x02b1 }
            r0.Brh(r5)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0298
        L_0x0189:
            boolean r0 = r7 instanceof X.C93595lr     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.location.zzal     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.location.zzao r10 = new com.google.android.gms.internal.location.zzao     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x016d
        L_0x019d:
            boolean r0 = r7 instanceof X.C93535ll     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.auth_blockstore.zzf     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.auth_blockstore.zzf r10 = new com.google.android.gms.internal.auth_blockstore.zzf     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0225
        L_0x01b1:
            boolean r0 = r7 instanceof X.C93575lp     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.auth.zzr     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.auth.zzq r10 = new com.google.android.gms.internal.auth.zzq     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x016d
        L_0x01c5:
            boolean r0 = r7 instanceof X.C93585lq     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.auth.zzbl     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.auth.zzbk r10 = new com.google.android.gms.internal.auth.zzbk     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x016d
        L_0x01d9:
            boolean r0 = r7 instanceof X.C93555ln     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.p001authapi.zbt     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.auth-api.zbt r10 = new com.google.android.gms.internal.auth-api.zbt     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0225
        L_0x01ed:
            boolean r0 = r7 instanceof X.C93525lk     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.internal.p000authapiphone.zzh     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.internal.auth-api-phone.zzk r10 = new com.google.android.gms.internal.auth-api-phone.zzk     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x016d
        L_0x0202:
            boolean r0 = r7 instanceof X.C93545lm     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0216
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.common.internal.service.zai     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.common.internal.service.zai r10 = new com.google.android.gms.common.internal.service.zai     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0225
        L_0x0216:
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.ISignInService"
            android.os.IInterface r10 = r1.queryLocalInterface(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            boolean r0 = r10 instanceof com.google.android.gms.auth.api.signin.internal.zbs     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 != 0) goto L_0x0225
            com.google.android.gms.auth.api.signin.internal.zbs r10 = new com.google.android.gms.auth.api.signin.internal.zbs     // Catch:{ RuntimeException -> 0x02b1 }
            r10.<init>(r1)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x0225:
            if (r10 == 0) goto L_0x0266
            goto L_0x016d
        L_0x0229:
            java.lang.String r0 = "service probably died"
            goto L_0x0263
        L_0x022c:
            X.7Ij r1 = r2.A02     // Catch:{ RuntimeException -> 0x02b1 }
            X.C121837Ij.A00(r5, r1, r3)     // Catch:{ RuntimeException -> 0x02b1 }
            android.os.Bundle r1 = r2.A01     // Catch:{ RuntimeException -> 0x02b1 }
            if (r1 == 0) goto L_0x023d
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x023d:
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch:{ RuntimeException -> 0x02b1 }
            r1.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0270
        L_0x0243:
            int r0 = X.C86104wH.A0A(r12)     // Catch:{ RuntimeException -> 0x02b1 }
            int r1 = X.C86104wH.A0A(r11)     // Catch:{ RuntimeException -> 0x02b1 }
            int r0 = r0 + 34
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            java.lang.String r0 = "service descriptor mismatch: "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            r1.append(r12)     // Catch:{ RuntimeException -> 0x02b1 }
            java.lang.String r0 = " vs. "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x02b1 }
            java.lang.String r0 = X.C18180wK.A0i(r11, r1)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x0263:
            android.util.Log.w(r10, r0)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x0266:
            X.7Ij r0 = r2.A02     // Catch:{ RuntimeException -> 0x02b1 }
            X.C121837Ij.A00(r5, r0, r3)     // Catch:{ RuntimeException -> 0x02b1 }
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch:{ RuntimeException -> 0x02b1 }
            r1.<init>(r6, r5)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x0270:
            boolean r0 = r2 instanceof X.AnonymousClass5ol     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x0288
            X.5ol r2 = (X.AnonymousClass5ol) r2     // Catch:{ RuntimeException -> 0x02b1 }
            X.7Ij r2 = r2.A00     // Catch:{ RuntimeException -> 0x02b1 }
            X.8hL r0 = r2.A08     // Catch:{ RuntimeException -> 0x02b1 }
            r0.CGB(r1)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x027d:
            int r0 = r1.A01     // Catch:{ RuntimeException -> 0x02b1 }
            r2.A01 = r0     // Catch:{ RuntimeException -> 0x02b1 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x02b1 }
            r2.A05 = r0     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x0298
        L_0x0288:
            X.5om r2 = (X.AnonymousClass5om) r2     // Catch:{ RuntimeException -> 0x02b1 }
            X.7Ij r2 = r2.A01     // Catch:{ RuntimeException -> 0x02b1 }
            X.8eJ r0 = r2.A0I     // Catch:{ RuntimeException -> 0x02b1 }
            if (r0 == 0) goto L_0x027d
            X.7lp r0 = (X.C129407lp) r0     // Catch:{ RuntimeException -> 0x02b1 }
            X.8hI r0 = r0.A00     // Catch:{ RuntimeException -> 0x02b1 }
            r0.Bro(r1)     // Catch:{ RuntimeException -> 0x02b1 }
            goto L_0x027d
        L_0x0298:
            monitor-enter(r4)
            r4.A01 = r3     // Catch:{ all -> 0x02b3 }
            monitor-exit(r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x001b
        L_0x029e:
            r4.A00 = r0     // Catch:{ all -> 0x02ae }
            monitor-exit(r4)     // Catch:{ all -> 0x02ae }
            X.7Ij r0 = r4.A02
            java.util.ArrayList r1 = r0.A0M
            monitor-enter(r1)
            r1.remove(r4)     // Catch:{ all -> 0x02ab }
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            return
        L_0x02ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            throw r0
        L_0x02ae:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02ae }
            throw r0
        L_0x02b1:
            r0 = move-exception
            throw r0
        L_0x02b3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02b3 }
            throw r0
        L_0x02b6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02b6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5q4.handleMessage(android.os.Message):void");
    }
}
