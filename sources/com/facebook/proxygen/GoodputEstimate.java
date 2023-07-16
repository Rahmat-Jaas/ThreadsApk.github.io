package com.facebook.proxygen;

import X.C18190wL;
import X.C18200wM;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

public class GoodputEstimate {
    public final long achievableBps;
    public final long cdfMsSinceLastUpdated;
    public final long cdfSamplesSinceInit;
    public final String cdfSrc;
    public final long ctmNumKnobFrameErrors;
    public final long ctmNumKnobFramesReceived;
    public final long ctmNumSocketObserversAttached;
    public boolean isMaximumAchievableBps;
    public final Long minRttUs;

    public long getAchievableBps() {
        return this.achievableBps;
    }

    public long getCdfMsSinceLastUpdated() {
        return this.cdfMsSinceLastUpdated;
    }

    public long getCdfSamplesSinceInit() {
        return this.cdfSamplesSinceInit;
    }

    public String getCdfSrc() {
        return this.cdfSrc;
    }

    public long getCtmNumKnobFrameErrors() {
        return this.ctmNumKnobFrameErrors;
    }

    public long getCtmNumKnobFramesReceived() {
        return this.ctmNumKnobFramesReceived;
    }

    public long getCtmNumSocketObserversAttached() {
        return this.ctmNumSocketObserversAttached;
    }

    public Long getMinRttUs() {
        return this.minRttUs;
    }

    public String getMiniDebugString() {
        long longValue;
        StringBuilder A0s = C18190wL.A0s("s=");
        A0s.append(this.cdfSrc);
        A0s.append(",mrttus=");
        Long l = this.minRttUs;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        A0s.append(longValue);
        A0s.append(",mslu=");
        A0s.append(this.cdfMsSinceLastUpdated);
        A0s.append(",ssi=");
        A0s.append(this.cdfSamplesSinceInit);
        A0s.append(",nkfr=");
        A0s.append(this.ctmNumKnobFramesReceived);
        A0s.append(",nkfe=");
        A0s.append(this.ctmNumKnobFrameErrors);
        A0s.append(",nsoa=");
        A0s.append(this.ctmNumSocketObserversAttached);
        return A0s.toString();
    }

    public boolean isMaximumAchievableBps() {
        return this.isMaximumAchievableBps;
    }

    public GoodputEstimate(long j, boolean z, Long l, String str, long j2, long j3, long j4, long j5, long j6) {
        this.achievableBps = j;
        this.isMaximumAchievableBps = z;
        this.minRttUs = l;
        this.cdfSrc = str;
        this.cdfMsSinceLastUpdated = j2;
        this.cdfSamplesSinceInit = j3;
        this.ctmNumKnobFramesReceived = j4;
        this.ctmNumKnobFrameErrors = j5;
        this.ctmNumSocketObserversAttached = j6;
    }

    public String getDebugString(boolean z) {
        long longValue;
        StringBuilder A0r = C18200wM.A0r();
        if (z) {
            A0r.append("achievableBps=");
            A0r.append(this.achievableBps);
            A0r.append(",isMaximumAchievableBps=");
            A0r.append(this.isMaximumAchievableBps ? 1 : 0);
            A0r.append(",minRttUs=");
            Long l = this.minRttUs;
            if (l == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            A0r.append(longValue);
            A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        A0r.append("cdfSrc=");
        A0r.append(this.cdfSrc);
        A0r.append(",cdfMsSinceLastUpdated=");
        A0r.append(this.cdfMsSinceLastUpdated);
        A0r.append(",cdfSamplesSinceInit=");
        A0r.append(this.cdfSamplesSinceInit);
        A0r.append(",ctmNumKnobFramesReceived=");
        A0r.append(this.ctmNumKnobFramesReceived);
        A0r.append(",ctmNumKnobFrameErrors=");
        A0r.append(this.ctmNumKnobFrameErrors);
        A0r.append(",ctmNumSocketObserversAttached=");
        A0r.append(this.ctmNumSocketObserversAttached);
        return A0r.toString();
    }

    public String getDebugString() {
        return getDebugString(false);
    }
}
