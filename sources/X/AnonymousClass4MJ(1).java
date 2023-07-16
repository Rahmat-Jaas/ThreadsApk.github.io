package X;

import com.instagram.common.ui.base.IgButton;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.4MJ  reason: invalid class name */
public final class AnonymousClass4MJ implements C39614Kwm {
    public final /* synthetic */ IgButton A00;
    public final /* synthetic */ AnonymousClass1YG A01;

    public AnonymousClass4MJ(IgButton igButton, AnonymousClass1YG r2) {
        this.A01 = r2;
        this.A00 = igButton;
    }

    public final void Boi(IgRadioGroup igRadioGroup, int i) {
        FXCalAgeInfo fXCalAgeInfo;
        IgButton igButton = this.A00;
        if (!igButton.isEnabled()) {
            igButton.setEnabled(true);
        }
        AnonymousClass1YG r2 = this.A01;
        if (i == 1) {
            fXCalAgeInfo = r2.A04;
        } else {
            fXCalAgeInfo = r2.A03;
        }
        String str = fXCalAgeInfo.A02;
        str.getClass();
        r2.A07 = str;
        String str2 = fXCalAgeInfo.A03;
        str2.getClass();
        r2.A08 = str2;
    }
}
