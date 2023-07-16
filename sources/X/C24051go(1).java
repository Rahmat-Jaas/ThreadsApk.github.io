package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public final class C24051go extends AnonymousClass436 {
    public final AnonymousClass1k1 A00;
    public final Context A01;
    public final C11630kW A02;
    public final User A03;

    public C24051go(Context context, C11630kW r3, AnonymousClass1k1 r4, User user) {
        C18180wK.A1Q(context, 1, r4);
        this.A01 = context;
        this.A02 = r3;
        this.A03 = user;
        this.A00 = r4;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C04220Ms.A0B(obj, 1);
        return ((AnonymousClass35H) obj).A00.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = C14030oh.A03(-106333026);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.newsfeed.adapter.bindergroup.BusinessConversionReminderBinderGroup.Holder");
        AnonymousClass3BZ r2 = (AnonymousClass3BZ) tag;
        AnonymousClass0wJ.A16(r2.A00, 561, this);
        AnonymousClass0wJ.A16(r2.A01, 562, this);
        r2.A02.setText(((AnonymousClass35H) obj).A00);
        User user = this.A03;
        if (user != null) {
            r2.A03.setUrl(user.B4M(), this.A02);
        }
        C14030oh.A0A(1826502906, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(599953835, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A01), viewGroup, R.layout.business_conversion_reminder);
        C04220Ms.A06(A0H);
        A0H.setTag(new AnonymousClass3BZ(A0H));
        C14030oh.A0A(-465466859, A002);
        return A0H;
    }
}
