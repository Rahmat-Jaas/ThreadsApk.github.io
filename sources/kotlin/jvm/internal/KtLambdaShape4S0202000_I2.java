package kotlin.jvm.internal;

import X.AnonymousClass00J;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass69J;
import X.AnonymousClass7FV;
import X.AnonymousClass94F;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C122067Jz;
import X.C123507Xe;
import X.C123657Xy;
import X.C144688iv;
import X.C17519ADf;
import X.C17984AVe;
import X.C18;
import X.C18180wK;
import X.C18200wM;
import X.C21726BzD;
import X.C86104wH;
import X.ILj;
import X.IlS;
import X.JJF;
import X.KJX;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0112000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.shopping.MicroProduct;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

public class KtLambdaShape4S0202000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0202000_I2(Object obj, int i, Object obj2, int i2, int i3) {
        super(1);
        this.A04 = i3;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C144688iv r1;
        BKU Atv;
        String str;
        switch (this.A04) {
            case 0:
                C04220Ms.A0B(obj, 0);
                C123657Xy[] r9 = (C123657Xy[]) this.A02;
                C123507Xe r8 = (C123507Xe) this.A03;
                int i = this.A01;
                int i2 = this.A00;
                for (C123657Xy r3 : r9) {
                    if (r3 != null) {
                        long A88 = r8.A00.A01.A88(AnonymousClass69J.Ltr, AnonymousClass7FV.A00(r3.A01, r3.A00), AnonymousClass7FV.A00(i, i2));
                        C122067Jz.A00(r3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C86104wH.A07(A88), C86104wH.A08(A88));
                    }
                }
                break;
            case 1:
                AnonymousClass94F r12 = (AnonymousClass94F) this.A03;
                C17984AVe aVe = (C17984AVe) this.A02;
                int i3 = this.A01;
                int i4 = this.A00;
                boolean A1Y = AnonymousClass0wJ.A1Y(r12, aVe);
                ArrayList A0s = C18200wM.A0s(r12.A0E);
                A0s.add(i3, aVe);
                BKU bku = r12.A05;
                Integer num = r12.A08;
                Map map = r12.A0F;
                List<KJX> list = aVe.A02;
                boolean z = false;
                for (KJX kjx : list) {
                    if (kjx instanceof IlS) {
                        num = Integer.valueOf(i3);
                        bku = ((IlS) kjx).Atv();
                        z = true;
                    }
                }
                if (!z) {
                    map.remove(Integer.valueOf(i3));
                }
                ArrayList<Object> A0v = AnonymousClass0wJ.A0v();
                for (KJX kjx2 : list) {
                    if (!(!(kjx2 instanceof C144688iv) || (r1 = (C144688iv) kjx2) == null || (Atv = r1.Atv()) == null || (str = Atv.A0f.A4Y) == null)) {
                        A0v.add(str);
                    }
                }
                ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
                for (Object A0p : A0v) {
                    A0w.add(C18180wK.A0p(A0p, Integer.valueOf(i4)));
                }
                Map A0B = AnonymousClass4WJ.A0B(A0w);
                List A0N = AnonymousClass00J.A0N(A0s);
                LinkedHashMap linkedHashMap = new LinkedHashMap(r12.A0G);
                linkedHashMap.putAll(A0B);
                return AnonymousClass94F.A00((KtCSuperShape0S0112000_I2) null, (ILj) null, bku, (JJF) null, (C17519ADf) null, r12, (Integer) null, num, (String) null, (String) null, (String) null, (String) null, (String) null, A0N, linkedHashMap, map, A1Y ? 1 : 0, A1Y ? 1 : 0, 130814, A1Y, A1Y);
            case 2:
                MultiProductComponent multiProductComponent = (MultiProductComponent) this.A03;
                ((C21726BzD) this.A02).Bok(this.A01, String.valueOf(multiProductComponent.A05), multiProductComponent.A00(), this.A00, multiProductComponent.A01.A04);
                break;
            default:
                Product A012 = ((ProductFeedItem) this.A03).A01();
                if (A012 != null) {
                    ((C18) this.A02).CCq(new MicroProduct(A012), this.A01, this.A00);
                    break;
                }
                break;
        }
        return Unit.A00;
    }
}
