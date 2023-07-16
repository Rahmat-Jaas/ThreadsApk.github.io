package X;

import android.view.ViewGroup;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.11B  reason: invalid class name */
public final class AnonymousClass11B extends C41030Luu {
    public List A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        AnonymousClass3GQ r1 = C29821zM.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        r1.A01(m5o, this.A01, userSession, list, i);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return C29821zM.values()[i].A00.A00(viewGroup);
    }

    public /* synthetic */ AnonymousClass11B(C11630kW r3, UserSession userSession) {
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        C04220Ms.A0B(userSession, 2);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = r1;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-552152904);
        int size = this.A00.size();
        C14030oh.A0A(2127948308, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C29821zM r0;
        int A03 = C14030oh.A03(1386806774);
        Object obj = this.A00.get(i);
        C04220Ms.A0B(obj, 0);
        if (obj instanceof C63613hu) {
            r0 = C29821zM.A03;
        } else if (obj instanceof AnonymousClass4MA) {
            r0 = C29821zM.A04;
        } else if (obj instanceof AnonymousClass348) {
            r0 = C29821zM.A02;
        } else {
            throw C18190wL.A0a("Unsupported item type");
        }
        int ordinal = r0.ordinal();
        C14030oh.A0A(452110619, A03);
        return ordinal;
    }
}
