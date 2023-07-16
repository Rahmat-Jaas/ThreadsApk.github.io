package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1ls  reason: invalid class name and case insensitive filesystem */
public final class C25141ls extends IgLinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02 = AnonymousClass0wJ.A0L(this, R.id.subtitle);
    public IgImageView A03 = C18250wR.A0M(this, R.id.clear_button);
    public IgImageView A04 = C18250wR.A0M(this, R.id.icon);
    public String A05;
    public final int A06;
    public final int A07;
    public final View.OnClickListener A08;
    public final boolean A09;

    public C25141ls(Context context, View.OnClickListener onClickListener, int i, int i2, boolean z) {
        super(context);
        this.A07 = i;
        this.A08 = onClickListener;
        this.A09 = z;
        this.A06 = i2;
        this.A00 = IgLinearLayout.inflate(context, R.layout.layout_clips_quickshare_attribution_pill, this);
        TextView A0L = AnonymousClass0wJ.A0L(this, R.id.label);
        this.A01 = A0L;
        if (A0L != null) {
            C18200wM.A17(context.getResources(), A0L, i2);
        }
        View view = this.A00;
        if (view != null) {
            view.setFocusable(true);
        }
        IgImageView igImageView = this.A04;
        if (igImageView != null) {
            C18180wK.A0r(context, igImageView, i);
        }
        IgImageView igImageView2 = this.A03;
        if (igImageView2 != null) {
            igImageView2.setOnClickListener(onClickListener);
        }
        A00();
    }

    private final void A00() {
        if (this.A09) {
            TextView textView = this.A01;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.A02;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(8);
            }
        }
    }

    public final int getDefaultLabelText() {
        return this.A06;
    }

    public final int getIcon() {
        return this.A07;
    }

    public final View.OnClickListener getOnClickListener() {
        return this.A08;
    }

    public final boolean getQuickShareDesignV2Enabled() {
        return this.A09;
    }

    public final String getSubtitleText() {
        return this.A05;
    }

    public final void setSubtitleText(String str) {
        this.A05 = str;
        int i = 0;
        if (!this.A09 || (str != null && !AnonymousClass8bQ.A0n(str))) {
            TextView textView = this.A02;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(0);
            }
            View view = this.A00;
            if (view != null) {
                if (str == null || AnonymousClass8bQ.A0n(str)) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            return;
        }
        A00();
    }
}
