package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.3DL  reason: invalid class name */
public final class AnonymousClass3DL {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final C19577Ayd A04;
    public final C19577Ayd A05;
    public final C19577Ayd A06;
    public final C19577Ayd A07;
    public final IgdsButton A08;
    public final IgdsButton A09;

    public AnonymousClass3DL(View view) {
        this.A00 = (LinearLayout) view;
        View requireViewById = view.requireViewById(R.id.icon);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        this.A05 = new C19577Ayd((ViewStub) requireViewById);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.title);
        this.A07 = C18180wK.A0U(view, R.id.subtitle);
        C19577Ayd A0U = C18180wK.A0U(view, R.id.share_button_group);
        this.A06 = A0U;
        this.A09 = (IgdsButton) AnonymousClass0wJ.A0J(A0U.A08(), R.id.row_share_button);
        this.A03 = (IgImageView) AnonymousClass0wJ.A0J(A0U.A08(), R.id.row_share_hide_button);
        C19577Ayd A0U2 = C18180wK.A0U(view, R.id.auto_share_buttons);
        this.A04 = A0U2;
        this.A08 = (IgdsButton) AnonymousClass0wJ.A0J(A0U2.A08(), R.id.row_yes_button);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(A0U2.A08(), R.id.row_not_now_button);
    }
}
