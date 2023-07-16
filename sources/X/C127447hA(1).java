package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.7hA  reason: invalid class name and case insensitive filesystem */
public final class C127447hA implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        ((ImageView) obj).getDrawable().getClass();
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return C90985fP.A00((C90985fP) obj, (C90985fP) obj2);
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((ImageView) obj).getDrawable();
        drawable.getClass();
        C142078dm r1 = (C142078dm) drawable;
        AnonymousClass7CI.A00();
        C04220Ms.A0B(r1, 0);
        if (!(r1 instanceof I2F)) {
            AnonymousClass0JV.A01("KFrescoController", AnonymousClass0wJ.A0t("Drawable not supported ", r1));
        } else {
            AnonymousClass78V.A02.A01((I2F) r1);
        }
    }
}
