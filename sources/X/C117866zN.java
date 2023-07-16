package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.6zN  reason: invalid class name and case insensitive filesystem */
public final class C117866zN {
    public static final void A01(C147188nY r12, List list, int i, int i2) {
        C04220Ms.A0B(list, 0);
        C147188nY r6 = r12;
        r12.Cvd(-1792841902);
        if (i < list.size()) {
            AnonymousClass77C r5 = AnonymousClass77C.A00;
            C114796tu r0 = (C114796tu) list.get(i);
            float f = r0.A00;
            float f2 = r0.A01;
            r5.A00(r6, AnonymousClass7Kq.A0A(C97906Dk.A00(AnonymousClass7Kq.A03(AnonymousClass7KV.A08, Modifier.A04(Modifier.A00), 2), f + (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER * f2), (float) 0), f2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 6, 0);
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, list, i, i2, 7);
        }
    }

    public static final void A00(LazyListState lazyListState, C147188nY r5, List list, int i) {
        float f;
        boolean A1Y = AnonymousClass0wJ.A1Y(list, lazyListState);
        r5.Cvd(86213186);
        int A07 = C86104wH.A07(lazyListState.A02().BLg());
        if (A07 != 0) {
            f = ((float) lazyListState.A01()) / ((float) A07);
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        C86104wH.A1E(lazyListState, r5, list, f, A1Y ? 1 : 0);
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, lazyListState, list, i, 7);
        }
    }
}
