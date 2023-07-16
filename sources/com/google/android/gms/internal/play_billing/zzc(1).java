package com.google.android.gms.internal.play_billing;

import X.AnonymousClass7GD;
import X.C14030oh;
import X.C86104wH;
import X.C86114wI;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzc implements IInterface, zze {
    public final IBinder A00;

    public zzc(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(-1810836792);
        this.A00 = iBinder;
        C14030oh.A0A(1474796330, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(-331189266);
        IBinder iBinder = this.A00;
        C14030oh.A0A(-844410918, A03);
        return iBinder;
    }

    public zzc(IBinder iBinder) {
        this("com.android.vending.billing.IInAppBillingService", iBinder);
        C14030oh.A0A(839242305, C14030oh.A03(-1496878973));
    }

    public final Bundle DCA(String str, String str2, String str3, int i) {
        int A03 = C14030oh.A03(1817451081);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, "subs", 3);
        A01.writeString(str3);
        Bundle A002 = A00(A01, this, 4);
        C14030oh.A0A(-1594897689, A03);
        return A002;
    }

    public final Bundle DCB(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = C14030oh.A03(-1016108808);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, "subs", 9);
        A01.writeString(str3);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 11);
        C14030oh.A0A(-324081443, A03);
        return A002;
    }

    public final Bundle DCD(Bundle bundle, Bundle bundle2, String str, String str2, int i) {
        int A03 = C14030oh.A03(-1091117972);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 10);
        AnonymousClass7GD.A01(A01, bundle);
        AnonymousClass7GD.A01(A01, bundle2);
        Bundle A002 = A00(A01, this, 901);
        C14030oh.A0A(2083890489, A03);
        return A002;
    }

    public static Bundle A00(Parcel parcel, zzc zzc, int i) {
        Parcel A02 = zzc.A02(parcel, i);
        Bundle bundle = (Bundle) AnonymousClass7GD.A00(A02, Bundle.CREATOR);
        A02.recycle();
        return bundle;
    }

    public final Parcel A01() {
        int A03 = C14030oh.A03(12112524);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        C14030oh.A0A(-38794055, A03);
        return obtain;
    }

    public final Parcel A02(Parcel parcel, int i) {
        int A03 = C14030oh.A03(-410288713);
        parcel = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            C14030oh.A0A(621800276, A03);
        }
    }

    public final int DBs(int i, String str, String str2) {
        int A03 = C14030oh.A03(24466677);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 3);
        Parcel A02 = A02(A01, 5);
        int readInt = A02.readInt();
        A02.recycle();
        C14030oh.A0A(-231123349, A03);
        return readInt;
    }

    public final int DC1(Bundle bundle, String str, String str2, int i) {
        int A03 = C14030oh.A03(1207793565);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, i);
        AnonymousClass7GD.A01(A01, bundle);
        Parcel A02 = A02(A01, 10);
        int readInt = A02.readInt();
        A02.recycle();
        C14030oh.A0A(-1985906555, A03);
        return readInt;
    }

    public final Bundle DC4(Bundle bundle, String str, String str2, int i) {
        int A03 = C14030oh.A03(-1503520927);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 9);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 902);
        C14030oh.A0A(-1535161436, A03);
        return A002;
    }

    public final Bundle DC5(Bundle bundle, String str, String str2, int i) {
        int A03 = C14030oh.A03(1901526031);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 9);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 12);
        C14030oh.A0A(-1118387083, A03);
        return A002;
    }

    public final Bundle DC6(String str, String str2, String str3, String str4, int i) {
        int A03 = C14030oh.A03(-196982549);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 3);
        A01.writeString(str3);
        A01.writeString((String) null);
        Bundle A002 = A00(A01, this, 3);
        C14030oh.A0A(-795177372, A03);
        return A002;
    }

    public final Bundle DC7(Bundle bundle, String str, String str2, String str3, String str4, int i) {
        int A03 = C14030oh.A03(-457860373);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, i);
        A01.writeString(str3);
        A01.writeString((String) null);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 8);
        C14030oh.A0A(1241179976, A03);
        return A002;
    }

    public final Bundle DC9(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = C14030oh.A03(150951652);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 6);
        A01.writeString(str3);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 9);
        C14030oh.A0A(-665168024, A03);
        return A002;
    }

    public final Bundle DCC(Bundle bundle, String str, String str2, int i) {
        int A03 = C14030oh.A03(-983041733);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, 3);
        AnonymousClass7GD.A01(A01, bundle);
        Bundle A002 = A00(A01, this, 2);
        C14030oh.A0A(-1827801251, A03);
        return A002;
    }

    public final int DCE(int i, String str, String str2) {
        int A03 = C14030oh.A03(-1863245998);
        Parcel A01 = A01();
        C86114wI.A14(A01, str, str2, i);
        Parcel A02 = A02(A01, 1);
        int readInt = A02.readInt();
        A02.recycle();
        C14030oh.A0A(-2086027380, A03);
        return readInt;
    }
}
