package X;

import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.44u  reason: invalid class name and case insensitive filesystem */
public final class C686244u implements C39769Kzd {
    public Drawable A00;
    public final AnonymousClass0YY A01;
    public final AnonymousClass0YY A02;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Object obj = ktCSuperShape0S2101000_I2.A01;
        if (obj != null) {
            Drawable drawable = (Drawable) this.A01.invoke(obj);
            this.A00 = drawable;
            this.A02.invoke(drawable);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public C686244u(Drawable drawable, ImageUrl imageUrl, String str, AnonymousClass0YY r5, AnonymousClass0YY r6) {
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = drawable;
        if (imageUrl != null) {
            C37030Jj7 A0A = C37744K2e.A01().A0A(imageUrl, str);
            A0A.A02(this);
            A0A.A01();
        }
    }
}
