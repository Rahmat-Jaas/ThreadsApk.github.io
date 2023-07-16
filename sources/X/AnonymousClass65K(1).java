package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

/* renamed from: X.65K  reason: invalid class name */
public final class AnonymousClass65K extends C18730xl {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C111316n8 A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65K(Activity activity, C111316n8 r2, int i, boolean z) {
        super(i);
        this.A02 = z;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("is_payment_enabled", this.A02);
        A06.putBoolean("is_reconsent_enabled", true);
        C63863iT.A0B(this.A00, A06, ModalActivity.class, C18170wI.A00(486));
        AnonymousClass7KI.A08(this.A01);
    }
}
