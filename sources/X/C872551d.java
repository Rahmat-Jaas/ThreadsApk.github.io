package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.51d  reason: invalid class name and case insensitive filesystem */
public final class C872551d extends FrameLayout implements C146408mC {
    public final SwitchCompat A00;

    public void setChecked(boolean z) {
        this.A00.setChecked(z);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00.setThumbTintList(colorStateList);
    }

    public C872551d(Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.A00 = switchCompat;
        addView(switchCompat, -2, -2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }
}
