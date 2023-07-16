package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86114wI;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class FeatureMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public String A00;
    public final int A01;
    public final int A02;
    public final DcpData A03;
    public final FeatureSource A04;
    public final LogLevel A05;
    public final Type A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return FeatureMetadata$$serializer.INSTANCE;
        }
    }

    public FeatureMetadata() {
        this((DcpData) null, (FeatureSource) null, (LogLevel) null, (Type) null, (String) null, (List) null, 0, 2047);
    }

    public /* synthetic */ FeatureMetadata(DcpData dcpData, FeatureSource featureSource, LogLevel logLevel, Type type, String str, String str2, String str3, String str4, List list, int i, int i2, int i3) {
        this.A08 = (i & 1) == 0 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : str;
        this.A06 = (i & 2) == 0 ? Type.STRING : type;
        this.A03 = (i & 4) == 0 ? C86114wI.A0J() : dcpData;
        this.A0A = (i & 8) == 0 ? AnonymousClass0ZV.A00 : list;
        this.A04 = (i & 16) == 0 ? FeatureSource.PREFER_CLIENT : featureSource;
        this.A01 = (i & 32) == 0 ? 30 : i2;
        this.A05 = (i & 64) == 0 ? new LogLevel(0) : logLevel;
        this.A09 = (i & 128) == 0 ? "" : str2;
        if ((i & 256) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str3;
        }
        if ((i & 512) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str4;
        }
        if ((i & 1024) == 0) {
            this.A02 = 0;
        } else {
            this.A02 = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeatureMetadata) {
                FeatureMetadata featureMetadata = (FeatureMetadata) obj;
                if (!C04220Ms.A0I(this.A08, featureMetadata.A08) || this.A06 != featureMetadata.A06 || !C04220Ms.A0I(this.A03, featureMetadata.A03) || !C04220Ms.A0I(this.A0A, featureMetadata.A0A) || this.A04 != featureMetadata.A04 || this.A01 != featureMetadata.A01 || !C04220Ms.A0I(this.A05, featureMetadata.A05) || !C04220Ms.A0I(this.A09, featureMetadata.A09) || !C04220Ms.A0I(this.A00, featureMetadata.A00) || !C04220Ms.A0I(this.A07, featureMetadata.A07) || this.A02 != featureMetadata.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A08);
        int A052 = AnonymousClass0wJ.A05(this.A0A, (AnonymousClass0wJ.A05(this.A06, A032) + AnonymousClass0wJ.A03(this.A03)) * 31);
        return ((((AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A05(this.A05, (AnonymousClass0wJ.A05(this.A04, A052) + this.A01) * 31)) + AnonymousClass0wJ.A06(this.A00)) * 31) + C18200wM.A09(this.A07)) * 31) + this.A02;
    }

    public /* synthetic */ FeatureMetadata(DcpData dcpData, FeatureSource featureSource, LogLevel logLevel, Type type, String str, List list, int i, int i2) {
        String str2;
        LogLevel logLevel2 = logLevel;
        int i3 = i;
        FeatureSource featureSource2 = featureSource;
        List list2 = list;
        DcpData dcpData2 = dcpData;
        Type type2 = type;
        int i4 = i2;
        String str3 = (i2 & 1) != 0 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : str;
        type2 = (i2 & 2) != 0 ? Type.STRING : type2;
        dcpData2 = (i2 & 4) != 0 ? new DcpData((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0.0d, 32767, 0) : dcpData2;
        list2 = (i2 & 8) != 0 ? AnonymousClass0ZV.A00 : list2;
        featureSource2 = (i2 & 16) != 0 ? FeatureSource.PREFER_CLIENT : featureSource2;
        i3 = (i2 & 32) != 0 ? 30 : i3;
        logLevel2 = (i2 & 64) != 0 ? new LogLevel(0) : logLevel2;
        if ((i4 & 128) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        AnonymousClass0wJ.A1O(str3, type2);
        C18190wL.A1S(list2, 4, featureSource2);
        C18210wN.A1M(logLevel2, 7, str2);
        this.A08 = str3;
        this.A06 = type2;
        this.A03 = dcpData2;
        this.A0A = list2;
        this.A04 = featureSource2;
        this.A01 = i3;
        this.A05 = logLevel2;
        this.A09 = str2;
        this.A00 = null;
        this.A07 = null;
        this.A02 = 0;
    }
}
