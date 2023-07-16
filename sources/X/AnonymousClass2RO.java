package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.2RO  reason: invalid class name */
public final class AnonymousClass2RO {
    public static final View A00(ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.spinner_dropdown_numeric_row, viewGroup, false);
        C04220Ms.A06(context);
        TextView textView = (TextView) AnonymousClass0wJ.A0K(inflate, R.id.row_user_textview);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0K(inflate, R.id.row_user_categorized_notification_textview);
        inflate.setTag(new AnonymousClass3DG(context, inflate, (ImageView) AnonymousClass0wJ.A0K(inflate, R.id.check), textView, textView2, (TextView) AnonymousClass0wJ.A0K(inflate, R.id.notification_count_avatar), (CircularImageView) AnonymousClass0wJ.A0K(inflate, R.id.row_user_imageview), (IgdsButton) AnonymousClass0wJ.A0K(inflate, R.id.login_button)));
        return inflate;
    }
}
