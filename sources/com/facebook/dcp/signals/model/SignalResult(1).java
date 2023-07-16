package com.facebook.dcp.signals.model;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C86104wH;
import X.C86164wN;
import com.facebook.dcp.model.DcpContext;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class SignalResult extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final long A00;
    public final DcpContext A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return SignalResult$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalResult) {
                SignalResult signalResult = (SignalResult) obj;
                if (!C04220Ms.A0I(this.A03, signalResult.A03) || !C04220Ms.A0I(this.A04, signalResult.A04) || !C04220Ms.A0I(this.A06, signalResult.A06) || !C04220Ms.A0I(this.A05, signalResult.A05) || !C04220Ms.A0I(this.A08, signalResult.A08) || !C04220Ms.A0I(this.A07, signalResult.A07) || !C04220Ms.A0I(this.A02, signalResult.A02) || this.A00 != signalResult.A00 || !C04220Ms.A0I(this.A01, signalResult.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A06((AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A05(this.A08, AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A06, (C18180wK.A03(this.A03) + AnonymousClass0wJ.A06(this.A04)) * 31)))) + AnonymousClass0wJ.A06(this.A02)) * 31, this.A00) + C18200wM.A07(this.A01);
    }

    public /* synthetic */ SignalResult(DcpContext dcpContext, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, int i, long j) {
        this.A03 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str2;
        }
        if ((i & 4) == 0) {
            this.A06 = AnonymousClass4WJ.A0A();
        } else {
            this.A06 = map;
        }
        if ((i & 8) == 0) {
            this.A05 = AnonymousClass4WJ.A0A();
        } else {
            this.A05 = map2;
        }
        if ((i & 16) == 0) {
            this.A08 = AnonymousClass4WJ.A0A();
        } else {
            this.A08 = map3;
        }
        if ((i & 32) == 0) {
            this.A07 = AnonymousClass4WJ.A0A();
        } else {
            this.A07 = map4;
        }
        if ((i & 64) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str3;
        }
        if ((i & 128) == 0) {
            this.A00 = 0;
        } else {
            this.A00 = j;
        }
        if ((i & 256) == 0) {
            this.A01 = null;
        } else {
            this.A01 = dcpContext;
        }
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(AnonymousClass00U.A0L("(id:", this.A03));
        Map map = this.A06;
        if (C86164wN.A1R(map)) {
            A0r.append(AnonymousClass0wJ.A0t(",L: ", map));
        }
        Map map2 = this.A05;
        if (C86164wN.A1R(map2)) {
            A0r.append(AnonymousClass0wJ.A0t(",F: ", map2));
        }
        Map map3 = this.A08;
        if (C86164wN.A1R(map3)) {
            A0r.append(AnonymousClass0wJ.A0t(",S: ", map3));
        }
        Map map4 = this.A07;
        if (C86164wN.A1R(map4)) {
            A0r.append(AnonymousClass0wJ.A0t(",SL: ", map4));
        }
        String A0i = C18180wK.A0i(")", A0r);
        C04220Ms.A06(A0i);
        return A0i;
    }

    public SignalResult(DcpContext dcpContext, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, long j) {
        C04220Ms.A0B(str, 1);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = map;
        this.A05 = map2;
        this.A08 = map3;
        this.A07 = map4;
        this.A02 = str3;
        this.A00 = j;
        this.A01 = dcpContext;
    }

    public SignalResult() {
        this((DcpContext) null, "", (String) null, (String) null, AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), 0);
    }
}
