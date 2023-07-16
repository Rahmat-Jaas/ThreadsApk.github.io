package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1y3  reason: invalid class name and case insensitive filesystem */
public final class C29431y3 extends C18730xl {
    public final /* synthetic */ AnonymousClass5EW A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29431y3(AnonymousClass5EW r1, int i, boolean z) {
        super(i);
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onClick(View view) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("is_payment_enabled", this.A01);
        A06.putBoolean("is_reconsent_enabled", false);
        C63863iT.A0B(this.A00.requireActivity(), A06, ModalActivity.class, "save_autofill_learn_more");
    }
}
