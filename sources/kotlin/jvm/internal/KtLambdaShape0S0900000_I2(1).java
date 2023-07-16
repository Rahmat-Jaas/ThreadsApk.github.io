package kotlin.jvm.internal;

import X.AnonymousClass0MQ;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7FV;
import X.AnonymousClass7HB;
import X.AnonymousClass7KC;
import X.AnonymousClass7UI;
import X.C02220Ah;
import X.C03700Kj;
import X.C04220Ms;
import X.C04530Oa;
import X.C104796cO;
import X.C104806cP;
import X.C104816cQ;
import X.C1197876x;
import X.C130667qT;
import X.C142688fQ;
import X.C145018jf;
import X.C146758mo;
import X.C147168nV;
import X.C157709Tg;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C19894BEu;
import X.C21839C2o;
import X.C21847C2w;
import X.C81784oM;
import X.C82044oz;
import X.C86104wH;
import X.C86154wM;
import X.C86164wN;
import X.C99016Hu;
import X.C99026Hv;
import X.I17;
import android.content.Context;
import android.widget.Magnifier;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtLambdaShape0S0900000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0900000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(0);
        this.A09 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A08 = obj4;
        this.A04 = obj5;
        this.A07 = obj6;
        this.A03 = obj7;
        this.A00 = obj8;
        this.A06 = obj9;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A09) {
            case 0:
                boolean A1X = C86104wH.A1X((C81784oM) this.A02);
                C142688fQ r5 = (C142688fQ) this.A03;
                if (!A1X) {
                    ((AnonymousClass7UI) r5).A00.dismiss();
                    break;
                } else {
                    long j = ((AnonymousClass7KC) C86104wH.A0f(this.A05)).A00;
                    C147168nV r4 = (C147168nV) this.A01;
                    Object invoke = ((AnonymousClass0YY) C86104wH.A0f(this.A06)).invoke(r4);
                    C81784oM r3 = (C81784oM) this.A00;
                    long j2 = ((AnonymousClass7KC) invoke).A00;
                    long j3 = AnonymousClass7KC.A02;
                    if (j2 != j3) {
                        j3 = AnonymousClass7KC.A05(C86164wN.A08(r3), j2);
                    }
                    r5.D8g(C18240wQ.A00(C86104wH.A0f(this.A08)), j, j3);
                    Magnifier magnifier = ((AnonymousClass7UI) r5).A00;
                    long A002 = AnonymousClass7FV.A00(magnifier.getWidth(), magnifier.getHeight());
                    AnonymousClass0MQ r7 = (AnonymousClass0MQ) this.A04;
                    C81784oM r32 = (C81784oM) this.A07;
                    if (A002 != r7.A00) {
                        r7.A00 = A002;
                        AnonymousClass0YY r33 = (AnonymousClass0YY) r32.getValue();
                        if (r33 != null) {
                            r33.invoke(new AnonymousClass7HB(r4.CxF(AnonymousClass7FV.A02(A002))));
                            break;
                        }
                    }
                }
                break;
            case 1:
                C104796cO r42 = (C104796cO) ((C04530Oa) this.A07).getValue();
                C104806cP r52 = (C104806cP) ((C04530Oa) this.A03).getValue();
                C99016Hu r34 = (C99016Hu) this.A02;
                String userId = ((UserSession) this.A08).getUserId();
                return new C1197876x((Context) this.A01, (C03700Kj) C18190wL.A0f((C04530Oa) this.A00), r34, r42, r52, (C104816cQ) ((C04530Oa) this.A04).getValue(), (C99026Hv) this.A05, (C146758mo) ((C04530Oa) this.A06).getValue(), userId);
            case 2:
                Number number = (Number) ((KtCSuperShape0S0102000_I2) this.A07).A02;
                AnonymousClass0ZU r10 = (AnonymousClass0ZU) this.A05;
                AnonymousClass0ZU r9 = (AnonymousClass0ZU) this.A03;
                AnonymousClass0ZU r8 = (AnonymousClass0ZU) this.A02;
                Object obj = this.A00;
                KtLambdaShape37S0100000_I2_17 A14 = C86154wM.A14(obj, 9);
                KtLambdaShape37S0100000_I2_17 A142 = C86154wM.A14(obj, 10);
                KtLambdaShape20S0200000_I2_4 A0y = C86164wN.A0y(obj, this.A08, 28);
                AnonymousClass0ZU r35 = (AnonymousClass0ZU) this.A06;
                AnonymousClass0ZU r2 = (AnonymousClass0ZU) this.A01;
                AnonymousClass0ZU r1 = (AnonymousClass0ZU) this.A04;
                AnonymousClass0wJ.A1N(r10, r9);
                C04220Ms.A0B(r8, 2);
                C18180wK.A1S(r35, r2, r1);
                C04220Ms.A0B(number, 9);
                switch (number.intValue()) {
                    case 0:
                        r9.invoke();
                        break;
                    case 1:
                        A14.invoke();
                        break;
                    case 2:
                        A142.invoke();
                        break;
                    case 3:
                        A0y.invoke();
                        break;
                    case 4:
                        r35.invoke();
                        break;
                    case 5:
                        r8.invoke();
                        break;
                    case 6:
                        r1.invoke();
                        break;
                    case 7:
                        r2.invoke();
                        break;
                    case 8:
                        r10.invoke();
                        break;
                }
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
                C04220Ms.A0C(fragmentActivity, I17.A00(3));
                Fragment fragment = (Fragment) this.A02;
                C19894BEu bEu = (C19894BEu) this.A06;
                C21847C2w c2w = (C21847C2w) this.A04;
                return new C157709Tg(fragmentActivity, fragmentActivity, fragment, (C82044oz) fragmentActivity, (C130667qT) this.A03, c2w, (C21839C2o) this.A05, bEu, (UserSession) this.A08, (C145018jf) this.A07, "main_feed", false, false);
        }
        return Unit.A00;
    }
}
