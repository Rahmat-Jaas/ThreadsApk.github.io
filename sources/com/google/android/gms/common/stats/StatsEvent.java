package com.google.android.gms.common.stats;

import X.C18180wK;
import X.C18230wP;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public final String toString() {
        String join;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.A05;
        int i = wakeLockEvent.A00;
        List list = wakeLockEvent.A0A;
        String str = wakeLockEvent.A06;
        int i2 = wakeLockEvent.A04;
        String str2 = "";
        if (list == null) {
            join = str2;
        } else {
            join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        }
        int i3 = wakeLockEvent.A01;
        String str3 = wakeLockEvent.A07;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = wakeLockEvent.A09;
        if (str4 == null) {
            str4 = str2;
        }
        float f = wakeLockEvent.A03;
        String str5 = wakeLockEvent.A08;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = wakeLockEvent.A0B;
        StringBuilder A0s = C86114wI.A0s(C86154wM.A06(str2, C86154wM.A06(str4, C86154wM.A06(str3, C86104wH.A0A(str) + 51 + C86104wH.A0A(join)))));
        A0s.append("\t");
        A0s.append(str);
        A0s.append("\t");
        A0s.append(i2);
        A0s.append("\t");
        A0s.append(join);
        A0s.append("\t");
        A0s.append(i3);
        A0s.append("\t");
        C18230wP.A1S(str3, "\t", str4, A0s);
        A0s.append("\t");
        A0s.append(f);
        A0s.append("\t");
        A0s.append(str2);
        A0s.append("\t");
        A0s.append(z);
        String obj = A0s.toString();
        StringBuilder A0s2 = C86114wI.A0s(obj.length() + 53);
        A0s2.append(j);
        A0s2.append("\t");
        A0s2.append(i);
        A0s2.append("\t");
        A0s2.append(-1);
        return C18180wK.A0i(obj, A0s2);
    }
}
