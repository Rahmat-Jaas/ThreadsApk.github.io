package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.4AG  reason: invalid class name */
public final class AnonymousClass4AG implements C21232Br0 {
    public static final AnonymousClass4AG A00 = new AnonymousClass4AG();

    public final void C2O(View view) {
        Context context = view.getContext();
        ImageView A0J = C18200wM.A0J(view, R.id.direct_private_share_warning_icon);
        C04220Ms.A06(context);
        A0J.setImageDrawable(C19587Ayn.A04(context, context.getDrawable(R.drawable.instagram_lock_outline_96), context.getColor(R.color.igds_creation_tools_red), context.getColor(R.color.igds_creation_tools_pink)));
        view.setOnClickListener(C65483tK.A00);
    }
}
