package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7hH  reason: invalid class name and case insensitive filesystem */
public final class C127517hH implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C90975fO r5 = (C90975fO) obj2;
        if (r5.A01 <= 0) {
            return null;
        }
        if (r5.A0C.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(r5.A01);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return C86114wI.A1T(((C90975fO) obj).A01, ((C90975fO) obj2).A01);
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }
}
