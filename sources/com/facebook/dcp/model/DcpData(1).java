package com.facebook.dcp.model;

import X.AnonymousClass000;
import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import com.facebook.common.dextricks.Constants;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class DcpData extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final double A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Type A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;
    public final boolean A0E;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return DcpData$$serializer.INSTANCE;
        }
    }

    public DcpData() {
        this((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0.0d, 32767, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C04220Ms.A0I(C86144wL.A0a(obj), getClass())) {
            return false;
        }
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.dcp.model.DcpData");
        DcpData dcpData = (DcpData) obj;
        return C04220Ms.A0I(this.A06, dcpData.A06) && this.A02 == dcpData.A02;
    }

    public /* synthetic */ DcpData(Type type, String str, String str2, List list, List list2, List list3, double d, int i, long j) {
        Map map;
        Map map2;
        Type type2 = type;
        List list4 = list;
        String str3 = str2;
        List list5 = list3;
        List list6 = list2;
        double d2 = d;
        long j2 = j;
        Map map3 = null;
        int i2 = i;
        String str4 = (i & 1) != 0 ? "" : str;
        boolean A1V = C18180wK.A1V(i & 2);
        type2 = (i & 4) != 0 ? Type.DOUBLE : type2;
        j2 = (i & 8) != 0 ? -1 : j2;
        d2 = (i & 16) != 0 ? -0.0d : d2;
        str3 = (i & 32) != 0 ? null : str3;
        list4 = (i2 & 128) != 0 ? AnonymousClass0ZV.A00 : list4;
        list6 = (i2 & 256) != 0 ? AnonymousClass0ZV.A00 : list6;
        list5 = (i2 & 512) != 0 ? AnonymousClass0ZV.A00 : list5;
        if ((i2 & 1024) != 0) {
            map = AnonymousClass4WJ.A0A();
        } else {
            map = null;
        }
        if ((i2 & 2048) != 0) {
            map2 = AnonymousClass4WJ.A0A();
        } else {
            map2 = null;
        }
        map3 = (i2 & 4096) != 0 ? AnonymousClass4WJ.A0A() : map3;
        C18180wK.A1P(str4, 1, type2);
        C04220Ms.A0B(list4, 8);
        C86104wH.A1Q(list6, list5, map);
        C04220Ms.A0B(map2, 12);
        C04220Ms.A0B(map3, 13);
        this.A06 = str4;
        this.A02 = A1V ? 1 : 0;
        this.A04 = type2;
        this.A03 = j2;
        this.A00 = d2;
        this.A07 = str3;
        this.A0E = false;
        this.A09 = list4;
        this.A08 = list6;
        this.A0A = list5;
        this.A0C = map;
        this.A0B = map2;
        this.A0D = map3;
        this.A05 = null;
        this.A01 = 0;
    }

    public final String A00() {
        String valueOf;
        Object obj;
        switch (this.A04.ordinal()) {
            case 0:
                valueOf = String.valueOf(this.A03);
                break;
            case 1:
                valueOf = String.valueOf(this.A00);
                break;
            case 2:
                valueOf = this.A07;
                break;
            case 3:
                valueOf = String.valueOf(this.A0E);
                break;
            case 4:
                obj = this.A0A;
                break;
            case 5:
                obj = this.A09;
                break;
            case 6:
                obj = this.A08;
                break;
            case 8:
                obj = this.A0D;
                break;
            case 9:
                obj = this.A0C;
                break;
            case 10:
                obj = this.A0B;
                break;
            default:
                valueOf = "Value type unsupported";
                break;
        }
        valueOf = obj.toString();
        return String.valueOf(valueOf);
    }

    public final int hashCode() {
        return AnonymousClass00U.A0R(this.A06, "v=", this.A02).hashCode();
    }

    public final String toString() {
        String A002 = A00();
        StringBuilder A0s = C18190wL.A0s("DcpData(value=");
        A0s.append(A002);
        A0s.append(", error=");
        A0s.append(this.A05);
        A0s.append(AnonymousClass000.A00(89));
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ DcpData(Type type, String str, String str2, String str3, List list, List list2, List list3, Map map, Map map2, Map map3, double d, int i, int i2, int i3, long j, boolean z) {
        Type type2 = type;
        List list4 = list2;
        List list5 = list;
        Map map4 = map2;
        Map map5 = map;
        List list6 = list3;
        Map map6 = map3;
        double d2 = d;
        long j2 = j;
        int i4 = i2;
        int i5 = i;
        this.A06 = (i & 1) == 0 ? "" : str;
        this.A02 = (i & 2) == 0 ? 1 : i4;
        this.A04 = (i & 4) == 0 ? Type.DOUBLE : type2;
        this.A03 = (i & 8) == 0 ? -1 : j2;
        this.A00 = (i & 16) == 0 ? -0.0d : d2;
        if ((i & 32) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str2;
        }
        if ((i & 64) == 0) {
            this.A0E = false;
        } else {
            this.A0E = z;
        }
        this.A09 = (i5 & 128) == 0 ? AnonymousClass0ZV.A00 : list5;
        this.A08 = (i5 & 256) == 0 ? AnonymousClass0ZV.A00 : list4;
        this.A0A = (i5 & 512) == 0 ? AnonymousClass0ZV.A00 : list6;
        this.A0C = (i5 & 1024) == 0 ? AnonymousClass4WJ.A0A() : map5;
        this.A0B = (i5 & 2048) == 0 ? AnonymousClass4WJ.A0A() : map4;
        this.A0D = (i5 & 4096) == 0 ? AnonymousClass4WJ.A0A() : map6;
        if ((i5 & 8192) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str3;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0) {
            this.A01 = 0;
        } else {
            this.A01 = i3;
        }
    }
}
