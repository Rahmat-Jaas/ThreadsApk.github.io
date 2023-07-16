package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.7bs  reason: invalid class name and case insensitive filesystem */
public final class C124867bs implements C147138nS {
    public QuickPerformanceLogger A00;
    public C108916jA A01;
    public C109796kd A02;
    public C107346gb A03;
    public C107356gc A04;
    public C107366gd A05;
    public C112706q3 A06;
    public C112706q3 A07;
    public C107396gg A08;
    public C143688h9 A09;
    public C112716q4 A0A;
    public C1194375i A0B;
    public final UserSession A0C;

    public C124867bs(QuickPerformanceLogger quickPerformanceLogger, C108916jA r2, C109796kd r3, C107346gb r4, C107356gc r5, C107366gd r6, C112706q3 r7, C107396gg r8, C143688h9 r9, C112716q4 r10, C1194375i r11, UserSession userSession) {
        this.A09 = r9;
        this.A00 = quickPerformanceLogger;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A08 = r8;
        this.A04 = r5;
        this.A01 = r2;
        this.A0A = r10;
        this.A07 = r7;
        this.A0B = r11;
        this.A0C = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        if (cls == C92815ju.class) {
            UserSession userSession = this.A0C;
            return new C92815ju(this.A04, this.A09, userSession);
        } else if (cls == C881356w.class) {
            return new C881356w(this.A09);
        } else {
            if (cls == AnonymousClass57X.class) {
                return new AnonymousClass57X(this.A09);
            }
            if (cls == AnonymousClass57Y.class) {
                return new AnonymousClass57Y(this.A09);
            }
            if (cls == C881056t.class) {
                new LinkedHashSet();
                throw C18210wN.A0W("getWidgetList");
            } else if (cls == C92835jw.class) {
                return new C92835jw(this.A06, this.A09, this.A0A, "FBPAY_HUB", new C969867m[]{C969867m.CREDIT_CARD, C969867m.PAYPAL, C969867m.DIRECT_DEBIT, C969867m.SHOP_PAY}, false, false, true);
            } else if (cls == C92725jl.class) {
                return new C92725jl(this.A06, this.A09);
            } else {
                if (cls == C92765jp.class) {
                    return new C92765jp();
                }
                if (cls == C92795js.class) {
                    return new C92795js(this.A09);
                }
                if (cls == AnonymousClass5k0.class) {
                    return new AnonymousClass5k0(this.A02, this.A09);
                }
                if (cls == C92775jq.class) {
                    return new C92775jq(this.A05, this.A09);
                }
                if (cls == C883857v.class) {
                    return new C883857v(this.A03, this.A09);
                }
                if (cls == C92785jr.class) {
                    return new C92785jr(this.A02, this.A09);
                }
                if (cls == C92825jv.class) {
                    return new C92825jv(this.A06, this.A09);
                }
                if (cls == AnonymousClass57Z.class) {
                    return new AnonymousClass57Z(this.A00, this.A09);
                } else if (cls == C883657t.class) {
                    return new C883657t(this.A09);
                } else {
                    if (cls == C92865jz.class) {
                        return new C92865jz(this.A00, this.A08, this.A09);
                    } else if (cls == C92805jt.class) {
                        return new C92805jt(this.A01, this.A09);
                    } else {
                        if (cls == C92855jy.class) {
                            return new C92855jy(this.A07, this.A09, this.A0A);
                        } else if (cls == C880956s.class) {
                            new LinkedHashSet();
                            new C880856r();
                            throw C18210wN.A0W("fetchP2pQRCode");
                        } else if (cls == C92845jx.class) {
                            return new C92845jx(this.A09, this.A0A);
                        } else if (cls == AnonymousClass579.class) {
                            return new AnonymousClass579(this.A0B);
                        } else {
                            if (cls == C881456x.class) {
                                return new C881456x();
                            }
                            throw C18180wK.A0a(AnonymousClass00U.A0L(cls.getName(), " cannot be created"));
                        }
                    }
                }
            }
        }
    }
}
