package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0yu  reason: invalid class name and case insensitive filesystem */
public final class C19060yu extends LinearLayout implements L3L {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void Cc6(C83094qm r3) {
        this.A02.remove((Object) null);
    }

    public final void A6q(C83094qm r2) {
        this.A02.add(r2);
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (C83094qm Boh : this.A02) {
                    Boh.Boh(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public C19060yu(Context context) {
        super(context);
        C18180wK.A0C(this).inflate(R.layout.layout_radio_button_with_secondary_text_and_button, this, true);
        C18190wL.A17(this);
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setOnClickListener(C18210wN.A0H(this, 330));
    }

    public void setExtraButtonText(String str) {
        AnonymousClass0wJ.A0L(this, R.id.extra_btn).setText(str);
    }

    public void setSubtitle(String str) {
        AnonymousClass0wJ.A0L(this, R.id.subtitle).setText(str);
    }

    public void setTitle(String str) {
        AnonymousClass0wJ.A0L(this, R.id.title).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
