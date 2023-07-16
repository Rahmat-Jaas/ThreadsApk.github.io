package com.facebookpay.widget.actionmenu;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass69Q;
import X.AnonymousClass7Fd;
import X.AnonymousClass7Fe;
import X.AnonymousClass7IS;
import X.C04220Ms;
import X.C116836xd;
import X.C18220wO;
import X.C86124wJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;

public final class InlineActionMenu extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A03 = C86124wJ.A09(context);
        FrameLayout.inflate(context, R.layout.fbpay_ui_inline_action_menu, this);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(this, R.id.fbpay_inline_action_menu_edit_view);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(this, R.id.fbpay_inline_action_menu_remove_view);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(this, R.id.fbpay_inline_action_menu_divider_view);
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("editView");
            throw null;
        }
        textView.setText(2131827309);
        TextView textView2 = this.A01;
        if (textView2 == null) {
            C04220Ms.A0E("editView");
            throw null;
        }
        AnonymousClass69Q r3 = AnonymousClass69Q.A03;
        AnonymousClass7Fd.A02(textView2, r3);
        TextView textView3 = this.A01;
        if (textView3 == null) {
            C04220Ms.A0E("editView");
            throw null;
        }
        AnonymousClass7Fe.A03(textView3, (float[]) null, 4, 11, 11, 4);
        TextView textView4 = this.A02;
        if (textView4 == null) {
            C04220Ms.A0E("removeView");
            throw null;
        }
        textView4.setText(2131827310);
        TextView textView5 = this.A02;
        if (textView5 == null) {
            C04220Ms.A0E("removeView");
            throw null;
        }
        AnonymousClass7Fd.A02(textView5, r3);
        TextView textView6 = this.A02;
        if (textView6 == null) {
            C04220Ms.A0E("removeView");
            throw null;
        }
        AnonymousClass7Fe.A03(textView6, (float[]) null, 4, 11, 11, 4);
        TextView textView7 = this.A00;
        if (textView7 == null) {
            C04220Ms.A0E("dividerView");
            throw null;
        }
        textView7.setText("|");
        TextView textView8 = this.A00;
        if (textView8 == null) {
            C04220Ms.A0E("dividerView");
            throw null;
        }
        AnonymousClass7Fd.A02(textView8, AnonymousClass69Q.A0z);
        TextView textView9 = this.A00;
        if (textView9 == null) {
            C04220Ms.A0E("dividerView");
            throw null;
        }
        Integer valueOf = Integer.valueOf(this.A03);
        Integer A0d = C18220wO.A0d();
        AnonymousClass7IS.A03(textView9, valueOf, valueOf, A0d, A0d);
    }

    public final void setEditAccessibility(String str) {
        C04220Ms.A0B(str, 0);
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("editView");
            throw null;
        } else {
            C116836xd.A01(textView, AnonymousClass006.A01, str);
        }
    }

    public final void setRemoveAccessibility(String str) {
        C04220Ms.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            C04220Ms.A0E("removeView");
            throw null;
        } else {
            C116836xd.A01(textView, AnonymousClass006.A01, str);
        }
    }

    public final void A00() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void A01() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(0);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setEditComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("editView");
            throw null;
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setRemoveComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A02;
        if (textView == null) {
            C04220Ms.A0E("removeView");
            throw null;
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
