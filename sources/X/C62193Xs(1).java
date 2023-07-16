package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxPCallbackShape31S0400000_1_I2;
import com.instagram.common.task.IDxLTaskShape3S0500000_1_I2;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public final class C62193Xs {
    public static final C62193Xs A00 = new C62193Xs();

    public final Object A01(AnonymousClass601 r10, C63893iY r11) {
        AnonymousClass601 r6 = r10;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        Object A0B = C63893iY.A0B(r11, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        AnonymousClass3HX r5 = (AnonymousClass3HX) A0B;
        C109326jp A0R = C18190wL.A0R(r11.A00, A1Z ? 1 : 0);
        Fragment A01 = C63913ic.A01(r10);
        if (!C18180wK.A1W(A01.requireContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            AnonymousClass7K8.A02(A01.requireActivity(), new IDxPCallbackShape31S0400000_1_I2(0, r5, r6, A0R, A01), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            return null;
        }
        A00(A01, r5, r10, A0R);
        return null;
    }

    public static final void A00(Fragment fragment, AnonymousClass3HX r5, AnonymousClass601 r6, C109326jp r7) {
        View requireView = fragment.requireView();
        requireView.setDrawingCacheEnabled(true);
        if (requireView.getDrawingCache() != null) {
            Bitmap drawingCache = requireView.getDrawingCache();
            C13760oG.A00(drawingCache);
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            C04220Ms.A06(createBitmap);
            requireView.setDrawingCacheEnabled(false);
            C31155GhB.A03(new IDxLTaskShape3S0500000_1_I2(0, createBitmap, fragment, r5, r6, r7));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
