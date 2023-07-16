package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7hE  reason: invalid class name and case insensitive filesystem */
public final class C127487hE implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setForeground(((C90955fM) obj2).A05);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((C90955fM) obj).A05;
        Drawable drawable2 = ((C90955fM) obj2).A05;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (drawable2 == null || drawable.equals(drawable2)) {
            return false;
        } else {
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setForeground((Drawable) null);
    }
}
