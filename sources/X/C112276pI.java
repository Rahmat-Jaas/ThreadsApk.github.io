package X;

/* renamed from: X.6pI  reason: invalid class name and case insensitive filesystem */
public final class C112276pI {
    public final /* synthetic */ AnonymousClass76I A00;
    public final /* synthetic */ C130557qH A01;

    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r10) {
        /*
            r9 = this;
            r7 = 0
            X.76I r2 = r9.A00     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            int r1 = r2.A00     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            r0 = 2
            if (r1 != r0) goto L_0x0076
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r2.A02     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            if (r0 == 0) goto L_0x0076
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            if (r0 == 0) goto L_0x0076
            android.os.Bundle r8 = X.C18180wK.A06()     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            android.content.Context r0 = r2.A03     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r0 = "package_name"
            r8.putString(r0, r1)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r6 = r2.A02     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy r6 = (com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy) r6     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            r0 = -1688150585(0xffffffff9b60ddc7, float:-1.8600506E-22)
            int r4 = X.C14030oh.A03(r0)     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r5.writeInterfaceToken(r0)     // Catch:{ all -> 0x005e }
            r1 = 1
            r0 = 0
            r5.writeInt(r1)     // Catch:{ all -> 0x005e }
            r8.writeToParcel(r5, r0)     // Catch:{ all -> 0x005e }
            android.os.IBinder r0 = r6.A00     // Catch:{ all -> 0x005e }
            int r0 = X.C86114wI.A07(r0, r5, r3, r1)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0050
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r0.createFromParcel(r3)     // Catch:{ all -> 0x005e }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x005e }
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            r3.recycle()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            r5.recycle()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            r0 = -904788255(0xffffffffca1206e1, float:-2392504.2)
            X.C14030oh.A0A(r0, r4)     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            goto L_0x007d
        L_0x005e:
            r1 = move-exception
            r3.recycle()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            r5.recycle()     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            r0 = 128906760(0x7aef608, float:2.6325214E-34)
            X.C14030oh.A0A(r0, r4)     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
            throw r1     // Catch:{ RemoteException -> 0x006c, RemoteException | IllegalStateException -> 0x0083 }
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = "RemoteException getting install referrer information"
            X.C86144wL.A1R(r0)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            r0 = 0
            r2.A00 = r0     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            goto L_0x007c
        L_0x0076:
            java.lang.String r0 = "Service not connected. Please start a connection before using the service."
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
        L_0x007c:
            throw r1     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
        L_0x007d:
            java.lang.String r0 = "install_referrer"
            java.lang.String r7 = r1.getString(r0)
        L_0x0083:
            X.7qH r2 = r9.A01
            r4 = 0
            if (r10 == 0) goto L_0x00af
            r0 = 1
            if (r10 == r0) goto L_0x00ac
            java.lang.String r1 = "FEATURE_NOT_SUPPORTED"
        L_0x008d:
            X.0i6 r0 = r2.A01
            X.C54162z0.A00(r0, r4, r1, r4)
        L_0x0092:
            r3 = 1
            if (r10 == r3) goto L_0x00e7
            X.0dD r0 = X.C08360dF.A00()
            r2 = 0
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "preference_referral_logging_attempt_count"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            X.C130557qH.A03 = r3
            goto L_0x00e7
        L_0x00ac:
            java.lang.String r1 = "SERVICE_UNAVAILABLE"
            goto L_0x008d
        L_0x00af:
            X.0i6 r6 = r2.A01
            if (r7 == 0) goto L_0x00e2
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = android.net.Uri.decode(r7)
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r5 = r0.build()
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.util.Set r0 = r5.getQueryParameterNames()
            java.util.Iterator r2 = r0.iterator()
        L_0x00d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.String r0 = r5.getQueryParameter(r1)
            r3.put(r1, r0)
            goto L_0x00d0
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            X.C54162z0.A00(r6, r7, r4, r3)
            goto L_0x0092
        L_0x00e7:
            X.76I r2 = r9.A00     // Catch:{ Exception -> 0x0101 }
            r0 = 3
            r2.A00 = r0     // Catch:{ Exception -> 0x0101 }
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = "InstallReferrerClient"
            r0 = 2
            android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x0101 }
            android.content.Context r1 = r2.A03     // Catch:{ Exception -> 0x0101 }
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ Exception -> 0x0101 }
            r1.unbindService(r0)     // Catch:{ Exception -> 0x0101 }
            r2.A01 = r4     // Catch:{ Exception -> 0x0101 }
        L_0x00ff:
            r2.A02 = r4     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112276pI.A00(int):void");
    }

    public C112276pI(AnonymousClass76I r1, C130557qH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
