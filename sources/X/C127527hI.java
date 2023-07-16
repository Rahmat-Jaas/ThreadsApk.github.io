package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.7hI  reason: invalid class name and case insensitive filesystem */
public final class C127527hI implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((C90975fO) obj2).A04;
        if (rect != null) {
            view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Rect rect = ((C90975fO) obj).A04;
        Rect rect2 = ((C90975fO) obj2).A04;
        if (rect == rect2 || (rect != null && rect.equals(rect2))) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }
}
