package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.63g  reason: invalid class name and case insensitive filesystem */
public final class C960463g extends AnonymousClass5NL implements C28019Ex9 {
    public final TrackData D2u() {
        HashMap hashMap;
        boolean AQU = AQU();
        String stringValueByHashCode = getStringValueByHashCode(574519571);
        String stringValueByHashCode2 = getStringValueByHashCode(-2061768941);
        String stringValueByHashCode3 = getStringValueByHashCode(1025801609);
        ImageUrl A06 = A06(-22609914);
        ImageUrl AaE = AaE();
        String stringValueByHashCode4 = getStringValueByHashCode(-220872642);
        String stringValueByHashCode5 = getStringValueByHashCode(1128191036);
        String stringValueByHashCode6 = getStringValueByHashCode(1258734948);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(55068821);
        String stringValueByHashCode7 = getStringValueByHashCode(682262252);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1988432185);
        List An8 = An8();
        String id = getId();
        String stringValueByHashCode8 = getStringValueByHashCode(1357418199);
        boolean BTh = BTh();
        String stringValueByHashCode9 = getStringValueByHashCode(1436807532);
        String stringValueByHashCode10 = getStringValueByHashCode(527639047);
        String stringValueByHashCode11 = getStringValueByHashCode(932670004);
        String stringValueByHashCode12 = getStringValueByHashCode(-2060497896);
        Map map = (Map) getTreeValueByHashCode(1595686986, AnonymousClass1Pt.class);
        if (map != null) {
            hashMap = C86164wN.A0j(map);
        } else {
            hashMap = null;
        }
        return new TrackData(A06, AaE, optionalBooleanValueByHashCode, optionalIntValueByHashCode, stringValueByHashCode, stringValueByHashCode2, stringValueByHashCode3, stringValueByHashCode4, stringValueByHashCode5, stringValueByHashCode6, stringValueByHashCode7, id, stringValueByHashCode8, stringValueByHashCode9, stringValueByHashCode10, stringValueByHashCode11, stringValueByHashCode12, AnonymousClass5NL.A05(this), getStringValueByHashCode(-310659645), hashMap, An8, AQU, BTh);
    }

    public final boolean AQU() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1545396879);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String ARL() {
        return getStringValueByHashCode(574519571);
    }

    public final String AS1() {
        return getStringValueByHashCode(1025801609);
    }

    public final ImageUrl AaD() {
        return A06(-22609914);
    }

    public final ImageUrl AaE() {
        ImageUrl A06 = A06(-45086183);
        if (A06 != null) {
            return A06;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Ac2() {
        return getStringValueByHashCode(-220872642);
    }

    public final String Ac4() {
        return getStringValueByHashCode(1128191036);
    }

    public final String AdS() {
        return getStringValueByHashCode(1258734948);
    }

    public final Integer AeI() {
        return getOptionalIntValueByHashCode(55068821);
    }

    public final Boolean Alw() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    public final List An8() {
        ImmutableList optionalIntListByHashCode = getOptionalIntListByHashCode(-1755167329);
        if (optionalIntListByHashCode != null) {
            return optionalIntListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String B4j() {
        return getStringValueByHashCode(1436807532);
    }

    public final String BH2() {
        return AnonymousClass5NL.A05(this);
    }

    public final boolean BTh() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1630845353);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String getId() {
        String A03 = AnonymousClass5NL.A03(this);
        if (A03 != null) {
            return A03;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
