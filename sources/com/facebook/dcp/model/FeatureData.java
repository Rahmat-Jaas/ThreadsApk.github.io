package com.facebook.dcp.model;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass6D1;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18210wN;
import X.C18240wQ;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class FeatureData extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final double A00;
    public final long A01;
    public final Type A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return FeatureData$$serializer.INSTANCE;
        }
    }

    public FeatureData() {
        this((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16383, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C04220Ms.A0I(C86144wL.A0a(obj), getClass())) {
            return false;
        }
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.dcp.model.FeatureData");
        FeatureData featureData = (FeatureData) obj;
        return C04220Ms.A0I(this.A03, featureData.A03) && this.A02 == featureData.A02 && C04220Ms.A0I(A00(), featureData.A00());
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, double d, int i, long j, boolean z) {
        Type type2 = type;
        List list5 = list;
        String str3 = str2;
        List list6 = list4;
        List list7 = list3;
        List list8 = list2;
        Map map5 = map3;
        Map map6 = map2;
        Map map7 = map;
        Map map8 = map4;
        double d2 = d;
        int i2 = i;
        long j2 = j;
        String str4 = (i & 1) != 0 ? "" : str;
        type2 = (i & 2) != 0 ? Type.DOUBLE : type2;
        j2 = (i & 4) != 0 ? -1 : j2;
        d2 = (i & 8) != 0 ? -1.0d : d2;
        str3 = (i & 16) != 0 ? null : str3;
        boolean A1R = C18240wQ.A1R(i & 32, z);
        list5 = (i & 64) != 0 ? AnonymousClass0ZV.A00 : list5;
        list8 = (i2 & 128) != 0 ? AnonymousClass0ZV.A00 : list8;
        list7 = (i2 & 256) != 0 ? AnonymousClass0ZV.A00 : list7;
        list6 = (i2 & 512) != 0 ? AnonymousClass0ZV.A00 : list6;
        map7 = (i2 & 1024) != 0 ? AnonymousClass4WJ.A0A() : map7;
        map6 = (i2 & 2048) != 0 ? AnonymousClass4WJ.A0A() : map6;
        map5 = (i2 & 4096) != 0 ? AnonymousClass4WJ.A0A() : map5;
        map8 = (i2 & 8192) != 0 ? AnonymousClass4WJ.A0A() : map8;
        AnonymousClass0wJ.A1O(str4, type2);
        C18210wN.A1M(list5, 7, list8);
        C86104wH.A1Q(list7, list6, map7);
        C86124wJ.A1A(12, map6, map5, map8);
        this.A03 = str4;
        this.A02 = type2;
        this.A01 = j2;
        this.A00 = d2;
        this.A04 = str3;
        this.A0D = A1R;
        this.A07 = list5;
        this.A06 = list8;
        this.A08 = list7;
        this.A05 = list6;
        this.A0B = map7;
        this.A0A = map6;
        this.A0C = map5;
        this.A09 = map8;
    }

    public final String A00() {
        String valueOf;
        Object obj;
        switch (this.A02.ordinal()) {
            case 0:
                valueOf = String.valueOf(this.A01);
                break;
            case 1:
                valueOf = new BigDecimal(String.valueOf(this.A00)).toPlainString();
                break;
            case 2:
                valueOf = this.A04;
                break;
            case 3:
                valueOf = String.valueOf(this.A0D);
                break;
            case 4:
                obj = this.A08;
                break;
            case 5:
                obj = this.A07;
                break;
            case 6:
                obj = this.A06;
                break;
            case 7:
                obj = this.A05;
                break;
            case 8:
                obj = this.A0C;
                break;
            case 9:
                obj = this.A0B;
                break;
            case 10:
                obj = this.A0A;
                break;
            case 11:
                obj = this.A09;
                break;
            default:
                valueOf = "Value type unsupported";
                break;
        }
        valueOf = obj.toString();
        return String.valueOf(valueOf);
    }

    public final int hashCode() {
        return AnonymousClass00U.A0N(this.A03, A00(), '=').hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0e("(id:", this.A03, ", value:", A00(), ')');
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, AnonymousClass6D1 r31, double d, int i, long j, boolean z) {
        Type type2 = type;
        List list5 = list;
        String str3 = str2;
        List list6 = list4;
        List list7 = list3;
        List list8 = list2;
        Map map5 = map3;
        Map map6 = map2;
        Map map7 = map;
        Map map8 = map4;
        double d2 = d;
        long j2 = j;
        int i2 = i;
        this.A03 = (i & 1) == 0 ? "" : str;
        this.A02 = (i & 2) == 0 ? Type.DOUBLE : type2;
        this.A01 = (i & 4) == 0 ? -1 : j2;
        this.A00 = (i & 8) == 0 ? -1.0d : d2;
        this.A04 = (i & 16) == 0 ? null : str3;
        if ((i & 32) == 0) {
            this.A0D = false;
        } else {
            this.A0D = z;
        }
        this.A07 = (i & 64) == 0 ? AnonymousClass0ZV.A00 : list5;
        this.A06 = (i2 & 128) == 0 ? AnonymousClass0ZV.A00 : list8;
        this.A08 = (i2 & 256) == 0 ? AnonymousClass0ZV.A00 : list7;
        this.A05 = (i2 & 512) == 0 ? AnonymousClass0ZV.A00 : list6;
        this.A0B = (i2 & 1024) == 0 ? AnonymousClass4WJ.A0A() : map7;
        this.A0A = (i2 & 2048) == 0 ? AnonymousClass4WJ.A0A() : map6;
        this.A0C = (i2 & 4096) == 0 ? AnonymousClass4WJ.A0A() : map5;
        this.A09 = (i2 & 8192) == 0 ? AnonymousClass4WJ.A0A() : map8;
    }
}
