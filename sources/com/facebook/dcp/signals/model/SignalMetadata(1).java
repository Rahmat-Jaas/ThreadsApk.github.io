package com.facebook.dcp.signals.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import com.facebook.common.dextricks.Constants;
import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.LogLevel;
import com.facebook.dcp.model.Type;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class SignalMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public String A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final DcpData A06;
    public final LogLevel A07;
    public final Type A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return SignalMetadata$$serializer.INSTANCE;
        }
    }

    public SignalMetadata() {
        this((DcpData) null, (Type) null, (String) null, (String) null, (String) null, 0, 0, 262143, 0, 0, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalMetadata) {
                SignalMetadata signalMetadata = (SignalMetadata) obj;
                if (!(C04220Ms.A0I(this.A0B, signalMetadata.A0B) && C04220Ms.A0I(this.A0D, signalMetadata.A0D) && this.A08 == signalMetadata.A08 && C04220Ms.A0I(this.A06, signalMetadata.A06) && C04220Ms.A0I(this.A0C, signalMetadata.A0C) && C04220Ms.A0I(this.A0A, signalMetadata.A0A) && this.A0F == signalMetadata.A0F && this.A0G == signalMetadata.A0G && this.A0H == signalMetadata.A0H && this.A02 == signalMetadata.A02 && this.A01 == signalMetadata.A01 && C04220Ms.A0I(this.A00, signalMetadata.A00) && C04220Ms.A0I(this.A09, signalMetadata.A09) && C04220Ms.A0I(this.A07, signalMetadata.A07) && this.A0E == signalMetadata.A0E && this.A05 == signalMetadata.A05 && this.A03 == signalMetadata.A03 && this.A04 == signalMetadata.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SignalMetadata(DcpData dcpData, Type type, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        LogLevel logLevel;
        long j4 = j3;
        int i4 = i3;
        long j5 = j2;
        long j6 = j;
        String str4 = str3;
        int i5 = i2;
        int i6 = i;
        DcpData dcpData2 = dcpData;
        Type type2 = type;
        String str5 = str2;
        String str6 = (i3 & 1) != 0 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : str;
        str5 = (i3 & 2) != 0 ? "0.0.0" : str5;
        type2 = (i3 & 4) != 0 ? Type.STRING : type2;
        dcpData2 = (i3 & 8) != 0 ? new DcpData((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0.0d, 32767, 0) : dcpData2;
        String str7 = "";
        String str8 = (i3 & 16) != 0 ? str7 : null;
        str7 = (i3 & 32) == 0 ? null : str7;
        boolean A1V = C18180wK.A1V(i3 & 64);
        boolean A1V2 = C18180wK.A1V(i4 & 128);
        boolean A1R = C18240wQ.A1R(i4 & 256, z);
        i6 = (i4 & 512) != 0 ? 0 : i6;
        i5 = (i4 & 1024) != 0 ? 30 : i5;
        str4 = (i4 & 2048) != 0 ? null : str4;
        if ((i4 & 8192) != 0) {
            logLevel = new LogLevel(0);
        } else {
            logLevel = null;
        }
        boolean A1V3 = C18180wK.A1V(i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        j6 = (i3 & 32768) != 0 ? 600 : j6;
        j5 = (i3 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? 3600 : j5;
        j4 = (i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? 0 : j4;
        AnonymousClass0wJ.A1O(str6, str5);
        C18190wL.A1S(type2, 3, str8);
        C04220Ms.A0B(str7, 6);
        C04220Ms.A0B(logLevel, 14);
        this.A0B = str6;
        this.A0D = str5;
        this.A08 = type2;
        this.A06 = dcpData2;
        this.A0C = str8;
        this.A0A = str7;
        this.A0F = A1V;
        this.A0G = A1V2;
        this.A0H = A1R;
        this.A02 = i6;
        this.A01 = i5;
        this.A00 = str4;
        this.A09 = null;
        this.A07 = logLevel;
        this.A0E = A1V3;
        this.A05 = j6;
        this.A03 = j5;
        this.A04 = j4;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A0D, C18180wK.A03(this.A0B));
        int A073 = AnonymousClass0wJ.A07(this.A0A, AnonymousClass0wJ.A07(this.A0C, (AnonymousClass0wJ.A05(this.A08, A072) + AnonymousClass0wJ.A03(this.A06)) * 31));
        boolean z = this.A0F;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A073 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A0G;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A0H;
        if (z3) {
            z3 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A07, (((((((((i3 + (z3 ? 1 : 0)) * 31) + this.A02) * 31) + this.A01) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31) + C18200wM.A09(this.A09)) * 31);
        if (!this.A0E) {
            i = 0;
        }
        return C86134wK.A06(C86104wH.A06(C86104wH.A06((A052 + i) * 31, this.A05), this.A03), this.A04);
    }

    public /* synthetic */ SignalMetadata(DcpData dcpData, LogLevel logLevel, Type type, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        String str7 = str2;
        int i4 = i;
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        int i5 = i3;
        this.A0B = (i & 1) == 0 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : str;
        this.A0D = (i & 2) == 0 ? "0.0.0" : str7;
        this.A08 = (i & 4) == 0 ? Type.STRING : type;
        this.A06 = (i & 8) == 0 ? C86114wI.A0J() : dcpData;
        if ((i & 16) == 0) {
            this.A0C = "";
        } else {
            this.A0C = str3;
        }
        if ((i & 32) == 0) {
            this.A0A = "";
        } else {
            this.A0A = str4;
        }
        if ((i & 64) == 0) {
            this.A0F = true;
        } else {
            this.A0F = z;
        }
        if ((i4 & 128) == 0) {
            this.A0G = true;
        } else {
            this.A0G = z2;
        }
        if ((i4 & 256) == 0) {
            this.A0H = false;
        } else {
            this.A0H = z3;
        }
        if ((i4 & 512) == 0) {
            this.A02 = 0;
        } else {
            this.A02 = i2;
        }
        this.A01 = (i4 & 1024) == 0 ? 30 : i5;
        if ((i4 & 2048) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str5;
        }
        if ((i4 & 4096) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str6;
        }
        this.A07 = (i4 & 8192) == 0 ? new LogLevel(0) : logLevel;
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0) {
            this.A0E = true;
        } else {
            this.A0E = z4;
        }
        this.A05 = (32768 & i) == 0 ? 600 : j6;
        this.A03 = (65536 & i) == 0 ? 3600 : j5;
        this.A04 = (i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) == 0 ? 0 : j4;
    }
}
