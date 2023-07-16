package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gW  reason: invalid class name */
public final class AnonymousClass1gW extends AnonymousClass436 {
    public final Context A00;
    public final AnonymousClass1fW A01;
    public final C11630kW A02;
    public final UserSession A03;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        Object obj3 = obj;
        int A032 = C14030oh.A03(-1284603776);
        if (view.getTag() == null) {
            i2 = 207675374;
        } else {
            Context context = this.A00;
            UserSession userSession = this.A03;
            C11630kW r6 = this.A02;
            C34532Jx.A00(context, this.A01, (C57743Ch) view.getTag(), (AnonymousClass3IK) obj3, r6, userSession, false);
            i2 = -1322097950;
        }
        C14030oh.A0A(i2, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gW(Context context, AnonymousClass1fW r2, C11630kW r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = C14030oh.A03(1048192905);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.page_row_with_preview);
        A0H.setTag(new C57743Ch(A0H));
        C14030oh.A0A(-1715604948, A032);
        return A0H;
    }
}
