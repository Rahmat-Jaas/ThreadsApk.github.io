package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.7h8  reason: invalid class name and case insensitive filesystem */
public final class C127437h8 implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int i = ((C114356t9) obj2).value;
        C04220Ms.A0B(view, 1);
        C04220Ms.A0C(obj3, "null cannot be cast to non-null type com.facebook.mountable.canvas.model.CanvasModel");
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
            if (i == 2) {
                i2 = 2;
            }
        }
        if (view.getLayerType() != i2) {
            view.setLayerType(i2, (Paint) null);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass0wJ.A1T(((C114356t9) obj).value, ((C114356t9) obj2).value);
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C04220Ms.A0B(view, 1);
        view.setLayerType(0, (Paint) null);
    }
}
