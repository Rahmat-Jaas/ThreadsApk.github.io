package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;

/* renamed from: X.7r9  reason: invalid class name and case insensitive filesystem */
public final class C130937r9 implements C39769Kzd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C31304GmJ A01;
    public final /* synthetic */ AnonymousClass0YY A02;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        if (C31304GmJ.A03(this.A01)) {
            Context context = this.A00;
            C04220Ms.A05(context);
            F6Z f6z = new F6Z(context.getResources(), (Bitmap) ktCSuperShape0S2101000_I2.A01);
            f6z.A02(C09860go.A03(context, 12));
            this.A02.invoke(f6z);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public C130937r9(Context context, C31304GmJ gmJ, AnonymousClass0YY r3) {
        this.A01 = gmJ;
        this.A00 = context;
        this.A02 = r3;
    }
}
