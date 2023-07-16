package com.facebook.redex;

import X.AnonymousClass3DS;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C18220wO;
import X.C86134wK;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

public class IDxSListenerShape455S0100000_2_I2 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape455S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C04220Ms.A0C(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                if (((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet) != null) {
                    AnonymousClass7Kz.A0D().A00(((Fragment) this.A00).requireContext(), 21);
                    throw null;
                }
                return;
            case 1:
                C04220Ms.A0C(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(AnonymousClass7Kz.A0G().A03(C18220wO.A0A(this.A00), 4));
                    return;
                }
                return;
            default:
                AnonymousClass3DS r6 = (AnonymousClass3DS) this.A00;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Dialog dialog = r6.A06;
                layoutParams.copyFrom(dialog.getWindow().getAttributes());
                DisplayMetrics displayMetrics = new DisplayMetrics();
                int height = (int) (((float) dialog.getWindow().getDecorView().getHeight()) / C86134wK.A00());
                ((Activity) r6.A07).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int A002 = ((int) (((float) displayMetrics.heightPixels) / C86134wK.A00())) - 120;
                if (height > A002) {
                    layoutParams.height = (int) (((float) A002) * C86134wK.A00());
                }
                dialog.getWindow().setAttributes(layoutParams);
                return;
        }
    }
}
