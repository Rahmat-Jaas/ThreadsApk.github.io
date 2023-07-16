package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass56Q;
import X.AnonymousClass57G;
import X.AnonymousClass57L;
import X.AnonymousClass593;
import X.AnonymousClass5HT;
import X.AnonymousClass67Z;
import X.AnonymousClass6EG;
import X.AnonymousClass6M0;
import X.AnonymousClass6M1;
import X.AnonymousClass6O4;
import X.AnonymousClass6QO;
import X.AnonymousClass6WX;
import X.AnonymousClass70S;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7DE;
import X.AnonymousClass7Fz;
import X.AnonymousClass7Hw;
import X.AnonymousClass7K5;
import X.AnonymousClass7KL;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass84E;
import X.C02220Ah;
import X.C04220Ms;
import X.C06750aI;
import X.C101136Qa;
import X.C115286uo;
import X.C115556vT;
import X.C115796vv;
import X.C115906w6;
import X.C115986wE;
import X.C117796zG;
import X.C117836zK;
import X.C117886zP;
import X.C117896zQ;
import X.C1191773v;
import X.C1195976a;
import X.C1200278c;
import X.C120867Cw;
import X.C121857Im;
import X.C122107Kg;
import X.C123327Wm;
import X.C132857uc;
import X.C145548kg;
import X.C146288ly;
import X.C146958n9;
import X.C147178nW;
import X.C147188nY;
import X.C147368pE;
import X.C86104wH;
import X.C884257z;
import X.C884958x;
import X.C90395Lv;
import X.C98006Du;
import X.C98236Es;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.ui.Modifier;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

public class KtLambdaShape3S0302000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0302000_I2(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        super(2);
        this.A05 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A05) {
            case 0:
                C98006Du.A00((AnonymousClass84E) this.A04, C86104wH.A0H(obj3, obj4), this.A03, (AnonymousClass0YP) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
            case 1:
                AnonymousClass6EG.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A04, (AnonymousClass0YM) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                C147188nY A0H = C86104wH.A0H(obj3, obj4);
                SnackbarHostState snackbarHostState = (SnackbarHostState) this.A02;
                Modifier modifier = (Modifier) this.A03;
                AnonymousClass0YM r7 = (AnonymousClass0YM) this.A04;
                int A002 = C115796vv.A00(this.A00);
                int i2 = this.A01;
                C04220Ms.A0B(snackbarHostState, 0);
                A0H.Cvd(431012348);
                if ((i2 & 1) != 0) {
                    i = A002 | 6;
                } else if ((A002 & 14) == 0) {
                    i = C147188nY.A0F(A0H, snackbarHostState) | A002;
                } else {
                    i = A002;
                }
                int i3 = i2 & 2;
                if (i3 != 0) {
                    i |= 48;
                } else if ((A002 & 112) == 0) {
                    i |= C147188nY.A0G(A0H, modifier);
                }
                int i4 = i2 & 4;
                if (i4 != 0) {
                    i |= 384;
                } else if ((A002 & 896) == 0) {
                    i |= C147188nY.A0B(A0H, r7);
                }
                if ((i & 731) != 146 || !A0H.BCM()) {
                    if (i3 != 0) {
                        modifier = Modifier.A00;
                    }
                    if (i4 != 0) {
                        r7 = AnonymousClass6WX.A00;
                    }
                    C147368pE r6 = snackbarHostState.A00;
                    r6.getValue();
                    AnonymousClass7K5.A05(A0H, (Object) null, new KtSLambdaShape5S0200000_I2((Object) null, A0H.AEA(AnonymousClass7DE.A00), (C146958n9) null, 0));
                    r6.getValue();
                    AnonymousClass6EG.A00(A0H, modifier, r7, (i & 112) | (i & 896), 0);
                } else {
                    A0H.CuJ();
                }
                C147178nW AKE = A0H.AKE();
                if (AKE != null) {
                    AKE.D9d(new KtLambdaShape3S0302000_I2(r7, modifier, snackbarHostState, A002, i2, 2));
                    break;
                }
                break;
            case 3:
                C115906w6.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A03, (C1195976a) this.A04, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                C1191773v.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A03, (AnonymousClass0YY) this.A02, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                C115986wE.A01(C86104wH.A0H(obj3, obj4), (C1200278c) this.A04, (AnonymousClass0ZU) this.A03, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 6:
                AnonymousClass6M0.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 7:
                AnonymousClass5HT r4 = (AnonymousClass5HT) this.A02;
                AnonymousClass6M1.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A04, r4, (List) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 8:
                C120867Cw.A00((C115556vT) this.A04, C86104wH.A0H(obj3, obj4), (Modifier) this.A03, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C121857Im.A03(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (C884257z) this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 13:
                C117836zK.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (AnonymousClass67Z) this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 14:
                C122107Kg.A03(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (C90395Lv) this.A04, (AnonymousClass0YP) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 15:
                C117886zP.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (AnonymousClass56Q) this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 16:
                C117896zQ.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (AnonymousClass57G) this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case LangUtils.HASH_SEED /*17*/:
                AnonymousClass6O4.A00(C86104wH.A0H(obj3, obj4), (AnonymousClass57L) this.A04, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 18:
                AnonymousClass6QO.A00(C86104wH.A0H(obj3, obj4), this.A02, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 19:
                C145548kg r42 = (C145548kg) this.A02;
                C101136Qa.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A04, r42, (List) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 20:
                AnonymousClass7Hw.A03(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, (List) this.A04, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 21:
                C147188nY r11 = (C147188nY) obj3;
                if ((AnonymousClass0wJ.A04(obj4) & 11) == 2 && r11.BCM()) {
                    r11.CuJ();
                    break;
                } else {
                    C123327Wm r16 = Modifier.A00;
                    int i5 = 0;
                    Modifier A022 = AnonymousClass7Ad.A02(AnonymousClass7Ad.A00(r11), r16, 12, true);
                    int i6 = this.A01;
                    AnonymousClass0YY r72 = (AnonymousClass0YY) this.A03;
                    int i7 = this.A00;
                    Iterable iterable = (Iterable) this.A02;
                    C146288ly A052 = AnonymousClass7KV.A05(r11);
                    Object A0p = C147188nY.A0p(r11);
                    Object A0n = C147188nY.A0n(r11);
                    Object A0m = C147188nY.A0m(r11);
                    AnonymousClass0ZU r2 = AnonymousClass74X.A00;
                    AnonymousClass0YM A003 = C98236Es.A00(A022);
                    AnonymousClass7W3 r0 = (AnonymousClass7W3) r11;
                    C147188nY.A0w(r11, r0, r2);
                    AnonymousClass7W3.A0a(r11, r0, A052, A0p);
                    AnonymousClass7KP.A07(r11, A0n, A0m, A003);
                    int A07 = C147188nY.A07(r11, (IGRevShareProductType) this.A04, -947740537);
                    if (A07 == 2) {
                        r11.Cvb(557585236);
                        AnonymousClass7Fz.A03(r11, r72, i6, ((i7 >> 9) & 14) | ((i7 << 3) & 112));
                    } else if (A07 != 1) {
                        int i8 = 557585459;
                        if (A07 != 0) {
                            i8 = 557585471;
                        }
                        r11.Cvb(i8);
                    } else {
                        r11.Cvb(557585356);
                        AnonymousClass7Fz.A02(r11, r72, i6, ((i7 >> 9) & 14) | ((i7 << 3) & 112));
                    }
                    AnonymousClass7W3.A0w(r0, false);
                    for (Object next : iterable) {
                        int i9 = i5 + 1;
                        if (i5 < 0) {
                            C06750aI.A1A();
                            throw null;
                        }
                        KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I2 = (KtCSuperShape0S2020000_I2) next;
                        C147188nY r15 = r11;
                        AnonymousClass70S.A00(r15, r16, (C115286uo) null, new C132857uc(new KtLambdaShape31S0201000_I2(i5, 9, r72, ktCSuperShape0S2020000_I2), ktCSuperShape0S2020000_I2.A02), ktCSuperShape0S2020000_I2.A01, (String) null, 48, 24, ktCSuperShape0S2020000_I2.A03);
                        i5 = i9;
                    }
                    AnonymousClass7W3.A0v(r0, true);
                    break;
                }
                break;
            case 22:
                List list = (List) this.A02;
                AnonymousClass7Fz.A01(C86104wH.A0H(obj3, obj4), (IGRevShareProductType) this.A04, list, (AnonymousClass0YY) this.A03, this.A01, C115796vv.A00(this.A00));
                break;
            case 23:
                AnonymousClass7KL.A03(C86104wH.A0H(obj3, obj4), (Modifier) this.A03, (KtCSuperShape0S2200000_I2) this.A02, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                AnonymousClass593 r43 = (AnonymousClass593) this.A02;
                C117796zG.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A03, r43, (C884958x) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}
