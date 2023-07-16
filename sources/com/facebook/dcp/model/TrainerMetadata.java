package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class TrainerMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final ExampleSource A04;
    public final LogLevel A05;
    public final Map A06;
    public final Map A07;
    public final boolean A08;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return TrainerMetadata$$serializer.INSTANCE;
        }
    }

    public TrainerMetadata() {
        this((ExampleSource) null, (LogLevel) null, (Map) null, (Map) null, 511, 0, 0, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrainerMetadata) {
                TrainerMetadata trainerMetadata = (TrainerMetadata) obj;
                if (!(C04220Ms.A0I(this.A06, trainerMetadata.A06) && C04220Ms.A0I(this.A07, trainerMetadata.A07) && this.A08 == trainerMetadata.A08 && this.A04 == trainerMetadata.A04 && this.A03 == trainerMetadata.A03 && this.A01 == trainerMetadata.A01 && this.A02 == trainerMetadata.A02 && this.A00 == trainerMetadata.A00 && C04220Ms.A0I(this.A05, trainerMetadata.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ TrainerMetadata(ExampleSource exampleSource, LogLevel logLevel, Map map, Map map2, int i, long j, long j2, long j3, long j4, boolean z) {
        boolean z2 = z;
        this.A06 = (i & 1) == 0 ? AnonymousClass4WJ.A0A() : map;
        this.A07 = (i & 2) == 0 ? AnonymousClass4WJ.A0A() : map2;
        this.A08 = (i & 4) == 0 ? true : z2;
        this.A04 = (i & 8) == 0 ? ExampleSource.COMBINE : exampleSource;
        this.A03 = (i & 16) == 0 ? 600 : j;
        this.A01 = (i & 32) == 0 ? 3600 : j2;
        this.A02 = (i & 64) == 0 ? 0 : j3;
        this.A00 = (i & 128) == 0 ? 30 : j4;
        this.A05 = (i & 256) == 0 ? new LogLevel(0) : logLevel;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A07, C18210wN.A04(this.A06));
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A05, C86104wH.A06(C86104wH.A06(C86104wH.A06(C86104wH.A06(AnonymousClass0wJ.A05(this.A04, (A052 + (z ? 1 : 0)) * 31), this.A03), this.A01), this.A02), this.A00));
    }

    public /* synthetic */ TrainerMetadata(ExampleSource exampleSource, LogLevel logLevel, Map map, Map map2, int i, long j, long j2, long j3, boolean z) {
        long j4;
        map = (i & 1) != 0 ? AnonymousClass4WJ.A0A() : map;
        map2 = (i & 2) != 0 ? AnonymousClass4WJ.A0A() : map2;
        boolean A1Z = C86154wM.A1Z(i & 4, z);
        exampleSource = (i & 8) != 0 ? ExampleSource.COMBINE : exampleSource;
        j = (i & 16) != 0 ? 600 : j;
        j2 = (i & 32) != 0 ? 3600 : j2;
        j3 = (i & 64) != 0 ? 0 : j3;
        if ((i & 128) != 0) {
            j4 = 30;
        } else {
            j4 = 0;
        }
        logLevel = (i & 256) != 0 ? new LogLevel(0) : logLevel;
        AnonymousClass0wJ.A1O(map, map2);
        C86114wI.A1I(exampleSource, 4, logLevel);
        this.A06 = map;
        this.A07 = map2;
        this.A08 = A1Z;
        this.A04 = exampleSource;
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A05 = logLevel;
    }
}
