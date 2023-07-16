package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gC  reason: invalid class name */
public final class AnonymousClass1gC extends AnonymousClass436 {
    public final AnonymousClass4L1 A00;
    public final UserSession A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gC(AnonymousClass4L1 r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View view2;
        int i2;
        int i3;
        Integer BEi;
        int A03 = C14030oh.A03(905925249);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ExclusiveStoryRowViewBinder.Holder");
        C57773Ck r6 = (C57773Ck) tag;
        UserSession userSession = this.A01;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        AnonymousClass4L1 r5 = this.A00;
        C04220Ms.A0B(r6, 0);
        ImageView imageView = r6.A03;
        if (A1X) {
            imageView.setImageDrawable(r6.A00);
            view2 = r6.A02;
            i2 = 283;
        } else {
            imageView.setImageDrawable(r6.A01);
            view2 = r6.A02;
            i2 = 284;
        }
        AnonymousClass0wJ.A16(view2, i2, r5);
        C84624tY A0I = AnonymousClass0wJ.A0Y(userSession).A0I();
        if (A0I == null || (BEi = A0I.BEi()) == null) {
            i3 = 0;
        } else {
            i3 = BEi.intValue();
        }
        TextView textView = r6.A04;
        textView.setText(AnonymousClass0wJ.A0m(view2.getResources(), i3, R.plurals.recipient_picker_close_friends_count));
        AnonymousClass0wJ.A16(textView, 285, r5);
        C14030oh.A0A(2084004665, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-663297013, viewGroup);
        Context context = viewGroup.getContext();
        View A0D = C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_exclusive_story, false);
        C04220Ms.A06(context);
        A0D.setTag(new C57773Ck(A0D, context));
        C14030oh.A0A(-9977307, A002);
        return A0D;
    }
}
