package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.2L4  reason: invalid class name */
public final class AnonymousClass2L4 {
    public static final IgTextView A00(Context context, String str, int i) {
        AnonymousClass0wJ.A1N(context, str);
        IgTextView igTextView = new IgTextView(context);
        igTextView.setText(str);
        igTextView.setTextSize(12.0f);
        igTextView.setGravity(i);
        C18180wK.A0s(context, igTextView, R.color.igds_secondary_text);
        C18190wL.A17(igTextView);
        return igTextView;
    }
}
