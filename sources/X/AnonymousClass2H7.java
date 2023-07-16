package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.2H7  reason: invalid class name */
public final class AnonymousClass2H7 {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        Object A0B = C63893iY.A0B(r11, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r11, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        C109326jp A0R = C18190wL.A0R(r11.A00, 2);
        if (A0R != null) {
            iDxCListenerShape70S0200000_1_I2 = new IDxCListenerShape70S0200000_1_I2(r10, A0R, 11);
        } else {
            iDxCListenerShape70S0200000_1_I2 = null;
        }
        Fragment A01 = C63913ic.A01(r10);
        if (A01 instanceof AnonymousClass1c8) {
            AnonymousClass1c8 r6 = (AnonymousClass1c8) A01;
            C04220Ms.A0B(r6, 0);
            C04220Ms.A0B(str, A1Z);
            C04220Ms.A0B(str2, 2);
            ViewGroup BHD = C18190wL.A0M(r6).BHD();
            C04220Ms.A06(BHD);
            View findViewById = BHD.findViewById(R.id.timeframe_header_container);
            boolean z = true;
            if (findViewById == null) {
                z = false;
                findViewById = LayoutInflater.from(r6.getRootActivity()).inflate(R.layout.insights_timeframe_header, (ViewGroup) null);
            }
            ((TextView) AnonymousClass0wJ.A0J(findViewById, R.id.timeframe_header_title)).setText(str);
            TextView textView = (TextView) AnonymousClass0wJ.A0J(findViewById, R.id.timeframe_header_subtitle);
            textView.setText(str2);
            if (!(iDxCListenerShape70S0200000_1_I2 == null || r6.getContext() == null)) {
                findViewById.setOnClickListener(iDxCListenerShape70S0200000_1_I2);
                Context context = r6.getContext();
                if (context != null) {
                    textView.setCompoundDrawables((Drawable) null, (Drawable) null, context.getDrawable(R.drawable.instagram_chevron_down_pano_outline_12), (Drawable) null);
                    textView.setCompoundDrawablePadding(4);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            if (!z) {
                int A012 = C121907Is.A01(r6.getRootActivity(), R.attr.actionBarButtonWidth);
                C121247Ez r0 = r6.A0C;
                if (r0 != null) {
                    r0.A03();
                    r6.A0C = null;
                }
                FrameLayout frameLayout = r6.A02;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    r6.A02 = null;
                    r6.A08 = null;
                    r6.A07 = null;
                }
                E2V.A03(r6.A03).Cjs(findViewById, 0, A012, false);
            }
        }
        return null;
    }
}
