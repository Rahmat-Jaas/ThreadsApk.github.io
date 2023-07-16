package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.security.InvalidParameterException;

/* renamed from: X.2OT  reason: invalid class name */
public final class AnonymousClass2OT {
    public static final void A00(View view, ImageView imageView, TextView textView, TextView textView2, Integer num) {
        int i;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(num, imageView);
        if (num != AnonymousClass006.A0N) {
            int intValue = num.intValue();
            if (intValue == 0) {
                i = R.dimen.avatar_size_ridiculously_xxxlarge_plus;
            } else if (intValue == A1Z) {
                i = R.dimen.avatar_size_ridiculously_xxxlarge;
            } else if (intValue == 2) {
                i = R.dimen.avatar_size_ridiculously_xxlarge_plus;
            } else {
                switch (intValue) {
                    case 1:
                        str = "MEDIUM_LARGE";
                        break;
                    case 2:
                        str = "MEDIUM";
                        break;
                    case 3:
                        str = "SMALL";
                        break;
                    default:
                        str = "LARGE";
                        break;
                }
                throw new InvalidParameterException(AnonymousClass00U.A0L("Card type is not supported: ", str));
            }
            Resources resources = imageView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            if (num == AnonymousClass006.A01 || num == AnonymousClass006.A00) {
                C09860go.A0V(view, resources.getDimensionPixelSize(R.dimen.abc_floating_window_z));
            }
            if (textView != null) {
                Context context = textView.getContext();
                C18180wK.A0s(context, textView, C121907Is.A02(context, R.attr.igdsSecondaryText));
            }
            if (textView2 != null) {
                Context context2 = textView2.getContext();
                C18180wK.A0s(context2, textView2, C121907Is.A02(context2, R.attr.igdsSecondaryText));
            }
        }
    }
}
