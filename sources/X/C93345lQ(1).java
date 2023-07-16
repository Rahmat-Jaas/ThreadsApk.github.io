package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.5lQ  reason: invalid class name and case insensitive filesystem */
public abstract class C93345lQ extends BasePendingResult implements AnonymousClass8eF {
    public final C99286Iv A00;
    public final C108946jD A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(4:6|7|8|(1:14))|15|16|(1:18)(1:19)|20|(4:21|22|23|24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e A[Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass8eD r10) {
        /*
            r9 = this;
            r1 = r9
            boolean r0 = r9 instanceof X.C93655qd     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x009a
            X.5qd r1 = (X.C93655qd) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.5lo r10 = (X.C93565lo) r10     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.safetynet.zzg r7 = r1.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            byte[] r3 = r1.A02     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            java.lang.String r2 = r1.A01     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x0037
            java.lang.String r5 = "com.google.android.safetynet.ATTEST_API_KEY"
            r2 = 0
            android.content.Context r0 = r10.A00     // Catch:{ NameNotFoundException -> 0x0037 }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0037 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r0 == 0) goto L_0x0037
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NameNotFoundException -> 0x0037 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x0037 }
            r2 = r0
        L_0x0037:
            android.os.IInterface r6 = r10.A03()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.safetynet.zzi r6 = (com.google.android.gms.internal.safetynet.zzi) r6     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.safetynet.zzj r6 = (com.google.android.gms.internal.safetynet.zzj) r6     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1812876441(0xffffffff93f1b367, float:-6.1013857E-27)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -2041824502(0xffffffff864c3b0a, float:-3.841151E-35)
            int r1 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r4.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 1015539355(0x3c87e69b, float:0.016589453)
            X.C14030oh.A0A(r0, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r7 != 0) goto L_0x0060
            r0 = 0
            goto L_0x0064
        L_0x0060:
            android.os.IBinder r0 = r7.asBinder()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x0064:
            r4.writeStrongBinder(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r4.writeByteArray(r3)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r4.writeString(r2)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3 = 7
            r0 = -303491184(0xffffffffede91790, float:-9.0173116E27)
            int r2 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IBinder r0 = r6.A00     // Catch:{ all -> 0x008f }
            X.C86104wH.A19(r0, r4, r1, r3)     // Catch:{ all -> 0x008f }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r1.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -634569487(0xffffffffda2d3cf1, float:-1.21905442E16)
            X.C14030oh.A0A(r0, r2)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 656932770(0x2727ffa2, float:2.3314484E-15)
            goto L_0x0237
        L_0x008f:
            r3 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r1.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 1716373439(0x664dc7bf, float:2.4294245E23)
            goto L_0x0111
        L_0x009a:
            boolean r0 = r9 instanceof X.C93325lN     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x011c
            X.5lN r1 = (X.C93325lN) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.7Ij r10 = (X.C121837Ij) r10     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.location.LocationSettingsRequest r8 = r1.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3 = 0
            boolean r0 = r10.isConnected()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x0115
            com.google.android.gms.internal.location.zzaz r2 = new com.google.android.gms.internal.location.zzaz     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r2.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IInterface r7 = r10.A03()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.location.zzal r7 = (com.google.android.gms.internal.location.zzal) r7     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.location.zzb r7 = (com.google.android.gms.internal.location.zzb) r7     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1136123051(0xffffffffbc482355, float:-0.012215455)
            int r6 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 489795492(0x1d31afa4, float:2.351656E-21)
            int r1 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            java.lang.String r0 = r7.A01     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r5.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1050705418(0xffffffffc15f81f6, float:-13.969229)
            X.C14030oh.A0A(r0, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r4 = 0
            X.C86114wI.A12(r5, r8, r4)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r2, r5)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r5.writeString(r3)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3 = 63
            r0 = -1066251307(0xffffffffc0724bd5, float:-3.7858784)
            int r2 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IBinder r0 = r7.A00     // Catch:{ all -> 0x0107 }
            r0.transact(r3, r5, r1, r4)     // Catch:{ all -> 0x0107 }
            r1.readException()     // Catch:{ all -> 0x0107 }
            r5.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r1.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -351708126(0xffffffffeb095c22, float:-1.6605792E26)
            X.C14030oh.A0A(r0, r2)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1944852402(0xffffffff8c13e84e, float:-1.1394375E-31)
            X.C14030oh.A0A(r0, r6)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            return
        L_0x0107:
            r3 = move-exception
            r5.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r1.recycle()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -493153613(0xffffffffe29b12b3, float:-1.4302964E21)
        L_0x0111:
            X.C14030oh.A0A(r0, r2)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            goto L_0x011b
        L_0x0115:
            java.lang.String r0 = "Not connected. Call connect() and wait for onConnected() to be called."
            java.lang.IllegalStateException r3 = X.C18180wK.A0a(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x011b:
            throw r3     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x011c:
            boolean r0 = r9 instanceof X.C93305lL     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x01ce
            X.5lL r1 = (X.C93305lL) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.7Ij r10 = (X.C121837Ij) r10     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IInterface r4 = r10.A03()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbt r4 = (com.google.android.gms.internal.p001authapi.zbt) r4     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            boolean r0 = r1 instanceof X.AnonymousClass5pO     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x014a
            com.google.android.gms.internal.auth-api.zbk r2 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r2.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 446697625(0x1aa01099, float:6.6201264E-23)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r2, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 4
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 1009048364(0x3c24db2c, float:0.01006202)
            goto L_0x0237
        L_0x014a:
            boolean r0 = r1 instanceof X.AnonymousClass5pR     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x0177
            X.5pR r1 = (X.AnonymousClass5pR) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbk r3 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.credentials.Credential r0 = r1.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbp r2 = new com.google.android.gms.internal.auth-api.zbp     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r2.<init>(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1558616712(0xffffffffa3196578, float:-8.3156335E-18)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r3, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 0
            X.C86114wI.A12(r1, r2, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 3
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 273468191(0x104ccb1f, float:4.0388385E-29)
            goto L_0x0237
        L_0x0177:
            boolean r0 = r1 instanceof X.AnonymousClass5pQ     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x01a4
            X.5pQ r1 = (X.AnonymousClass5pQ) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbk r3 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.credentials.Credential r0 = r1.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbu r2 = new com.google.android.gms.internal.auth-api.zbu     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r2.<init>(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 273623450(0x104f299a, float:4.08556E-29)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r3, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 0
            X.C86114wI.A12(r1, r2, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 2
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -821565376(0xffffffffcf07e840, float:-2.2801449E9)
            goto L_0x0237
        L_0x01a4:
            X.5pP r1 = (X.AnonymousClass5pP) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zbf r3 = new com.google.android.gms.internal.auth-api.zbf     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.credentials.CredentialRequest r2 = r1.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -1184094116(0xffffffffb96c285c, float:-2.2521749E-4)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r3, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 0
            if (r2 != 0) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            X.C86114wI.A12(r1, r2, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            goto L_0x01c6
        L_0x01c3:
            r1.writeInt(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x01c6:
            r0 = 1
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 184478729(0xafeec09, float:2.4548097E-32)
            goto L_0x0237
        L_0x01ce:
            boolean r0 = r9 instanceof X.C93045kq     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            if (r0 == 0) goto L_0x0205
            X.5kq r1 = (X.C93045kq) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.5ls r10 = (X.C93605ls) r10     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IInterface r4 = r10.A03()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zba r4 = (com.google.android.gms.internal.p001authapi.zba) r4     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.signin.internal.zbj r3 = new com.google.android.gms.auth.api.signin.internal.zbj     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r10.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -620025741(0xffffffffdb0b2873, float:-3.9169496E16)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r3, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 0
            if (r2 != 0) goto L_0x01f5
            goto L_0x01f9
        L_0x01f5:
            X.C86114wI.A12(r1, r2, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            goto L_0x01fc
        L_0x01f9:
            r1.writeInt(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x01fc:
            r0 = 103(0x67, float:1.44E-43)
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = -756663817(0xffffffffd2e639f7, float:-4.94407483E11)
            goto L_0x0237
        L_0x0205:
            X.5kp r1 = (X.C93035kp) r1     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.5ls r10 = (X.C93605ls) r10     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.IInterface r4 = r10.A03()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.internal.auth-api.zba r4 = (com.google.android.gms.internal.p001authapi.zba) r4     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.signin.internal.zbh r3 = new com.google.android.gms.auth.api.signin.internal.zbh     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r3.<init>(r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r10.A00     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 856895497(0x33133009, float:3.4269792E-8)
            int r5 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            android.os.Parcel r1 = r4.A00()     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            X.C86134wK.A16(r3, r1)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 0
            if (r2 != 0) goto L_0x0228
            goto L_0x022c
        L_0x0228:
            X.C86114wI.A12(r1, r2, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            goto L_0x022f
        L_0x022c:
            r1.writeInt(r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
        L_0x022f:
            r0 = 102(0x66, float:1.43E-43)
            r4.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            r0 = 1117280424(0x429858a8, float:76.17316)
        L_0x0237:
            X.C14030oh.A0A(r0, r5)     // Catch:{ DeadObjectException -> 0x024e, RemoteException -> 0x023b }
            return
        L_0x023b:
            r0 = move-exception
            java.lang.String r3 = r0.getLocalizedMessage()
            r1 = 0
            r5 = 8
            r4 = 1
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r9.A0A(r0)
            return
        L_0x024e:
            r0 = move-exception
            java.lang.String r4 = r0.getLocalizedMessage()
            r2 = 0
            r6 = 8
            r5 = 1
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r9.A0A(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93345lQ.A09(X.8eD):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93345lQ(C108946jD r2, AnonymousClass7AL r3) {
        super(r3);
        C13320nQ.A02(r3, "GoogleApiClient must not be null");
        C13320nQ.A02(r2, "Api must not be null");
        this.A00 = r2.A01;
        this.A01 = r2;
    }

    public final void A0A(Status status) {
        boolean z = false;
        if (status.A01 <= 0) {
            z = true;
        }
        C13320nQ.A06(!z, "Failed result must not be success");
        A07(A04(status));
    }
}
