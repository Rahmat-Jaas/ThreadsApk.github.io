package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67;

/* renamed from: X.1Xq  reason: invalid class name */
public final class AnonymousClass1Xq extends C34640IcN {
    public static final String __redex_internal_original_name = "MusicConsumptionSheetFragmentV2";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C04530Oa A01;

    public final String getModuleName() {
        return "story_viewer_music_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass1Xq() {
        KtLambdaShape87S0100000_I2_67 ktLambdaShape87S0100000_I2_67 = new KtLambdaShape87S0100000_I2_67(this, 36);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape87S0100000_I2_67(new KtLambdaShape87S0100000_I2_67(this, 33), 34));
        this.A01 = C18220wO.A0M(new KtLambdaShape87S0100000_I2_67(A012, 35), ktLambdaShape87S0100000_I2_67, new KtLambdaShape31S0200000_I2_15(21, (Object) null, A012), C18210wN.A0l(C8W.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-2063387215);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_music_consumption_sheet, false);
        C14030oh.A09(-2050814242, A02);
        return A0D;
    }
}
