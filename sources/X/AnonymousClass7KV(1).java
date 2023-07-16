package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7KV  reason: invalid class name */
public final class AnonymousClass7KV {
    public static final C142878fk A00 = new C123277Wg(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final C142878fk A01 = new C123277Wg(1.0f);
    public static final C142878fk A02 = new C123277Wg(-1.0f);
    public static final C141758cu A03 = new AnonymousClass7Wh(1.0f);
    public static final C141758cu A04 = new AnonymousClass7Wh(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final C141758cu A05 = new AnonymousClass7Wh(-1.0f);
    public static final Alignment A06 = new C123287Wi(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    public static final Alignment A07 = new C123287Wi(1.0f, 1.0f);
    public static final Alignment A08 = new C123287Wi(-1.0f, 1.0f);
    public static final Alignment A09 = new C123287Wi(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final Alignment A0A = new C123287Wi(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final Alignment A0B = new C123287Wi(-1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final Alignment A0C = new C123287Wi(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1.0f);
    public static final Alignment A0D = new C123287Wi(1.0f, -1.0f);
    public static final Alignment A0E = new C123287Wi(-1.0f, -1.0f);
    public static final /* synthetic */ AnonymousClass7KV A0F = new AnonymousClass7KV();

    public static void A08(AnonymousClass7V3 r5, C147188nY r6, Modifier modifier, int i) {
        r6.Cvb(i);
        C101286Qp.A00(r6, r5.A86(A09, modifier), (AnonymousClass5HL) null, 0, 6, 0);
    }

    public static Modifier A01(AnonymousClass7V3 r1, Modifier modifier) {
        return r1.A86(A09, modifier);
    }

    public static C146288ly A04(C147188nY r2) {
        return AnonymousClass72M.A00(AnonymousClass7J3.A07, r2, A02);
    }

    public static Alignment A00(C147188nY r1) {
        r1.Cvb(733328855);
        return A0E;
    }

    public static C146288ly A02(C145048jk r1, C147188nY r2) {
        r2.Cvb(693286680);
        return AnonymousClass72N.A00(r1, r2, A05);
    }

    public static C146288ly A03(C145058jl r1, C147188nY r2) {
        r2.Cvb(-483455358);
        return AnonymousClass72M.A00(r1, r2, A02);
    }

    public static C146288ly A05(C147188nY r2) {
        r2.Cvb(-483455358);
        return AnonymousClass72M.A00(AnonymousClass7J3.A07, r2, A02);
    }

    public static C146288ly A06(C147188nY r2) {
        r2.Cvb(693286680);
        return AnonymousClass72N.A00(AnonymousClass7J3.A01, r2, A05);
    }

    public static C146288ly A07(C147188nY r1, boolean z) {
        r1.Cvb(733328855);
        return C120767Cj.A00(r1, A0E, z);
    }
}
