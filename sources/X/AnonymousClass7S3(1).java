package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.7S3  reason: invalid class name */
public final class AnonymousClass7S3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ CompoundButton A01;
    public final /* synthetic */ M5J A02;
    public final /* synthetic */ AnonymousClass561 A03;

    public AnonymousClass7S3(View.OnClickListener onClickListener, CompoundButton compoundButton, M5J m5j, AnonymousClass561 r4) {
        this.A03 = r4;
        this.A02 = m5j;
        this.A01 = compoundButton;
        this.A00 = onClickListener;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2;
        boolean z2;
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A02);
        if (AnonymousClass7Kx.A0R(A0R)) {
            compoundButton2 = this.A01;
            z2 = Boolean.TRUE.equals(A0R.A01);
        } else {
            if (AnonymousClass7Kx.A0O(A0R)) {
                compoundButton2 = this.A01;
                z2 = false;
            }
            this.A00.onClick(compoundButton);
        }
        compoundButton2.setChecked(z2);
        this.A00.onClick(compoundButton);
    }
}
