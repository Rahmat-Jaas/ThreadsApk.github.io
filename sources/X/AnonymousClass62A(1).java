package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.62A  reason: invalid class name */
public final class AnonymousClass62A extends C34846IgV {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;

    public AnonymousClass62A(Rect rect, View view, AnonymousClass3HX r3, C127397h3 r4) {
        this.A01 = view;
        this.A00 = rect;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onScroll(C24 c24, int i, int i2, int i3, int i4, int i5) {
        float f;
        int A032 = C14030oh.A03(1990709536);
        View view = this.A01;
        Rect rect = this.A00;
        if (view.getLocalVisibleRect(rect)) {
            f = ((float) rect.bottom) / ((float) view.getHeight());
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        C127397h3 r6 = this.A03;
        C109326jp A0L = r6.A0L(36);
        if (A0L != null) {
            try {
                C122047Jt.A03(this.A02, r6, C86154wM.A0S(AnonymousClass3VO.A00(), new C105616di(f), 0), A0L);
            } catch (IllegalStateException e) {
                C30967GcS.A02("NetegoNodeExtensionBinderUtils", AnonymousClass00U.A0R(e.getMessage(), " on_scroll hash: ", System.identityHashCode(r6.A0L(36))));
            }
            C10450iM.A00().CYW("last_on_scroll_hash", String.valueOf(System.identityHashCode(A0L)));
        }
        C14030oh.A0A(1720762424, A032);
    }

    public final void onScrollStateChanged(C24 c24, int i) {
        C14030oh.A0A(-51740331, C14030oh.A03(985537654));
    }
}
