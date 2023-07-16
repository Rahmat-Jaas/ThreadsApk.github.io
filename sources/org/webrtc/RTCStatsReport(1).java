package org.webrtc;

import X.C18180wK;
import X.C18190wL;
import java.util.Map;

public class RTCStatsReport {
    public final Map stats;
    public final long timestampUs;

    public static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("{ timestampUs: ");
        A0s.append(this.timestampUs);
        A0s.append(", stats: [\n");
        boolean z = true;
        for (Object next : this.stats.values()) {
            if (!z) {
                A0s.append(",\n");
            }
            A0s.append(next);
            z = false;
        }
        return C18180wK.A0i(" ] }", A0s);
    }

    public RTCStatsReport(long j, Map map) {
        this.timestampUs = j;
        this.stats = map;
    }
}
