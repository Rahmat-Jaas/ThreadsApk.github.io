package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7RL  reason: invalid class name */
public final class AnonymousClass7RL implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass7JF A01;
    public final /* synthetic */ AnonymousClass5xd A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public AnonymousClass7RL(FragmentActivity fragmentActivity, AnonymousClass7JF r2, AnonymousClass5xd r3, User user, Long l, String str) {
        this.A01 = r2;
        this.A05 = str;
        this.A03 = user;
        this.A04 = l;
        this.A02 = r3;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        C14030oh.A05(-933847176);
        AnonymousClass7JF r3 = this.A01;
        String str = this.A05;
        User user = this.A03;
        String id = user.getId();
        Long l = this.A04;
        AnonymousClass0wJ.A1N(str, id);
        Integer num = AnonymousClass006.A0N;
        AnonymousClass7JF.A03(AnonymousClass7JF.A00(r3, (Boolean) null, (Boolean) null, num, num, l, str, id, (List) null, 28), r3);
        AnonymousClass5xd r0 = this.A02;
        String id2 = user.getId();
        C04530Oa r2 = r0.A07;
        C25586DoM.A02(AnonymousClass0wJ.A0X(r2), id2, "appreciation_gift_feed", "appreciation_gift_feed");
        r2.getValue();
        C60113Ns.A00();
        throw null;
    }
}
