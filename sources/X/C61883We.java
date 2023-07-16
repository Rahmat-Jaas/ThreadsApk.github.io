package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.IDxDCompatShape5S0000000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.3We  reason: invalid class name and case insensitive filesystem */
public final class C61883We {
    public static void A01(C63613hu r4, C83074qk r5, C201613j r6) {
        View.OnClickListener onClickListener;
        if (r6 != null) {
            int i = 0;
            A02(r4, r6, false);
            TextView textView = r6.A04;
            textView.getClass();
            ImageView imageView = r6.A03;
            imageView.getClass();
            Drawable drawable = r4.A05;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            textView.setText(r4.A0D);
            if (r5 != null || r4.A06 != null) {
                C18210wN.A0y(textView);
                if (r5 != null) {
                    onClickListener = C18200wM.A0R(r4, r5, 216);
                } else {
                    onClickListener = r4.A06;
                }
                textView.setOnClickListener(onClickListener);
            }
        }
    }

    public static void A02(C63613hu r8, C201613j r9, boolean z) {
        View view = r9.A01;
        if (view.getLayoutParams() != null) {
            if (r8.A0H) {
                view.setLayoutParams(new C39909L6z(-1, -2));
                FrameLayout frameLayout = r9.A02;
                if (frameLayout != null) {
                    frameLayout.setMinimumHeight(0);
                    frameLayout.setLayoutParams(new C39909L6z(-1, -2));
                }
            } else {
                view.getLayoutParams().height = r9.itemView.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
                view.setMinimumHeight(C18240wQ.A04(r9.itemView, R.dimen.abc_action_bar_stacked_max_height));
            }
            if (r8.A0H) {
                C09860go.A0X(view, r9.itemView.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
            }
        }
        if (z) {
            C09860go.A0X(view, 0);
        }
        TextView textView = r9.A06;
        textView.setAlpha(1.0f);
        if (textView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.gravity = 8388611;
            textView.setGravity(0);
            textView.setLayoutParams(layoutParams);
        }
        view.setFocusable(true);
        C006702y.A0C(view, new IDxDCompatShape5S0000000_2_I2(6));
        textView.setSingleLine(r8.A0F);
        TextView textView2 = r9.A05;
        if (textView2 != null) {
            textView2.setSingleLine(r8.A0G);
            textView2.setPaddingRelative(textView2.getPaddingStart(), r8.A03, textView2.getPaddingEnd(), textView2.getPaddingBottom());
        }
        r9.A00.setVisibility(C18190wL.A00(r8.A0E ? 1 : 0));
        r8.A06(textView, textView2, (TextView) null);
        if (C18210wN.A1U(r8.A0C)) {
            boolean z2 = r8.A0H;
            int paddingStart = textView.getPaddingStart();
            if (z2) {
                textView.setPaddingRelative(paddingStart, textView.getPaddingTop(), textView.getPaddingEnd(), 0);
            } else {
                textView.setPaddingRelative(paddingStart, 0, textView.getPaddingEnd(), 0);
            }
        }
        r9.itemView.setBackgroundColor(r8.A00);
        if (!(r8.A04 == 0 && r8.A01 == 0)) {
            ViewGroup.LayoutParams layoutParams2 = r9.itemView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                r9.itemView.setLayoutParams(layoutParams2);
            }
            View view2 = r9.itemView;
            view2.setPadding(view2.getPaddingLeft(), r8.A04, r9.itemView.getPaddingRight(), r8.A01);
        }
        View.OnClickListener onClickListener = r8.A07;
        View view3 = r9.itemView;
        if (onClickListener != null) {
            view3.setOnClickListener(onClickListener);
            C18210wN.A0y(r9.itemView);
            return;
        }
        view3.setClickable(false);
    }

    public static M5O A00(Context context, ViewGroup viewGroup, boolean z) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.row_header;
        if (z) {
            i = R.layout.row_header_with_action;
        }
        View A0H = AnonymousClass0wJ.A0H(from, viewGroup, i);
        C201613j r0 = new C201613j(A0H, z);
        A0H.setTag(r0);
        return r0;
    }
}
