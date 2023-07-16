package X;

import android.content.Context;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1fW  reason: invalid class name */
public final class AnonymousClass1fW extends C34727Idy implements C82214pG {
    public int A00 = -1;
    public FBPageListWithPreviewFragment A01;
    public AnonymousClass3IK A02;
    public AnonymousClass3IK A03;
    public UserSession A04;
    public List A05 = AnonymousClass0wJ.A0v();
    public final C23951ge A06;
    public final C24091gs A07;
    public final AnonymousClass1gW A08;
    public final AnonymousClass1gX A09;

    public final void A01(AnonymousClass3IK r2) {
        User A0Y;
        UserSession userSession = this.A04;
        if (userSession == null) {
            A0Y = null;
        } else {
            A0Y = AnonymousClass0wJ.A0Y(userSession);
        }
        if (!r2.A00(A0Y)) {
            this.A03 = this.A02;
            this.A02 = r2;
        }
    }

    public final void BsT() {
        this.A01.A04.A05(false);
    }

    public AnonymousClass1fW(Context context, FBPageListWithPreviewFragment fBPageListWithPreviewFragment, C11630kW r7, UserSession userSession, CharSequence charSequence, String str) {
        this.A04 = userSession;
        C24091gs r3 = new C24091gs(context, charSequence, str);
        this.A07 = r3;
        AnonymousClass1gX r2 = new AnonymousClass1gX(context, this, r7, userSession);
        this.A09 = r2;
        C23951ge r1 = new C23951ge(context, this);
        this.A06 = r1;
        AnonymousClass1gW r0 = new AnonymousClass1gW(context, this, r7, userSession);
        this.A08 = r0;
        this.A01 = fBPageListWithPreviewFragment;
        init(r3, r2, r1, r0);
    }

    public final void A00() {
        User A0Y;
        boolean z;
        clear();
        addModel((Object) null, (Object) null, this.A07);
        int i = 0;
        while (true) {
            List list = this.A05;
            if (i < list.size()) {
                AnonymousClass3IK r2 = (AnonymousClass3IK) list.get(i);
                UserSession userSession = this.A04;
                if (userSession == null) {
                    A0Y = null;
                } else {
                    A0Y = AnonymousClass0wJ.A0Y(userSession);
                }
                if (!r2.A00(A0Y)) {
                    AnonymousClass3IK r0 = this.A02;
                    if (r0 == null || !r2.A08.equals(r0.A08)) {
                        z = false;
                    } else {
                        z = true;
                        this.A00 = i;
                    }
                    addModel(r2, Boolean.valueOf(z), this.A09);
                } else {
                    addModel(r2, (Object) null, this.A08);
                }
                i++;
            } else {
                addModel((Object) null, (Object) null, this.A06);
                notifyDataSetChanged();
                return;
            }
        }
    }
}
