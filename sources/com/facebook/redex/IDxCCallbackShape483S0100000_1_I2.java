package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass13Z;
import X.AnonymousClass1Z1;
import X.C04220Ms;
import X.C10600ic;
import X.C18240wQ;
import X.C31176Gi6;
import X.C39769Kzd;
import X.KHQ;
import X.L5E;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public class IDxCCallbackShape483S0100000_1_I2 implements C39769Kzd {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape483S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        int i = this.A01;
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (i != 0) {
            if (bitmap != null) {
                AnonymousClass1Z1 r5 = (AnonymousClass1Z1) this.A00;
                Bitmap A02 = C31176Gi6.A02(bitmap);
                if (A02 != null) {
                    ImageView imageView = r5.A00;
                    if (imageView != null) {
                        imageView.setImageDrawable(new BitmapDrawable(AnonymousClass0wJ.A0B(r5), A02));
                        ImageView imageView2 = r5.A00;
                        if (imageView2 != null) {
                            C18240wQ.A0r(r5.requireContext(), imageView2, R.color.fds_transparent);
                            return;
                        }
                    }
                    C04220Ms.A0E("profilePhoto");
                    throw null;
                }
            }
        } else if (bitmap != null) {
            AnonymousClass13Z r0 = (AnonymousClass13Z) this.A00;
            Bitmap A022 = C31176Gi6.A02(bitmap);
            if (A022 != null) {
                IgSimpleImageView igSimpleImageView = r0.A04;
                igSimpleImageView.setImageDrawable(new BitmapDrawable(C10600ic.A00.getResources(), A022));
                C18240wQ.A0r(C10600ic.A00, igSimpleImageView, R.color.fds_transparent);
            }
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }
}
