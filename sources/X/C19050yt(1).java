package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public final class C19050yt extends LinearLayout implements L3L {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void A6q(C83094qm r2) {
        C04220Ms.A0B(r2, 0);
        this.A02.add(r2);
    }

    public final void Cc6(C83094qm r3) {
        C04220Ms.A0B((Object) null, 0);
        this.A02.remove((Object) null);
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

    public C19050yt(Context context) {
        super(context);
        C18180wK.A0C(this).inflate(R.layout.birthday_row, this, true);
        setGravity(16);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding));
        setOnClickListener(C18190wL.A0H(this, 578));
    }

    public final void setPrimaryText(String str) {
        C18210wN.A0E(this, R.id.primary_text).setText(str);
    }

    public final void setSecondaryText(String str) {
        C18210wN.A0E(this, R.id.secondary_text).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
