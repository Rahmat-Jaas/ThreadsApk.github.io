package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import go.Seq;

/* renamed from: X.7Fd  reason: invalid class name */
public final class AnonymousClass7Fd {
    public static final void A01(TextView textView, int i, int i2) {
        int i3;
        Context context = textView.getContext();
        AnonymousClass7Kz.A0G();
        switch (i) {
            case 0:
            case Rfc3492Idn.base /*36*/:
                i3 = R.style.FBPayUIPrimaryTextStyle;
                break;
            case 1:
                i3 = 2131886558;
                break;
            case 2:
            case 20:
            case 27:
                i3 = 2131886556;
                break;
            case 3:
            case 9:
            case 11:
            case 13:
            case 16:
            case LangUtils.HASH_SEED /*17*/:
                i3 = R.style.FBPayUISecondaryTexStyle;
                break;
            case 4:
                i3 = R.style.FBPayUIButtonTexStyle;
                break;
            case 5:
                i3 = R.style.FBPayUIPrimaryTitleStyle;
                break;
            case 6:
                i3 = 2131886560;
                break;
            case 7:
                i3 = 2131886561;
                break;
            case 18:
                i3 = 2131886563;
                break;
            case 21:
            case 22:
            case 25:
            case 34:
                throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid typography type: ", i));
            case 23:
            case 24:
                i3 = R.style.FBPayUISelectionButtonTextStyle;
                break;
            case Rfc3492Idn.tmax /*26*/:
                i3 = R.style.igds_emphasized_body_2;
                break;
            case 28:
                i3 = R.style.igds_headline_2_emphasized;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                i3 = R.style.igds_emphasized_label;
                break;
            case 30:
            case 33:
                i3 = R.style.PrivacyTextStyle;
                break;
            case 31:
                i3 = R.style.igds_label;
                break;
            case 32:
                i3 = R.style.FBPayUIButtonTextEmphasizedStyle;
                break;
            case 35:
                i3 = R.style.FBPayUIFooterTexTStyle;
                break;
            case LangUtils.HASH_OFFSET /*37*/:
                i3 = 2131886557;
                break;
            case Rfc3492Idn.skew /*38*/:
                i3 = 2131886562;
                break;
            case 39:
                i3 = R.style.FBPayUIBadgeIconTextStyle;
                break;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
                i3 = 2131886565;
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                i3 = R.style.FBPayUIOrderSummaryOrginalPriceStyle;
                break;
            case 43:
                i3 = 2131886566;
                break;
            default:
                i3 = 2131886567;
                break;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, C29934Fwk.A0g);
        textView.setTypeface(Typeface.create(obtainStyledAttributes.getString(4), obtainStyledAttributes.getInt(1, 0)));
        textView.setTextSize(0, obtainStyledAttributes.getDimension(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        textView.setTextColor(AnonymousClass7Kz.A00(context, i2));
        AnonymousClass7Kz.A0G();
        textView.setLinkTextColor(context.getColor(R.color.igds_link));
        textView.setLineSpacing((float) obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getFloat(3, 1.0f));
        obtainStyledAttributes.recycle();
    }

    public static final void A03(TextView textView, CharSequence charSequence) {
        if (charSequence == null || AnonymousClass8bQ.A0n(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public static final void A00(TextView textView) {
        Context context = textView.getContext();
        AnonymousClass7Kz.A0G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUITextButtonBackground, C29934Fwk.A0b);
        StateListDrawable stateListDrawable = new StateListDrawable();
        AnonymousClass7Kz.A0G();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context, drawable, AnonymousClass7Kz.A0G(), 23);
        stateListDrawable.addState(new int[]{16842919}, drawable);
        stateListDrawable.addState(new int[]{-16842919}, (Drawable) null);
        AnonymousClass7Kz.A0G();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context, drawable2, AnonymousClass7Kz.A0G(), 23);
        stateListDrawable.addState(new int[]{16842908}, drawable2);
        stateListDrawable.addState(new int[]{-16842908}, (Drawable) null);
        textView.setBackground(stateListDrawable);
        obtainStyledAttributes.recycle();
    }

    public static final void A02(TextView textView, AnonymousClass69Q r3) {
        AnonymousClass0wJ.A1N(textView, r3);
        A01(textView, r3.A01, r3.A00);
    }
}
