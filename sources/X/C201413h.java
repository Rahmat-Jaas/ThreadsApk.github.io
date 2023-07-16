package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.13h  reason: invalid class name and case insensitive filesystem */
public final class C201413h extends M5O {
    public EditPhoneNumberView A00;
    public final ViewStub A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final ViewGroup A06;

    public C201413h(View view) {
        super(view);
        ImageView A0J = C18200wM.A0J(view, R.id.dismiss_button);
        this.A02 = A0J;
        Drawable drawable = A0J.getDrawable();
        drawable.getClass();
        C63393hP.A03(view.getContext(), drawable.mutate(), R.color.grey_5);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.message);
        this.A01 = (ViewStub) view.requireViewById(R.id.inline_edit_view);
        ViewGroup A002 = C36342Qy.A00(C18220wO.A0J(view, R.id.megaphone_content), C18220wO.A0J(view, R.id.button_placeholder), (ViewGroup) null, (C310724c) null, C310724c.ONE_BUTTON_PRIMARY);
        this.A06 = A002;
        if (A002 != null) {
            this.A04 = C18180wK.A0G(A002, R.id.primary_button);
        }
    }
}
