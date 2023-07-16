package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.1lp  reason: invalid class name and case insensitive filesystem */
public final class C25111lp extends IgFrameLayout {
    public C25111lp(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (AnonymousClass0wJ.A1V(C18190wL.A0X().A18)) {
            setBackgroundResource(R.color.igds_debug_overlay_background);
            LayoutInflater.from(context).inflate(R.layout.igds_debug_overlay, this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C29934Fwk.A1N);
            C04220Ms.A06(obtainStyledAttributes);
            setTitle(AnonymousClass2LX.A00(context, obtainStyledAttributes, 0));
            return;
        }
        setVisibility(8);
    }

    public final void setTitle(String str) {
        if (str != null && str.length() != 0) {
            TextView textView = (TextView) AnonymousClass0wJ.A0J(this, R.id.igds_debug_overlay_textview);
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
