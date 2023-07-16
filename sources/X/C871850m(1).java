package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.50m  reason: invalid class name and case insensitive filesystem */
public final class C871850m extends ViewGroup {
    public int A00;
    public String A01 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public boolean A02;
    public final int A03;
    public final CircularImageView A04;
    public final GradientSpinner A05;
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08;

    public /* synthetic */ C871850m(Context context) {
        super(context, (AttributeSet) null, 0);
        CircularImageView circularImageView = new CircularImageView(context, (AttributeSet) null, 0);
        this.A04 = circularImageView;
        this.A06 = AnonymousClass0OY.A02(C86154wM.A14(context, 42));
        this.A07 = AnonymousClass0OY.A02(C86154wM.A14(context, 43));
        this.A08 = AnonymousClass0OY.A02(C86154wM.A14(context, 44));
        GradientSpinner gradientSpinner = new GradientSpinner(context);
        this.A05 = gradientSpinner;
        int A012 = C18240wQ.A01(context, 4);
        this.A03 = A012;
        this.A00 = A012;
        addView(circularImageView);
        addView(gradientSpinner);
    }

    public static /* synthetic */ void getRenderType$annotations() {
    }

    public final void setRenderType(String str) {
        C04220Ms.A0B(str, 0);
        this.A01 = str;
        if (!str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) && !this.A02) {
            this.A02 = true;
            addView(getPreviewCard(), 0);
            C04530Oa r2 = this.A06;
            View A0I = C86144wL.A0I(r2);
            Context context = getContext();
            A0I.setBackground(context.getDrawable(R.drawable.reel_background_content_gradient));
            addView(C86144wL.A0I(r2), 1);
            TextView usernameLabel = getUsernameLabel();
            usernameLabel.setTextSize(2, 14.0f);
            usernameLabel.setEllipsize(TextUtils.TruncateAt.END);
            usernameLabel.setMaxLines(1);
            int A072 = C86134wK.A07(context);
            C09860go.A0a(getUsernameLabel(), A072, A072);
            addView(getUsernameLabel(), 2);
        }
        AnonymousClass6OF.A00(C86144wL.A0I(this.A06), !str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        AnonymousClass6OF.A00(getPreviewCard(), !str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        AnonymousClass6OF.A00(getUsernameLabel(), !str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
    }

    private final View getGradient() {
        return C86144wL.A0I(this.A06);
    }

    public final CircularImageView getAvatarView() {
        return this.A04;
    }

    public final IgImageView getPreviewCard() {
        return (IgImageView) this.A07.getValue();
    }

    public final GradientSpinner getRing() {
        return this.A05;
    }

    public final TextView getUsernameLabel() {
        return (TextView) this.A08.getValue();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C04220Ms.A0I(this.A01, "with_preview_card")) {
            getPreviewCard().layout(0, 0, getPreviewCard().getMeasuredWidth(), getPreviewCard().getMeasuredHeight());
            C04530Oa r3 = this.A06;
            C86144wL.A0I(r3).layout(0, 0, C86144wL.A0I(r3).getMeasuredWidth(), C86144wL.A0I(r3).getMeasuredHeight());
            int measuredWidth = getPreviewCard().getMeasuredWidth() >> 1;
            int measuredHeight = getPreviewCard().getMeasuredHeight();
            Context context = getContext();
            GradientSpinner gradientSpinner = this.A05;
            int A002 = (measuredHeight - ((int) C09860go.A00(context, context.getResources().getDimension(R.dimen.account_section_text_margin_horizontal)))) - (gradientSpinner.getMeasuredHeight() >> 1);
            gradientSpinner.layout(measuredWidth - (gradientSpinner.getMeasuredWidth() >> 1), A002 - (gradientSpinner.getMeasuredHeight() >> 1), (gradientSpinner.getMeasuredWidth() >> 1) + measuredWidth, (gradientSpinner.getMeasuredHeight() >> 1) + A002);
            int i5 = this.A03;
            getUsernameLabel().layout((measuredWidth - getUsernameLabel().getPaddingLeft()) - (getUsernameLabel().getMeasuredWidth() >> 1), (gradientSpinner.getMeasuredHeight() >> 1) + A002 + i5, getUsernameLabel().getPaddingRight() + measuredWidth + (getUsernameLabel().getMeasuredWidth() >> 1), gradientSpinner.getMeasuredHeight() + A002 + i5 + getUsernameLabel().getMeasuredHeight());
            CircularImageView circularImageView = this.A04;
            circularImageView.layout(measuredWidth - (circularImageView.getMeasuredWidth() >> 1), A002 - (circularImageView.getMeasuredHeight() >> 1), measuredWidth + (circularImageView.getMeasuredWidth() >> 1), A002 + (circularImageView.getMeasuredHeight() >> 1));
            return;
        }
        GradientSpinner gradientSpinner2 = this.A05;
        gradientSpinner2.layout(0, 0, gradientSpinner2.getMeasuredWidth(), gradientSpinner2.getMeasuredHeight());
        CircularImageView circularImageView2 = this.A04;
        int i6 = this.A00;
        circularImageView2.layout(i6, i6, circularImageView2.getMeasuredWidth(), circularImageView2.getMeasuredHeight());
    }

    public final void setRingActive(boolean z) {
        GradientSpinner gradientSpinner = this.A05;
        if (z) {
            gradientSpinner.A03();
        } else {
            gradientSpinner.A05();
        }
    }

    public final void setRingSpacing(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A03;
        }
        this.A00 = i;
        this.A04.invalidate();
    }

    public final void setShowRing(boolean z) {
        AnonymousClass6OF.A00(this.A05, z);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        int i4 = min - this.A00;
        if (C04220Ms.A0I(this.A01, "with_preview_card")) {
            Context context = getContext();
            i3 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
            i4 = context.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size);
        } else {
            i3 = min;
        }
        this.A04.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.A05.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        if (C04220Ms.A0I(this.A01, "with_preview_card")) {
            getPreviewCard().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            C86144wL.A0I(this.A06).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            getUsernameLabel().measure(View.MeasureSpec.makeMeasureSpec(size - (this.A03 << 1), Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec((int) C09860go.A02(getContext(), getUsernameLabel().getTextSize()), 1073741824));
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(min, min);
    }

    public final void setProfilePicUrl(ImageUrl imageUrl, C11630kW r3) {
        AnonymousClass0wJ.A1N(imageUrl, r3);
        this.A04.setUrl(imageUrl, r3);
    }
}
