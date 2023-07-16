package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.7hq  reason: invalid class name and case insensitive filesystem */
public final class C127867hq implements Mcm {
    public static final void A00(C108796ix r5, C90965fN r6, String str) {
        AnonymousClass3HX r4 = r6.A01;
        C127397h3 r3 = r6.A02;
        ((C130757qi) AnonymousClass7K7.A03(r4, r3)).A03 = str;
        C117976zY.A00(r5, r6);
        C109326jp r2 = r6.A03;
        if (r2 != null) {
            AnonymousClass3VO A00 = AnonymousClass3VO.A00();
            A00.A02(r6, 0);
            A00.A02(str, 1);
            C122047Jt.A07(r4, r3, A00, r2);
        }
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C90965fN r5 = (C90965fN) obj2;
        AnonymousClass0wJ.A1O(viewGroup, r5);
        View childAt = viewGroup.getChildAt(0);
        C04220Ms.A0C(childAt, AnonymousClass000.A00(73));
        ((InlineSearchBox) childAt).A02 = new C133557vt(this, r5, obj3);
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C04220Ms.A0B(viewGroup, 1);
        View childAt = viewGroup.getChildAt(0);
        C04220Ms.A0C(childAt, AnonymousClass000.A00(73));
        ((InlineSearchBox) childAt).A02 = null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
