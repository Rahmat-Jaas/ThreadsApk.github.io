package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7hD  reason: invalid class name and case insensitive filesystem */
public final class C127477hD implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setBackground(((C90955fM) obj2).A04);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((C90955fM) obj).A04;
        Drawable drawable2 = ((C90955fM) obj2).A04;
        if (drawable != null) {
            return !drawable.equals(drawable2);
        }
        if (drawable2 == null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setBackground((Drawable) null);
    }
}
