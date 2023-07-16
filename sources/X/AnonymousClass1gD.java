package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gD  reason: invalid class name */
public final class AnonymousClass1gD extends AnonymousClass436 {
    public final AnonymousClass4L1 A00;
    public final UserSession A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gD(AnonymousClass4L1 r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Drawable drawable;
        int A03 = C14030oh.A03(1383505533);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.SaveStoryToArchiveViewBinder.Holder");
        C57783Cl r6 = (C57783Cl) tag;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        AnonymousClass4L1 r3 = this.A00;
        C04220Ms.A0B(r6, 0);
        C18180wK.A0r(r6.A00, r6.A04, R.drawable.instagram_history_outline_24);
        AnonymousClass0wJ.A16(r6.A03, 286, r3);
        ImageView imageView = r6.A05;
        if (A1X) {
            drawable = r6.A01;
        } else {
            drawable = r6.A02;
        }
        imageView.setImageDrawable(drawable);
        C14030oh.A0A(-1401748783, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-1019174499, viewGroup);
        Context context = viewGroup.getContext();
        View A0D = C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_save_story_to_archive, false);
        C04220Ms.A06(context);
        A0D.setTag(new C57783Cl(A0D, context));
        C14030oh.A0A(769249651, A002);
        return A0D;
    }
}
