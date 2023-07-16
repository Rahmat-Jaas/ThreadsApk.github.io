package kotlin.coroutines.jvm.internal;

import X.AnonymousClass01V;
import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass4VZ;
import X.AnonymousClass5z0;
import X.C04220Ms;
import X.C113146qp;
import X.C121967Iz;
import X.C146958n9;
import X.C39142Kno;
import X.C62903b6;
import X.C86074wE;
import X.C86164wN;
import X.CKX;
import X.D0E;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.api.ReelXpostApi;
import com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl;
import kotlin.Unit;

public class KtSLambdaShape1S0112000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0112000_I2(C113146qp r2, C146958n9 r3, int i, boolean z) {
        super(1, r3);
        this.A04 = i;
        this.A03 = z;
        this.A02 = r2;
    }

    public final C146958n9 create(C146958n9 r5) {
        int i;
        int i2 = this.A04;
        boolean z = this.A03;
        C113146qp r2 = (C113146qp) this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new KtSLambdaShape1S0112000_I2(r2, r5, i, z);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        int A002;
        String str;
        C86074wE r1;
        Object A012;
        CKX A013;
        long j2;
        int A003;
        Object value;
        Unit unit;
        String str2;
        CKX A014;
        if (this.A04 != 0) {
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            if (this.A01 != 0) {
                A003 = this.A00;
                AnonymousClass0OU.A00(obj);
            } else {
                AnonymousClass0OU.A00(obj);
                if (this.A03 || (((C113146qp) this.A02).A09.getValue() instanceof AnonymousClass1jB)) {
                    j2 = 0;
                } else {
                    j2 = 432000000;
                }
                UserSession userSession = ((C113146qp) this.A02).A05;
                A003 = C121967Iz.A00(userSession, "xar_v1");
                Long l = new Long(j2);
                this.A00 = A003;
                this.A01 = 1;
                obj = ReelXpostApi.A02(userSession, l, "RECOMMEND", this);
                if (obj == d0e) {
                    return d0e;
                }
            }
            Object obj2 = (C62903b6) obj;
            C113146qp r4 = (C113146qp) this.A02;
            if (obj2 instanceof AnonymousClass1jA) {
                AnonymousClass5z0 r5 = (AnonymousClass5z0) ((AnonymousClass1jA) obj2).A00;
                UserSession userSession2 = r4.A05;
                if (r5.BS2()) {
                    str2 = "fetch_success_from_cache";
                } else {
                    str2 = "fetch_success";
                }
                C04220Ms.A0B(userSession2, 0);
                AnonymousClass01V.A0p.markerPoint(383656871, A003, str2);
                CrossPostingContentCompatibilityConfigResponseImpl crossPostingContentCompatibilityConfigResponseImpl = (CrossPostingContentCompatibilityConfigResponseImpl) r5.A01;
                if (crossPostingContentCompatibilityConfigResponseImpl == null || (A014 = ReelXpostApi.A01(crossPostingContentCompatibilityConfigResponseImpl)) == null) {
                    C121967Iz.A04(userSession2, A003, 433);
                    C86074wE r3 = r4.A09;
                    do {
                    } while (!r3.ADi(r3.getValue(), AnonymousClass1jB.A01()));
                } else {
                    C121967Iz.A04(userSession2, A003, 2);
                    C86074wE r32 = r4.A09;
                    do {
                    } while (!r32.ADi(r32.getValue(), AnonymousClass1jA.A00(A014)));
                }
                obj2 = C62903b6.A03();
            } else if (!(obj2 instanceof AnonymousClass1jB)) {
                throw AnonymousClass4VZ.A00();
            }
            if (obj2 instanceof AnonymousClass1jA) {
                return obj2;
            }
            if (obj2 instanceof AnonymousClass1jB) {
                C121967Iz.A04(r4.A05, A003, 97);
                C86074wE r33 = r4.A09;
                do {
                    value = r33.getValue();
                    unit = Unit.A00;
                } while (!r33.ADi(value, C86164wN.A0R(unit)));
                return C86164wN.A0R(unit);
            }
            throw AnonymousClass4VZ.A00();
        }
        D0E d0e2 = D0E.COROUTINE_SUSPENDED;
        if (this.A01 != 0) {
            A002 = this.A00;
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            if (this.A03 || (((C113146qp) this.A02).A07.getValue() instanceof AnonymousClass1jB)) {
                j = 0;
            } else {
                j = 86400000;
            }
            UserSession userSession3 = ((C113146qp) this.A02).A05;
            A002 = C121967Iz.A00(userSession3, "ccp_v1");
            Long l2 = new Long(j);
            this.A00 = A002;
            this.A01 = 1;
            obj = ReelXpostApi.A02(userSession3, l2, "CROSSPOST", this);
            if (obj == d0e2) {
                return d0e2;
            }
        }
        Object obj3 = (C62903b6) obj;
        C113146qp r42 = (C113146qp) this.A02;
        if (obj3 instanceof AnonymousClass1jA) {
            AnonymousClass5z0 r6 = (AnonymousClass5z0) ((AnonymousClass1jA) obj3).A00;
            UserSession userSession4 = r42.A05;
            if (r6.BS2()) {
                str = "fetch_success_from_cache";
            } else {
                str = "fetch_success";
            }
            C04220Ms.A0B(userSession4, 0);
            AnonymousClass01V.A0p.markerPoint(383656871, A002, str);
            CrossPostingContentCompatibilityConfigResponseImpl crossPostingContentCompatibilityConfigResponseImpl2 = (CrossPostingContentCompatibilityConfigResponseImpl) r6.A01;
            if (crossPostingContentCompatibilityConfigResponseImpl2 == null || (A013 = ReelXpostApi.A01(crossPostingContentCompatibilityConfigResponseImpl2)) == null) {
                C121967Iz.A04(userSession4, A002, 433);
                r1 = r42.A07;
                A012 = AnonymousClass1jB.A01();
            } else {
                C121967Iz.A04(userSession4, A002, 2);
                r1 = r42.A07;
                A012 = AnonymousClass1jA.A00(A013);
            }
            r1.CrC(A012);
            obj3 = C62903b6.A03();
        } else if (!(obj3 instanceof AnonymousClass1jB)) {
            throw AnonymousClass4VZ.A00();
        }
        if (obj3 instanceof AnonymousClass1jA) {
            return obj3;
        }
        if (obj3 instanceof AnonymousClass1jB) {
            C121967Iz.A04(r42.A05, A002, 97);
            C86074wE r2 = r42.A07;
            Unit unit2 = Unit.A00;
            r2.CrC(C86164wN.A0R(unit2));
            return C86164wN.A0R(unit2);
        }
        throw AnonymousClass4VZ.A00();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape1S0112000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
