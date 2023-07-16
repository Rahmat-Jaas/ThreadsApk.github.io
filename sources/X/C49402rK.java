package X;

import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2rK  reason: invalid class name and case insensitive filesystem */
public final class C49402rK {
    public static final C61813Vs A00(UserSession userSession, FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility noticeEligibility) {
        C311724n r1;
        C312124s r0;
        C04220Ms.A0B(userSession, 0);
        C313425p A00 = noticeEligibility.A00();
        C311724n[] values = C311724n.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = null;
                break;
            }
            r1 = values[i];
            if (r1.A00 == A00) {
                break;
            }
            i++;
        }
        if (r1 == null) {
            StringBuilder A0s = C18190wL.A0s("Unsupported notice variant: ");
            A0s.append(A00);
            A0s.append('.');
            AnonymousClass0LU.A0B("NoticeVariant", A0s.toString());
            return null;
        }
        ImmutableList enumList = noticeEligibility.getEnumList("client_rules", AnonymousClass231.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C04220Ms.A06(enumList);
        ArrayList A0w = AnonymousClass0wJ.A0w(enumList);
        Iterator it = enumList.iterator();
        while (it.hasNext()) {
            AnonymousClass231 r02 = (AnonymousClass231) it.next();
            C04220Ms.A04(r02);
            switch (r02.ordinal()) {
                case 1:
                    r0 = C312124s.A03;
                    break;
                case 2:
                    r0 = C312124s.A0F;
                    break;
                case 3:
                    r0 = C312124s.A08;
                    break;
                case 4:
                    r0 = C312124s.A09;
                    break;
                case 5:
                    r0 = C312124s.A04;
                    break;
                case 6:
                    r0 = C312124s.A0H;
                    break;
                case 7:
                    r0 = C312124s.A02;
                    break;
                case 8:
                    r0 = C312124s.A0E;
                    break;
                case 9:
                    r0 = C312124s.A0G;
                    break;
                case 10:
                    r0 = C312124s.A05;
                    break;
                case 11:
                    r0 = C312124s.A0D;
                    break;
                default:
                    r0 = C312124s.A0A;
                    break;
            }
            A0w.add(r0);
        }
        if (r1 instanceof AnonymousClass1vX) {
            AnonymousClass0wJ.A1N(userSession, A0w);
            return new C28871vh(userSession, A0w);
        } else if (r1 instanceof AnonymousClass1vW) {
            AnonymousClass0wJ.A1N(userSession, A0w);
            return new C28861vg(userSession, A0w);
        } else if (r1 instanceof AnonymousClass1vV) {
            return new C28811vb(userSession);
        } else {
            if (r1 instanceof AnonymousClass1vU) {
                return new C28801va(userSession);
            }
            if (r1 instanceof AnonymousClass1vT) {
                return new AnonymousClass1vZ(userSession);
            }
            if (r1 instanceof AnonymousClass1vS) {
                return new AnonymousClass1vY(userSession);
            }
            if (r1 instanceof AnonymousClass1vR) {
                return new C28881vi(userSession);
            }
            if (r1 instanceof AnonymousClass1vQ) {
                return new C28851vf(userSession);
            }
            if (r1 instanceof AnonymousClass1vP) {
                return new C28841ve(userSession);
            }
            if (r1 instanceof AnonymousClass1vO) {
                return new C28831vd(userSession);
            }
            return new C28821vc(userSession);
        }
    }
}
