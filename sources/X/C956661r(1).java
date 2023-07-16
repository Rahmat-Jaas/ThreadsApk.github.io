package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.61r  reason: invalid class name and case insensitive filesystem */
public final class C956661r extends AnonymousClass5xI implements C82034oy {
    public static final String __redex_internal_original_name = "IgHubContainerFragment";

    public final void configureActionBar(AnonymousClass4u2 r6) {
        int i;
        View.OnClickListener onClickListener;
        C25764Drc drc;
        View.OnClickListener onClickListener2;
        if (getChildFragmentManager().A0L(R.id.container_fragment) instanceof C143678h8) {
            C113986sV BH4 = ((C143678h8) getChildFragmentManager().A0L(R.id.container_fragment)).BH4();
            r6.CtO(BH4.A08);
            r6.CtT(true);
            boolean A01 = AnonymousClass7HK.A01();
            String str = BH4.A05;
            str.getClass();
            if (A01) {
                r6.setTitle(str);
            } else {
                r6.Cnm(str, requireContext().getString(2131827288));
            }
            if (BH4.A07 && (i = BH4.A01) != 0) {
                if (i == 1) {
                    String str2 = BH4.A04;
                    if (str2 != null && (onClickListener2 = BH4.A03) != null) {
                        if (BH4.A06) {
                            drc = new C25764Drc();
                            drc.A0F = str2;
                            drc.A0C = onClickListener2;
                        } else {
                            r6.A7V(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Drawable drawable = BH4.A02;
                    if (drawable != null && (onClickListener = BH4.A03) != null) {
                        drc = new C25764Drc();
                        drc.A0B = drawable;
                        drc.A0C = onClickListener;
                        drc.A04 = BH4.A00;
                    } else {
                        return;
                    }
                }
                r6.A7Q(new C25435DlZ(drc));
                return;
            }
            return;
        }
        r6.CtO(false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (getChildFragmentManager().A0L(R.id.container_fragment) != null) {
            getChildFragmentManager().A0L(R.id.container_fragment).onActivityResult(i, i2, intent);
        }
    }
}
