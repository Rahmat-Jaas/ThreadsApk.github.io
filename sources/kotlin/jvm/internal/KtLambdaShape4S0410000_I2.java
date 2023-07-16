package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5DC;
import X.AnonymousClass679;
import X.AnonymousClass6Ax;
import X.AnonymousClass6FM;
import X.AnonymousClass77X;
import X.AnonymousClass7HD;
import X.AnonymousClass7Hr;
import X.AnonymousClass7JQ;
import X.AnonymousClass7KC;
import X.AnonymousClass7KG;
import X.AnonymousClass8AL;
import X.C02220Ah;
import X.C04180Mo;
import X.C04220Ms;
import X.C112036os;
import X.C113196qu;
import X.C115786vu;
import X.C121457Gf;
import X.C121767Ia;
import X.C121827Ii;
import X.C123917Zx;
import X.C134747yH;
import X.C146508mM;
import X.C146978nB;
import X.C147368pE;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape4S0410000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0410000_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(1);
        this.A05 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A04 = z;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A012;
        C147368pE r0;
        switch (this.A05) {
            case 0:
                C146508mM r11 = (C146508mM) obj;
                C04220Ms.A0B(r11, 0);
                C113196qu r4 = (C113196qu) this.A02;
                r4.A01 = r11;
                if (this.A04) {
                    C147368pE r2 = r4.A08;
                    if (r2.getValue() == AnonymousClass679.Selection) {
                        boolean z = r4.A06;
                        C121827Ii r22 = (C121827Ii) this.A00;
                        if (z) {
                            r22.A08();
                        } else {
                            r22.A06();
                        }
                        C147368pE.A04(r4.A0E, C115786vu.A01(r22, true));
                        A012 = C115786vu.A01(r22, false);
                        r0 = r4.A0D;
                    } else {
                        if (r2.getValue() == AnonymousClass679.Cursor) {
                            A012 = C115786vu.A01((C121827Ii) this.A00, true);
                            r0 = r4.A0C;
                        }
                        AnonymousClass7JQ.A03(r4, (C146978nB) this.A01, (AnonymousClass7HD) this.A03);
                    }
                    C147368pE.A04(r0, A012);
                    AnonymousClass7JQ.A03(r4, (C146978nB) this.A01, (AnonymousClass7HD) this.A03);
                }
                C121457Gf A002 = C147368pE.A00(r4);
                if (A002 != null) {
                    A002.A01 = r11;
                    break;
                }
                break;
            case 1:
                long j = ((AnonymousClass7KC) obj).A00;
                C113196qu r7 = (C113196qu) this.A03;
                AnonymousClass7JQ.A02(r7, (AnonymousClass77X) this.A00, !this.A04);
                if (C86104wH.A1X(r7.A09)) {
                    C147368pE r6 = r7.A08;
                    if (r6.getValue() == AnonymousClass679.Selection) {
                        ((C121827Ii) this.A01).A09(C86124wJ.A0O(j));
                        break;
                    } else {
                        C121457Gf A003 = C147368pE.A00(r7);
                        if (A003 != null) {
                            C146978nB r8 = (C146978nB) this.A02;
                            C112036os r42 = r7.A0H;
                            AnonymousClass0YY r5 = r7.A0J;
                            AnonymousClass0wJ.A1R(r8, r5);
                            int D7e = r8.D7e(C121457Gf.A00(A003, C121457Gf.A01(A003, j)));
                            AnonymousClass7HD r02 = r42.A01;
                            long A004 = AnonymousClass6FM.A00(D7e, D7e);
                            C134747yH r43 = r02.A01;
                            C121767Ia r1 = r02.A02;
                            C04220Ms.A0B(r43, 0);
                            r5.invoke(new AnonymousClass7HD(r43, r1, A004));
                            if (r7.A00.A05.length() > 0) {
                                r6.CrC(AnonymousClass679.Cursor);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                C123917Zx r112 = (C123917Zx) obj;
                C04220Ms.A0B(r112, 0);
                ((C04180Mo) this.A01).A00 = true;
                ((C04180Mo) this.A00).A00 = true;
                AnonymousClass7KG.A03(r112, (AnonymousClass7KG) this.A03, (AnonymousClass8AL) this.A02, this.A04);
                break;
            default:
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
                AnonymousClass5DC r3 = new AnonymousClass5DC();
                LoggingContext loggingContext = (LoggingContext) this.A03;
                C86104wH.A1K(r3, loggingContext);
                r3.A07("perform_validation", Boolean.valueOf(this.A04));
                r3.A0B("account_mutation_data_list", (List) this.A00);
                AnonymousClass7Hr.A03(r3, loggingContext);
                AnonymousClass6Ax r12 = (AnonymousClass6Ax) this.A01;
                if (r12 != null) {
                    r3.A04(r12, "account_mutation_failure_step");
                }
                C86114wI.A1C(uSLEBaseShape0S0000000, r3);
                C86114wI.A1G(uSLEBaseShape0S0000000, this.A02);
                return uSLEBaseShape0S0000000;
        }
        return Unit.A00;
    }
}
