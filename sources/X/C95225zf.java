package X;

import android.view.View;
import com.facebook.redex.IDxObserverShape56S0300000_3_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7;

/* renamed from: X.5zf  reason: invalid class name and case insensitive filesystem */
public final class C95225zf extends C90995fQ {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;

    public static final void A00(View view, AnonymousClass3HX r9, C127397h3 r10) {
        C04220Ms.A0B(view, 0);
        C19821BBv bBv = (C19821BBv) AnonymousClass7K7.A04(r9, r10);
        if (bBv != null) {
            C18055AXx aXx = new C18055AXx(view);
            if (C63913ic.A00(r9).mView != null) {
                AnonymousClass066 viewLifecycleOwner = C63913ic.A00(r9).getViewLifecycleOwner();
                View requireViewById = aXx.A00.requireViewById(R.id.cta_container);
                if (requireViewById != null) {
                    if (bBv.A08) {
                        requireViewById.setVisibility(8);
                    } else {
                        AnonymousClass8vJ r3 = bBv.A07;
                        r3.A02.A0C(viewLifecycleOwner, new IDxObserverShape56S0300000_3_I2(5, requireViewById, aXx, bBv));
                        C25817DsW.A06(AnonymousClass067.A00(viewLifecycleOwner), C86154wM.A0O(new KtSLambdaShape12S0200000_I2_7((Object) bBv, (C146958n9) null, 41), r3.A0E));
                    }
                }
            }
            C63913ic.A0O(r9, bBv);
        }
    }

    public C95225zf(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
        this.A01 = r2;
        this.A00 = r1;
    }
}
