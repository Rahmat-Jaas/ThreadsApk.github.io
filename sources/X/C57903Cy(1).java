package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Cy  reason: invalid class name and case insensitive filesystem */
public final class C57903Cy {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final ImageView A05;
    public final TextView A06;

    public C57903Cy(View view, Context context) {
        this.A02 = AnonymousClass0wJ.A0I(view, R.id.row_add_to_story_favorites_container);
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0I(view, R.id.icon);
        this.A05 = imageView;
        TextView textView = (TextView) AnonymousClass0wJ.A0I(view, R.id.label);
        this.A06 = textView;
        this.A04 = C18250wR.A0A(((ViewStub) view.findViewById(R.id.edit_close_friends_label_stub)).inflate());
        this.A03 = C18200wM.A0I(view);
        this.A00 = C18200wM.A0D(context);
        this.A01 = C19587Ayn.A01(context, R.drawable.unchecked, context.getColor(R.color.grey_3));
        imageView.setImageDrawable(C19557AyI.A01(context));
        textView.setText(2131824038);
    }
}
