package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass0YC;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass56U;
import X.AnonymousClass56Z;
import X.AnonymousClass6NR;
import X.AnonymousClass7FI;
import X.AnonymousClass7Hs;
import X.AnonymousClass7W3;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C10450iM;
import X.C117736zA;
import X.C1183570p;
import X.C121177En;
import X.C123917Zx;
import X.C147188nY;
import X.C18190wL;
import X.C20066BMj;
import X.C37;
import X.C81074n3;
import X.C86104wH;
import X.C86124wJ;
import X.C86164wN;
import android.os.Bundle;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.barcelona.profile.editor.ProfileEditorViewModel;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape32S0201000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape32S0201000_I2(int i, int i2, Object obj, Object obj2) {
        super(4);
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        String str2;
        List list;
        String string;
        BKU bku;
        Object obj5 = obj2;
        Object obj6 = obj3;
        Object obj7 = obj;
        Object obj8 = obj4;
        switch (this.A03) {
            case 0:
                C123917Zx r2 = (C123917Zx) obj5;
                C147188nY A0H = C86104wH.A0H(obj6, obj8);
                boolean A1Y = AnonymousClass0wJ.A1Y(obj7, r2);
                Object obj9 = this.A01;
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_13 = new KtLambdaShape33S0100000_I2_13(obj9, 42);
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_132 = new KtLambdaShape33S0100000_I2_13(obj9, 43);
                KtLambdaShape168S0100000_I2_1 ktLambdaShape168S0100000_I2_1 = new KtLambdaShape168S0100000_I2_1(obj9, 11);
                AnonymousClass0YY r1 = (AnonymousClass0YY) this.A02;
                C121177En A002 = C123917Zx.A00(r2);
                Modifier A003 = AnonymousClass7FI.A00(AnonymousClass7FI.A01(Modifier.A00));
                C04220Ms.A0B(A003, A1Y ? 1 : 0);
                Modifier A05 = Modifier.A05(A003);
                Bundle bundle = r2.A06;
                if (bundle != null && (string = bundle.getString("postId")) != null) {
                    KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_133 = ktLambdaShape33S0100000_I2_13;
                    C117736zA.A00(A0H, A05, A002, (AnonymousClass56Z) null, string, bundle.getString("repostId"), (String) null, (String) null, (List) null, ktLambdaShape33S0100000_I2_133, ktLambdaShape33S0100000_I2_132, r1, ktLambdaShape168S0100000_I2_1, ((this.A00 >> 12) & 7168) | 32768, A1Y ? 1 : 0, 3840);
                    break;
                } else {
                    throw C18190wL.A0a("Required value was null.");
                }
            case 1:
                C123917Zx r22 = (C123917Zx) obj5;
                C147188nY A0H2 = C86104wH.A0H(obj6, obj8);
                boolean A1Y2 = AnonymousClass0wJ.A1Y(obj7, r22);
                Object obj10 = this.A01;
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_134 = new KtLambdaShape33S0100000_I2_13(obj10, 45);
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_135 = new KtLambdaShape33S0100000_I2_13(obj10, 46);
                KtLambdaShape168S0100000_I2_1 ktLambdaShape168S0100000_I2_12 = new KtLambdaShape168S0100000_I2_1(obj10, 12);
                AnonymousClass0YY r12 = (AnonymousClass0YY) this.A02;
                C121177En A004 = C123917Zx.A00(r22);
                Modifier A005 = AnonymousClass7FI.A00(AnonymousClass7FI.A01(Modifier.A00));
                C04220Ms.A0B(A005, A1Y2 ? 1 : 0);
                Modifier A052 = Modifier.A05(A005);
                Bundle bundle2 = r22.A06;
                if (bundle2 != null) {
                    str2 = bundle2.getString("text");
                    String string2 = bundle2.getString("mediaFilePaths");
                    if (string2 != null) {
                        list = C81074n3.A07(string2, ";", A1Y2);
                    }
                    list = null;
                } else {
                    str2 = null;
                    list = null;
                }
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_136 = ktLambdaShape33S0100000_I2_135;
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_137 = ktLambdaShape33S0100000_I2_134;
                C117736zA.A00(A0H2, A052, A004, (AnonymousClass56Z) null, (String) null, (String) null, (String) null, str2, list, ktLambdaShape33S0100000_I2_137, ktLambdaShape33S0100000_I2_136, r12, ktLambdaShape168S0100000_I2_12, ((this.A00 >> 12) & 7168) | 32768, 8, 2496);
                break;
            case 2:
                C123917Zx r23 = (C123917Zx) obj5;
                C147188nY A0H3 = C86104wH.A0H(obj6, obj8);
                boolean A1Y3 = AnonymousClass0wJ.A1Y(obj7, r23);
                Object obj11 = this.A01;
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_138 = new KtLambdaShape33S0100000_I2_13(obj11, 47);
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_139 = new KtLambdaShape33S0100000_I2_13(obj11, 48);
                KtLambdaShape168S0100000_I2_1 ktLambdaShape168S0100000_I2_13 = new KtLambdaShape168S0100000_I2_1(obj11, 13);
                AnonymousClass0YY r13 = (AnonymousClass0YY) this.A02;
                C121177En A006 = C123917Zx.A00(r23);
                Modifier A007 = AnonymousClass7FI.A00(AnonymousClass7FI.A01(Modifier.A00));
                C04220Ms.A0B(A007, A1Y3 ? 1 : 0);
                Modifier A053 = Modifier.A05(A007);
                Bundle bundle3 = r23.A06;
                if (bundle3 != null) {
                    str = bundle3.getString("postId");
                } else {
                    str = null;
                }
                KtLambdaShape33S0100000_I2_13 ktLambdaShape33S0100000_I2_1310 = ktLambdaShape33S0100000_I2_138;
                C117736zA.A00(A0H3, A053, A006, (AnonymousClass56Z) null, (String) null, (String) null, str, (String) null, (List) null, ktLambdaShape33S0100000_I2_1310, ktLambdaShape33S0100000_I2_139, r13, ktLambdaShape168S0100000_I2_13, ((this.A00 >> 12) & 7168) | 32768, A1Y3 ? 1 : 0, 3776);
                break;
            case 3:
                AnonymousClass7Hs.A03(C86104wH.A0H(obj6, obj8), AnonymousClass7FI.A02(Modifier.A00), (AnonymousClass56U) null, C86164wN.A0z(this.A01, 1), (AnonymousClass0YP) this.A02, (this.A00 >> 12) & 112, 8);
                break;
            case 4:
                C123917Zx r24 = (C123917Zx) obj5;
                C147188nY A0H4 = C86104wH.A0H(obj6, obj8);
                AnonymousClass0wJ.A1N(obj7, r24);
                C121177En A008 = C123917Zx.A00(r24);
                Object obj12 = this.A01;
                AnonymousClass6NR.A00(A0H4, Modifier.A05(Modifier.A00), A008, (ProfileEditorViewModel) null, (AnonymousClass0ZU) this.A02, C86164wN.A0z(obj12, 3), C86164wN.A0t(obj12, 3), C86164wN.A0t(obj12, 4), ((this.A00 >> 24) & 14) | 448, 64);
                break;
            case 5:
                int A04 = AnonymousClass0wJ.A04(obj5);
                C147188nY r3 = (C147188nY) obj6;
                int A042 = AnonymousClass0wJ.A04(obj8);
                C04220Ms.A0B(obj7, 0);
                if ((A042 & 14) == 0) {
                    i = C147188nY.A0F(r3, obj7) | A042;
                } else {
                    i = A042;
                }
                if ((A042 & 112) == 0) {
                    i |= C147188nY.A04(r3, A04);
                }
                if ((i & 731) == 146 && r3.BCM()) {
                    r3.CuJ();
                    break;
                } else {
                    int i2 = i & 14;
                    KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = (KtCSuperShape0S3100000_I2) C86124wJ.A0p(this.A01, A04);
                    r3.Cvb(-379623962);
                    if ((i2 & 112) == 0) {
                        i2 |= C147188nY.A08(r3, ktCSuperShape0S3100000_I2);
                    }
                    if ((i2 & 721) != 144 || !r3.BCM()) {
                        C1183570p.A00(r3, ktCSuperShape0S3100000_I2, (AnonymousClass0YY) this.A02, ((i2 >> 3) & 14) | ((this.A00 >> 3) & 112));
                    } else {
                        r3.CuJ();
                    }
                    AnonymousClass7W3.A0z(r3, false);
                    break;
                }
                break;
            default:
                C37 c37 = (C37) obj7;
                int A043 = AnonymousClass0wJ.A04(obj5);
                int A044 = AnonymousClass0wJ.A04(obj6);
                boolean A1X = AnonymousClass0wJ.A1X(obj8);
                C04220Ms.A0B(c37, 0);
                BKU bku2 = (BKU) this.A01;
                BKU A2E = bku2.A2E(A043);
                if (A2E != null) {
                    if (A044 >= 0) {
                        bku = bku2.A2E(A044);
                    } else {
                        bku = null;
                    }
                    ((C20066BMj) this.A02).A0G(A043);
                    c37.BoQ(bku2, bku, A2E, this.A00, A044, A043, A1X);
                    break;
                } else {
                    C10450iM.A03(AnonymousClass000.A00(618), AnonymousClass000.A00(617));
                    break;
                }
        }
        return Unit.A00;
    }
}
