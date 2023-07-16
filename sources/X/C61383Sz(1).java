package X;

/* renamed from: X.3Sz  reason: invalid class name and case insensitive filesystem */
public final class C61383Sz {
    public static C61383Sz A04;
    public long A00;
    public String A01;
    public String A02;
    public boolean A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(14:47|48|49|50|51|52|53|54|55|56|88|(7:94|95|96|(1:(1:108)(1:107))(1:100)|101|(1:103)|(4:110|131|132|133)(6:111|(2:113|(3:115|116|(3:118|(1:123)|124)))(1:125)|126|127|(2:129|130)|93))|92|93) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|(6:22|23|24|25|26|(10:33|34|35|36|37|39|40|41|42|(14:47|48|49|50|51|52|53|54|55|56|88|(7:94|95|96|(1:(1:108)(1:107))(1:100)|101|(1:103)|(4:110|131|132|133)(6:111|(2:113|(3:115|116|(3:118|(1:123)|124)))(1:125)|126|127|(2:129|130)|93))|92|93)))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0097 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d8 A[Catch:{ Exception -> 0x027d, all -> 0x027e }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e4 A[Catch:{ Exception -> 0x027d, all -> 0x027e }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec A[Catch:{ Exception -> 0x027d, all -> 0x027e }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0202 A[Catch:{ Exception -> 0x027d, all -> 0x027e }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0203 A[Catch:{ Exception -> 0x027d, all -> 0x027e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61383Sz A00(android.content.Context r27) {
        /*
            java.lang.String r12 = "limit_tracking"
            java.lang.String r11 = "androidid"
            java.lang.String r10 = "aid"
            X.3Sz r5 = A04
            if (r5 == 0) goto L_0x0019
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.A00
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            return r5
        L_0x0019:
            X.C63643hy.A01()
            r8 = 0
            r1 = 1
            r5 = r27
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r7 = 0
            java.lang.Class[] r3 = new java.lang.Class[]{r4}     // Catch:{  }
            java.lang.String r0 = "com.google.android.gms.common.GooglePlayServicesUtil"
            java.lang.String r2 = "isGooglePlayServicesAvailable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.reflect.Method r3 = r0.getMethod(r2, r3)     // Catch:{ Exception -> 0x009f }
            if (r3 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{  }
            r2 = 0
            java.lang.Object r2 = r3.invoke(r8, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x003e }
        L_0x003e:
            boolean r0 = r2 instanceof java.lang.Integer     // Catch:{  }
            if (r0 == 0) goto L_0x009f
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{  }
            int r0 = r2.intValue()     // Catch:{  }
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.String r3 = "getAdvertisingIdInfo"
            java.lang.Class[] r2 = new java.lang.Class[]{r4}     // Catch:{  }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.reflect.Method r2 = r0.getMethod(r3, r2)     // Catch:{ Exception -> 0x009f }
            if (r2 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{  }
            java.lang.Object r6 = r2.invoke(r8, r0)     // Catch:{  }
            if (r6 == 0) goto L_0x009f
            java.lang.Class r3 = r6.getClass()     // Catch:{  }
            java.lang.String r2 = "getId"
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{  }
            java.lang.reflect.Method r8 = r3.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0072 }
        L_0x0072:
            java.lang.String r2 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{  }
            java.lang.reflect.Method r4 = r3.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x007b }
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r8 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            X.3Sz r0 = new X.3Sz     // Catch:{  }
            r0.<init>()     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{  }
            r2 = 0
            java.lang.Object r2 = r8.invoke(r6, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x008c }
        L_0x008c:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{  }
            r0.A01 = r2     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{  }
            r2 = 0
            java.lang.Object r2 = r4.invoke(r6, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097 }
        L_0x0097:
            boolean r2 = X.AnonymousClass0wJ.A1X(r2)     // Catch:{  }
            r0.A03 = r2     // Catch:{  }
            goto L_0x019e
        L_0x009f:
            X.3kM r2 = new X.3kM
            r2.<init>()
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.START"
            android.content.Intent r3 = X.C18250wR.A05(r0)
            r0 = 326(0x146, float:4.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.setPackage(r0)
            boolean r0 = r5.bindService(r3, r2, r1)
            if (r0 == 0) goto L_0x0195
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A00     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            boolean r0 = r0.compareAndSet(r1, r1)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            if (r0 != 0) goto L_0x0174
            java.util.concurrent.BlockingQueue r0 = r2.A01     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            java.lang.Object r3 = r0.take()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r17 = 1994005342(0x76da1b5e, float:2.2118668E33)
            com.facebook.profilo.provider.constants.ExternalProvider r13 = com.facebook.profilo.provider.constants.ExternalProviders.A07     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r14 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r15 = 6
            r16 = 21
            r19 = 0
            r6 = 0
            r18 = r6
            int r25 = r14.A00(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r24 = 398801902(0x17c53bee, float:1.2745955E-24)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r21 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r23 = 22
            r22 = r15
            r26 = r19
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            X.3Sz r0 = new X.3Sz     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r0.<init>()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r17 = 354002295(0x1519a577, float:3.1028633E-26)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r14 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            int r25 = r14.A00(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            java.lang.String r4 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            r9.writeInterfaceToken(r4)     // Catch:{ all -> 0x017b }
            r3.transact(r1, r9, r8, r6)     // Catch:{ all -> 0x017b }
            r8.readException()     // Catch:{ all -> 0x017b }
            java.lang.String r7 = r8.readString()     // Catch:{ all -> 0x017b }
            r8.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r9.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r24 = -1645263356(0xffffffff9def4604, float:-6.3335168E-21)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r21 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r0.A01 = r7     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r17 = -1586974568(0xffffffffa168b098, float:-7.8838377E-19)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r14 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            int r25 = r14.A00(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r8.writeInterfaceToken(r4)     // Catch:{ all -> 0x0162 }
            r4 = 1
            r8.writeInt(r1)     // Catch:{ all -> 0x0162 }
            r1 = 2
            r3.transact(r1, r8, r7, r6)     // Catch:{ all -> 0x0162 }
            r7.readException()     // Catch:{ all -> 0x0162 }
            int r1 = r7.readInt()     // Catch:{ all -> 0x0162 }
            if (r1 != 0) goto L_0x014f
            r4 = 0
        L_0x014f:
            r7.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r8.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r24 = -1729567861(0xffffffff98e8e38b, float:-6.0200354E-24)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r21 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r0.A03 = r4     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            goto L_0x019b
        L_0x0162:
            r0 = move-exception
            r7.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r8.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r24 = 1370419014(0x51aeef46, float:9.3917331E10)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r21 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            goto L_0x018c
        L_0x0174:
            java.lang.String r0 = "Binder already consumed"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            goto L_0x018c
        L_0x017b:
            r0 = move-exception
            r8.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r9.recycle()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r24 = -1325392520(0xffffffffb1001d78, float:-1.8643203E-9)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r21 = r13.A08()     // Catch:{ Exception -> 0x0192, all -> 0x018d }
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0192, all -> 0x018d }
        L_0x018c:
            throw r0     // Catch:{ Exception -> 0x0192, all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            r5.unbindService(r2)
            throw r0
        L_0x0192:
            r5.unbindService(r2)
        L_0x0195:
            X.3Sz r0 = new X.3Sz
            r0.<init>()
            goto L_0x019e
        L_0x019b:
            r5.unbindService(r2)
        L_0x019e:
            X.0fL r1 = X.C09370fJ.A00
            boolean r1 = r1.AJH()
            if (r1 == 0) goto L_0x01b3
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x01b3
        L_0x01aa:
            long r1 = java.lang.System.currentTimeMillis()
            r0.A00 = r1
            A04 = r0
        L_0x01b2:
            return r0
        L_0x01b3:
            r16 = 0
            r4 = 0
            java.lang.String[] r15 = new java.lang.String[]{r10, r11, r12}     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            java.lang.String r1 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r3 = r2.resolveContentProvider(r1, r4)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            java.lang.String r1 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r1, r4)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r3 == 0) goto L_0x01ec
            java.lang.String r1 = r3.packageName     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            boolean r1 = X.AnonymousClass3QV.A00(r5, r1)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r1 == 0) goto L_0x01ec
            java.lang.String r1 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r14 = X.C15430rJ.A01(r1)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
        L_0x01de:
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r2 == 0) goto L_0x0200
            java.lang.String r1 = r5.getPackageName()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            r2.getInstallerPackageName(r1)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            goto L_0x0200
        L_0x01ec:
            if (r2 == 0) goto L_0x01fd
            java.lang.String r1 = r2.packageName     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            boolean r1 = X.AnonymousClass3QV.A00(r5, r1)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r1 == 0) goto L_0x01fd
            java.lang.String r1 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r14 = X.C15430rJ.A01(r1)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            goto L_0x01de
        L_0x01fd:
            r14 = r16
            goto L_0x01de
        L_0x0200:
            if (r14 != 0) goto L_0x0203
            goto L_0x0268
        L_0x0203:
            android.content.ContentResolver r4 = r5.getContentResolver()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            r3 = -1443598606(0xffffffffa9f46ef2, float:-1.0855023E-13)
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            java.lang.String r1 = r14.getAuthority()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            X.AnonymousClass0UD.A00(r1, r3, r2)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            android.content.ContentProviderClient r13 = r4.acquireUnstableContentProviderClient(r14)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r13 == 0) goto L_0x0258
            r17 = r16
            r18 = r16
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            if (r4 == 0) goto L_0x025a
            boolean r1 = r4.moveToFirst()     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            if (r1 == 0) goto L_0x025a
            int r1 = r4.getColumnIndex(r10)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            int r3 = r4.getColumnIndex(r11)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            int r2 = r4.getColumnIndex(r12)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r1 = r4.getString(r1)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            r0.A02 = r1     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            if (r3 <= 0) goto L_0x0253
            if (r2 <= 0) goto L_0x0253
            java.lang.String r1 = r0.A01     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            if (r1 != 0) goto L_0x0253
            java.lang.String r1 = r4.getString(r3)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            r0.A01 = r1     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r1 = r4.getString(r2)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            r0.A03 = r1     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
        L_0x0253:
            r4.close()
            goto L_0x01aa
        L_0x0258:
            r4 = r16
        L_0x025a:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            r0.A00 = r1     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            A04 = r0     // Catch:{ Exception -> 0x0278, all -> 0x0271 }
            if (r4 == 0) goto L_0x01b2
            r4.close()
            return r0
        L_0x0268:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            r0.A00 = r1     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            A04 = r0     // Catch:{ Exception -> 0x027d, all -> 0x027e }
            return r0
        L_0x0271:
            r0 = move-exception
            if (r4 == 0) goto L_0x027f
            r4.close()
            throw r0
        L_0x0278:
            if (r4 == 0) goto L_0x027d
            r4.close()
        L_0x027d:
            return r16
        L_0x027e:
            r0 = move-exception
        L_0x027f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61383Sz.A00(android.content.Context):X.3Sz");
    }
}
