package com.google.android.gms.internal.p001authapi;

import X.AnonymousClass0wJ;
import X.AnonymousClass5lP;
import X.AnonymousClass7AL;
import X.AnonymousClass7CO;
import X.AnonymousClass7CP;
import X.AnonymousClass7HJ;
import X.AnonymousClass83M;
import X.C113826sD;
import X.C1199977y;
import X.C13320nQ;
import X.C14030oh;
import X.C86144wL;
import X.C86164wN;
import X.C93035kp;
import X.C93045kq;
import X.C93235lE;
import X.C93335lO;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbo;
import com.google.android.gms.auth.api.signin.internal.zbt;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.internal.auth-api.zbb  reason: invalid package */
public abstract class zbb extends Binder implements IInterface {
    public boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        int i5;
        BasePendingResult A04;
        BasePendingResult A042;
        zbo zbo = (zbo) this;
        int A03 = C14030oh.A03(972203475);
        boolean z = true;
        if (i == 1) {
            zbt zbt = (zbt) zbo;
            i3 = C14030oh.A03(-1908095713);
            zbt.A00(zbt);
            Context context = zbt.A00;
            AnonymousClass7HJ A00 = AnonymousClass7HJ.A00(context);
            GoogleSignInAccount A02 = A00.A02();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0D;
            if (A02 != null) {
                googleSignInOptions = A00.A03();
            }
            C13320nQ.A01(googleSignInOptions);
            C93235lE r0 = new C93235lE(context, googleSignInOptions);
            AnonymousClass7AL r5 = r0.A05;
            Context context2 = r0.A01;
            boolean A1T = AnonymousClass0wJ.A1T(C93235lE.A00(r0), 3);
            C113826sD r6 = AnonymousClass7CO.A00;
            Object[] A1T2 = C86164wN.A1T();
            if (A02 != null) {
                r6.A00("Revoking access", A1T2);
                String A043 = AnonymousClass7HJ.A00(context2).A04("refreshToken");
                AnonymousClass7CO.A01(context2);
                if (!A1T) {
                    A042 = r5.A04(new C93045kq(r5));
                } else if (A043 == null) {
                    Status status = new Status(4, (String) null);
                    boolean z2 = false;
                    if (status.BDf().A01 <= 0) {
                        z2 = true;
                    }
                    C13320nQ.A06(!z2, "Status code must not be SUCCESS");
                    A042 = new AnonymousClass5lP(status);
                    A042.A07(status);
                } else {
                    AnonymousClass83M r1 = new AnonymousClass83M(A043);
                    new Thread(r1).start();
                    A042 = r1.A00;
                }
                AnonymousClass7CP.A00(A042);
                i4 = 659214002;
            } else {
                r6.A00("Signing out", A1T2);
                AnonymousClass7CO.A01(context2);
                if (A1T) {
                    Status status2 = Status.A09;
                    C13320nQ.A02(status2, "Result must not be null");
                    A04 = new C93335lO(r5);
                    A04.A07(status2);
                } else {
                    A04 = r5.A04(new C93035kp(r5));
                }
                AnonymousClass7CP.A00(A04);
                i4 = 1456626855;
            }
            C14030oh.A0A(i4, i3);
            i5 = -711435128;
        } else if (i != 2) {
            z = false;
            i5 = 1103574563;
        } else {
            zbt zbt2 = (zbt) zbo;
            i3 = C14030oh.A03(-1912087391);
            zbt.A00(zbt2);
            C1199977y.A00(zbt2.A00).A01();
            i4 = -387719590;
            C14030oh.A0A(i4, i3);
            i5 = -711435128;
        }
        C14030oh.A0A(i5, A03);
        return z;
    }

    public final IBinder asBinder() {
        C14030oh.A0A(1375053497, C14030oh.A03(1901617163));
        return this;
    }

    public zbb(String str) {
        int A03 = C14030oh.A03(-288759801);
        attachInterface(this, str);
        C14030oh.A0A(-1964760975, A03);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A01;
        int i3;
        int A03 = C14030oh.A03(-1821738767);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A01 = true;
                i3 = -1380969112;
            }
            A01 = A01(i, parcel, parcel2, i2);
            i3 = 1020434458;
        } else {
            C86144wL.A1A(this, parcel);
            A01 = A01(i, parcel, parcel2, i2);
            i3 = 1020434458;
        }
        C14030oh.A0A(i3, A03);
        return A01;
    }
}
