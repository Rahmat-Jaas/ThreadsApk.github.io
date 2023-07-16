package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass56Y;
import X.AnonymousClass7JH;
import X.AnonymousClass7KC;
import X.AnonymousClass7U0;
import X.AnonymousClass7U4;
import X.AnonymousClass8cU;
import X.AnonymousClass8cW;
import X.AnonymousClass9D3;
import X.AnonymousClass9F7;
import X.B5b;
import X.BKU;
import X.BMZ;
import X.C02220Ah;
import X.C04220Ms;
import X.C103866ar;
import X.C107806hL;
import X.C113636rr;
import X.C1203479u;
import X.C122717To;
import X.C146238ls;
import X.C146958n9;
import X.C1526490u;
import X.C17989AVj;
import X.C18230wP;
import X.C18240wQ;
import X.C18266Acd;
import X.C19556AyH;
import X.C20066BMj;
import X.C21697Byi;
import X.C25237DiI;
import X.C27952Ew2;
import X.C86104wH;
import X.C86124wJ;
import X.C86134wK;
import X.C89955Hr;
import X.Lu1;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import com.instagram.model.shopping.Product;
import com.instagram.shopping.model.destination.home.FeedMediaContent$MediaViewerConfig;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2;

public class KtLambdaShape11S0401000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape11S0401000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(0);
        this.A05 = i2;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A00 = i;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int A022;
        switch (this.A05) {
            case 0:
                Long A0f = C18230wP.A0f(this.A00);
                C89955Hr r0 = (C89955Hr) this.A02;
                ((AnonymousClass56Y) this.A04).A09(r0, A0f);
                Uri uri = r0.A00;
                if (uri == null) {
                    String str = r0.A09;
                    if (str != null) {
                        C86134wK.A1L(this.A03, str);
                        break;
                    }
                } else {
                    AnonymousClass56Y.A00((Context) this.A01, uri);
                    break;
                }
                break;
            case 1:
                C113636rr r2 = (C113636rr) this.A04;
                long A0C = C86104wH.A0C(r2.A01.A00(), r2.A02.A00());
                long A0C2 = C86104wH.A0C(C86104wH.A00(A0C), Float.intBitsToFloat(C86104wH.A08(A0C)));
                AnonymousClass8cU r22 = (AnonymousClass8cU) this.A01;
                AnonymousClass8cW r4 = C103866ar.A06;
                C107806hL r5 = (C107806hL) this.A03;
                AnonymousClass7KC A0O = C86124wJ.A0O(((AnonymousClass7KC) AnonymousClass7JH.A01(r5.A00)).A00);
                AnonymousClass7KC A0O2 = C86124wJ.A0O(A0C2);
                AnonymousClass0wJ.A1N(r22, r4);
                AnonymousClass7U4 r23 = new AnonymousClass7U4(((C122717To) r22).A00);
                AnonymousClass7U0 r42 = (AnonymousClass7U0) r4;
                AnonymousClass0YY r02 = r42.A01;
                if (AnonymousClass7KC.A00(((AnonymousClass7KC) r42.A00.invoke(r23.BFh((C1203479u) r02.invoke(A0O), (C1203479u) r02.invoke(A0O2)))).A00) <= ((float) this.A00)) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101100_I2(r5, (C146958n9) null, 6, A0C2), r5.A01, 3);
                    break;
                } else {
                    ((AnonymousClass0YY) this.A02).invoke(C86124wJ.A0O(A0C2));
                    break;
                }
            case 2:
                int i = this.A00;
                ((C21697Byi) this.A01).CKu((C1526490u) this.A02, (BKU) this.A03, (C17989AVj) null, (C20066BMj) this.A04, i);
                break;
            case 3:
                B5b b5b = (B5b) this.A03;
                int i2 = this.A00;
                return new BMZ(b5b, (C18266Acd) this.A02, (C18266Acd) this.A01, (AnonymousClass9D3) this.A04, i2);
            case 4:
                Product product = (Product) this.A04;
                C04220Ms.A05(product);
                ((C146238ls) this.A01).C11((BKU) this.A02, product, ((FeedMediaContent$MediaViewerConfig) this.A03).A01, this.A00);
                break;
            default:
                String str2 = ((AnonymousClass9F7) this.A04).A04;
                if (str2 != null) {
                    A022 = Color.parseColor(str2);
                } else {
                    A022 = C19556AyH.A02((B5b) this.A03, this.A00);
                }
                ((C18266Acd) this.A01).A00(AnonymousClass9F7.A00(C18240wQ.A00(((Lu1) this.A02).A02), A022));
                return null;
        }
        return Unit.A00;
    }
}
