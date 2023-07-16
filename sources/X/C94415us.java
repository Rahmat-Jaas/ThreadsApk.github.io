package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

/* renamed from: X.5us  reason: invalid class name and case insensitive filesystem */
public final class C94415us extends AnonymousClass5xY {
    public static final AnonymousClass6LU A03 = new AnonymousClass6LU();
    public static final String __redex_internal_original_name = "GreenscreenCameraRollTabFragment";
    public Folder A00 = new Folder(-1, "Gallery");
    public final C04530Oa A01 = C86144wL.A12(this, 28);
    public final C04530Oa A02;

    public final String getModuleName() {
        return "GREEN_SCREEN_CAMERA_ROLL_TAB_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AnonymousClass575) this.A02.getValue()).A00.A06();
        AnonymousClass061 r3 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0301000_I2_1(r3, viewLifecycleOwner, this, (C146958n9) null, 5), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final Collection getDefinitions() {
        int A04 = AnonymousClass0wJ.A04(this.A01.getValue());
        return C18180wK.A0n(new C22420CZb(new C105386dL(this), (H5F) this.A01.getValue(), A04));
    }

    public C94415us() {
        KtLambdaShape28S0100000_I2_8 ktLambdaShape28S0100000_I2_8 = new KtLambdaShape28S0100000_I2_8(this, 29);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape28S0100000_I2_8(new KtLambdaShape28S0100000_I2_8(this, 25), 26));
        this.A02 = C18220wO.A0M(new KtLambdaShape28S0100000_I2_8(A012, 27), ktLambdaShape28S0100000_I2_8, new KtLambdaShape18S0200000_I2_2(0, (Object) null, A012), C18210wN.A0l(AnonymousClass575.class));
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1544615319);
        super.onPause();
        ((AnonymousClass575) this.A02.getValue()).A00.A07();
        C14030oh.A09(1927366979, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-528725387);
        super.onResume();
        ((AnonymousClass575) this.A02.getValue()).A00.A08();
        C14030oh.A09(-156829926, A022);
    }
}
