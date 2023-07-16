package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.52M  reason: invalid class name */
public final class AnonymousClass52M extends L7L implements C143538gu {
    public C91945hL A00;
    public final View.OnClickListener A01 = C86134wK.A0P(this, 17);

    public void setViewModel(C91945hL r10) {
        boolean booleanValue;
        C04220Ms.A0B(r10, 0);
        this.A00 = r10;
        Boolean bool = (Boolean) AnonymousClass7Ih.A0C(r10);
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        setChecked(booleanValue);
        C91945hL r0 = this.A00;
        if (r0 != null) {
            setEnabled(r0.A08);
            C91945hL r02 = this.A00;
            if (r02 != null) {
                setText(r02.A01);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    context.getTheme().resolveAttribute(R.attr.fbpay_hub_checkbox_item_margin_top, typedValue, true);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) typedValue.getDimension(C18230wP.A0E(context)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    requestLayout();
                }
                Integer num = AnonymousClass006.A0C;
                Context context2 = getContext();
                C91945hL r03 = this.A00;
                if (r03 != null) {
                    C116836xd.A01(this, num, context2.getString(r03.A00));
                    C91945hL r04 = this.A00;
                    if (r04 != null) {
                        if (r04.A02) {
                            setCheckMarkDrawable((Drawable) null);
                            setCompoundDrawablesWithIntrinsicBounds(getCheckBoxDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        setOnClickListener(this.A01);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    private final StateListDrawable getCheckBoxDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C121097Ec A0G = AnonymousClass7Kz.A0G();
        Context context = getContext();
        stateListDrawable.addState(new int[]{16842912}, A0G.A04(context, 24, 9));
        stateListDrawable.addState(new int[]{-16842912}, AnonymousClass7Kz.A0G().A04(context, 25, 36));
        return stateListDrawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52M(Context context) {
        super(new ContextThemeWrapper(context, R.style.FbPayUICheckbox), (AttributeSet) null);
        AnonymousClass7Kz.A0G();
        AnonymousClass7Fd.A02(this, AnonymousClass69Q.A0C);
        setCheckMarkDrawable(getCheckBoxDrawable());
    }

    public void setEnabled(boolean z) {
        setClickable(z);
        setAlpha(C18230wP.A00(z ? 1 : 0));
    }
}
