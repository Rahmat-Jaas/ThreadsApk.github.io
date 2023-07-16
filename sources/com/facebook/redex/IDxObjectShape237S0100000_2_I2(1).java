package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass71E;
import X.AnonymousClass71F;
import X.AnonymousClass75V;
import X.AnonymousClass7H6;
import X.AnonymousClass7HM;
import X.AnonymousClass7JD;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kr;
import X.C04220Ms;
import X.C10300i6;
import X.C106216eg;
import X.C106226eh;
import X.C10660ii;
import X.C113766s6;
import X.C113776s7;
import X.C1198277d;
import X.C128957ke;
import X.C131607sT;
import X.C131997t9;
import X.C132107tL;
import X.C132687uL;
import X.C132697uM;
import X.C18180wK;
import X.C18200wM;
import X.C28161tl;
import X.C63803iN;
import X.C86104wH;
import X.C880756q;
import X.C92005hR;
import X.C92045hV;
import X.C92325hz;
import X.C956861v;
import X.KJB;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.fbpay.logging.LoggingContext;
import com.fbpay.theme.FBPayIcon;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtime.requeststream.PulsarScheduler;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClient;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Unit;

public class IDxObjectShape237S0100000_2_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    public IDxObjectShape237S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final Object A00(IDxObjectShape237S0100000_2_I2 iDxObjectShape237S0100000_2_I2) {
        BaseRequestStreamClient instance;
        UserSession userSession = (UserSession) iDxObjectShape237S0100000_2_I2.A00;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312535445144673L)) {
            instance = DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        } else {
            instance = DGWRequestStreamClient.getInstance(userSession);
        }
        return new PulsarScheduler(userSession, instance, new XAnalyticsAdapterHolder(new C10660ii(userSession)));
    }

    public final Object invoke() {
        FormCellLoggingEvents formCellLoggingEvents;
        FormCellLoggingEvents formCellLoggingEvents2;
        C113766s6 r3;
        C113776s7 r0;
        switch (this.A01) {
            case 0:
                C92045hV r2 = (C92045hV) this.A00;
                C92005hR r02 = r2.A01;
                if (r02 != null) {
                    r02.A09.A0H(AnonymousClass0wJ.A0v());
                    AnonymousClass7JD.A02(r2.A01.A0A, false);
                    C880756q r22 = r2.A01.A06;
                    AnonymousClass75V r03 = (AnonymousClass75V) r22.A08();
                    if (r03 != null && FBPayIcon.LOADING_SPINNER.equals(r03.A00)) {
                        r22.A0H((Object) null);
                    }
                }
                return Unit.A00;
            case 1:
                C92005hR r04 = ((C92325hz) this.A00).A04;
                C1198277d r23 = r04.A00;
                if (r23 == null || (formCellLoggingEvents = r04.A01) == null) {
                    return null;
                }
                String str = formCellLoggingEvents.A00.A03;
                C128957ke A002 = AnonymousClass7JJ.A00();
                LoggingContext loggingContext = r23.A01;
                LinkedHashMap A07 = AnonymousClass7Kr.A07(r23.A00);
                C04220Ms.A0B(loggingContext, 0);
                C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_platformautofill_init"), 349), loggingContext, A07, str, 43);
                return null;
            case 2:
                C92005hR r05 = ((C92325hz) this.A00).A04;
                C1198277d r24 = r05.A00;
                if (r24 == null || (formCellLoggingEvents2 = r05.A01) == null) {
                    return null;
                }
                String str2 = formCellLoggingEvents2.A00.A03;
                C128957ke A003 = AnonymousClass7JJ.A00();
                LoggingContext loggingContext2 = r24.A01;
                LinkedHashMap A072 = AnonymousClass7Kr.A07(r24.A00);
                C04220Ms.A0B(loggingContext2, 0);
                C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A003.A00, "client_load_platformautofill_success"), 350), loggingContext2, A072, str2, 44);
                return null;
            case 3:
                return new KJB((UserSession) this.A00);
            case 4:
                return new IgArVoltronModuleLoader((C10300i6) this.A00);
            case 5:
                return new C131997t9((C10300i6) this.A00);
            case 6:
                return new AnonymousClass7H6((UserSession) this.A00);
            case 7:
                return new C132107tL((UserSession) this.A00);
            case 8:
                return new C131607sT();
            case 9:
                return new C956861v((UserSession) this.A00);
            case 10:
                return new C106216eg((UserSession) this.A00);
            case 11:
                return new C106226eh((UserSession) this.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                UserSession userSession = (UserSession) this.A00;
                try {
                    r3 = AnonymousClass71E.parseFromJson(C18180wK.A0L(C18200wM.A0h(C28161tl.A04(userSession), "per_media_seen_state")));
                } catch (Exception unused) {
                    r3 = new C113766s6();
                }
                r3.A00 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36592404103889332L);
                return new C132697uM(r3, userSession);
            case 13:
                UserSession userSession2 = (UserSession) this.A00;
                try {
                    r0 = AnonymousClass71F.parseFromJson(C18180wK.A0L(C18200wM.A0h(C28161tl.A04(userSession2), "seen_state")));
                } catch (Exception unused2) {
                    r0 = new C113776s7();
                }
                return new C132687uL(r0, userSession2);
            case 14:
                return new AnonymousClass7HM((UserSession) this.A00);
            default:
                return A00(this);
        }
    }
}
