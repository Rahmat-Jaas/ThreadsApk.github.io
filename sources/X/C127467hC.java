package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.7hC  reason: invalid class name and case insensitive filesystem */
public final class C127467hC implements Mcm {
    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((ImageView) obj).getDrawable();
        drawable.getClass();
        C142078dm r2 = (C142078dm) drawable;
        AnonymousClass7CI.A00();
        C04220Ms.A0B(r2, 0);
        if (!(r2 instanceof I2F)) {
            AnonymousClass0JV.A01("KFrescoController", AnonymousClass0wJ.A0t("Drawable not supported ", r2));
            return;
        }
        I2F i2f = (I2F) r2;
        C04220Ms.A0B(i2f, 0);
        i2f.A01();
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
