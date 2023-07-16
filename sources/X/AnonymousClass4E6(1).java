package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4E6  reason: invalid class name */
public final class AnonymousClass4E6 implements C28017Ex7 {
    public Map A00;
    public AnonymousClass0ZU A01;
    public boolean A02;
    public long A03 = System.currentTimeMillis();
    public final C58323Ez A04;
    public final boolean A05;

    public final void Cl8(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
    }

    public final List AiT() {
        return (List) this.A01.invoke();
    }

    public final int Ay4() {
        Collection<Iterable> values = this.A00.values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Iterable A0N : values) {
            C000300e.A0r(AnonymousClass00J.A0N(A0N), A0v);
        }
        return A0v.size();
    }

    public final List B9s() {
        Map map = this.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2 : (Iterable) C18180wK.A0o(A0z).getValue()) {
                String str = ktCSuperShape0S2010000_I2.A00;
                if (str != null) {
                    A0v2.add(str);
                }
            }
            C000300e.A0r(A0v2, A0v);
        }
        return A0v;
    }

    public final void D9i(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2, boolean z) {
        Map map = this.A00;
        Object obj = map.get(ktCSuperShape0S1200000_I2);
        if (obj == null) {
            obj = AnonymousClass0wJ.A0v();
            map.put(ktCSuperShape0S1200000_I2, obj);
        }
        List list = (List) obj;
        if (ktCSuperShape0S1200000_I2.A01 == AnonymousClass006.A00) {
            list.clear();
        }
        if (z) {
            list.add(ktCSuperShape0S2010000_I2);
        } else {
            list.remove(ktCSuperShape0S2010000_I2);
        }
    }

    public final void clear() {
        this.A00.clear();
    }

    public AnonymousClass4E6(C58323Ez r4, UserSession userSession, AnonymousClass0ZU r6) {
        AnonymousClass0wJ.A1O(userSession, r6);
        C04220Ms.A0B(r4, 3);
        this.A01 = r6;
        this.A04 = r4;
        this.A05 = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327288656111564L);
        this.A00 = C18220wO.A0y();
    }

    public final Map A00() {
        LinkedHashMap A0y = C18220wO.A0y();
        for (KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 : AiT()) {
            for (KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2 : (Iterable) ktCSuperShape0S1200000_I2.A00) {
                if (ktCSuperShape0S2010000_I2.A02) {
                    Object obj = A0y.get(ktCSuperShape0S1200000_I2);
                    if (obj == null) {
                        obj = AnonymousClass0wJ.A0v();
                        A0y.put(ktCSuperShape0S1200000_I2, obj);
                    }
                    ((List) obj).add(ktCSuperShape0S2010000_I2);
                }
            }
        }
        return A0y;
    }

    public final boolean ADA() {
        if (Ay4() != 0) {
            if ((System.currentTimeMillis() - this.A03) / ((long) 1000) <= 300 || (this.A05 && !this.A02)) {
                this.A02 = false;
            } else {
                clear();
                this.A02 = false;
                C58323Ez r0 = this.A04;
                List B9s = B9s();
                List AR7 = AR7();
                List ASR = ASR();
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r0.A00, r0.A01), "instagram_af_filter_events_v2"), 1686);
                C18230wP.A1G(A0I, "filters_cleared_timer");
                if (AR7 == null) {
                    AR7 = AnonymousClass0ZV.A00;
                }
                A0I.A0U("current_filters", AR7);
                if (B9s == null) {
                    B9s = AnonymousClass0ZV.A00;
                }
                A0I.A0U("clicked_filters", B9s);
                if (ASR == null) {
                    ASR = AnonymousClass0ZV.A00;
                }
                A0I.A0U("filters", ASR);
                A0I.Bb4();
                return true;
            }
        }
        return false;
    }

    public final List AR7() {
        Collection<Iterable> values = A00().values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Iterable<KtCSuperShape0S2010000_I2> it : values) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2 : it) {
                String str = ktCSuperShape0S2010000_I2.A00;
                if (str != null) {
                    A0v2.add(str);
                }
            }
            C000300e.A0r(A0v2, A0v);
        }
        return A0v;
    }

    public final List ASR() {
        List<KtCSuperShape0S1200000_I2> AiT = AiT();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 : AiT) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2 : (Iterable) ktCSuperShape0S1200000_I2.A00) {
                String str = ktCSuperShape0S2010000_I2.A00;
                if (str != null) {
                    A0v2.add(str);
                }
            }
            C000300e.A0r(A0v2, A0v);
        }
        return A0v;
    }

    public final int Axv() {
        int i = 0;
        for (List size : A00().values()) {
            i += size.size();
        }
        return i;
    }

    public final String B9t() {
        List B9s = B9s();
        if (B9s.isEmpty()) {
            return null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = B9s.iterator();
        while (it.hasNext()) {
            C18220wO.A1P(A0v, it);
        }
        return AnonymousClass00J.A0H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, (CharSequence) null, (CharSequence) null, A0v, (AnonymousClass0YY) null, 62);
    }

    public final boolean BNy() {
        return C18180wK.A1X(Axv());
    }

    public final void Cl6(long j) {
        this.A03 = j;
    }
}
