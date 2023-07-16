package X;

import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public final class C13230nH extends AnonymousClass0gG {
    public final /* synthetic */ PrecomputedText.Params A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ CharSequence A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13230nH(PrecomputedText.Params params, TextView textView, CharSequence charSequence) {
        super(788, 1, false, false);
        this.A01 = textView;
        this.A02 = charSequence;
        this.A00 = params;
    }

    public final void run() {
        this.A01.post(new AnonymousClass0hE(PrecomputedText.create(this.A02, this.A00), this));
    }
}
