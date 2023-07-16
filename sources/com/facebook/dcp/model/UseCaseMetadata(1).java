package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C86104wH;
import X.C86134wK;
import X.C86154wM;
import com.facebook.common.dextricks.Constants;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class UseCaseMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final long A00;
    public final long A01;
    public final DcpContext A02;
    public final DcpContext A03;
    public final DcpContext A04;
    public final PredictorMetadata A05;
    public final TrainerMetadata A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final Map A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return UseCaseMetadata$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UseCaseMetadata) {
                UseCaseMetadata useCaseMetadata = (UseCaseMetadata) obj;
                if (!C04220Ms.A0I(this.A07, useCaseMetadata.A07) || !C04220Ms.A0I(this.A0B, useCaseMetadata.A0B) || !C04220Ms.A0I(this.A0A, useCaseMetadata.A0A) || !C04220Ms.A0I(this.A08, useCaseMetadata.A08) || !C04220Ms.A0I(this.A09, useCaseMetadata.A09) || this.A0F != useCaseMetadata.A0F || this.A01 != useCaseMetadata.A01 || this.A0E != useCaseMetadata.A0E || !C04220Ms.A0I(this.A0C, useCaseMetadata.A0C) || !C04220Ms.A0I(this.A0D, useCaseMetadata.A0D) || !C04220Ms.A0I(this.A05, useCaseMetadata.A05) || !C04220Ms.A0I(this.A06, useCaseMetadata.A06) || !C04220Ms.A0I(this.A04, useCaseMetadata.A04) || !C04220Ms.A0I(this.A03, useCaseMetadata.A03) || !C04220Ms.A0I(this.A02, useCaseMetadata.A02) || this.A00 != useCaseMetadata.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A07(this.A08, AnonymousClass0wJ.A07(this.A0A, AnonymousClass0wJ.A07(this.A0B, C18180wK.A03(this.A07)))));
        boolean z = this.A0F;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = C86104wH.A06((A072 + (z ? 1 : 0)) * 31, this.A01);
        if (!this.A0E) {
            i = 0;
        }
        return C86134wK.A06(AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A06, AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A0D, AnonymousClass0wJ.A05(this.A0C, (A062 + i) * 31))))))), this.A00);
    }

    public /* synthetic */ UseCaseMetadata(DcpContext dcpContext, DcpContext dcpContext2, DcpContext dcpContext3, PredictorMetadata predictorMetadata, TrainerMetadata trainerMetadata, String str, String str2, String str3, String str4, String str5, List list, Map map, int i, long j, long j2, boolean z, boolean z2) {
        long j3 = j2;
        int i2 = i;
        DcpContext dcpContext4 = dcpContext3;
        String str6 = str2;
        String str7 = str3;
        String str8 = str5;
        boolean z3 = z;
        TrainerMetadata trainerMetadata2 = trainerMetadata;
        long j4 = j;
        DcpContext dcpContext5 = dcpContext2;
        Map map2 = map;
        PredictorMetadata predictorMetadata2 = predictorMetadata;
        String str9 = str4;
        List list2 = list;
        DcpContext dcpContext6 = dcpContext;
        this.A07 = (i & 1) == 0 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : str;
        this.A0B = (i & 2) == 0 ? "test" : str6;
        this.A0A = (i & 4) == 0 ? "" : str7;
        this.A08 = (i & 8) == 0 ? "default_model_name" : str9;
        this.A09 = (i & 16) == 0 ? "1.0" : str8;
        this.A0F = (i & 32) == 0 ? true : z3;
        this.A01 = (i & 64) == 0 ? -1 : j4;
        if ((i2 & 128) == 0) {
            this.A0E = false;
        } else {
            this.A0E = z2;
        }
        this.A0C = (i2 & 256) == 0 ? AnonymousClass0ZV.A00 : list2;
        this.A0D = (i2 & 512) == 0 ? AnonymousClass4WJ.A0A() : map2;
        this.A05 = (i2 & 1024) == 0 ? new PredictorMetadata(ExampleSource.COMBINE, new LogLevel(0), "model_name", "asset_name", AnonymousClass4WJ.A0A(), 0.5d, 1.0d, 0, 600, 3600, 0, 0, 0, false, true, false) : predictorMetadata2;
        this.A06 = (i2 & 2048) == 0 ? new TrainerMetadata((ExampleSource) null, (LogLevel) null, (Map) null, (Map) null, 511, 0, 0, 0, false) : trainerMetadata2;
        this.A04 = (i2 & 4096) == 0 ? DcpContext.A05 : dcpContext6;
        this.A03 = (i2 & 8192) == 0 ? DcpContext.A05 : dcpContext5;
        this.A02 = (i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0 ? DcpContext.A05 : dcpContext4;
        this.A00 = (i & 32768) == 0 ? 30 : j3;
    }

    public UseCaseMetadata(DcpContext dcpContext, DcpContext dcpContext2, DcpContext dcpContext3, PredictorMetadata predictorMetadata, TrainerMetadata trainerMetadata, String str, String str2, String str3, String str4, String str5, List list, Map map, long j, long j2, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        C86154wM.A1R(str5, 5, predictorMetadata);
        this.A07 = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0F = z;
        this.A01 = j;
        this.A0E = z2;
        this.A0C = list;
        this.A0D = map;
        this.A05 = predictorMetadata;
        this.A06 = trainerMetadata;
        this.A04 = dcpContext;
        this.A03 = dcpContext2;
        this.A02 = dcpContext3;
        this.A00 = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UseCaseMetadata() {
        /*
            r53 = this;
            r41 = 0
            java.lang.String r31 = "1"
            java.lang.String r32 = "test"
            java.lang.String r33 = ""
            java.lang.String r34 = "default_model_name"
            java.lang.String r35 = "1.0"
            r24 = 1
            r38 = -1
            r0 = 0
            X.0ZV r36 = X.AnonymousClass0ZV.A00
            java.util.Map r37 = X.AnonymousClass4WJ.A0A()
            java.util.Map r6 = X.AnonymousClass4WJ.A0A()
            java.lang.String r4 = "model_name"
            r11 = 0
            java.lang.String r5 = "asset_name"
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.facebook.dcp.model.ExampleSource r2 = com.facebook.dcp.model.ExampleSource.COMBINE
            r13 = 600(0x258, double:2.964E-321)
            r15 = 3600(0xe10, double:1.7786E-320)
            com.facebook.dcp.model.LogLevel r3 = new com.facebook.dcp.model.LogLevel
            r3.<init>(r0)
            com.facebook.dcp.model.PredictorMetadata r1 = new com.facebook.dcp.model.PredictorMetadata
            r17 = r11
            r19 = r11
            r21 = r11
            r23 = r0
            r25 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r13, r15, r17, r19, r21, r23, r24, r25)
            r45 = 511(0x1ff, float:7.16E-43)
            com.facebook.dcp.model.TrainerMetadata r30 = new com.facebook.dcp.model.TrainerMetadata
            r40 = r30
            r42 = r41
            r43 = r41
            r44 = r41
            r46 = r11
            r48 = r11
            r50 = r11
            r52 = r0
            r40.<init>(r41, r42, r43, r44, r45, r46, r48, r50, r52)
            com.facebook.dcp.model.DcpContext r26 = com.facebook.dcp.model.DcpContext.A05
            r40 = 30
            r25 = r53
            r27 = r26
            r28 = r26
            r29 = r1
            r42 = r24
            r43 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.UseCaseMetadata.<init>():void");
    }
}
