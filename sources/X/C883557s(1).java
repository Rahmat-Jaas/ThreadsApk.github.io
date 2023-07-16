package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.57s  reason: invalid class name and case insensitive filesystem */
public final class C883557s extends C62793ak {
    public User A00;
    public String A01 = "";
    public final GroupProfileRepository A02;
    public final UserSession A03;
    public final String A04;
    public final C86074wE A05;
    public final C86094wG A06;

    public C883557s(GroupProfileRepository groupProfileRepository, UserSession userSession, String str) {
        Object value;
        List list;
        Integer num;
        Object value2;
        List A002;
        Integer num2;
        boolean z;
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = str;
        this.A02 = groupProfileRepository;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0210000_I2(14));
        this.A05 = A0z;
        this.A06 = A0z;
        User A0P = C18210wN.A0P(userSession, str);
        if (A0P != null) {
            this.A00 = A0P;
            this.A01 = A0P.BK7();
            do {
                value2 = A0z.getValue();
                KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) value2;
                A002 = A00(this);
                num2 = (Integer) ktCSuperShape0S0210000_I2.A00;
                z = ktCSuperShape0S0210000_I2.A02;
                C04220Ms.A0B(A002, 0);
                C04220Ms.A0B(num2, 1);
            } while (!A0z.ADi(value2, new KtCSuperShape0S0210000_I2(num2, A002, 14, z)));
            return;
        }
        do {
            value = A0z.getValue();
            KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I22 = (KtCSuperShape0S0210000_I2) value;
            list = (List) ktCSuperShape0S0210000_I22.A01;
            num = (Integer) ktCSuperShape0S0210000_I22.A00;
            C04220Ms.A0B(list, 0);
            C04220Ms.A0B(num, 1);
        } while (!A0z.ADi(value, new KtCSuperShape0S0210000_I2(num, list, 14, true)));
    }

    public static final List A00(C883557s r17) {
        AnonymousClass8f4 r0;
        boolean AlB;
        C883557s r02 = r17;
        User user = r02.A00;
        if (user == null) {
            C04220Ms.A0E("groupProfile");
            throw null;
        }
        C84664te A0J = user.A0J();
        if (A0J != null) {
            UserSession userSession = r02.A03;
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            AnonymousClass8f4[] r5 = new AnonymousClass8f4[11];
            if (C63803iN.A0E(r2, userSession, 36318230572568868L)) {
                r5[0] = C133387vc.A00;
                r5[1] = C133367va.A00;
                r5[2] = new C133457vj(A0J.Ay2());
                r5[3] = new C133447vi(A0J.Ay1());
                r5[4] = C133427vg.A00;
                r5[5] = C133407ve.A00;
                r5[6] = C133417vf.A00;
                r5[7] = C133357vZ.A00;
                r0 = C133437vh.A00;
            } else {
                r5[0] = C133357vZ.A00;
                r5[1] = C133437vh.A00;
                r5[2] = new C133457vj(A0J.Ay2());
                r5[3] = new C133447vi(A0J.Ay1());
                r5[4] = C133427vg.A00;
                r5[5] = C133407ve.A00;
                r5[6] = C133387vc.A00;
                r5[7] = C133367va.A00;
                r0 = C133417vf.A00;
            }
            r5[8] = r0;
            r5[9] = C133397vd.A00;
            r5[10] = C133377vb.A00;
            List A17 = C06750aI.A17(r5);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : A17) {
                C84664te A0J2 = user.A0J();
                if (A0J2 != null) {
                    boolean BZq = A0J2.BZq();
                    boolean A3N = user.A3N();
                    if (!(next instanceof C133387vc)) {
                        if (next instanceof C133367va) {
                            if (BZq) {
                                AlB = C63803iN.A0E(r2, userSession, 36318230572306720L);
                            }
                        } else if (next instanceof C133457vj) {
                            if (BZq) {
                                AlB = A0J2.AlB();
                            }
                        } else if (!(next instanceof C133447vi)) {
                            if (!(next instanceof C133427vg)) {
                                if (!(next instanceof C133407ve) && !(next instanceof C133417vf)) {
                                    if (next instanceof C133357vZ) {
                                        if (A3N) {
                                        }
                                    } else if (next instanceof C133437vh) {
                                        BZq = A3N;
                                    } else if (!(next instanceof C133397vd)) {
                                        if (!(next instanceof C133377vb)) {
                                            throw AnonymousClass4VZ.A00();
                                        }
                                    }
                                }
                                A0v.add(next);
                            } else if (BZq) {
                                if (user.A0e() != C169839tz.PrivacyStatusPrivate) {
                                }
                                A0v.add(next);
                            }
                        }
                        if (!AlB) {
                        }
                        A0v.add(next);
                    }
                    if (!BZq) {
                    }
                    A0v.add(next);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            return A0v;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
