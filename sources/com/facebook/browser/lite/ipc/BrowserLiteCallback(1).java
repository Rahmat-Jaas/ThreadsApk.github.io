package com.facebook.browser.lite.ipc;

import X.C116166wX;
import X.C14030oh;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.List;
import java.util.Map;

public interface BrowserLiteCallback extends IInterface {

    public abstract class Stub extends Binder implements BrowserLiteCallback {

        public final class Proxy implements BrowserLiteCallback {
            public IBinder A00;

            public static IBinder A00(Parcel parcel, Proxy proxy) {
                parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                return proxy.A00;
            }

            public static void A01(Parcel parcel, String str) {
                parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                parcel.writeString(str);
            }

            public static boolean A02(Parcel parcel, Parcelable parcelable) {
                parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                C116166wX.A01(parcel, parcelable, 0);
                return false;
            }

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1327775068);
                this.A00 = iBinder;
                C14030oh.A0A(-138292883, A03);
            }

            public final void AAz(String str, Map map, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(844923089);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeMap(map);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-665243539, A03);
                }
            }

            public final void ACq(Bundle bundle) {
                int A03 = C14030oh.A03(-41538863);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(38, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(953622633, A03);
                }
            }

            public final void AHV() {
                int A03 = C14030oh.A03(1731577058);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 30);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-682876244, A03);
                }
            }

            public final boolean AM3(String str, String str2, boolean z) {
                int A03 = C14030oh.A03(340344578);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    boolean z2 = true;
                    obtain.writeInt(C18180wK.A1V(z ? 1 : 0) ? 1 : 0);
                    if (C86114wI.A07(this.A00, obtain, obtain2, 68) == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1546238601, A03);
                }
            }

            public final int AM4(String str, String str2, int i) {
                int A03 = C14030oh.A03(-1369546410);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    C86104wH.A19(this.A00, obtain, obtain2, 67);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-686108795, A03);
                }
            }

            public final long AM5(String str, String str2, long j) {
                int A03 = C14030oh.A03(-358206196);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    C86104wH.A19(this.A00, obtain, obtain2, 69);
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(748675424, A03);
                }
            }

            public final void AM6(String str, String str2, boolean z) {
                int A03 = C14030oh.A03(-536963269);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeInt(C18180wK.A1V(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(163205795, A03);
                }
            }

            public final void AM7(String str, String str2, int i) {
                int A03 = C14030oh.A03(455470223);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    C86104wH.A19(this.A00, obtain, obtain2, 64);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1177041597, A03);
                }
            }

            public final void AM8(String str, String str2, long j) {
                int A03 = C14030oh.A03(2045645600);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    C86104wH.A19(this.A00, obtain, obtain2, 66);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-443633532, A03);
                }
            }

            public final void AMH(AutofillContactDataCallback autofillContactDataCallback) {
                int A03 = C14030oh.A03(-1775449315);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeStrongInterface(autofillContactDataCallback);
                    C86104wH.A19(this.A00, obtain, obtain2, 26);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-428878988, A03);
                }
            }

            public final void AMI(AutofillScriptCallback$Stub$Proxy autofillScriptCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(1850332226);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeStrongInterface(autofillScriptCallback$Stub$Proxy);
                    C86104wH.A19(this.A00, obtain, obtain2, 25);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-350602278, A03);
                }
            }

            public final void AMJ() {
                int A03 = C14030oh.A03(291148472);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 34);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(734377083, A03);
                }
            }

            public final PrefetchCacheEntry B2n(String str) {
                int A03 = C14030oh.A03(-1265314492);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 18);
                    return (PrefetchCacheEntry) C86114wI.A0d(obtain2, PrefetchCacheEntry.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(407969762, A03);
                }
            }

            public final List B2o() {
                int A03 = C14030oh.A03(-306861057);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 17);
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1495120046, A03);
                }
            }

            public final void BN4(String str) {
                int A03 = C14030oh.A03(1759965785);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 45);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1263883452, A03);
                }
            }

            public final int BNL(String str) {
                int A03 = C14030oh.A03(-375372880);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1255314008, A03);
                }
            }

            public final boolean BNO(String str, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(-843864128);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    boolean z = false;
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    if (C86114wI.A07(this.A00, obtain, obtain2, 44) != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-198971764, A03);
                }
            }

            public final boolean BNS(String str, String str2, String str3, String str4, String str5) {
                int A03 = C14030oh.A03(413535326);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    boolean z = false;
                    if (C86114wI.A07(this.A00, obtain, obtain2, 3) != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-584446207, A03);
                }
            }

            public final boolean BNT(String str) {
                int A03 = C14030oh.A03(789039959);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    boolean z = false;
                    if (C86114wI.A07(this.A00, obtain, obtain2, 22) != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(726175430, A03);
                }
            }

            public final void BNW(String str, String str2, Bundle bundle) {
                int A03 = C14030oh.A03(-244239273);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    C116166wX.A01(obtain, bundle, 0);
                    this.A00.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-209426071, A03);
                }
            }

            public final boolean BNa(String str, String str2) {
                int A03 = C14030oh.A03(-1970581553);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    boolean z = false;
                    if (C86114wI.A07(this.A00, obtain, obtain2, 2) != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-828393000, A03);
                }
            }

            public final void BNb(Bundle bundle) {
                int A03 = C14030oh.A03(-1001021873);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(60, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1306193583, A03);
                }
            }

            public final void BPT() {
                int A03 = C14030oh.A03(1622371798);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 29);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1359696818, A03);
                }
            }

            public final void BPW() {
                int A03 = C14030oh.A03(-1522210368);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 33);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1483907228, A03);
                }
            }

            public final void BYY(Bundle bundle, ShopsLiteEligibilityCallback$Stub$Proxy shopsLiteEligibilityCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(1510936815);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A02 = A02(obtain, bundle);
                    obtain.writeStrongInterface(shopsLiteEligibilityCallback$Stub$Proxy);
                    this.A00.transact(59, obtain, obtain2, A02 ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-541285415, A03);
                }
            }

            public final void BZX(String str, IsUrlSavedCallback$Stub$Proxy isUrlSavedCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(951251318);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeStrongInterface(isUrlSavedCallback$Stub$Proxy);
                    C86104wH.A19(this.A00, obtain, obtain2, 50);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-453604295, A03);
                }
            }

            public final void BaR(String str) {
                int A03 = C14030oh.A03(-37818060);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 37);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1898825193, A03);
                }
            }

            public final void BbQ(String str) {
                int A03 = C14030oh.A03(-976938517);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 27);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(2044293651, A03);
                }
            }

            public final void BbS(String str, Map map, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(-2144255664);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeMap(map);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(956848384, A03);
                }
            }

            public final void Bbo(String str) {
                int A03 = C14030oh.A03(460088225);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 63);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-982652169, A03);
                }
            }

            public final void Bcx(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(453135490);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    obtain.writeLong(j4);
                    obtain.writeLong(j5);
                    obtain.writeInt(i);
                    int i2 = 1;
                    obtain.writeInt(C18180wK.A1V(z ? 1 : 0) ? 1 : 0);
                    obtain.writeInt(C18180wK.A1V(z2 ? 1 : 0) ? 1 : 0);
                    obtain.writeInt(C18180wK.A1V(z3 ? 1 : 0) ? 1 : 0);
                    obtain.writeMap(map);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    obtain.writeMap(map2);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1915585145, A03);
                }
            }

            public final void BdA(Bundle bundle) {
                int A03 = C14030oh.A03(1798639116);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(57, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1421911345, A03);
                }
            }

            public final void Bdc(String str, String str2) {
                int A03 = C14030oh.A03(-1492294979);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 62);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(914302173, A03);
                }
            }

            public final void Bdu(long j, String str, String str2) {
                int A03 = C14030oh.A03(-1958896808);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 70);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1256801643, A03);
                }
            }

            public final String BfW(String str) {
                int A03 = C14030oh.A03(-1704342652);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 23);
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(8888453, A03);
                }
            }

            public final void BiJ(Bundle bundle) {
                int A03 = C14030oh.A03(182880575);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(41, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(372970802, A03);
                }
            }

            public final void Blw(String str, AutofillOptOutCallback autofillOptOutCallback) {
                int A03 = C14030oh.A03(-1761575952);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeStrongInterface(autofillOptOutCallback);
                    C86104wH.A19(this.A00, obtain, obtain2, 24);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(710765706, A03);
                }
            }

            public final void BsK(String str, Bundle bundle) {
                int A03 = C14030oh.A03(-1678923046);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C116166wX.A01(obtain, bundle, 0);
                    this.A00.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1685312379, A03);
                }
            }

            public final void BxD(String str, String str2, Map map, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(1284694047);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(242326286, A03);
                }
            }

            public final void BxS(String str) {
                int A03 = C14030oh.A03(-1450074326);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 49);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1217416646, A03);
                }
            }

            public final void BzT() {
                int A03 = C14030oh.A03(49581761);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 43);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(660425260, A03);
                }
            }

            public final void C1n(String str, List list) {
                int A03 = C14030oh.A03(1057898864);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeList(list);
                    C86104wH.A19(this.A00, obtain, obtain2, 21);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(375085294, A03);
                }
            }

            public final void C1p(IABEvent iABEvent, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(1515294289);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A02 = A02(obtain, iABEvent);
                    C116166wX.A01(obtain, bundle, A02 ? 1 : 0);
                    C116166wX.A01(obtain, zonePolicy, A02);
                    this.A00.transact(4, obtain, obtain2, A02);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1984691087, A03);
                }
            }

            public final void C3w(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
                int A03 = C14030oh.A03(2002744335);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A02 = A02(obtain, browserLiteJSBridgeCall);
                    obtain.writeStrongInterface(browserLiteJSBridgeCallback);
                    this.A00.transact(19, obtain, obtain2, A02 ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1361320787, A03);
                }
            }

            public final void C7o(String str, String str2) {
                int A03 = C14030oh.A03(1411451947);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 52);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-317751930, A03);
                }
            }

            public final void C7p(String str, String str2, String str3, String str4, MoreInfoCallback$Stub$Proxy moreInfoCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(793361501);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeStrongInterface(moreInfoCallback$Stub$Proxy);
                    C86104wH.A19(this.A00, obtain, obtain2, 51);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-705566624, A03);
                }
            }

            public final void C9W(Map map) {
                int A03 = C14030oh.A03(1347116685);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    C86104wH.A19(this.A00, obtain, obtain2, 55);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(429425926, A03);
                }
            }

            public final void C9a(Bundle bundle) {
                int A03 = C14030oh.A03(839669424);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(54, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-395872904, A03);
                }
            }

            public final void C9x(String str, Bundle bundle, int i) {
                int A03 = C14030oh.A03(-1302481321);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C116166wX.A01(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.A00.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1191521422, A03);
                }
            }

            public final void CA0(String str, Bundle bundle, int i, long j) {
                int A03 = C14030oh.A03(2086073855);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C116166wX.A01(obtain, bundle, 0);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.A00.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1456072416, A03);
                }
            }

            public final void CA9(String str, String str2, Bundle bundle) {
                int A03 = C14030oh.A03(-1619222897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    C116166wX.A01(obtain, bundle, 0);
                    this.A00.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-565490210, A03);
                }
            }

            public final void CAP(String str, boolean z, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(-1815910792);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeInt(C18180wK.A1V(z ? 1 : 0) ? 1 : 0);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1524282767, A03);
                }
            }

            public final void CED(Map map) {
                int A03 = C14030oh.A03(-1769196388);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    C86104wH.A19(this.A00, obtain, obtain2, 14);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1160342537, A03);
                }
            }

            public final void CHL(String str, Bundle bundle, ZonePolicy zonePolicy) {
                int A03 = C14030oh.A03(1537631812);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C116166wX.A01(obtain, bundle, 0);
                    C116166wX.A01(obtain, zonePolicy, 0);
                    this.A00.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-658421847, A03);
                }
            }

            public final void CJy() {
                int A03 = C14030oh.A03(463162871);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 48);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-504628911, A03);
                }
            }

            public final void CQs(String str, String str2, MoreInfoCallback$Stub$Proxy moreInfoCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(695176321);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeStrongInterface(moreInfoCallback$Stub$Proxy);
                    C86104wH.A19(this.A00, obtain, obtain2, 53);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1259720060, A03);
                }
            }

            public final void CS1(Bundle bundle, String str) {
                int A03 = C14030oh.A03(991632442);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A02 = A02(obtain, bundle);
                    obtain.writeString(str);
                    this.A00.transact(42, obtain, obtain2, A02 ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(318205377, A03);
                }
            }

            public final void CS7(Map map, Bundle bundle) {
                int A03 = C14030oh.A03(59897858);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    C116166wX.A01(obtain, bundle, 0);
                    this.A00.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1893171265, A03);
                }
            }

            public final void CVd() {
                int A03 = C14030oh.A03(-1156139546);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 61);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1435614980, A03);
                }
            }

            public final void CVg(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
                int A03 = C14030oh.A03(-1272321443);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A02 = A02(obtain, bundle);
                    obtain.writeStrongInterface(onShopsLiteCallback);
                    this.A00.transact(56, obtain, obtain2, A02 ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(672175466, A03);
                }
            }

            public final void CVh(Bundle bundle) {
                int A03 = C14030oh.A03(2082176756);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(58, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1711539851, A03);
                }
            }

            public final void CVj() {
                int A03 = C14030oh.A03(-1851230979);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 36);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1578375227, A03);
                }
            }

            public final void CVk() {
                int A03 = C14030oh.A03(1410252376);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 31);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1272164189, A03);
                }
            }

            public final void Cdd(long[] jArr, Bundle bundle) {
                int A03 = C14030oh.A03(989552937);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeLongArray(jArr);
                    C116166wX.A01(obtain, bundle, 0);
                    this.A00.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1238210430, A03);
                }
            }

            public final void CeQ() {
                int A03 = C14030oh.A03(-811615659);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 32);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(331853409, A03);
                }
            }

            public final void Cku() {
                int A03 = C14030oh.A03(-13079558);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 28);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(593532088, A03);
                }
            }

            public final void CnQ(String str) {
                int A03 = C14030oh.A03(-1263644109);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A01(obtain, str);
                    C86104wH.A19(this.A00, obtain, obtain2, 40);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(483150133, A03);
                }
            }

            public final void Cwx() {
                int A03 = C14030oh.A03(53440699);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    C86104wH.A19(A00(obtain, this), obtain, obtain2, 20);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-957228098, A03);
                }
            }

            public final void D88(Bundle bundle) {
                int A03 = C14030oh.A03(1870301993);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.A00.transact(39, obtain, obtain2, A02(obtain, bundle) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-38927022, A03);
                }
            }

            public final void D8x(int i) {
                int A03 = C14030oh.A03(1546245705);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeInt(i);
                    C86104wH.A19(this.A00, obtain, obtain2, 35);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1659299224, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(1291148035);
                IBinder iBinder = this.A00;
                C14030oh.A0A(281641695, A03);
                return iBinder;
            }
        }

        public static Bundle A00(Parcel parcel) {
            return (Bundle) C116166wX.A00(parcel, Bundle.CREATOR);
        }

        public Stub() {
            int A03 = C14030oh.A03(-48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            C14030oh.A0A(-1722318555, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1416617752, C14030oh.A03(1175971799));
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0344, code lost:
            r1.writeNoException();
            r1.writeInt(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0432, code lost:
            r1.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0435, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x04dd, code lost:
            r1.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0512, code lost:
            r1.writeNoException();
            r1.writeInt(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0518, code lost:
            X.C14030oh.A0A(-399314222, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x051e, code lost:
            return r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r31, android.os.Parcel r32, android.os.Parcel r33, int r34) {
            /*
                r30 = this;
                r0 = -818611076(0xffffffffcf34fc7c, float:-3.0364457E9)
                int r3 = X.C14030oh.A03(r0)
                r7 = 1
                java.lang.String r4 = "com.facebook.browser.lite.ipc.BrowserLiteCallback"
                r8 = r30
                r6 = r31
                r0 = r32
                r1 = r33
                if (r6 < r7) goto L_0x0020
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r6 > r2) goto L_0x002d
                r0.enforceInterface(r4)
                r5 = 0
                switch(r31) {
                    case 1: goto L_0x0509;
                    case 2: goto L_0x04fb;
                    case 3: goto L_0x04e1;
                    case 4: goto L_0x04c5;
                    case 5: goto L_0x04b8;
                    case 6: goto L_0x04a3;
                    case 7: goto L_0x0487;
                    case 8: goto L_0x0438;
                    case 9: goto L_0x0423;
                    case 10: goto L_0x040f;
                    case 11: goto L_0x03ff;
                    case 12: goto L_0x03f3;
                    case 13: goto L_0x03d3;
                    case 14: goto L_0x03c7;
                    case 15: goto L_0x03b7;
                    case 16: goto L_0x03a7;
                    case 17: goto L_0x039b;
                    case 18: goto L_0x038b;
                    case 19: goto L_0x0362;
                    case 20: goto L_0x035d;
                    case 21: goto L_0x034c;
                    case 22: goto L_0x033c;
                    case 23: goto L_0x032c;
                    case 24: goto L_0x0307;
                    case 25: goto L_0x02e2;
                    case 26: goto L_0x02c1;
                    case 27: goto L_0x02b8;
                    case 28: goto L_0x02b3;
                    case 29: goto L_0x02ae;
                    case 30: goto L_0x02a9;
                    case 31: goto L_0x02a4;
                    case 32: goto L_0x029f;
                    case 33: goto L_0x029a;
                    case 34: goto L_0x0295;
                    case 35: goto L_0x028c;
                    case 36: goto L_0x0287;
                    case 37: goto L_0x027e;
                    case 38: goto L_0x0275;
                    case 39: goto L_0x026c;
                    case 40: goto L_0x0263;
                    case 41: goto L_0x025a;
                    case 42: goto L_0x024d;
                    case 43: goto L_0x0248;
                    case 44: goto L_0x0232;
                    case 45: goto L_0x0229;
                    case 46: goto L_0x020c;
                    case 47: goto L_0x01ef;
                    case 48: goto L_0x01ea;
                    case 49: goto L_0x01e1;
                    case 50: goto L_0x01bc;
                    case 51: goto L_0x018b;
                    case 52: goto L_0x017e;
                    case 53: goto L_0x0155;
                    case 54: goto L_0x014c;
                    case 55: goto L_0x013f;
                    case 56: goto L_0x011a;
                    case 57: goto L_0x0111;
                    case 58: goto L_0x0108;
                    case 59: goto L_0x00e3;
                    case 60: goto L_0x00da;
                    case 61: goto L_0x00d5;
                    case 62: goto L_0x00c8;
                    case 63: goto L_0x00bf;
                    case 64: goto L_0x00ae;
                    case 65: goto L_0x009a;
                    case 66: goto L_0x0089;
                    case 67: goto L_0x0077;
                    case 68: goto L_0x0062;
                    case 69: goto L_0x004a;
                    case 70: goto L_0x0039;
                    default: goto L_0x0020;
                }
            L_0x0020:
                r2 = r34
                boolean r7 = super.onTransact(r6, r0, r1, r2)
                r0 = -1944335588(0xffffffff8c1bcb1c, float:-1.2001887E-31)
            L_0x0029:
                X.C14030oh.A0A(r0, r3)
                return r7
            L_0x002d:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 != r2) goto L_0x0020
                r1.writeString(r4)
                r0 = -1800119072(0xffffffff94b45ce0, float:-1.8211988E-26)
                goto L_0x0029
            L_0x0039:
                long r4 = r0.readLong()
                java.lang.String r2 = r0.readString()
                java.lang.String r0 = r0.readString()
                r8.Bdu(r4, r2, r0)
                goto L_0x0432
            L_0x004a:
                java.lang.String r6 = r0.readString()
                java.lang.String r2 = r0.readString()
                long r4 = r0.readLong()
                long r4 = r8.AM5(r6, r2, r4)
                r1.writeNoException()
                r1.writeLong(r4)
                goto L_0x0435
            L_0x0062:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                int r0 = r0.readInt()
                if (r0 == 0) goto L_0x0071
                r5 = 1
            L_0x0071:
                boolean r0 = r8.AM3(r4, r2, r5)
                goto L_0x0344
            L_0x0077:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                int r0 = r0.readInt()
                int r0 = r8.AM4(r4, r2, r0)
                goto L_0x0344
            L_0x0089:
                java.lang.String r6 = r0.readString()
                java.lang.String r2 = r0.readString()
                long r4 = r0.readLong()
                r8.AM8(r6, r2, r4)
                goto L_0x0432
            L_0x009a:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                int r0 = r0.readInt()
                if (r0 == 0) goto L_0x00a9
                r5 = 1
            L_0x00a9:
                r8.AM6(r4, r2, r5)
                goto L_0x0432
            L_0x00ae:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                int r0 = r0.readInt()
                r8.AM7(r4, r2, r0)
                goto L_0x0432
            L_0x00bf:
                java.lang.String r0 = r0.readString()
                r8.Bbo(r0)
                goto L_0x0432
            L_0x00c8:
                java.lang.String r2 = r0.readString()
                java.lang.String r0 = r0.readString()
                r8.Bdc(r2, r0)
                goto L_0x0432
            L_0x00d5:
                r8.CVd()
                goto L_0x0432
            L_0x00da:
                android.os.Bundle r0 = A00(r0)
                r8.BNb(r0)
                goto L_0x0432
            L_0x00e3:
                android.os.Bundle r5 = A00(r0)
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x00f3
                r2 = 0
            L_0x00ee:
                r8.BYY(r5, r2)
                goto L_0x0432
            L_0x00f3:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0102
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback$Stub$Proxy
                if (r0 == 0) goto L_0x0102
                com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback$Stub$Proxy r2 = (com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback$Stub$Proxy) r2
                goto L_0x00ee
            L_0x0102:
                com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x00ee
            L_0x0108:
                android.os.Bundle r0 = A00(r0)
                r8.CVh(r0)
                goto L_0x0432
            L_0x0111:
                android.os.Bundle r0 = A00(r0)
                r8.BdA(r0)
                goto L_0x0432
            L_0x011a:
                android.os.Bundle r5 = A00(r0)
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x012a
                r2 = 0
            L_0x0125:
                r8.CVg(r5, r2)
                goto L_0x0432
            L_0x012a:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.OnShopsLiteCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0139
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.OnShopsLiteCallback
                if (r0 == 0) goto L_0x0139
                com.facebook.browser.lite.ipc.OnShopsLiteCallback r2 = (com.facebook.browser.lite.ipc.OnShopsLiteCallback) r2
                goto L_0x0125
            L_0x0139:
                com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x0125
            L_0x013f:
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r0 = r0.readHashMap(r2)
                r8.C9W(r0)
                goto L_0x0432
            L_0x014c:
                android.os.Bundle r0 = A00(r0)
                r8.C9a(r0)
                goto L_0x0432
            L_0x0155:
                java.lang.String r6 = r0.readString()
                java.lang.String r5 = r0.readString()
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x0169
                r2 = 0
            L_0x0164:
                r8.CQs(r6, r5, r2)
                goto L_0x0432
            L_0x0169:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.MoreInfoCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0178
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy
                if (r0 == 0) goto L_0x0178
                com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy r2 = (com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy) r2
                goto L_0x0164
            L_0x0178:
                com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x0164
            L_0x017e:
                java.lang.String r2 = r0.readString()
                java.lang.String r0 = r0.readString()
                r8.C7o(r2, r0)
                goto L_0x0432
            L_0x018b:
                java.lang.String r9 = r0.readString()
                java.lang.String r10 = r0.readString()
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                android.os.IBinder r2 = r0.readStrongBinder()
                if (r2 != 0) goto L_0x01a7
                r13 = 0
            L_0x01a2:
                r8.C7p(r9, r10, r11, r12, r13)
                goto L_0x0432
            L_0x01a7:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.MoreInfoCallback"
                android.os.IInterface r13 = r2.queryLocalInterface(r0)
                if (r13 == 0) goto L_0x01b6
                boolean r0 = r13 instanceof com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy
                if (r0 == 0) goto L_0x01b6
                com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy r13 = (com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy) r13
                goto L_0x01a2
            L_0x01b6:
                com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy r13 = new com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy
                r13.<init>(r2)
                goto L_0x01a2
            L_0x01bc:
                java.lang.String r5 = r0.readString()
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x01cc
                r2 = 0
            L_0x01c7:
                r8.BZX(r5, r2)
                goto L_0x0432
            L_0x01cc:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.IsUrlSavedCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x01db
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy
                if (r0 == 0) goto L_0x01db
                com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy r2 = (com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy) r2
                goto L_0x01c7
            L_0x01db:
                com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x01c7
            L_0x01e1:
                java.lang.String r0 = r0.readString()
                r8.BxS(r0)
                goto L_0x0432
            L_0x01ea:
                r8.CJy()
                goto L_0x0432
            L_0x01ef:
                java.lang.String r6 = r0.readString()
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r5 = r0.readHashMap(r2)
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.AAz(r6, r5, r4, r0)
                goto L_0x0432
            L_0x020c:
                java.lang.String r6 = r0.readString()
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r5 = r0.readHashMap(r2)
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.BbS(r6, r5, r4, r0)
                goto L_0x0432
            L_0x0229:
                java.lang.String r0 = r0.readString()
                r8.BN4(r0)
                goto L_0x0432
            L_0x0232:
                java.lang.String r5 = r0.readString()
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                boolean r0 = r8.BNO(r5, r4, r0)
                goto L_0x0344
            L_0x0248:
                r8.BzT()
                goto L_0x0432
            L_0x024d:
                android.os.Bundle r2 = A00(r0)
                java.lang.String r0 = r0.readString()
                r8.CS1(r2, r0)
                goto L_0x0432
            L_0x025a:
                android.os.Bundle r0 = A00(r0)
                r8.BiJ(r0)
                goto L_0x0432
            L_0x0263:
                java.lang.String r0 = r0.readString()
                r8.CnQ(r0)
                goto L_0x0432
            L_0x026c:
                android.os.Bundle r0 = A00(r0)
                r8.D88(r0)
                goto L_0x0432
            L_0x0275:
                android.os.Bundle r0 = A00(r0)
                r8.ACq(r0)
                goto L_0x0432
            L_0x027e:
                java.lang.String r0 = r0.readString()
                r8.BaR(r0)
                goto L_0x0432
            L_0x0287:
                r8.CVj()
                goto L_0x0432
            L_0x028c:
                int r0 = r0.readInt()
                r8.D8x(r0)
                goto L_0x0432
            L_0x0295:
                r8.AMJ()
                goto L_0x0432
            L_0x029a:
                r8.BPW()
                goto L_0x0432
            L_0x029f:
                r8.CeQ()
                goto L_0x0432
            L_0x02a4:
                r8.CVk()
                goto L_0x0432
            L_0x02a9:
                r8.AHV()
                goto L_0x0432
            L_0x02ae:
                r8.BPT()
                goto L_0x0432
            L_0x02b3:
                r8.Cku()
                goto L_0x0432
            L_0x02b8:
                java.lang.String r0 = r0.readString()
                r8.BbQ(r0)
                goto L_0x0432
            L_0x02c1:
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x02cd
                r2 = 0
            L_0x02c8:
                r8.AMH(r2)
                goto L_0x0432
            L_0x02cd:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.AutofillContactDataCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x02dc
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.AutofillContactDataCallback
                if (r0 == 0) goto L_0x02dc
                com.facebook.browser.lite.ipc.AutofillContactDataCallback r2 = (com.facebook.browser.lite.ipc.AutofillContactDataCallback) r2
                goto L_0x02c8
            L_0x02dc:
                com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x02c8
            L_0x02e2:
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x02ee
                r2 = 0
            L_0x02e9:
                r8.AMI(r2)
                goto L_0x0432
            L_0x02ee:
                r0 = 554(0x22a, float:7.76E-43)
                java.lang.String r0 = X.I17.A00(r0)
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0301
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy
                if (r0 == 0) goto L_0x0301
                com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy r2 = (com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy) r2
                goto L_0x02e9
            L_0x0301:
                com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x02e9
            L_0x0307:
                java.lang.String r5 = r0.readString()
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x0317
                r2 = 0
            L_0x0312:
                r8.Blw(r5, r2)
                goto L_0x0432
            L_0x0317:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.AutofillOptOutCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0326
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.AutofillOptOutCallback
                if (r0 == 0) goto L_0x0326
                com.facebook.browser.lite.ipc.AutofillOptOutCallback r2 = (com.facebook.browser.lite.ipc.AutofillOptOutCallback) r2
                goto L_0x0312
            L_0x0326:
                com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x0312
            L_0x032c:
                java.lang.String r0 = r0.readString()
                java.lang.String r0 = r8.BfW(r0)
                r1.writeNoException()
                r1.writeString(r0)
                goto L_0x0435
            L_0x033c:
                java.lang.String r0 = r0.readString()
                boolean r0 = r8.BNT(r0)
            L_0x0344:
                r1.writeNoException()
                r1.writeInt(r0)
                goto L_0x0435
            L_0x034c:
                java.lang.String r4 = r0.readString()
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.ArrayList r0 = r0.readArrayList(r2)
                r8.C1n(r4, r0)
                goto L_0x0432
            L_0x035d:
                r8.Cwx()
                goto L_0x0432
            L_0x0362:
                android.os.Parcelable$Creator r2 = com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall.CREATOR
                java.lang.Object r5 = X.C86114wI.A0d(r0, r2)
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r5 = (com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall) r5
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x0376
                r2 = 0
            L_0x0371:
                r8.C3w(r5, r2)
                goto L_0x0432
            L_0x0376:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback"
                android.os.IInterface r2 = r4.queryLocalInterface(r0)
                if (r2 == 0) goto L_0x0385
                boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
                if (r0 == 0) goto L_0x0385
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback r2 = (com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback) r2
                goto L_0x0371
            L_0x0385:
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy
                r2.<init>(r4)
                goto L_0x0371
            L_0x038b:
                java.lang.String r0 = r0.readString()
                com.facebook.browser.lite.ipc.PrefetchCacheEntry r0 = r8.B2n(r0)
                r1.writeNoException()
                X.C116166wX.A01(r1, r0, r7)
                goto L_0x0435
            L_0x039b:
                java.util.List r0 = r8.B2o()
                r1.writeNoException()
                r1.writeStringList(r0)
                goto L_0x0435
            L_0x03a7:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                android.os.Bundle r0 = A00(r0)
                r8.BNW(r4, r2, r0)
                goto L_0x0432
            L_0x03b7:
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r2 = r0.readHashMap(r2)
                android.os.Bundle r0 = A00(r0)
                r8.CS7(r2, r0)
                goto L_0x0432
            L_0x03c7:
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r0 = r0.readHashMap(r2)
                r8.CED(r0)
                goto L_0x0432
            L_0x03d3:
                java.lang.String r9 = r0.readString()
                java.lang.String r10 = r0.readString()
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r11 = r0.readHashMap(r2)
                android.os.Bundle r12 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r13 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r13 = (com.facebook.privacy.zone.policy.ZonePolicy) r13
                r8.BxD(r9, r10, r11, r12, r13)
                goto L_0x0432
            L_0x03f3:
                long[] r2 = r0.createLongArray()
                android.os.Bundle r0 = A00(r0)
                r8.Cdd(r2, r0)
                goto L_0x0432
            L_0x03ff:
                java.lang.String r4 = r0.readString()
                android.os.Bundle r2 = A00(r0)
                int r0 = r0.readInt()
                r8.C9x(r4, r2, r0)
                goto L_0x0432
            L_0x040f:
                java.lang.String r9 = r0.readString()
                android.os.Bundle r10 = A00(r0)
                int r11 = r0.readInt()
                long r12 = r0.readLong()
                r8.CA0(r9, r10, r11, r12)
                goto L_0x0432
            L_0x0423:
                java.lang.String r4 = r0.readString()
                java.lang.String r2 = r0.readString()
                android.os.Bundle r0 = A00(r0)
                r8.CA9(r4, r2, r0)
            L_0x0432:
                r1.writeNoException()
            L_0x0435:
                r6 = 1
                goto L_0x0518
            L_0x0438:
                java.lang.String r9 = r0.readString()
                long r10 = r0.readLong()
                long r12 = r0.readLong()
                long r14 = r0.readLong()
                long r16 = r0.readLong()
                long r18 = r0.readLong()
                int r20 = r0.readInt()
                boolean r21 = X.C86104wH.A1W(r0)
                boolean r22 = X.C86104wH.A1W(r0)
                boolean r23 = X.C86104wH.A1W(r0)
                java.lang.ClassLoader r2 = X.C86114wI.A0Z(r8)
                java.util.HashMap r24 = r0.readHashMap(r2)
                boolean r25 = X.C86104wH.A1W(r0)
                java.lang.String r26 = r0.readString()
                java.util.HashMap r27 = r0.readHashMap(r2)
                android.os.Bundle r28 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r6 = 1
                r29 = r0
                r8.Bcx(r9, r10, r12, r14, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x04dd
            L_0x0487:
                r6 = 1
                java.lang.String r5 = r0.readString()
                int r2 = r0.readInt()
                if (r2 != 0) goto L_0x0493
                r7 = 0
            L_0x0493:
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.CAP(r5, r7, r4, r0)
                goto L_0x04dd
            L_0x04a3:
                r6 = 1
                java.lang.String r5 = r0.readString()
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.CHL(r5, r4, r0)
                goto L_0x04dd
            L_0x04b8:
                r6 = 1
                java.lang.String r2 = r0.readString()
                android.os.Bundle r0 = A00(r0)
                r8.BsK(r2, r0)
                goto L_0x04dd
            L_0x04c5:
                r6 = 1
                android.os.Parcelable$Creator r2 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
                java.lang.Object r5 = X.C86114wI.A0d(r0, r2)
                com.facebook.iabeventlogging.model.IABEvent r5 = (com.facebook.iabeventlogging.model.IABEvent) r5
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r2 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.C86114wI.A0d(r0, r2)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.C1p(r5, r4, r0)
            L_0x04dd:
                r1.writeNoException()
                goto L_0x0518
            L_0x04e1:
                r6 = 1
                java.lang.String r9 = r0.readString()
                java.lang.String r10 = r0.readString()
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.lang.String r13 = r0.readString()
                boolean r0 = r8.BNS(r9, r10, r11, r12, r13)
                goto L_0x0512
            L_0x04fb:
                r6 = 1
                java.lang.String r2 = r0.readString()
                java.lang.String r0 = r0.readString()
                boolean r0 = r8.BNa(r2, r0)
                goto L_0x0512
            L_0x0509:
                r6 = 1
                java.lang.String r0 = r0.readString()
                int r0 = r8.BNL(r0)
            L_0x0512:
                r1.writeNoException()
                r1.writeInt(r0)
            L_0x0518:
                r0 = -399314222(0xffffffffe832f2d2, float:-3.380242E24)
                X.C14030oh.A0A(r0, r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.ipc.BrowserLiteCallback.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void AAz(String str, Map map, Bundle bundle, ZonePolicy zonePolicy);

    void ACq(Bundle bundle);

    void AHV();

    boolean AM3(String str, String str2, boolean z);

    int AM4(String str, String str2, int i);

    long AM5(String str, String str2, long j);

    void AM6(String str, String str2, boolean z);

    void AM7(String str, String str2, int i);

    void AM8(String str, String str2, long j);

    void AMH(AutofillContactDataCallback autofillContactDataCallback);

    void AMI(AutofillScriptCallback$Stub$Proxy autofillScriptCallback$Stub$Proxy);

    void AMJ();

    PrefetchCacheEntry B2n(String str);

    List B2o();

    void BN4(String str);

    int BNL(String str);

    boolean BNO(String str, Bundle bundle, ZonePolicy zonePolicy);

    boolean BNS(String str, String str2, String str3, String str4, String str5);

    boolean BNT(String str);

    void BNW(String str, String str2, Bundle bundle);

    boolean BNa(String str, String str2);

    void BNb(Bundle bundle);

    void BPT();

    void BPW();

    void BYY(Bundle bundle, ShopsLiteEligibilityCallback$Stub$Proxy shopsLiteEligibilityCallback$Stub$Proxy);

    void BZX(String str, IsUrlSavedCallback$Stub$Proxy isUrlSavedCallback$Stub$Proxy);

    void BaR(String str);

    void BbQ(String str);

    void BbS(String str, Map map, Bundle bundle, ZonePolicy zonePolicy);

    void Bbo(String str);

    void Bcx(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2, Bundle bundle, ZonePolicy zonePolicy);

    void BdA(Bundle bundle);

    void Bdc(String str, String str2);

    void Bdu(long j, String str, String str2);

    String BfW(String str);

    void BiJ(Bundle bundle);

    void Blw(String str, AutofillOptOutCallback autofillOptOutCallback);

    void BsK(String str, Bundle bundle);

    void BxD(String str, String str2, Map map, Bundle bundle, ZonePolicy zonePolicy);

    void BxS(String str);

    void BzT();

    void C1n(String str, List list);

    void C1p(IABEvent iABEvent, Bundle bundle, ZonePolicy zonePolicy);

    void C3w(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void C7o(String str, String str2);

    void C7p(String str, String str2, String str3, String str4, MoreInfoCallback$Stub$Proxy moreInfoCallback$Stub$Proxy);

    void C9W(Map map);

    void C9a(Bundle bundle);

    void C9x(String str, Bundle bundle, int i);

    void CA0(String str, Bundle bundle, int i, long j);

    void CA9(String str, String str2, Bundle bundle);

    void CAP(String str, boolean z, Bundle bundle, ZonePolicy zonePolicy);

    void CED(Map map);

    void CHL(String str, Bundle bundle, ZonePolicy zonePolicy);

    void CJy();

    void CQs(String str, String str2, MoreInfoCallback$Stub$Proxy moreInfoCallback$Stub$Proxy);

    void CS1(Bundle bundle, String str);

    void CS7(Map map, Bundle bundle);

    void CVd();

    void CVg(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback);

    void CVh(Bundle bundle);

    void CVj();

    void CVk();

    void Cdd(long[] jArr, Bundle bundle);

    void CeQ();

    void Cku();

    void CnQ(String str);

    void Cwx();

    void D88(Bundle bundle);

    void D8x(int i);
}
