package X;

import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.4MI  reason: invalid class name */
public final class AnonymousClass4MI implements C39614Kwm {
    public final /* synthetic */ AnonymousClass3C5 A00;

    public AnonymousClass4MI(AnonymousClass3C5 r1) {
        this.A00 = r1;
    }

    public final void Boi(IgRadioGroup igRadioGroup, int i) {
        C04220Ms.A0B(igRadioGroup, 0);
        if (i == -1) {
            this.A00.A02.A1N = null;
            return;
        }
        Object tag = AnonymousClass0wJ.A0K(igRadioGroup, i).getTag();
        C18240wQ.A1I(tag);
        this.A00.A02.A1N = (String) tag;
    }
}
