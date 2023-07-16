package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0yv  reason: invalid class name and case insensitive filesystem */
public final class C19070yv extends LinearLayout implements L3L {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public C19070yv(Context context) {
        super(context);
        C18190wL.A17(C18180wK.A0C(this).inflate(R.layout.layout_cta_selector_radio_button, this, true));
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_floating_window_z);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOnClickListener(C18190wL.A0H(this, 298));
    }

    public final void A6q(C83094qm r2) {
        C04220Ms.A0B(r2, 0);
        this.A02.add(r2);
    }

    public final void setContentDescription(C57943Dd r3) {
        C04220Ms.A0B(r3, 0);
        View requireViewById = requireViewById(R.id.cta_selector_radio_button_view);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
        requireViewById.setContentDescription(C59523Ld.A00(C18190wL.A0A(this), r3));
    }

    public final void setSubTitleText(C57943Dd r3) {
        C04220Ms.A0B(r3, 0);
        C18210wN.A0E(this, R.id.cta_selector_radio_button_subtitle).setText(C59523Ld.A00(C18190wL.A0A(this), r3));
    }

    public final void setTitleText(C57943Dd r3) {
        C04220Ms.A0B(r3, 0);
        C18210wN.A0E(this, R.id.cta_selector_radio_button_title).setText(C59523Ld.A00(C18190wL.A0A(this), r3));
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            LinearLayout.mergeDrawableStates(onCreateDrawableState, A03);
        }
        C04220Ms.A06(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (C83094qm Boh : this.A02) {
                    Boh.Boh(this, z);
                }
                this.A00 = false;
            }
        }
    }

    public final void setMetadataText(String str) {
        C18210wN.A0E(this, R.id.cta_selector_radio_button_metadata).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }

    public final void Cc6(C83094qm r1) {
    }
}
