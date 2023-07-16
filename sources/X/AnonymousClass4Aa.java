package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Aa  reason: invalid class name */
public final class AnonymousClass4Aa implements C82444pd {
    public AnonymousClass252 A00 = AnonymousClass252.A07;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgImageView A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final Context A07;

    public AnonymousClass4Aa(FragmentActivity fragmentActivity, UserSession userSession, Context context) {
        C04220Ms.A0B(userSession, 2);
        this.A05 = fragmentActivity;
        this.A06 = userSession;
        this.A07 = context;
    }

    public final void A01(ViewStub viewStub) {
        C04220Ms.A0B(viewStub, 0);
        if (viewStub.getParent() != null) {
            View inflate = viewStub.inflate();
            AnonymousClass0wJ.A17(inflate, 350, this);
            this.A01 = inflate;
            String str = "rowContainer";
            IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.label);
            igTextView.setText(2131829899);
            this.A02 = igTextView;
            View view = this.A01;
            if (view != null) {
                IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.metadata);
                this.A03 = igTextView2;
                if (igTextView2 == null) {
                    str = "metadata";
                } else {
                    igTextView2.setVisibility(0);
                    View view2 = this.A01;
                    if (view2 != null) {
                        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(view2, R.id.icon);
                        this.A04 = igImageView;
                        if (igImageView == null) {
                            str = "icon";
                        } else {
                            C18180wK.A0r(this.A07, igImageView, R.drawable.instagram_chevron_right_pano_outline_16);
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        A00(this);
    }

    public static final void A00(AnonymousClass4Aa r6) {
        String str;
        IgTextView igTextView = r6.A03;
        if (igTextView == null) {
            str = "metadata";
        } else {
            Context context = r6.A07;
            C18200wM.A15(context, igTextView, C59573Li.A00(r6.A06, r6.A00, false));
            AnonymousClass252 r2 = r6.A00;
            AnonymousClass252 r0 = AnonymousClass252.A07;
            str = "icon";
            IgImageView igImageView = r6.A04;
            if (r2 != r0) {
                if (igImageView != null) {
                    C18180wK.A0r(context, igImageView, R.drawable.instagram_x_outline_16);
                    IgImageView igImageView2 = r6.A04;
                    if (igImageView2 != null) {
                        AnonymousClass0wJ.A17(igImageView2, 351, r6);
                        return;
                    }
                }
            } else if (igImageView != null) {
                C18180wK.A0r(context, igImageView, R.drawable.instagram_chevron_right_pano_outline_16);
                IgImageView igImageView3 = r6.A04;
                if (igImageView3 != null) {
                    igImageView3.setOnClickListener((View.OnClickListener) null);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void BlU(AnonymousClass252 r1) {
        this.A00 = r1;
        A00(this);
    }
}
